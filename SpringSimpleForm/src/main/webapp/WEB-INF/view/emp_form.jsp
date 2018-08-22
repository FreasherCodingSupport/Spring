
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
    <f:form  action="saveEmp" modelAttribute="ecmd" >
        <h1>Employee Form</h1>
        NAME:<f:input path="name"/><br/><br/>
        SALARY:<f:input path="salary"/><br/><br/>
        REMARK:<f:input path="remark"/><br/><br/>
        <f:button>SAVE</f:button>
    </f:form>
   