
	<%@ page isELIgnored = "false" import="java.util.*" %>


<%-- 	<h1>modle attribute date is</h1>
					<b>fav colore are::<%=Arrays.toString(((String[])request.getAttribute("favColor")))  %></b>
					<b> nick names are ::${nickName}</b>
					<b> phone Number are::${phoneNumber}</b>
					<b> idDetails are ::${idDetails }</b>
 --%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<h1>Model attribute data is:</h1>
<b>Fav colors are:</b><br>
<c:forEach var="color" items="${favColor}">
    ${color},
</c:forEach>
<br>
<b>Nick names are:</b><br>
<c:forEach var="name" items="${nickName}">
    ${name}
</c:forEach>
<br>
<b>Phone numbers are:</b><br>
<c:forEach var="ph" items="${phoneNumber}">
    ${ph},
</c:forEach>
<br>
<b>ID details:</b><br>
<c:forEach var="id" items="${idDetails}">
    ${id.key}, ${id.value}<br>
</c:forEach>

 
 