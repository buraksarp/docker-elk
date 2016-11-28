Elasticsearch - Logstash - Kibana 
=========================

Building the ELK
---------------------
    $ git clone https://github.com/buraksarp/docker-elk.git
    $ cd docker-elk

This demo assumes you know how to run Docker.

Building the Containers
----------------------
Nothing special if you already have Docker installed:

    $ docker-compose build 

Running Containers with the docker-compose
---------------------
To run these containers:

    $ docker-compose up

To view the Kibana UI: [http://localhost:5601](http://localhost:5601)

Running Spring-Boot app to view logs on the Kibana
---------------------
To build spring-boot app's container

    $ cd ../springboot-elk
    $ docker build -t spring-boot/springboot-elk .

To run spring-boot app's container

    $ docker run -ti spring-boot/springboot-elk





