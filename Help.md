Создать бд 'open' через интерфейс или через докер как показано ниже
```shell
docker run --name museum -p 5432:5432 -e POSTGRES_PASSWORD=postgres -e POSTGRES_DB=museum -d postgres:11-alpine
```
Запустить приложение
или сразу
 ```shell
docker-compose up --build
```

* БД Postgress -> таблица users.
* Примеры запросов:

Регистрация
```shell
curl -i -X POST http://127.0.0.1:8080/api/auth/register -H 'Content-Type: application/json' -d '{"username":"name","email":"name@mail.ru","password":"12345678"}'
```
Авторизация
```shell
curl -i -X POST http://127.0.0.1:8080/api/auth/login -H 'Content-Type: application/json' -d '{"email":"name@mail.ru" , "password":"12345678"}'
```
Далее уже авторизованым пользователям:

С ролью user
```shell
curl -i -X GET http://localhost:8080/user \
  -H "Authorization: Bearer eyJhbGciOiJIUzI1NiJ9.eyJyb2xlIjpbIlJPTEVfVVNFUiJdLCJpZCI6MTAwMDAwLCJlbWFpbCI6Im5hbWVAbWFpbC5ydSIsInN1YiI6Im5hbWUiLCJpYXQiOjE3MTgwOTk0MDMsImV4cCI6MTcxODI0MzQwM30.5MJfPOlyrnS6On3KP9QxejIVsZSlolkrSgFEMzC7-us" \
  -H "Application-Authorization: token"
```
С ролью admin
 ```shell
curl -i -X GET http://localhost:8080/admin \
  -H "Authorization: Bearer eyJhbGciOiJIUzI1NiJ9.eyJyb2xlIjpbIlJPTEVfQURNSU4iXSwiaWQiOjEwMDAwMCwiZW1haWwiOiJuYW1lQG1haWwucnUiLCJzdWIiOiJuYW1lIiwiaWF0IjoxNzE4MDk5NTkxLCJleHAiOjE3MTgyNDM1OTF9.6-lOc4OXzBoWojqpPpN73MhVLtbwPBcY53DVuhN39FY" \
  -H "Application-Authorization: token"
``` 
С ролью admin или user
```shell
curl -i -X GET http://localhost:8080/example