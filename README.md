Full Stack Web Project with Microservices
This project is a full-stack web application project and it was created with Java and React. Spring Cloud was used in this project to create the microservice architecture. Detailed explanations of the services in the microservice architecture are explained in the readme files of the services.

Subject Of Project
CineVision App is online cinema ticket sale website. Purpose of this website is to provide ease of buying tickets for those who want to watch movies in the cinema. People can display movies in the theaters or upcoming movies. They can view the movie details and can learn the plot of the movie, actors of the movie, release date and so on. In this detail page, people can choose the city and movie theater where they want to watch to movie. After this selection, they can automatically redirect to payment page. In this payment page, they can choose ticket count and type such as student and adult. Then, they can choose the chairs they will sit on in the movie theater. Finally, they complete the payment process after entering information such as credit card information, email, name and surname. If the payment is successful, the ticket details are sent to the email which entered by the user. If people want to share their opinions about the movie, they can write comments on the movie detail page. However, People must create an account to comments on movies. Only admins can add movie,actor or director to the system. This authorization process is controlled with Jwt token.

Technologies Of Project
There are many technologies in this project. These are:

Backend Techologies
Java 17
Spring Boot 2.7.0
Spring Cloud
Spring Data Jpa
Spring Security
Lombok
WebClient
Apache Kafka
Jwt
Java Mail Sender
Zipkin
Resilience4j
PostgreSql
MongoDB
Redis
Docker
Frontend Techologies
JavaScript
React
Bootstrap
Redux
Usage Of Technologies In Project
There are 5 services in this project and each service are written with N-layered architecture. Spring Cloud used for microservice infrastructure. Netflix Eureka Server used to create eureka server. This eureka server contains movie service, user service and email service eureka clients and api-gateway service. In addition, Zipkin and Sleuth were used to monitor cross-service logs. Also, Resilience4j used as Circuit Breaker.

In the Api Gateway, Spring Cloud Gateway was used for managing requests.

In the Eureka Server, Netflix Eureka Server was used. And Spring Security was used to secure eureka server.

WebFlux was used for communication between Movie and User Services. And, Apache Kafka was used for asynchronous communication between Movie and Email Services.

In the User Service, MongoDB used as database. Spring Security was used for encrypting user's passwords and generating Jwt token.

In the Movie Service, PostgreSql used as database and Spring Data Jpa was used. Webflux and Apache Kafka was used for communication with other services. Resilience4J Circuit Breaker was used here. Displaying and coming soon movies are cached using with Redis.

In the Email Service, Apache Kafka was used for receiving the message from Movie Service. Java Mail Sender and FreeMarker template was used for creating email template and sending email.

PostgreSql, MongoDB, Apache Kafka and Zipkin run as Docker container in the docker-compose.yml file.

On the Frontend side, JavaScript and React was used. Also, Axios was preferred to send request to the backend. For state management, Redux was used. For, design of the UI, Bootstrap and Css are used.
