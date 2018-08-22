<%-- 
    Document   : elist
    Created on : 27 Mar, 2018, 3:50:35 PM
    Author     : ww
--%>

<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Employee List</title>
    </head>
    <body>
        <h1>Employee List</h1>
        <%--${emps}--%>
        <table border="1">
            <tr>
                <td>S.no.</td>
                <td>ID</td>
                <td>NAME</td>
                <td>SALARY</td>
                <td>REMARK</td>
            </tr>
            <c:forEach items="${emps}" var="e" varStatus="st">
               <tr>
                <td>${st.count}</td>
                <td>${e.empId}</td>
                <td>${e.name}</td>
                <td>${e.salary}</td>
                <td>${e.remark}</td>
            </tr> 
            </c:forEach>
        </table>
    </body>
</html>
