<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Admin Projectes</title>


<style>
#Table {
  font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

#Table td, #Table th {
  border: 1px solid #ddd;
  padding: 8px;
}

#Table tr:nth-child(even){background-color: #f2f2f2;}

#Table tr:hover {background-color: #ddd;}

#Table th {
  padding-top: 12px;
  padding-bottom: 12px;
  text-align: left;
  background-color: #4CAF50;
  color: white;
}
</style>


</head>
<body>
    <div align="center">              
              
       <h1>Projectes</h1>
        <h3>
            <a href="newProject">NOU Projecte</a>
        </h3>
  		<table id="Table">
 
            <th>Nom Projecte</th>
            <th>Data d'entrega</th>
            <th>Pressupost</th>
          
            <c:forEach var="project" items="${listProject}">
                <tr>
 
                    <td>${project.project_name}</td>
                    <td>${project.delivery_date}</td>
                    <td>${project.budget}</td>
                    
                    <!-- A) Se puede añadir class="btn-default" a A href... y darle config para que parezc un botón... -->                  
                    
                    <td><a href="editProject?project_id=${project.project_id}">Modifica</a>
                        <a href="deleteProject?project_id=${project.project_id}">Elimina</a></td>
 
                </tr>
            </c:forEach>
        </table>       
        
    </div>
</body>
</html>