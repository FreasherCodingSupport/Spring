<%-- 
    Document   : emp_form
    Created on : 28 Mar, 2018, 6:52:04 PM
    Author     : ww
--%>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Employee Form</title>
        <style>
            .err{
                color: red;
                font-weight:bold;
                font-size: 18px
            }
            .err_bdr{
                border:1px solid red;
            }
            .nrm_bdr{
                border:1px solid gray; 
            }
        </style>
    </head>
    <body>
       <f:form  action="saveEmp" modelAttribute="ecmd" >
        <h1>Employee Form</h1>
        NAME:<f:input path="name" cssClass="nrm_bdr" cssErrorClass="err_bdr"/>
        <f:errors cssClass="err" path="name"/>
        <br/><br/>
        SALARY:<f:input path="salary" cssClass="nrm_bdr" cssErrorClass="err_bdr"/>
        <f:errors cssClass="err" path="salary"/>
        <br/><br/>
        REMARK:<f:input path="remark" cssClass="nrm_bdr" cssErrorClass="err_bdr"/>
        <f:errors cssClass="err"  path="remark"/>
        <br/><br/>
        <f:button>SAVE</f:button>
    </f:form>
   
    </body>
</html>