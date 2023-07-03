<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
    <title>Sistema de Capacitacion 2.0 - Listados</title>
    <style>
        body {
            background-color: white;
            color: green;
          }
          
          .success-message {
            color: green;
            font-weight: bold;
          }
        </style>
</head>
<body>
    <h1 style="color: darkgreen; font-family: verdana, arial;">Sistema de Capacitacion 2.0 - Listados</h1>
    
    <form method="get" action="listados.jsp">
        <label for="opciones" style="color: darkgreen; font-family: verdana, arial;">Selecciona una opción:</label>
        <select id="opciones" name="opcion" style="color: darkgreen; font-family: verdana, arial;">
            <option value="ID">ID</option>
            <option value="Cliente">Cliente</option>
            <option value="Administrativo">Administrativo</option>
            <option value="Profesional">Profesional</option>
            <option value="Capacitacion">Capacitacion</option>
        </select>
        <input type="submit" value="Mostrar" style="color: darkgreen; font-family: verdana, arial;">
    </form>

    <%-- Obtener el valor seleccionado de la opción --%>
    <% String opcion = request.getParameter("opcion"); %>
    
    <%-- Conexión a la base de datos --%>
    <% String url = "jdbc:mysql://localhost:3306/prevencion_grupo05";
       String user = "tu_usuario";
       String password = "tu_contraseña";
    
       try {
           Class.forName("com.mysql.jdbc.Driver");
           Connection conn = DriverManager.getConnection(url, user, password);
           Statement stmt = conn.createStatement();
    
           <%-- Consulta según la opción seleccionada --%>
           <% if (opcion.equals("Cliente")) { %>
               <%-- Consulta para obtener los datos de los clientes --%>
               String query = "SELECT usuario, Nombre, rut, apellido, correo, telefono, AFP, dirección, comuna FROM clientes";
               ResultSet rs = stmt.executeQuery(query);
               %>
    
               <%-- Mostrar los datos de los clientes --%>
               <h2 style="color: darkgreen; font-family: verdana, arial;">Listado de Clientes:</h2>
               <table>
                   <tr>
                       <th>Usuario</th>
                       <th>Nombre</th>
                       <th>Rut</th>
                       <th>Apellido</th>
                       <th>Correo</th>
                       <th>Teléfono</th>
                       <th>AFP</th>
                       <th>Dirección</th>
                       <th>Comuna</th>
                   </tr>
                   <% while (rs.next()) { %>
                       <tr>
                           <td><%= rs.getString("usuario") %></td>
                           <td><%= rs.getString("Nombre") %></td>
                           <td><%= rs.getString("rut") %></td>
                           <td><%= rs.getString("apellido") %></td>
                           <td><%= rs.getString("correo") %></td>
                           <td><%= rs.getString("telefono") %></td>
                           <td><%= rs.getString("AFP") %></td>
                           <td><%= rs.getString("dirección") %></td>
                           <td><%= rs.getString("comuna") %></td>
                       </tr>
                   <% } %>
               </table>
               <% rs.close(); %>
           <% } else if (opcion.equals("Capacitacion")) { %>
               <%-- Consulta para obtener los datos de las capacitaciones --%>
               String query = "SELECT Nombre, detalle, fecha, hora, lugar, duración, cantidad FROM capacitaciones";
               ResultSet rs = stmt.executeQuery(query);
               %>
    
               <%-- Mostrar los datos de las capacitaciones --%>
               <h2 style="color: darkgreen; font-family: verdana, arial;">Listado de Capacitaciones:</h2>
               <table>
                   <tr>
                       <th>Nombre</th>
                       <th>Detalle</th>
                       <th>Fecha</th>
                       <th>Hora</th>
                       <th>Lugar</th>
                       <th>Duración</th>
                       <th>Cantidad</th>
                   </tr>
                   <% while (rs.next()) { %>
                       <tr>
                           <td><%= rs.getString("Nombre") %></td>
                           <td><%= rs.getString("detalle") %></td>
                           <td><%= rs.getString("fecha") %></td>
                           <td><%= rs.getString("hora") %></td>
                           <td><%= rs.getString("lugar") %></td>
                           <td><%= rs.getString("duración") %></td>
                           <td><%= rs.getString("cantidad") %></td>
                       </tr>
                   <% } %>
               </table>
               <% rs.close(); %>
           <% } else if (opcion.equals("Profesional")) { %>
               <%-- Consulta para obtener los datos de los profesionales --%>
               String query = "SELECT usuario, Nombre, run, apellido, correo, telefono, cargo FROM profesionales";
               ResultSet rs = stmt.executeQuery(query);
               %>
    
               <%-- Mostrar los datos de los profesionales --%>
               <h2 style="color: darkgreen; font-family: verdana, arial;">Listado de Profesionales:</h2>
               <table>
                   <tr>
                       <th>Usuario</th>
                       <th>Nombre</th>
                       <th>Run</th>
                       <th>Apellido</th>
                       <th>Correo</th>
                       <th>Teléfono</th>
                       <th>Cargo</th>
                   </tr>
                   <% while (rs.next()) { %>
                       <tr>
                           <td><%= rs.getString("usuario") %></td>
                           <td><%= rs.getString("Nombre") %></td>
                           <td><%= rs.getString("run") %></td>
                           <td><%= rs.getString("apellido") %></td>
                           <td><%= rs.getString("correo") %></td>
                           <td><%= rs.getString("telefono") %></td>
                           <td><%= rs.getString("cargo") %></td>
                       </tr>
                   <% } %>
               </table>
               <% rs.close(); %>
           <% } else if (opcion.equals("Administrativo")) { %>
               <%-- Consulta para obtener los datos de los administrativos --%>
               String query = "SELECT usuario, Nombre, run, apellido, correo, area FROM administrativos";
               ResultSet rs = stmt.executeQuery(query);
               %>
    
               <%-- Mostrar los datos de los administrativos --%>
               <h2 style="color: darkgreen; font-family: verdana, arial;">Listado de Administrativos:</h2>
               <table>
                   <tr>
                       <th>Usuario</th>
                       <th>Nombre</th>
                       <th>Run</th>
                       <th>Apellido</th>
                       <th>Correo</th>
                       <th>Área</th>
                   </tr>
                   <% while (rs.next()) { %>
                       <tr>
                           <td><%= rs.getString("usuario") %></td>
                           <td><%= rs.getString("Nombre") %></td>
                           <td><%= rs.getString("run") %></td>
                           <td><%= rs.getString("apellido") %></td>
                           <td><%= rs.getString("correo") %></td>
                           <td><%= rs.getString("area") %></td>
                       </tr>
                   <% } %>
               </table>
               <% rs.close(); %>
           <% }
              stmt.close();
              conn.close();
           } catch (ClassNotFoundException | SQLException e) {
               e.printStackTrace();
           }
        %>
    
    <form method="get" action="index.jsp">
        <input type="submit" value="Volver" style="color: darkgreen; font-family: verdana, arial;">
    </form>
</body>
</html>
