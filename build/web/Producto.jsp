<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
        <title>Producto</title>
    </head>
    
    <body>
        <div class="d-flex">
            <div class="card col-sm-4">
                <div class="card-body">
                    <form action="Controlador?menu=Producto" method="post">
                        <div class="form-group">
                            <input class="form-control" type="hidden" name="id" value="${p.getId()}">
                        </div>

                        <div class="form-group">
                            <label>Nombres</label>
                            <input class="form-control rounded-pill" type="text" name="nombre" value="${p.getNombre()}">
                        </div>

                        <div class="form-group">
                            <label>Precio</label>
                            <input class="form-control rounded-pill" type="text" name="precio" value="${p.getPrecio()}">
                        </div>

                        <div class="form-group">
                            <label>Stock</label>
                            <input class="form-control rounded-pill" type="text" name="stock" value="${p.getStock()}">
                        </div>

                        <div class="form-group">
                            <label>Estado</label>
                            <input class="form-control rounded-pill" type="text" name="estado" value="${p.getEstado()}">
                        </div>

                        <input class="btn btn-info rounded-pill" type="submit" name="accion" value="Agregar">
                        <input class="btn btn-success rounded-pill" type="submit" name="accion" value="Actualizar">
                    </form>
                </div>
            </div>

            <div class="col-sm-8">
                <table class="table table-hover">
                    <thead>
                        <tr>
                            <th>ID</th>
                            <th>Nombres</th>
                            <th>Precio</th>
                            <th>Stock</th>
                            <th>Estado</th>
                            <th>Acciones</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="pr" items="${listaP}">
                            <tr>
                                <td>${pr.getId()}</td>
                                <td>${pr.getNombre()}</td>
                                <td>${pr.getPrecio()}</td>
                                <td>${pr.getStock()}</td>
                                <td>${pr.getEstado()}</td>
                                <td>
                                    <a class="btn btn-warning rounded-pill" href="Controlador?menu=Producto&accion=Editar&id=${pr.getId()}">Editar</a>
                                    <a class="btn btn-danger rounded-pill" href="Controlador?menu=Producto&accion=Eliminar&id=${pr.getId()}">Eliminar</a>
                                </td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>

        <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.min.js" integrity="sha384-+sLIOodYLS7CIrQpBjl+C7nPvqq+FbNUBDunl/OZv93DB7Ln/533i8e/mZXLi/P+" crossorigin="anonymous"></script>
    </body>
</html>
