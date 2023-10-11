<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">        
        <link rel="stylesheet" type="text/css" href="Estilos/estiloFunNav.css"/>
        <title>JSP Page</title>
    </head>

    <body>
        <div class="form-group text-center pt-4">
            <h3>Registrar Venta</h3>
        </div>
        
        <div class="d-flex pr-4 pl-4 pb-5 pt-1">
            <div class="col-sm-5">
                <div class="card">
                    <form action="Controlador?menu=NuevaVenta" method="post">
                        <div class="card-body">
                            <div class="form-group">
                                <label>Datos del Cliente</label>
                            </div>

                            <div class="form-group d-flex">
                                <div class="col-sm-6 d-flex">
                                    <input class="form-control" type="text" name="codigoCliente" value="${c.getDni()}" placeholder="Dni">
                                    <input class="btn btn-info" type="submit" name="accion" value="Buscar Cliente">
                                </div>

                                <div class="col-sm-6">
                                    <input class="form-control" type="text" name="nombresCliente" value="${c.getNombre()}" placeholder="Datos Cliente">
                                </div>
                            </div>

                            <div class="form-group">
                                <label>Datos Producto</label>
                            </div>

                            <div class="form-group d-flex">
                                <div class="col-sm-6 d-flex">
                                    <input class="form-control" type="text" name="codigoProducto" placeholder="ID">
                                    <input class="btn btn-info" type="submit" name="accion" value="Buscar Producto">
                                </div>

                                <div class="col-sm-6">
                                    <input class="form-control" type="text" name="nombresProducto" placeholder="Datos Producto">
                                </div>
                            </div>

                            <div class="form-group d-flex">
                                <div class="col-sm-6">
                                    <input class="form-control" type="text" name="precio" placeholder="S/.0.00">
                                </div>

                                <div class="col-sm-3">
                                    <input class="form-control" type="number" name="cant">
                                </div>

                                <div class="col-sm-3">
                                    <input class="form-control" type="text" name="stock" placeholder="Stock">
                                </div>
                            </div>

                            <div class="form-group">
                                <input class="btn btn-info rounded-pill" type="submit" name="accion" value="Agregar">
                                <a class="btn btn-secondary rounded-pill" href="Controlador?menu=NuevaVenta&accion=default">Limpiar</a>
                            </div>
                        </div>
                    </form>
                </div>
            </div>

            <div class="col-sm-7">
                <div class="card">
                    <div class="card-body">
                        <div class="d-flex col-sm-5 ml-auto">
                            <label>Número de Serie</label>
                            <input class="form-control" type="text" name="noSerie">
                        </div>
                        
                        <br>
                        <table class="table table-hover table-dark">
                            <thead>
                                <tr>
                                    <th>Nro.</th>
                                    <th>Codigo</th>
                                    <th>Descripción</th>
                                    <th>Precio</th>
                                    <th>Cantidad</th>
                                    <th>SubTotal</th>
                                    <th>Acciones</th>
                                </tr>
                            </thead>
                            <tbody>
                                <tr>
                                    <td></td>
                                    <td></td>
                                    <td></td>
                                    <td></td>
                                    <td></td>
                                    <td></td>
                                    <td></td>
                                </tr>
                            </tbody>
                        </table>
                    </div>
                    
                    <div class="card-footer">
                        <input class="btn btn-success rounded-pill" type="submit" name="accion" value="Generar Venta">
                        <input class="btn btn-danger rounded-pill" type="submit" name="accion" value="Cancelar">
                    </div>
                </div>
            </div>
        </div>

        <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.min.js" integrity="sha384-+sLIOodYLS7CIrQpBjl+C7nPvqq+FbNUBDunl/OZv93DB7Ln/533i8e/mZXLi/P+" crossorigin="anonymous"></script>
    </body>
</html>
