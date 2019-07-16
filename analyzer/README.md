# Analyzer

Calculates the final score for the privacy metric. 
The analyzer will calculate the scores and add them to the topic `topic-planning`.

## Prerequisites
This component requires the software available in [tma-utils](https://github.com/joseadp/tma-utils).

### Steps to run the SpringBoot Analyzer Application:

1) Go to the Analyzer project (/tma-framework/tma-framework-a/analyzer) and run the following command to build the project:

	Note: You must have apache maven installed.

	mvn clean install

2) Run the following command to initialize the two containers (Analyzer and Dashboard):
	
	Notes: 
	
		- Docker must have been initialized before executing the command below.
		
		- You must have been configured the connection to the knowledge database in the application.yml file (src/main/resources).
	
	docker-compose up
	
	
		- To restart cache use two commands below.
	
	docker-compose build --no-cache
	docker-compose up -d 