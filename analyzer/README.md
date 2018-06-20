# Analyzer

Steps to run the SpringBoot Analyzer Application:

1) Start the database named knowledgebd: 

	docker run --name knowledgebd -e MYSQL_ROOT_PASSWORD=root -e MYSQL_DATABASE=knowledgebd -e MYSQL_USER=atm -e MYSQL_PASSWORD=root -d mysql:5.6

2) Go to the Analyzer project (/tma-framework/tma-framework-a/analyzer) and run the following command to build the project 	  and generate an image in docker:

	Note: Docker must have been initialized before executing the command below.

	mvn clean install docker:build

3) Initialize a docker container with the image of the generated analyzer in the previous step:

	docker container run -d -p 8080:8080 --name analyzer --link knowledgebd:mysql atm/analyzer

