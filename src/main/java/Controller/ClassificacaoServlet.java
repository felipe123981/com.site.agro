package Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.google.gson.Gson;

import Dao.ClassificacaoDAO;
import Model.Classificacao;

/**
 * Servlet implementation class ClassificacaoServlet
 */
public class ClassificacaoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private ClassificacaoDAO classificacaoDAO;

	@Override
	public void init() {
		classificacaoDAO = new ClassificacaoDAO();
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");

		try {
			List<Classificacao> classificacoes = classificacaoDAO.listAll();
			String json = new Gson().toJson(classificacoes);
			PrintWriter out = response.getWriter();
			out.print(json);
			out.flush();

		} catch (Exception e) {
			e.printStackTrace();
			response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
			response.getWriter().write("{\"error\":\"Erro ao carregar classificações: " + e.getMessage() + "\"}");
		}
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		String acao = request.getParameter("acao");
		if ("Delete".equals(acao)) {
			
			try {
				// Declaraçao de id

				String idParam = request.getParameter("id");
				// Verifica se os parâmetros estão presentes e válidos
				int id = Integer.parseInt(idParam);
				// Cria a instância do modelo e define os valores
				Classificacao classificacao = new Classificacao();
				classificacao.setIdclassificacao(id);
				classificacaoDAO.deleteClassificacao(classificacao);
				// Envia mensangem de exclusão
				
				response.setStatus(HttpServletResponse.SC_OK);
				response.getWriter().write("{\"message\":\"Classificação excluída com sucesso!\"}");
			} catch (Exception e) {
				e.printStackTrace();
				response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
				response.getWriter().write("{\"error\":\"Erro ao Excliur classificação: " + e.getMessage() + "\"}");
			}
		} else {
			
			String idParam = request.getParameter("id");
			// String teste= request.getParameter("classificacao");

			if (idParam != null && !idParam.trim().isEmpty()) {
				try {
					// Captura os parâmetros da requisição e adiciona logs para depuração

					String classificacaoNome = request.getParameter("classificacao");

					// Verifica se os parâmetros estão presentes e válidos
					if (idParam == null || classificacaoNome == null || idParam.isEmpty()
							|| classificacaoNome.isEmpty()) {
						response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
						response.getWriter().write("{\"error\":\"ID ou classificação não fornecidos.\"}");
						return;
					}
					int id = Integer.parseInt(idParam);

					// Cria a instância do modelo e define os valores
					Classificacao classificacao = new Classificacao();
					classificacao.setIdclassificacao(id);
					classificacao.setClassificacao(classificacaoNome);

					// Chama o método de atualização no DAO
					classificacaoDAO.updateClassificacao(classificacao);

					// Envia resposta de sucesso
					response.setStatus(HttpServletResponse.SC_OK);
					response.getWriter().write("{\"message\":\"Classificação atualizada com sucesso!\"}");

				} catch (NumberFormatException e) {
					// Tratamento para caso o ID não seja um número válido
					response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
					response.getWriter().write("{\"error\":\"ID inválido.\"}");
				} catch (Exception e) {
					// Tratamento de erros gerais
					e.printStackTrace();
					response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
					response.getWriter()
							.write("{\"error\":\"Erro ao atualizar classificação: " + e.getMessage() + "\"}");

				}
			} else {
				try {
					// Recupera o valor do parâmetro 'classificacao' enviado no request
					String classificacaoNome = request.getParameter("classificacao");

					// Cria uma nova instância do modelo Classificacao
					Classificacao classificacao = new Classificacao();
					classificacao.setClassificacao(classificacaoNome);

					// Salva a nova classificação usando o DAO
					classificacaoDAO.saveClassificacao(classificacao);

					// Envia uma resposta de sucesso
					response.setStatus(HttpServletResponse.SC_OK);
					response.getWriter().write("{\"message\":\"Classificação cadastrada com sucesso!\"}");
				} catch (Exception e) {
					e.printStackTrace();
					response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
					response.getWriter()
							.write("{\"error\":\"Erro ao cadastrar classificação: " + e.getMessage() + "\"}");
				}
			}

		}
	}
}