# Analyzer

Calculates the final score for the privacy metric. 
The analyzer will calculate the scores and add them to the topic `topic-planning`.

## Prerequisites
This component requires the software available in [tma-utils](https://github.com/joseadp/tma-utils).

### Steps to run the SpringBoot Analyzer Application:

1) Go to the Analyzer project (/tma-framework/tma-framework-a/analyzer) and run the following command to build the project:

	Note: You must have apache maven installed.

	mvn clean install

2) Run the following command to initialize the Analyzer container:
	
	Notes: 
	
		- Docker must have been initialized before executing the command below.
		
		- You must have been configured the connection to the knowledge database in the application.yml file (src/main/resources).
	
	docker-compose up -d analyzer

		
### Steps to run the Dashboard container

1) Run the following command to initialize Dashboard container based on DockerHub's Atmosphere project image:

	docker-compose up -d dashboard

2) Access the Metabase and reconfigure the database connection:

   1. Access the Metabase url using the dashboard host and the port 3000.
   ![url](https://github.com/eubr-atmosphere/tma-framework-a/tree/master/analyzer/metabase/url.png)
  
   2. In the top-right corner of the site, click on the "gear" icon and after on "Administrator".
   ![admin](https://github.com/eubr-atmosphere/tma-framework-a/tree/master/analyzer/metabase/admin.png)
  
   3. Click on "Banco de Dados" and after on "knowledge".
   ![datasources](https://github.com/eubr-atmosphere/tma-framework-a/tree/master/analyzer/metabase/datasources.png)

   4. Change the settings to match your DB server installation.
   ![values](https://github.com/eubr-atmosphere/tma-framework-a/tree/master/analyzer/metabase/values.png)


### To restart cache use two commands below.
	
   docker-compose build --no-cache
   docker-compose up -d container-name
