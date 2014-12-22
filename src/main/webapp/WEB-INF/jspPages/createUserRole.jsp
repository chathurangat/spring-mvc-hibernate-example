<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>

Creating User Roles <br/>

<sf:form method="POST"  action="createUserRole" modelAttribute="userRoleModel">

    <sf:errors path="roleNameEnglish" cssclass="error"> </sf:errors><br/>
    <sf:input path="roleNameEnglish" /> <br/>

    <sf:errors path="roleNameSinhala" cssclass="error"> </sf:errors><br/>
    <sf:input path="roleNameSinhala" /> <br/>

    <sf:errors path="roleNameTamil" cssclass="error"> </sf:errors><br/>
    <sf:input path="roleNameTamil" /> <br/>

    <input type="submit" value="Submit"/>

</sf:form>

</body>
</html>
