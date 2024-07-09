/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package plantkartservlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import plantkartaction.SignupAction;


@WebServlet(name = "deletepersonservlet", urlPatterns = {"/deletepersonservlet"})
public class deletepersonservlet extends HttpServlet {

   
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String email=request.getParameter("email");
        SignupAction ac=new SignupAction();
      boolean b=  ac.deletePerson(email);
        if(b==true)
        {
            response.sendRedirect("admin.jsp");
        }
    }

    
}
