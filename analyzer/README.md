# Analyzer

Steps to run the SpringBoot Analyzer Application:

1) Go to the Analyzer project (/tma-framework/tma-framework-a/analyzer) and run the following command to build the project:

	Note: You must have apache maven installed.

	mvn clean install

2) Run the following command to initialize the three containers (Analyzer, Dashboard and Knowledgedb)::
	
	Note: Docker must have been initialized before executing the command below.
	
	docker compose up