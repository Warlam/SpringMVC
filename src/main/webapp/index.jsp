<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Login</title>
</head>
<body>
<label for="firstName">Name:</label>
<input type="text" id="firstName" placeholder="Enter name">

<label for="lastName">Surname:</label>
<input type="text" id="lastName" placeholder="Enter surname">

<button onclick="redirectToGoodbye()">Login</button>

<script>
    function redirectToGoodbye() {


        // Формируем URL с параметрами
        window.location.href = "http://localhost:8080/goodbye?name=" + encodeURIComponent(document.getElementById("firstName").value) + "&surname=" + encodeURIComponent(document.getElementById("lastName").value);

        // Переходим по URL

    }
</script>
</body>
</html>