<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>
    <div class="container">
        <c:choose>
            <c:when test="${!empty empreport.getContent()}">
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
                    <c:forEach var="emp" items="${empreport.getContent()}">
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
                                <a href="emp_edit?no=${emp.empno}"><img alt="edit" src="images/edit.png" width="50" height="60"></a>
                            </td>
                            <td>
                                <a onclick="return confirm('Do you want to delete?')" href="emp_delete?no=${emp.empno}"><img alt="delete" src="images/delete.jpeg" width="50" height="60"></a>
                            </td>
                        </tr>
                    </c:forEach>
                </table>
                <p style="text-align:center">
                    <c:if test="${empreport.hasPrevious()}">
                        <a href="page_report?page=${empsData.pageable.pageNumber - 1}">previous</a>&nbsp;&nbsp;
                    </c:if>
                    
                    <c:if test="${!empreport.hasPrevious()}">
                        <a href="page_report?page=0">first</a>
                    </c:if>

                    <c:forEach var="i" begin="0" end="${empreport.totalPages - 1}">
                        <a href="page_report?page=${i}">${i + 1}</a>&nbsp;
                    </c:forEach>

                    <c:if test="${empreport.hasNext()}">
                        <a href="page_report?page=${empsData.pageable.pageNumber + 1}">next</a>
                    </c:if>
                    
                    <c:if test="${empreport.pageable.pageNumber < empreport.totalPages - 1}">
                        <a href="page_report?page=${empreport.totalPages - 1}">last</a>
                    </c:if>
                </p>
            </c:when>
            <c:otherwise>
                <h1 style="color:red;text-align:center">Employees not found</h1>
            </c:otherwise>
        </c:choose>

        <c:if test="${!empty empreport}">
            <h3 style="color:green;text-align:center">${resultMsg}</h3>
        </c:if>
    </div>

    <br><br>
    <h1 style="color:green; text-align:center">${registe}</h1><br>
    <center>
        <a href="emp_add"><img alt="add employee" src="images/emp_add.png" width="80" height="100"></a><br>
        <a href="./"><img alt="HOME" src="images/home.png" width="80" height="100"></a>
    </center>
</body>
</html>
