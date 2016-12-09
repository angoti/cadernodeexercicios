<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Exercício 4 - caderno de exercícios</title>
</head>
<body>
${array[0].nome.primeiroNome}
${array[0].nome.ultimoNome}
-
${array[0].endereco.nomeRua}
${array[0].endereco.nomeCidade}
${array[0].endereco.cep}
<hr>
${array[1].nome.primeiroNome}
${array[1].nome.ultimoNome}
-
${array[1].endereco.nomeRua}
${array[1].endereco.nomeCidade}
${array[1].endereco.cep}
<hr>
${array[2].nome.primeiroNome}
${array[2].nome.ultimoNome}
-
${array[2].endereco.nomeRua}
${array[2].endereco.nomeCidade}
${array[2].endereco.cep}

</body>
</html>