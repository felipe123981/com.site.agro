<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
<head>
<title>Info4Cloud</title>
<!-- Incluindo o CSS do Bootstrap 4 -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<!-- jQuery -->
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<!-- JavaScript do Bootstrap 4 -->
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.bundle.min.js"></script>
<link href="CSS/estilo.css" rel="stylesheet">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">

<script>
	$(document)
			.ready(
					function() {
						// Chama a função carregarClassificacoes ao carregar a página
						carregarClassificacoes();

						// Função de busca na tabela
						$('#inputBusca')
								.on(
										'keyup',
										function() {
											var valorBusca = $(this).val()
													.toLowerCase();
											$('#tabelaClassificacoes tbody tr')
													.filter(
															function() {
																$(this)
																		.toggle(
																				$(
																						this)
																						.text()
																						.toLowerCase()
																						.indexOf(
																								valorBusca) > -1);
															});
										});
					});

	// Função para carregar classificações
	function carregarClassificacoes() {
		$
				.ajax({
					url : '/agro/ClassificacaoServlet', // Verifique se a URL está correta
					method : 'GET',
					timeout : 2000,
					dataType : 'json',
					success : function(data) {
						if (data.length === 0) {
							alert('Não há dados disponíveis.'); // Alerta de erro
							$('#tabelaClassificacoes').hide(); // Esconde a tabela
							$('#divBusca').hide(); // Esconde a div do campo de busca
							$('#btnCadastro').removeClass('mt-3').addClass(
									'mt-4'); // Ajusta margem do botão
						} else {
							$('#tabelaClassificacoes tbody').empty(); // Limpa a tabela
							$('#tabelaClassificacoes').show(); // Mostra a tabela
							$('#divBusca').show(); // Mostra a div do campo de busca
							$('#btnCadastro').removeClass('mt-4').addClass(
									'mt-3'); // Ajusta margem do botão
							// Itera sobre os dados recebidos e cria as linhas da tabela
							$
									.each(
											data,
											function(index, classificacao) {
												var linha = '<tr>'
														+ '<td>'
														+ classificacao.idclassificacao
														+ '</td>'
														+ '<td>'
														+ classificacao.classificacao
														+ '</td>'
														+ '<td>'
														+ '<button class="btn btn-sm btn-warning btn-responsivo" onclick="abrirModalAtualizacao('
														+ classificacao.idclassificacao
														+ ', \''
														+ classificacao.classificacao
														+ '\')"><i class="fas fa-sync"></i><span class="texto-botao">Atualizar</span></button> '
														+ '<button class="btn btn-sm btn-danger btn-responsivo" onclick="abrirModalExclusao('
														+ classificacao.idclassificacao
														+ ', \''
														+ classificacao.classificacao
														+ '\')"><i class="fas fa-trash-alt"></i><span class="texto-botao">Excluir</span></button>'
														+ '</td>' + '</tr>';
												$('#tabelaClassificacoes tbody')
														.append(linha);
											});
						}
					},
					error : function(xhr, status, error) {
						// Log detalhado do erro para depuração
						console.error('Erro ao carregar classificações:',
								status, error);
						console
								.error('Detalhes da resposta:',
										xhr.responseText);
						alert('Erro ao carregar classificações.');
						$('#tabelaClassificacoes').hide(); // Esconde a tabela em caso de erro
						$('#divBusca').hide(); // Esconde a div do campo de busca
						$('#btnCadastro').removeClass('mt-3').addClass('mt-4'); // Ajusta margem do botão
					}
				});
	}

	// Função para abrir o modal de atualização e preencher o formulário com os dados atuais
	function abrirModalAtualizacao(id, classificacao) {
		$('#atualizacaoId').val(id);
		$('#atualizacaoClassificacao').val(classificacao);
		$('#modalAtualizacao').modal('show');
	}

	// Função para abrir o modal de confirmação de exclusão
	function abrirModalExclusao(id, classificacao) {
		$('#exclusaoId').val(id);
		$('#exclusaoClassificacao').val(classificacao);
		$('#modalExclusao').modal('show');

	}

	// Função para salvar a nova classificação
	function salvarClassificacao() {
		var classificacao = $('#classificacao').val();

		if (classificacao.trim() === '') {
			alert('Por favor, preencha a classificação.');
			return;
		}

		// Envia os dados da nova classificação para o servidor
		$.ajax({
			url : '/agro/ClassificacaoServlet',
			method : 'POST',
			data : {
				classificacao : classificacao
			},
			success : function(response) {
				alert(response.message)
				$('#modalCadastro').modal('hide');
				classificacao = $('#classificacao').val("")// Fecha o modal após salvar
				carregarClassificacoes(); // Recarrega as classificações para atualizar a tabela
			},
			error : function(xhr) {
				alert('Erro ao cadastrar classificação: '
						+ xhr.responseJSON.error);
			}
		});
	}

	function atualizarClassificacao() {
		var id = $('#atualizacaoId').val();
		var classificacao = $('#atualizacaoClassificacao').val();
		var acao = $('#acao').val();

		if (classificacao.trim() === '') {
			alert('Por favor, preencha a classificação.');
			return;
		}

		// Log para verificar os dados que estão sendo enviados
		console.log('Enviando dados:', {
			id : id,
			classificacao : classificacao
		});

		// Envia os dados atualizados para o servidor usando PUT
		$.ajax({
			url : '/agro/ClassificacaoServlet',
			method : 'POST',

			data : {
				id : id,
				classificacao : classificacao,
			},
			success : function(response) {
				alert(response.message);
				console.log(response);
				$('#modalAtualizacao').modal('hide'); // Fecha o modal após atualizar
				carregarClassificacoes(); // Recarrega as classificações para atualizar a tabela
			},
			error : function(xhr) {

				alert('Erro ao atualizar classificação: '
						+ (xhr.responseJSON ? xhr.responseJSON.error
								: 'Erro desconhecido'));
			}
		});
	}

	// Função para excluir a classificação
	function excluirClassificacao() {
		var id = $('#exclusaoId').val();
		var acao = "Delete";
		console.log(acao);
		$.ajax({
			url : '/agro/ClassificacaoServlet',
			method : 'POST',
			data : {
				id : id,
				acao : acao,
			},
			success : function(response) {
				alert(response.message);
				$('#modalExclusao').modal('hide'); // Feche o modal após excluir
				carregarClassificacoes(); // Recarrega as classificações para atualizar a tabela
			},
			error : function(xhr) {
				console.error('Erro ao Excluir:', xhr.responseText);
				alert('Erro ao Excluir: '
						+ (xhr.responseJSON ? xhr.responseJSON.error
								: 'Erro desconhecido'));
			}
		});
	}
