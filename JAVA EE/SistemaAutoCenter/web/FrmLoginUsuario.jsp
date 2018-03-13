<%-- 
    Document   : FrmLoginUsuario
    Created on : Sep 29, 2016, 1:20:32 PM
    Author     : 
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/formulario.css">
    </head>
    <body class='bg'>
        
        <form method="post" action="LoginUsuario">
            <fieldset style="margin-top:250px;">
                <legend>Login de usuario</legend>
                login:<br/><br/><input type="text" name="login"><br/><br/>
                senha:<br/><br/><input type="password" name="pass"><br/><br/>
                <input type="submit" value="logar">
            </fieldset>
        </form>
    </body>
</html>

