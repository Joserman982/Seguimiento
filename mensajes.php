<?php 


//Generamos nuestra conexión
$mysqli = new mysqli("localhost", "chat", "chat123", "chat");

// Verificar si es una petición tipo GET
if($_SERVER['REQUEST_METHOD']=="GET"){

    /* comprobar la conexión */
    if ($mysqli->connect_errno) {
        printf("Falló la conexión: %s\n", $mysqli->connect_error);
        exit();
    }else{
        echo "<strong>Conexion exitosa</strong>";
        //Obtengo todos los mensajes
        $consulta = "SELECT * FROM mensajes";
        if ($resultado = $mysqli->query($consulta)) {
            /* obtener un array asociativo */
            while ($fila = $resultado->fetch_assoc()) {
                printf ("%s: (%s) - %s\n", $fila["Fecha"],
                        $fila["usuario"], $fila["mensajeHtml"]);
            }
            /* liberar el conjunto de resultados */
            $resultado->free();
        }
    }
    $mysqli->close();
}

// Si es un método POST
else{
	// Obtener el mensaje y guardar en BD
	echo "ESTE es un método POST";
	/* comprobar la conexión */
if ($mysqli->connect_errno) {
    printf("Falló la conexión: %s\n", $mysqli->connect_error);
    exit();
} else {
	// Obtengo los datos
	$usuario = $_POST["usuario"];
	$msj=$_POST["mensajeHtml"];

$consulta = "INSERT INTO mensajes(usuario,mensajeHtml) 
VALUES ('$usuario','$msj'); ";
echo "CONSULTA: $consulta";

 $mysqli->query($consulta);
}
$mysqli->close();
}
?>
