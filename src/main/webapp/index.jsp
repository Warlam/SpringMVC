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
        var firstName = document.getElementById("firstName").value;
        var lastName = document.getElementById("lastName").value;

        // Формируем URL с параметрами
        var url = "http://localhost:8080/goodbye?name=" + encodeURIComponent(firstName) + "&surname=" + encodeURIComponent(lastName);

        // Переходим по URL
        window.location.href = url;
    }
</script>
</body>
</html>