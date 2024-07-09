<%-- 
    Document   : admin
    Created on : 15 May, 2022, 6:40:30 AM
    Author     : HP
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="plantkartaction.SignupAction"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/bootstrap.css" type="text/css" rel="stylesheet">
    </head>
    <body>
      <%
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
            
        %> 
        <div>
            
            <div class="row">
                 <div class="col-lg-12">
                     <h4>Welcome admin: <%=email%></h4>
                 </div>
             </div>
            
        <div class="row">
                     <div class="col-lg-2">
                         <a class="btn btn-success btn-sm" data-toggle="modal" data-target="#addplant">Add Plants</a>
                     </div>
                     <div class="col-lg-2">
                         <a class="btn btn-success btn-sm" data-toggle="modal" data-target="#showplant">View Plants</a>
                     </div>
                     <div class="col-lg-2">
                         <a class="btn btn-success btn-sm" data-toggle="modal" data-target="#currentorder">Current Order</a>
                     </div>
                     <div class="col-lg-2">
                         <a class="btn btn-success btn-sm" data-toggle="modal" data-target="#delivered">Delivered Plants Status</a>
                     </div>
                     <div class="col-lg-2">
                         <a href="admin.jsp?msg=success" class="btn btn-success btn-sm" style="color:white" data-toggle="modal" data-target="#adminchatbox">Chat</a>
                     </div>
                     <div class="col-lg-2">
                         <a class="btn btn-success btn-sm" href="adminlogout.jsp">Logout</a>
                     </div>
                 </div>
        
        
        <table class="table table-dark table-bordered">
            <tr>
                <th>SNo</th>
                <th>EMAIL</th>
                <th>NAME</th>
                <th>MOBILE</th>
                <th>PASSWORD</th>
                <th>ADDRESS</th>
                <th>DELETE</th>
               <!-- <th>UPDATE</th>-->

            </tr>
            <%
               SignupAction ac=new SignupAction();
               ResultSet rs=  ac.getCustomers();
               int i=1;
               while(rs.next())
                 {
            %>
                   
            <tr>
                <td> <%=i%></td>
                <td><%=rs.getString(1)%></td>
                <td><%=rs.getString(2)%></td>
                <td><%=rs.getString(3)%></td>
                <td><%=rs.getString(4)%></td>
                <td><%=rs.getString(5)%></td>
               < <td><a href="deletepersonservlet?email=<%=rs.getString(1)%>" onclick="return confirm('Are you sure want to delete')" ><img src="img/deleteicon.png" style="width: 20px; height:20;"></a></td>
                <!--<td> 
                    <a href="admin.jsp?email=<%=rs.getString(1)%>" class="btn btn-success  btn-sm">UPDATE  </a>
                </td>-->
                  
            </tr>
            
        
        
            <%
                     i++;
                }
            %>
        </table>
        
        
            <%@include file="AddplantModel.jsp" %>

            <%@include file="plantordermodel.jsp" %>


        
        
        <div id="update" class="modal">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <h4>Update User</h4>
                        <button type="button" class="close" data-dismiss="modal" >&times;</button>
                    </div>
                    <div class="modal-body">
                        <form method="post" action="">
                            <div class="form-group">
                                <label>Email</label>
                                <input type="email" value="" class="form-control" name="email" readonly=""/> 
                            </div>
                            <div class="form-group">
                                <label>Name</label>
                                <input type="text" value="" class="form-control" name="user"/> 
                            </div>
                            <div class="form-group">
                                <label>Mobile</label>
                                <input type="text" value="" class="form-control" name="mobile"/> 
                            </div>
                            <div class="form-group">
                                <label>Password</label>
                                <input type="password" value="" class="form-control" name="pwd"/> 
                            </div>
                            <div class="form-group">
                                <label>Address</label>
                                <input type="text" value="" class="form-control" name="address"/> 
                            </div>
                            <input type="submit" value="Update User" class="btn btn-success"/>
                        </form> 
                    </div>
                    
                </div>
            </div>
        </div>
        </div>
        
       <script src="js/jquery.js"></script>
        <script src="js/bootstrap.js"></script>
        <script>
            
        </script>
    </body>
</html>
