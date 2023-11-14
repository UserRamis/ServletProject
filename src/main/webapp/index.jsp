<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Тест</title>
</head>
<body>
<h1>Пройдите тест</h1>

<form action="TestResultServlet" method="post">
    <p>1. Как называется код между фигурными скобками?</p>
    <input type="radio" name="question1" value="function"> функция<br>
    <input type="radio" name="question1" value="section"> секция<br>
    <input type="radio" name="question1" value="body"> тело<br>
    <input type="radio" name="question1" value="block"> блок<br>

    <p>2. Каково значение arr[1].length в следующем массиве?</p>
    <input type="radio" name="question2" value="5"> 5<br>
    <input type="radio" name="question2" value="10"> 10<br>
    <input type="radio" name="question2" value="1"> 1<br>
    <input type="radio" name="question2" value="2"> 2<br>


    <p>3. Какие из этих операторов можно использовать для объединения двух или более объектов String?</p>
    <input type="radio" name="question3" value="+"> +<br>
    <input type="radio" name="question3" value="*="> *=<br>
    <input type="radio" name="question3" value="+="> +<br>
    <input type="radio" name="question3" value="*"> *<br>


    <p>4. От какого класса наследуют все классы Java?</p>
    <input type="radio" name="question4" value="Object"> Object<br>
    <input type="radio" name="question4" value="List"> List<br>
    <input type="radio" name="question4" value="Runtime"> Runtime<br>
    <input type="radio" name="question4" value="Collection"> Collection<br>


    <p>5. Какой класс отвечает за получение информации от пользователя?</p>
    <input type="radio" name="question5" value="Get"> Get<br>
    <input type="radio" name="question5" value="Scaner"> Scaner<br>
    <input type="radio" name="question5" value="System"> System<br>
    <input type="radio" name="question5" value="Out"> Out<br>








    <br>
    <input type="submit" value="Отправить">
</form>
</body>
</html>
