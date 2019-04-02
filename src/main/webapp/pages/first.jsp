<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Arrays" %>
<%@ page import="java.util.Random" %>
<%@ page import="java.io.PrintWriter" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<title>FIRST JSP</title>
</head>
<body>
<h1>My first jsp</h1>

<q>
<%
List<String> quotes = Arrays.asList(
"— Многие жалуются на свою внешность, но на мозги не жалуется никто.",
"— Превосходство — это когда есть на что насрать, и есть чем.",
"— Есть такая штука как «Двигаться дальше». Попробуйте, поможет.",
"— Теория – это когда вы знаете все, но ничего не работает. Практика – это когда все работает, но никто не знает почему." +
" Мы совмещаем теорию и практику – ничего не работает и никто не знает почему!"
);
int i=new Random().nextInt(quotes.size());
PrintWriter writer=response.getWriter();
writer.println(quotes.get(i));
%>
</q>
</body>
</html>