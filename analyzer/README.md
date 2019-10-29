# Analyzer

Calculates the final score for the privacy metric. 
The analyzer will calculate the scores and add them to the topic `topic-planning`.

## Prerequisites
This component requires the software available in [tma-utils](https://github.com/eubr-atmosphere/tma-framework/tree/master/common/tma-utils).

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

   ![url](https://github.com/eubr-atmosphere/tma-framework-a/tree/master/analyzer/README/url.png)
   
   2. Use the e-mail atmosphere.eubrazil.dashboard@gmail.com and the password passtobereplaced1234 to sign in:
   ![signin](https://github.com/eubr-atmosphere/tma-framework-a/tree/master/analyzer/README/signin.png)
  
   3. In the top-right corner of the site, click on the "gear" icon and after on "Admin".
   ![admin](https://github.com/eubr-atmosphere/tma-framework-a/tree/master/analyzer/README/admin.png)
  
   4. Click on "Databases" and after on "knowledge".
   ![datasources](https://github.com/eubr-atmosphere/tma-framework-a/tree/master/analyzer/README/datasources.png)

   5. Change the settings to match your DB server installation.
   ![values](https://github.com/eubr-atmosphere/tma-framework-a/tree/master/analyzer/README/values.png)

### To restart cache use two commands below.
	
   docker-compose build --no-cache
   docker-compose up -d container-name
