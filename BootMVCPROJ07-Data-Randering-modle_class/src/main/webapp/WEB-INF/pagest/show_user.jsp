<%@ page isELIgnored = "false" import="java.util.*" %>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

 
 <h1 style="color:red;text-alignt:center">show_user.jsp</h1>
 
 <%-- <b>data show ::${empinfo}</b> <br>
 <b> data salary::${empinfo.salary}</b><br>
  --%>
  
  
 <%--  <c:forEach var="Employee" items="${empinfo}">
  <br>
  ${Employee} <br>
  
  </c:forEach> --%>
     <c:choose>
        <c:when test="${!empty empinfo}">
            <table border="1" bgcolor="gray" align="center">
                <tr><th>Id</th><th>ename</th><th>salary</th></tr>
                <c:forEach var="emp" items="${empinfo}">
                    <tr>
                        <td>${emp.id}</td>
                        <td>${emp.ename}</td>
                        <td>${emp.salary}</td>
                    </tr>
                </c:forEach>
            </table>
        </c:when>
        <c:otherwise>
            <h1 style="color:red; text-align:center">Employee not found</h1>
        </c:otherwise>
    </c:choose>