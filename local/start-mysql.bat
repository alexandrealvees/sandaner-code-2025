@echo off
echo Iniciando container MySQL no Docker...
docker run -d ^
  --name mysql-dev ^
  -e MYSQL_ROOT_PASSWORD=senha123 ^
  -e MYSQL_DATABASE=meubanco ^
  -p 3306:3306 ^
  mysql:8.0
