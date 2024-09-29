# Back-end Lab1

This is a demo lab project which serves as a REST web service with a `/healthcheck` endpoint.

The project is written on **Java (Spring Framework)**.

## How to run

To run the project locally you should have `Docker` installed on your machine and pass the following steps:
1. Clone this repo to your local machine
2. Go into your project directory and run the following commands:

```cli
docker compose build
```

```cli
docker compose up
```
This will build an image and run a container.

3. Go to your browser/postman and send a GET HTTP request to https://localhost:8080/healhcheck

## Deploy

The service is deployed on https://render.com,to access it go to:

https://back-end-lab-1.onrender.com/healthcheck
