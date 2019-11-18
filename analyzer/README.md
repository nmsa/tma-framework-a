# Analyzer and Dashboard

Calculates the final score for the privacy metric.  
The analyzer will calculate the scores and add them to the topic `topic-planning`.  
The dashboard will present the data calculated by analyzer.

## Prerequisites
1) This component requires the software available in [tma-utils](https://github.com/eubr-atmosphere/tma-framework/tree/master/common/tma-utils).
2) Choose the container's environment: [Docker](#docker-deployment) or [Kubernetes](#kubernetes-deployment).

	Notes:
	
		- Docker must have been initialized before executing the command below.
		
		- You must have been configured the connection to the knowledge database in the application.yml (src/main/resources) and changeDS.sql (dashboard/) files.

---

## **Docker Deployment**

If the deploy be in Docker containers, follow the steps below:

### Steps to run the SpringBoot Analyzer Application:

1) Go to the Analyzer project (/tma-framework/tma-framework-a/analyzer) and run the following command to build the project:

   Note: You must have apache maven installed.

   ``mvn clean install``

2) Run the following command to initialize the Analyzer container:
	
   ``docker-compose up -d analyzer``
		
### Steps to run the Dashboard container

1) Run the following command to initialize Dashboard container based on DockerHub's Atmosphere project image:

   ``docker-compose up -d dashboard``

2) Start the Metabase and reconfigure the database connection:

   1. Copy the script called changeDS.sql:  
   ``docker cp dashboard/changeDS.sql dashboard:/usr/share/metabase``
	
   2. Execute the container's bash:  
   ``docker exec -ti dashboard /bin/bash``
   
   3. Start the metabase service and reconfigure the connection using the commands:  
   * ``service metabase start``  
   * ``cd /usr/share/metabase/``  
   * ``java -cp ./metabase.jar org.h2.tools.RunScript -url jdbc:h2:`pwd`/metabase-atm.db -script changeDS.sql``  
   * ``rm changeDS.sql``
   
### To restart cache use two commands below.
	
   ``docker-compose build --no-cache``
   ``docker-compose up -d container-name``

---

## **Kubernetes Deployment**

If the deploy be in Kubernetes PODs, follow the steps below:

1) Create the PODs and services using the yaml file:
   
   ``kubectl apply -f tma-analyze-dashboard.yaml``

2) Start the Metabase and reconfigure the database connection:

   1. Copy the script called changeDS.sql:  
   ``kubectl cp dashboard/changeDS.sql tma-dashboard-0:/usr/share/metabase``
	
   2. Execute the container's bash:  
   ``kubectl exec -ti tma-dashboard-0 /bin/bash``
   
   3. Start the metabase service and reconfigure the connection using the commands:  
   * ``service metabase start``  
   * ``cd /usr/share/metabase/``  
   * ``java -cp ./metabase.jar org.h2.tools.RunScript -url jdbc:h2:`pwd`/metabase-atm.db -script changeDS.sql``  
   * ``rm changeDS.sql``