<%@page import="controller.CalcularController"%>
<!DOCTYPE html>
<html lang="es">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">    
    <link rel="icon" href="${pageContext.request.contextPath}/img/favicon1.png">

    <title>\\_ Calculadora _//</title>

   
    <link href="${pageContext.request.contextPath}/css/styles.css" rel="stylesheet">
</head>
<body>    

<div class="container">
       
            <h2>Cliente ------ param. ------> S(ervlet) -------- attrib. ------> JSP</h2>
            <hr>
            <h3>CALCULADORA</h3>
            <hr>
            <form action="${pageContext.request.contextPath}/calcular"  method="post">
                <div id="seleccion" class="select">
	                <label>Valor 1:<br></label>     
	                <input type="text" name="operador1" placeholder="Intruduce un valor" required><br>
	                <label>Valor 2:<br></label>   
	                <input type="text" name="operador2" placeholder="Intruduce un valor" required>
                </div>
                
                <div id="seleccion" class="select">
                   
					<fieldset><legend>Elige la operación a realizar:</legend>
	                    <select name="operacion">
	                    	<option value="Suma" selected>Suma (+)</option>
	                    	<option value="Resta">Resta (-)</option>
	                    	<option value="Division">Division (/)</option>
	                    	<option value="Multiplicacion">Multiplicacion (x)</option>	
	                    </select>
                 	</fieldset>
                </div>
                
                <button type="submit">Calcular</button>
                
            </form><!-- /form -->
           
          	<p>Ha seleccionado la operacion: <b><%=request.getAttribute("operacion") %></b></p>
			<p>El resultado es <b>${resultado}</b></p>
       
        
    </div><!-- /container -->

</body>
</html>
