<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
        <title>Iniciar Sesion</title>
    </head>

    <body>
        <div class="container mt-4 col-lg-4 justify-content-center">
            <div class="card col-sm-10 shadow-lg p-3 mb-5 bg-body rounded">
                <div class="card-body">
                    <form class="form-sign" action="Validar" method="post">
                        <div class="form-group text-center"> 
                            <h3>Iniciar Sesion</h3>
                            <br>
                            <img src="Imgs/logo.png" alt="Logo" height="50" width="170"/>
                            <label style="padding-top:10px">Bienvenido/a al Sistema</label>
                        </div>
                        
                        <div class="form-group"> 
                            <label>Usuario</label>
                            <input class="form-control rounded-pill" type="text" name="usuario">
                        </div>
                        
                        <div class="form-group"> 
                            <label>Contraseña</label>
                            <input class="form-control rounded-pill" type="password" name="clave">
                        </div>
                        
                        <input class="btn btn-primary btn-block rounded-pill" type="submit" name="accion" value="Ingresar">
                    </form>
                </div>
            </div>
        </div>

        <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.min.js" integrity="sha384-+sLIOodYLS7CIrQpBjl+C7nPvqq+FbNUBDunl/OZv93DB7Ln/533i8e/mZXLi/P+" crossorigin="anonymous"></script>
    </body>
</html>
