<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<form:form action="/TechStackForPss/login" method="post" commandName="userVO">
    <div><label>username:</label><form:input path="username"/><form:errors path="username"/></div>
    <div><label>password:</label><form:password path="password"/><form:errors path="password"/></div>
    <input type="submit" value="submit"/>
</form:form>