</script>




</head>
<body>
	<header>
		<%@ include file="pagina/menu.jsp"%>
	</header>
	<div class="container-fluid content mt-2">
		<h2
			class="mb-2 text-white border bg-success p-2 rounded shadow-custom">Classificações</h2>
		<!-- Div para o campo de busca -->
		<div id="divBusca" class="mb-3 bg-success p-2 rounded shadow-custom"
			style="display: none;">
			<h6 class="mb-1 text-white">Buscar</h6>
			<input id="inputBusca" type="text" class="form-control"
				placeholder="Buscar classificação...">
		</div>
		<div class="table-responsive  rounded shadow-custom">
			<table id="tabelaClassificacoes"
				class="table table-bordered table-striped" style="display: none;">
				<thead class="thead-green">
					<tr>
						<th>ID Classificação</th>
						<th>Classificação</th>
						<th>Ações</th>
					</tr>
				</thead>
				<tbody>
					<!-- Dados serão inseridos dinamicamente aqui -->
				</tbody>
			</table>
		</div>


		<!-- Botão para abrir o modal de cadastro -->
		<button id="btnCadastro" type="button" class="btn btn-primary mt-4"
			data-toggle="modal" data-target="#modalCadastro">
			<i class="fas fa-plus"></i> <span class="texto-botao">Classificação</span>
		</button>
	</div>

	<!-- Modal de Cadastro de Classificação -->

	<div class="modal fade" id="modalCadastro" tabindex="-1" role="dialog"
		aria-labelledby="modalCadastroLabel" aria-hidden="true">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="modalCadastroLabel">Cadastrar
						Classificação</h5>
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<div class="modal-body">
					<form id="formCadastro">
						<div class="form-group">
							<label for="classificacao">Classificação</label> <input
								type="text" class="form-control" id="classificacao"
								name="classificacao" required>
						</div>
					</form>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-secondary"
						data-dismiss="modal">Cancelar</button>
					<button type="button" class="btn btn-primary"
						onclick="salvarClassificacao()">Salvar</button>
				</div>
			</div>
		</div>
	</div>

	<!-- Modal de Atualização de Classificação -->
	<div class="modal fade" id="modalAtualizacao" tabindex="-1"
		role="dialog" aria-labelledby="modalAtualizacaoLabel"
		aria-hidden="true">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="modalAtualizacaoLabel">Atualizar
						Classificação</h5>
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<div class="modal-body">
					<form id="formAtualizacao">
						<input type="hidden" id="atualizacaoId" name="atualizacaoId">
						<div class="form-group">
							<label for="atualizacaoClassificacao">Classificação</label> <input
								type="text" class="form-control" id="atualizacaoClassificacao"
								name="atualizacaoClassificacao" required>
						</div>
					</form>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-primary"
						onclick="atualizarClassificacao()">Atualizar</button>
					<button type="button" class="btn btn-secondary"
						data-dismiss="modal">Cancelar</button>
				</div>
			</div>
		</div>
	</div>

	<!-- Modal de Confirmação de Exclusão -->
	<div class="modal fade" id="modalExclusao" tabindex="-1" role="dialog"
		aria-labelledby="modalExclusaoLabel" aria-hidden="true">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="modalExclusaoLabel">Confirmar
						Exclusão</h5>
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<div class="modal-body">

					<p></p>
					<form id="Excluir">
						<input type="text" id="exclusaoId" name="exclusaoId"> <input
							type="hidden" id="deletar" value="Delete"> <input
							type="text" id="exclusaoClassificacao">
					</form>
				</div>

				<div class="modal-footer">
					<button type="button" class="btn btn-danger"
						onclick="excluirClassificacao()">Excluir</button>
					<button type="button" class="btn btn-secondary"
						data-dismiss="modal">Cancelar</button>
				</div>


			</div>
		</div>
	</div>
	<footer>
		<%@ include file="pagina/footer.jsp"%>
	</footer>
</body>
</html>
