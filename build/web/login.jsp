<%-- 
    Document   : login
    Created on : 15 May, 2022, 1:26:49 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/bootstrap.css" type="text/css" rel="stylesheet">
    </head>
    <body>
        <div class="container-fluid">
           
                <%@include file="navbar.jsp" %>
                <div class="row mt-3">
                    <div class="col-lg-4"></div>
                    <div class="col-lg-4">
                        <form method="post" action="LoginServlet">
                            <fieldset class="border p-3">
                                <legend class="w-auto">Login</legend>
                            <div class="form-group">
                                <input type="radio" name="person" value="user">User&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                <input type="radio" name="person" value="admin">Admin&nbsp;&nbsp;&nbsp;
                            </div>
                            <div class="form-group">
                                <label>USER</label>
                                <input type="text" name="user" class="form-control">
                            </div>
                            <div class="form-group">
                                <label>PASSWORD</label>
                                <input type="password" name="password" class="form-control">
                            </div>
                            <div class="form-group">
                                <input type="submit" value="Login" class="btn btn-success"> &nbsp;&nbsp;&nbsp;&nbsp;
                                <a href="#">Forget Password</a>&nbsp;&nbsp;&nbsp;&nbsp;
                                 <a href="signup.jsp">Sign up</a>
                            </div>  
                            
                            </fieldset>   
                        </form>
                        
                    </div>
                    <div class="col-lg-4"></div>
                </div>
           
        </div>
            
            
            
            <script src="js/jquery.js"></script>
        <script src="js/bootstrap.js"></script>
    </body>
</html>
