package Modelo;

import Config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class EmpleadoDAO{
    Conexion c = new Conexion();
    Connection con;
    PreparedStatement ps = null;
    ResultSet rs = null;
    int r;
    
    public Empleado validar(String usuario,String clave){
        con = c.conexion();
        Empleado emp = new Empleado();
        
        try{
            ps = con.prepareStatement("SELECT * FROM Empleado WHERE ((User = ?) AND (Dni = ?))");
            ps.setString(1,usuario);
            ps.setString(2,clave);
            rs = ps.executeQuery();
            
            while(rs.next()){
                emp.setId(rs.getInt("IdEmpleado"));
                emp.setUsuario(rs.getString("User"));
                emp.setDni(rs.getString("Dni"));
                emp.setNombre(rs.getString("Nombres"));
            }
        } 
        catch(Exception e){
            System.out.println("ERROR al leer la BD\n"+e);
        }
        
        return emp;
    }
    
    //Op. del CRUD
    
    public ArrayList<Empleado> listar(){
        con = c.conexion();
        ArrayList<Empleado> listaE = new ArrayList<Empleado>();
        
        try{
            ps = con.prepareStatement("SELECT * FROM Empleado");
            rs = ps.executeQuery();
            
            while(rs.next()){
                Empleado e = new Empleado();
                e.setId(rs.getInt(1));
                e.setDni(rs.getString(2));
                e.setNombre(rs.getString(3));
                e.setTel(rs.getString(4));
                e.setEstado(rs.getString(5));
                e.setUsuario(rs.getString(6));
                
                listaE.add(e);
            }
        } 
        catch(Exception e){
            System.out.println("ERROR a leer la Tabla\n"+e);
        }
        
        return listaE;
    }
    public int agregar(Empleado emp){
        con = c.conexion();
        
        try{
            ps = con.prepareStatement("INSERT INTO Empleado (Dni,Nombres,Telefono,Estado,User)"
                +"VALUES (?,?,?,?,?)");
            ps.setString(1,emp.getDni());
            ps.setString(2,emp.getNombre());
            ps.setString(3,emp.getTel());
            ps.setString(4,emp.getEstado());
            ps.setString(5,emp.getUsuario());
            ps.executeUpdate();
        } 
        catch(Exception e){
            System.out.println("ERROR al insertar datos en la BD\n"+e);
        }
        
        return r;
    }
    public Empleado listarId(int id){
        con = c.conexion();
        Empleado emp = new Empleado();
        
        try{
            ps = con.prepareStatement("SELECT * FROM Empleado WHERE IdEmpleado = "+id);
            rs = ps.executeQuery();
            
            while(rs.next()){
                emp.setId(rs.getInt(1));
                emp.setDni(rs.getString(2));
                emp.setNombre(rs.getString(3));
                emp.setTel(rs.getString(4));
                emp.setEstado(rs.getString(5));
                emp.setUsuario(rs.getString(6));
            }
        } 
        catch(Exception e){
            System.out.println("ERROR a leer la Tabla - IdEmp\n"+e);
        }
        
        return emp;
    }
    public int actualizar(Empleado emp){
        con = c.conexion();
        
        try{
            ps = con.prepareStatement("UPDATE Empleado SET Dni = ?,Nombres = ?, Telefono = ?,Estado = ?, User = ? WHERE (IdEmpleado = ?)");
            ps.setString(1,emp.getDni());
            ps.setString(2,emp.getNombre());
            ps.setString(3,emp.getTel());
            ps.setString(4,emp.getEstado());
            ps.setString(5,emp.getUsuario());
            ps.setInt(6,emp.getId());
            ps.executeUpdate();
        } 
        catch(Exception e){
            System.out.println("ERROR al actualizar datos en la BD\n"+e);
        }
        
        return r;
    }
    public void eliminar(int id){
        con = c.conexion();
        
        try{
            ps = con.prepareStatement("DELETE FROM Empleado WHERE IdEmpleado = "+id);
            ps.executeUpdate();
        } 
        catch(Exception e){
            System.out.println("ERROR al eliminar datos en la BD\n"+e);
        }
    }
}
