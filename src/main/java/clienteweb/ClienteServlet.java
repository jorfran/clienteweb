package clienteweb;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
/*
 * @WebServlet configura o padr�o da url , como
 * este servlet ser� chamado pelo navegador
 */
@WebServlet(urlPatterns={"/cliente","/clienteServlet","/clienteController"})
@SuppressWarnings("serial")
/*
 * ClienteServlet objeto java capaz de receber
 * requisi��es vindas da web
 */
public class ClienteServlet extends HttpServlet{
@Override
 protected void doGet(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException{
 //super.doGet(req, resp);
	 //System.out.println("Chamou pelo m�todo get");
	 resp.setCharacterEncoding("UTF-8");
	 resp.getWriter().print("Chamou pelo m�todo GET !");	 
}
 @Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	//System.out.println("Chamou pelo m�todo POST");
	 resp.setCharacterEncoding("UTF-8");
	 resp.getWriter().print("Chamou pelo m�todo POST !");
	}
 @Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	 resp.setCharacterEncoding("UTF-8");
	 resp.getWriter().print("Chamou pelo m�todo DELETE !");	
	}
 @Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	 resp.setCharacterEncoding("UTF-8");
	 resp.getWriter().print("Chamou pelo m�todo PUT !");	
	}
}
