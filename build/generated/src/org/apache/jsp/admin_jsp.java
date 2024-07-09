package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import plantkartaction.SignupAction;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"css/bootstrap.css\" type=\"text/css\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("      ");

            String email=null;
            HttpSession sess=request.getSession();
        
            if(sess!=null)
            {
                email=sess.getAttribute("adminSessionid").toString();
            }
            else
            {
                response.sendRedirect("login.jsp");
            }
            
        
      out.write(" \n");
      out.write("        <h1>welcome Admin ");
      out.print(email);
      out.write("  </h1>\n");
      out.write("        <a href=\"logout.jsp\">Logout</a>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <table class=\"table table-dark table-bordered\">\n");
      out.write("            <tr>\n");
      out.write("                <th>SNo</th>\n");
      out.write("                <th>EMAIL</th>\n");
      out.write("                <th>NAME</th>\n");
      out.write("                <th>MOBILE</th>\n");
      out.write("                <th>PASSWORD</th>\n");
      out.write("                <th>ADDRESS</th>\n");
      out.write("                <th>DELETE</th>\n");
      out.write("                <th>UPDATE</th>\n");
      out.write("\n");
      out.write("            </tr>\n");
      out.write("            ");

               SignupAction ac=new SignupAction();
               ResultSet rs=  ac.getCustomers();
               int i=1;
               while(rs.next())
                 {
            
      out.write("\n");
      out.write("                   \n");
      out.write("            <tr>\n");
      out.write("                <td> ");
      out.print(i);
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getString(1));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getString(2));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getString(3));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getString(4));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getString(5));
      out.write("</td>\n");
      out.write("                <td><a href=\"deletepersonservlet?email=");
      out.print(rs.getString(1));
      out.write("\" onclick=\"return confirm('Are you sure want to delete')\" ><img src=\"img/deleteicon.png\" style=\"width: 20px; height:20;\"></a></td>\n");
      out.write("                <td> \n");
      out.write("                    <a href=\"admin.jsp?email=");
      out.print(rs.getString(1));
      out.write("\" class=\"btn btn-success  btn-sm\">UPDATE  </a>\n");
      out.write("                </td>\n");
      out.write("                  \n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("        \n");
      out.write("        \n");
      out.write("            ");

                     i++;
                }
            
      out.write("\n");
      out.write("        </table>\n");
      out.write("        \n");
      out.write("        <div id=\"update\" class=\"modal\">\n");
      out.write("            <div class=\"modal-dialog\">\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                    <div class=\"modal-header\">\n");
      out.write("                        <h4>Update User</h4>\n");
      out.write("                        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" >&times;</button>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-body\">\n");
      out.write("                        <form method=\"post\" action=\"\">\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>Email</label>\n");
      out.write("                                <input type=\"email\" value=\"\" class=\"form-control\" name=\"email\" readonly=\"\"/> \n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>Name</label>\n");
      out.write("                                <input type=\"text\" value=\"\" class=\"form-control\" name=\"user\"/> \n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>Mobile</label>\n");
      out.write("                                <input type=\"text\" value=\"\" class=\"form-control\" name=\"mobile\"/> \n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>Password</label>\n");
      out.write("                                <input type=\"password\" value=\"\" class=\"form-control\" name=\"pwd\"/> \n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>Address</label>\n");
      out.write("                                <input type=\"text\" value=\"\" class=\"form-control\" name=\"address\"/> \n");
      out.write("                            </div>\n");
      out.write("                            <input type=\"submit\" value=\"Update User\" class=\"btn btn-success\"/>\n");
      out.write("                        </form> \n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-footer\">\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("       <script src=\"js/jquery.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.js\"></script>\n");
      out.write("        <script>\n");
      out.write("            \n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
