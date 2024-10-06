<%@ taglib uri="http://www.springframework.org/tags/form" prefix="frm" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>UPDATE Employee</title>
</head>
<body>
    <h1 style="color:red;text-align:center">Update Employee</h1>
    <frm:form modelAttribute="emp">
        <table align="center" bgcolor="cyan">
            <tr>
                <td>Employee EmpNO:</td>
                <td><frm:input path="empno" readonly="true"/></td>
            </tr>
            <tr>
                <td>Employee Name:</td>
                <td><frm:input path="empname"/></td>
            </tr>
            <tr>
                <td>Employee Deg:</td>
                <td><frm:input path="deptname"/></td>
            </tr>
            <tr>
                <td>Employee MGR:</td>
                <td><frm:input path="mgr"/></td>
            </tr>
            <tr>
                <td>Employee HireDate:</td>
                <td><frm:input type="datetime-local" path="joinDate"/></td>
            </tr>
            <tr>
                <td>Employee Sal:</td>
                <td><frm:input path="salary"/></td>
            </tr>
            <tr>
                <td>Employee Communication:</td>
                <td><frm:input path="comm"/></td>
            </tr>
            <tr>
                <td>Employee Deptno:</td>
                <td><frm:input path="deptno"/></td>
            </tr>
            <tr>
                <td><input type="submit" value="submit"></td>
                <td><input type="reset" value="cancel"></td>
            </tr>
        </table>
    </frm:form>
</body>
</html>
