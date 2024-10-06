<%@ page isELIgnored="false" import="java.util.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<h1 style="color:red;text-alinr:center">show_report.jsp</h1>
<%-- <c:if test="${!empty empinfo}">
    <b>Emp Information: ${empinfo.id}, ${empinfo.Ename}, ${empinfo.salary}</b>
</c:if>
 --%>
 
 <b>Employee object::${empinfo}</b>
 <b>Employee name ::${empinfo.Ename }</b>