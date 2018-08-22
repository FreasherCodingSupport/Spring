<%-- 
    Document   : inq_form
    Created on : 29 Mar, 2018, 11:09:23 AM
    Author     : ww
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inquiry Form</title>
    </head>
    <body>
        <f:form  action="saveInq" method="post" modelAttribute="command" >
            
        <h1>Inquiry Form</h1>
            <table border="1" cellpadding="4">
                <tr>  
                    <td>
                     NAME:<f:input path="name"/>
                    </td>
                </tr>
                <tr>  
                    <td>
                     PHONE:<f:input path="phone"/>
                    </td>
                </tr>
                <tr>  
                    <td>GENDER:</td>
                    <td>
                        <f:radiobutton path="gender" value="M" label="Male"/>
                        <f:radiobutton path="gender" value="F" label="Female"/>
                    </td>
                </tr>
                <tr>  
                    <td>CITY:</td>
                     <td>
                         <f:select path="selectedCityId">
                             <f:option value="" lable="Select City"/>
                             <f:options items="${cityList}" itemLable="cityName" itemValue="cityId"/>
                         </f:select>        
                    </td>
                </tr>
                <tr>  
                    <td>
                     ADDRESS:<f:input path="address"/>
                    </td>
                </tr>
                <tr>  
                    <td>COURSES:</td>
                    <td>
                        <f:checkboxes path="courses" items="${courseList}"/>
                    </td>
                </tr>
                <tr>  
                    <td colspan="2">
                        <f:checkbox path="tNc" label="I Agree, with all Terms&Conditions"/>
                    </td>
                </tr>
                <tr>
                    <td align="right" colspan="2">
                        <f:button>SUBMIT</f:button>
                    </td>
                </tr>
    </f:form>
            </table>
    </body>
</html>

    