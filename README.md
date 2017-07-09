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
    
Consuming Rest Service
---------------------
To consume SpringBoot app user service:

    $ curl http://localhost:8080/user/{userid}
    
To view generated logs on Kibana UI: [http://localhost:5601](http://localhost:5601)






