<%-- 
    Document   : login
    Created on : 05/11/2014, 21:50:22
    Author     : Joao Henrique
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <h1>Olá, favor fazer login</h1>
        <fmt:message key="campo.usuario"/>
        <input name="usuario.email"/> <br/>

        <fmt:message key="campo.senha"/>
        <input type="password" name="usuario.senha"/>

        <input type="submit"/>
    </body>
</html>
