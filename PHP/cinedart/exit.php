<?php
	session_destroy();
    unset ($_SESSION['login']);
    unset ($_SESSION['senha']);
    print("<script>location.href='./?p=home.php'</script>");

?>