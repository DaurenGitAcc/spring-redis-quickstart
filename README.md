# Использование Redis, создание rest api приложения с использованием Spring MVC
1. Подтяните репозитории командой 'git pull https://github.com/DaurenGitAcc/spring-redis-quickstart.git'
2. Распакуйте в вашем IDE
3. Запустите докер контейнер с Redis с помощью команды 'docker-compose up redis-1'
4. Запустите проект
5. Перейдите в PostMan и введите следующие запросы: <br/>
   POST |  localhost:8080/api  - для добавления пользователя в redis.<br/> Данные пользователя передаются в теле запроса в виде json объекта. <br/>
   GET  |  localhost:8080/api?id=1  - для получения пользователя из redis.<br/> Id пользователя передается в параметре запроса. <br/>


# <img src="https://github.com/DaurenGitAcc/spring-redis-quickstart/blob/main/screens/img.png" width=80% height=80%>
<br/>
