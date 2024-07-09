
package plantkartservlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import plantkartaction.SignupAction;
import plantkartbeans.signupbean;


public class signupservlet extends HttpServlet {

   

    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String email=request.getParameter("email");
        String mobile=request.getParameter("mobile");
        String name=request.getParameter("user");
        String password=request.getParameter("password");
    
        
        signupbean data=new signupbean();
        data.setEmail(email);
        data.setMobile(mobile);
        data.setPassword(password);
        data.setUser(name);
        
        SignupAction ac=new SignupAction();
        boolean b=ac.signUpRegister(data);
        
        if(b==true)
            response.sendRedirect("login.jsp");
        else
            response.sendRedirect("error.jsp");
        
    }

   
}
 