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

				var nmPessoa = $('#nmPessoa').val();
				var cdSexo = $('#cdSexo').val();
				var nmEmail = $('#nmEmail').val();
				var cdCidade = $('#cdCidade').val();
				var inTrabalha = $('#inTrabalha').val();

				$.ajax({
					type : "Get",
					url : "save.html",
					data : "nmPessoa=" + nmPessoa + "&cdSexo=" + cdSexo
							+ "&nmEmail=" + nmEmail + "&cdCidade=" + cdCidade
							+ "&inTrabalha=" + inTrabalha,
					success : function(response) {
						alert(response);
					},
					error : function(e) {
						alert('Error: ' + e);
					}
				});
			}
			
			function doBuscaTodos() {

				$.ajax({
					type : "Get",
					url : "listaItens.html",
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
						<td>Nome :</td>
						<td><input type="text" id="nmPessoa" /></td>
					</tr>
					<tr>
						<td>Seco :</td>
						<td><input type="radio" id="cdSexo" value="M" /> Masculino <input
							type="radio" id="cdSexo" value="F" /> Feminino</td>
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
			<table>
				<c:if test="${fn:length(pessoaList) > 0 }">
					<table id="idTbPessoa">
						<thead>
							<tr>
								<th>codigo</th>
								<th>Nome</th>
								<th>Sexo</th>
								<th>email</th>
								<th>Trabalha</th>
							</tr>
						</thead>

						<tbody>
							<c:forEach items="${pessoaList}" var="item">
								<tr>
									<td>${item.cdPessoa}</td>
									<td>${item.sexo.nmPessoa}</td>
									<td>${item.estadoCivil.cdSexo}</td>
									<td>${item.nmEmail}</td>
									<c:if test="${item.inTrabalha}">
										<td>SIM</td>
									</c:if>
									<c:if test="${not item.inTrabalha}">
										<td>NÃO</td>
									</c:if>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</c:if>
			</table>
		</div>
	</center>
</body>
</html>
