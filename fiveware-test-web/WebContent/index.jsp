<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script type="text/javascript"
	src="http://code.jquery.com/jquery-1.12.0.min.js"></script>
<title>Cadastro Simples</title>

</head>
<body>
	<center>

		<b>Cadastro</b>

		<script>
			window.load(doBuscaTodos());

			function doAjaxPost() {
				
				var cdPessoa = $('#cdPessoa').val();
				var nmPessoa = $('#nmPessoa').val();
				var cdEstadoCivil = $('#cdEstadoCivil').val();
				var cdSexo = $('#cdSexo').val();
				var nmEmail = $('#nmEmail').val();
				var cdCidade = $('#cdCidade').val();
				var inTrabalha = $('#inTrabalha').val();

				$.ajax({
					type : "Get",
					url : "save.html",
					data : "cdPessoa=" + cdPessoa + "&nmPessoa=" + nmPessoa + "&cdEstadoCivil="
							+ cdEstadoCivil + "&cdSexo=" + cdSexo + "&nmEmail="
							+ nmEmail + "&cdCidade=" + cdCidade
							+ "&inTrabalha=" + inTrabalha,
					success : function(response) {
						alert(response);
					},
					error : function(e) {
						alert('Error: ' + e);
					}
				});
			}
		</script>
		<div id="form">
			<form method="get">
				<table>
					<tr>
						<td>codigo :</td>
						<td><input type="text" id="cdPessoa" /></td>
					</tr>
					<tr>
						<td>Nome :</td>
						<td><input type="text" id="nmPessoa" /></td>
					</tr>
					<tr>
						<td>Estado Civil :</td>
						<td><input name="cdEstadoCivil" type="radio" id="cdEstadoCivil" value="1" />	Casado 
						    <input name="cdEstadoCivil" type="radio" id="cdEstadoCivil" value="2" />	Solteiro
						</td>
					</tr>
					<tr>
						<td>Sexo :</td>
						<td><input name="cdSexo" type="radio" id="cdSexo" value="M" /> Masculino 
						    <input name="cdSexo"type="radio" id="cdSexo" value="F" /> Feminino</td>
					</tr>
					<tr>
						<td>Email :</td>
						<td><input type="text" id="nmEmail" /></td>
					</tr>
					<tr>
						<td>Cidade :</td>
						<td><select id="cdCidade"><option value="SP">São
									Paulo</option>
								<option value="RJ">Rio de Janeiro</option>
								<option value="BH">Belo Horizonte</option>
								<option value="OT">Outros</option>
						</select></td>
					</tr>

					<tr>
						<td>Trabalhando :</td>
						<td><input type="checkbox" id="inTrabalha" /></td>
					</tr>

					<tr>
						<td></td>
						<td><input type="button" value="Save" onclick="doAjaxPost();" />
						</td>
					</tr>
				</table>

			</form>
		</div>
	</center>
</body>
</html>
