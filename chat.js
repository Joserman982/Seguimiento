
function setMensaje(autor,mensaje){
 var chat=document.getElementById("chat");
 if(chat===null) console.log("Chat no encontrado");
 else 
	chat.innerHTML+="<br><strong>"+autor+": </strong>"+mensaje;

}

function obtenerMensajesChat(){
	// Creo el cliente AJAX para la petición
	var peticion= new XMLHttpRequest();
	// Asigno código cuanto exista un cambio de estado
	// en el objeto
	peticion.onreadystatechange = function() {
		console.log("Estado de XMLHttpRequest");
		if (this.readyState == 4 && this.status == 200) {
			console.log(peticion.responseText);
			setMensaje("Augusto",peticion.responseText);
			}
		};
	// Configuro a donde voy a realizar la petición
	peticion.open("GET","mensajes.php",true);
	// Inicio la petición
	peticion.send();
  }

  function enviarMensajeChat(){
  // Creo el cliente AJAX para la petición
	var peticion= new XMLHttpRequest();
	// Configuro a donde voy a realizar la petición
	peticion.open("POST","mensajes.php",true);
	// Asigno código cuanto exista un cambio de estado
	// en el objeto
	peticion.onreadystatechange = function() {
		if (this.readyState == 4 && this.status == 200) {
			console.log(peticion.responseText);
			}
		};
	peticion.setRequestHeader("Content-type",
							 "application/x-www-form-urlencoded");
	
	// Inicio la petición
	peticion.send("usuario=Augusto&mensajeHtml=Holamundo");

  }
