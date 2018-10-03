# tma-framework-a
Component A - Trustworthiness Monitoring &amp; Assessment Framework

The `TMA_Analyze` component is responsible for continuously listening to the `TMA_Knowledge` repository, calculate the trustworthiness scores and, if such scores fall below a threshold, the `TMA_Plan` microservice is activated. Furthermore, it provides a dashboard to the user, which allows him to analyse information at runtime and adjust the parameters of the quality models and thresholds used.

General TMA_Analyze architecture:
![TMA_Analyze](https://github.com/eubr-atmosphere/tma-framework-a/blob/master/architecture/diagrams/TMA-A/TMA-A_Detailed.png)

`TMA_Analyze` is basically composed by four major components:

* KnowledgeService: data access layer for reading and writing at the `TMA_Knowledge` repository, any relevant information for monitoring and acting upon trustworthiness scores.
* KnowledgeListener: observes the `TMA_Knowedge` continuously to detect relevant changes in the Athmosphere platform trustworthiness-related data. 
* QualityModel: implements quality models for calculating the trustworthiness levels/scores.
* Dashboard: graphical user interface to present trustworthiness indicator, update user preferences, and intervene to adjust trustworthiness levels.

Dashboard-QualityModel and QualityModel-KnowledgeListener communication works as an observer design pattern.
The behavior is depicted into the following sequence diagrams for the startup and notification scenarios.

## Analyze Startup
![startup](https://github.com/eubr-atmosphere/tma-framework-a/blob/master/architecture/diagrams/TMA-A/Startup.png)

## Notify the QualityModel regarding changes on trustworthiness-related data
![notify](https://github.com/eubr-atmosphere/tma-framework-a/blob/master/architecture/diagrams/TMA-A/NotifyQualityModel.png)
