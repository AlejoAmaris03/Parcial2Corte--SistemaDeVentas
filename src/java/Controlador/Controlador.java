package Controlador;

import Modelo.Cliente;
import Modelo.ClienteDAO;
import Modelo.Empleado;
import Modelo.EmpleadoDAO;
import Modelo.Producto;
import Modelo.ProductoDAO;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Controlador extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String accion = request.getParameter("accion");
        String menu = request.getParameter("menu");
        Empleado e = new Empleado();
        EmpleadoDAO eDAO = new EmpleadoDAO();
        Cliente c = new Cliente();
        ClienteDAO cDAO = new ClienteDAO();
        Producto p = new Producto();
        ProductoDAO pDAO = new ProductoDAO();
        int id;

        if (menu.equals("Principal")) {
            request.getRequestDispatcher("/Principal.jsp").forward(request, response);
        }

        if (menu.equals("Empleado")) {
            switch (accion) {
                case "Listar":
                    ArrayList<Empleado> listaE = eDAO.listar();
                    request.setAttribute("listaE", listaE);
                    break;
                case "Agregar":
                    String dni = request.getParameter("dni");
                    String nombre = request.getParameter("nombre");
                    String tel = request.getParameter("tel");
                    String estado = request.getParameter("estado");
                    String usuario = request.getParameter("usuario");

                    e.setDni(dni);
                    e.setNombre(nombre);
                    e.setTel(tel);
                    e.setEstado(estado);
                    e.setUsuario(usuario);
                    
                    eDAO.agregar(e);
                    request.getRequestDispatcher("Controlador?menu=Empleado&accion=Listar").forward(request, response);
                    break;
                case "Editar":
                    id = Integer.parseInt(request.getParameter("id"));
                    
                    e = eDAO.listarId(id);
                    
                    request.setAttribute("empleado",e);
                    request.getRequestDispatcher("Controlador?menu=Empleado&accion=Listar").forward(request, response);
                    break;
                case "Actualizar":
                    String dni1 = request.getParameter("dni");
                    String nombre1 = request.getParameter("nombre");
                    String tel1 = request.getParameter("tel");
                    String estado1 = request.getParameter("estado");
                    String usuario1 = request.getParameter("usuario");
                    id = Integer.parseInt(request.getParameter("ID"));
                                        
                    e.setDni(dni1);
                    e.setNombre(nombre1);
                    e.setTel(tel1);
                    e.setEstado(estado1);
                    e.setUsuario(usuario1);
                    e.setId(id);
                    
                    eDAO.actualizar(e);
                    request.getRequestDispatcher("Controlador?menu=Empleado&accion=Listar").forward(request, response);
                    break;
                case "Eliminar":
                    id = Integer.parseInt(request.getParameter("id"));
                    eDAO.eliminar(id);
                    
                    request.getRequestDispatcher("Controlador?menu=Empleado&accion=Listar").forward(request, response);
                    break;
                default:
                    throw new AssertionError();
            }

            request.getRequestDispatcher("/Empleado.jsp").forward(request, response);
        }

        if (menu.equals("Cliente")) {
            switch (accion) {
                case "Listar":
                    ArrayList<Cliente> listaC = cDAO.listar();
                    request.setAttribute("listaC",listaC);
                    break;
                case "Agregar":
                    String dni = request.getParameter("dni");
                    String nombre = request.getParameter("nombre");
                    String direccion = request.getParameter("direccion");
                    String estado = request.getParameter("estado");

                    c.setDni(dni);
                    c.setNombre(nombre);
                    c.setDireccion(direccion);
                    c.setEstado(estado);
                    
                    cDAO.agregar(c);
                    request.getRequestDispatcher("Controlador?menu=Cliente&accion=Listar").forward(request, response);
                    break;
                case "Editar":
                    id = Integer.parseInt(request.getParameter("id"));
                    
                    c = cDAO.listarId(id);
                    
                    request.setAttribute("c",c);
                    request.getRequestDispatcher("Controlador?menu=Cliente&accion=Listar").forward(request, response);
                    break;
                case "Actualizar":
                    String dni1 = request.getParameter("dni");
                    String nombre1 = request.getParameter("nombre");
                    String direccion1 = request.getParameter("direccion");
                    String estado1 = request.getParameter("estado");
                    id = Integer.parseInt(request.getParameter("id"));

                    c.setDni(dni1);
                    c.setNombre(nombre1);
                    c.setDireccion(direccion1);
                    c.setEstado(estado1);
                    c.setId(id);
                    
                    cDAO.actualizar(c);
                    request.getRequestDispatcher("Controlador?menu=Cliente&accion=Listar").forward(request, response);                    
                    break;
                case "Eliminar":
                    id = Integer.parseInt(request.getParameter("id"));
                    cDAO.eliminar(id);
                    
                    request.getRequestDispatcher("Controlador?menu=Cliente&accion=Listar").forward(request, response);                                        
                    break;
                default:
                    throw new AssertionError();
            }
            
            request.getRequestDispatcher("/Cliente.jsp").forward(request, response);
        }
        
        if (menu.equals("Producto")) {
            switch (accion) {
                case "Listar":
                    ArrayList<Producto> listaP = pDAO.listar();
                    request.setAttribute("listaP",listaP);
                    break;
                case "Agregar":
                    String nombre = request.getParameter("nombre");
                    double precio = Double.parseDouble(request.getParameter("precio"));
                    int stock = Integer.parseInt(request.getParameter("stock"));
                    String estado = request.getParameter("estado");

                    p.setNombre(nombre);
                    p.setPrecio(precio);
                    p.setStock(stock);
                    p.setEstado(estado);
                    
                    pDAO.agregar(p);
                    request.getRequestDispatcher("Controlador?menu=Producto&accion=Listar").forward(request, response);
                    break;
                case "Editar":
                    id = Integer.parseInt(request.getParameter("id"));
                    
                    p = pDAO.listarId(id);
                    
                    request.setAttribute("p",p);
                    request.getRequestDispatcher("Controlador?menu=Producto&accion=Listar").forward(request, response);
                    break;
                case "Actualizar":
                    String nombre1 = request.getParameter("nombre");
                    double precio1 = Double.parseDouble(request.getParameter("precio"));
                    int stock1 = Integer.parseInt(request.getParameter("stock"));
                    String estado1 = request.getParameter("estado");
                    id = Integer.parseInt(request.getParameter("id"));

                    p.setNombre(nombre1);
                    p.setPrecio(precio1);
                    p.setStock(stock1);
                    p.setEstado(estado1);
                    p.setId(id);
                    
                    pDAO.actualizar(p);
                    request.getRequestDispatcher("Controlador?menu=Producto&accion=Listar").forward(request, response);                    
                    break;
                case "Eliminar":
                    id = Integer.parseInt(request.getParameter("id"));
                    pDAO.eliminar(id);
                    
                    request.getRequestDispatcher("Controlador?menu=Producto&accion=Listar").forward(request, response);                                        
                    break;
                default:
                    throw new AssertionError();
            }
                        
            request.getRequestDispatcher("/Producto.jsp").forward(request, response);
        }

        if (menu.equals("NuevaVenta")) {
            request.getRequestDispatcher("/RegistrarVenta.jsp").forward(request, response);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
