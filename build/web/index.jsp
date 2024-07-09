
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Plantkarts</title>
        <link href="css/bootstrap.css" type="text/css" rel="stylesheet">
    </head>
    <body>
         <div class="container-fluid">
             <div class="row"><%@include file="top.jsp" %></div>
             <%@include file="navbar.jsp" %>
             <%@include file="slider.jsp" %>
                <div class="row mt-3">
                    <div class="card-deck">
                        <div class="card" style="width:18rem">
                            <img src="img/plantsforsale/croton.jpg"/>
                            <div class="card-body">
                                <h3>Croton</h3>
                                <p>Croton is indoor plant</p>
                                <p>Price: 1/- Per Plant</p>
                                <a href="buyplant.jsp?pid=1000" class="btn btn-danger">Buy</a>
                            </div>
                        </div>
                        <div class="card" style="width:18rem">
                            <img src="img/plantsforsale/Rubber-Plant.jpg"/>
                            <div class="card-body">
                                <h3>Rubber-Plant</h3>
                                <p>Rubber-Plant is indoor and outdoor plant</p>
                                <p>Price: 110/- Per Plant</p>
                                <a href="buyplant.jsp?pid=1001" class="btn btn-danger">Buy</a>
                            </div>
                        </div>
                        
                        <div class="card" style="width:18rem">
                            <img src="img/plantsforsale/cyrus.png"/>
                            <div class="card-body">
                                <h3>Cyrus</h3>
                                <p>Cyrus is outdoor plant</p>
                                <p>Price: 180/- Per Plant</p>
                                <a href="buyplant.jsp?pid=1002" class="btn btn-danger">Buy</a>
                            </div>
                        </div>
                         <div class="card" style="width:18rem">
                             <img src="img/plantsforsale/red_lily_flower.jpg"/>
                            <div class="card-body">
                                <h3>Red Lily</h3>
                                <p>Red Lily is indoor and outdoor plant</p>
                                <p>Price: 90/- Per Plant</p>
                                <a href="buyplant.jsp?pid=1003" class="btn btn-danger">Buy</a>
                            </div>
                        </div>
                        <div class="card" style="width:18rem">
                            <img src="img/plantsforsale/snakeplant.jpg"/>
                            <div class="card-body">
                                <h3>Snake Plant</h3>
                                <p>Snake plant is indoor plant</p>
                                <p>Price: 90/- Per Plant</p>
                                <a href="" class="btn btn-danger">Buy</a>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="row mt-3">
                    <div class="card-deck">
                        <div class="card" style="width:18rem">
                            <img src="img/plantsforsale/plumeria-white.jpg"/>
                            <div class="card-body">
                                <h3>Plumeria</h3>
                                <p>Plumeria is indoor plant</p>
                                <p>Price: 100/- Per Plant</p>
                                <a href="" class="btn btn-danger">Buy</a>
                            </div>
                        </div>
                        <div class="card" style="width:18rem">
                            <img src="img/plantsforsale/paam.jpg"/>
                            <div class="card-body">
                                <h3>Paam-Plant</h3>
                                <p>Paam-Plant is indoor and outdoor plant</p>
                                <p>Price: 80/- Per Plant</p>
                                <a href="" class="btn btn-danger">Buy</a>
                            </div>
                        </div>
                        
                        <div class="card" style="width:18rem">
                            <img src="img/plantsforsale/Blackeyedsusan.jpg"/>
                            <div class="card-body">
                                <h3>Blackeyedsusan</h3>
                                <p>Cyrus is outdoor plant</p>
                                <p>Price: 180/- Per Plant</p>
                                <a href="" class="btn btn-danger">Buy</a>
                            </div>
                        </div>
                         <div class="card" style="width:18rem">
                             <img src="img/plantsforsale/download.jpg"/>
                            <div class="card-body">
                                <h3>Aglaonema</h3>
                                <p>Aglaonema is outdoor plant</p>
                                <p>Price: 90/- Per Plant</p>
                                <a href="" class="btn btn-danger">Buy</a>
                            </div>
                        </div>
                        <div class="card" style="width:18rem">
                            <img src="img/plantsforsale/moneyplant.jpg"/>
                            <div class="card-body">
                                <h3>Money Plant</h3>
                                <p>Money Plant is outdoor plant</p>
                                <p>Price: 90/- Per Plant</p>
                                <a href="" class="btn btn-danger">Buy</a>
                            </div>
                        </div>
                    </div>
                </div>
                
             <%@include file="footer.jsp" %>
        </div>

        
        <script src="js/jquery.js"></script>
        <script src="js/bootstrap.js"></script>

    </body>
</html>
