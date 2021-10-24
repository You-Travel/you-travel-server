<p align="center">
    <h1 align="center">You.Travel server</h1>
    </p>

<h4>Возможности сервера:</h4>
<ul>
    <li>Получение списка мест отдыха;</li>
    <li>Построение маршрута;</li>
</ul> 

<h4>Стек технологий:</h4>
<ul>
	<li>Docker</li>
	<li>RESTful design</li>
	<li>Spring</li>
	<li>GSON</li>
 </ul>
<h4>Демо</h4>
<p>Демо сервиса доступно по адресу: --------</p>
<p>Авторизация не требуется</p>




СРЕДА ЗАПУСКА
------------
1) Docker;
2) Для сборки необходим Gradle;


# Запуск

## Вариант 1 ("Если повезет")
Выполните 
~~~
сd 'some_server_directory'
~~~
Затем (в зависимости от используемой коммандной строки)
~~~
./start_docker.bat
~~~
Или
~~~
start_docker.bat
~~~

## Вариант 2 ("Если не повезет")
Выполните 
~~~
сd 'some_server_directory'

docker build --build-arg JAR_FILE=build/libs/server-1.0.jar -t springio/gs-spring-boot-docker .

docker run -p 8080:8080 springio/gs-spring-boot-docker
~~~

РАЗРАБОТЧИКИ

<h4>Семен Барболин (android) https://t.me/Skat_bars </h4>
<h4>Никита Кощин (android) https://t.me/nhths </h4>


