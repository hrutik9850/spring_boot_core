<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <c:choose>
        <c:when test="${!empty empreport}">
            <h1 style="color:red;text-align:center">Employees Report</h1>
            <table border="1" align="center" bgcolor="gray">
                <tr style="color:blue">
                    <th>EMP_NO</th>
                    <th>EMP_NAME</th>
                    <th>JOB</th>
                    <th>JOIN DATE</th>
                    <th>SALARY</th>
                    <th>COMM</th>
                    <th>SALARY</th>
                    <th>DEPTNO</th>
                    <th>EDIT OPERATION</th>
                    <th>DELETE OPERATION</th>
                   
                </tr>
                <c:forEach var="emp" items="${empreport}">
                    <tr style="color:white">
                        <td>${emp.empno}</td>
                        <td>${emp.empname}</td>
                        <td>${emp.deptname}</td>
                        <td>${emp.mgr}</td>
                        <td>${emp.joinDate}</td>
                        <td>${emp.salary}</td>
                        <td>${emp.comm}</td>
                        <td>${emp.deptno}</td>
                        <td>
                      	  <a href="emp_edit?no=${emp.empno}"><img alt="eadit" src="images/edit.png"width="50",height="60"></a>
                         </td>
                        <td>
                       	 <a href="emp_delete?no=${emp.empno}"><img alt="eadit" src="images/delete.jpeg"width="50",height="60"></a>
                        </td>
                      
                        
                    </tr>
                </c:forEach>
            </table>
        </c:when>
        <c:otherwise>
            <h1 style="color:red;text-align:center">Employees not found</h1>
        </c:otherwise>
    </c:choose>
    
    <br>
    <br>
    <h1 style = "color:green; text-align:center">${registe}</h1><br>
    <center>
    	<a href="emp_add"><img alt="add employee" src="images/emp_add.png" width="80",height="100"></a><br>
    	<a href="./"><img alt="HOME" src="images/home.png" width="80",height="100"></a>
    </center>
</body>
</html>
