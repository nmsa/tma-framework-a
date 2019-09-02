--#############################################################################################################################################
--########################################################  DATA MANAGEMENT  ###################################################################
--#############################################################################################################################################

--################## compositeattribute ##################-------------------------------------------------------------------------------------

--NIVEL 1
insert into compositeattribute (attributeId, operator) values (60,0); -- SYSTEMTRUSTWORTHINESS
--NIVEL 2
insert into compositeattribute (attributeId, operator) values (61,0); -- DATAMANAGEMENTTRUSTWORTHINESS
--NIVEL 3
insert into compositeattribute (attributeId, operator) values (62,0); -- VALLUMTRUSTWORTHINESS
insert into compositeattribute (attributeId, operator) values (63,0); -- DBENGINETRUSTWORTHINESS
--NIVEL 4
insert into compositeattribute (attributeId, operator) values (64,0); -- SECURITYVALLUM
insert into compositeattribute (attributeId, operator) values (65,0); -- PERFORMANCEVALLUM
insert into compositeattribute (attributeId, operator) values (66,0); -- DATAPRIVACY
insert into compositeattribute (attributeId, operator) values (67,0); -- DBEn
--NIVEL 5
insert into compositeattribute (attributeId, operator) values (75,0); -- PERFORMANCE

-----------------------------------------------------------------------------------------------------------------------------------------------

--################## attribute ##################----------------------------------------------------------------------------------------------

--NIVEL 1
insert into attribute (attributeId, compositeattributeId, name) values (60, 60, 'SYSTEMTRUSTWORTHINESS');
--NIVEL 2
insert into attribute (attributeId, compositeattributeId, name) values (61, 60, 'DATAMANAGEMENTTRUSTWORTHINESS');
--NIVEL 3
insert into attribute (attributeId, compositeattributeId, name) values (62, 61, 'VALLUMTRUSTWORTHINESS');
insert into attribute (attributeId, compositeattributeId, name) values (63, 61, 'DBENGINETRUSTWORTHINESS');
--NIVEL 4
insert into attribute (attributeId, compositeattributeId, name) values (64, 62, 'SECURITYVALLUM');
insert into attribute (attributeId, compositeattributeId, name) values (65, 62, 'PERFORMANCEVALLUM');
insert into attribute (attributeId, compositeattributeId, name) values (66, 62, 'DATAPRIVACY');
insert into attribute (attributeId, compositeattributeId, name) values (67, 63, 'DBEn');
--NIVEL 5
insert into attribute (attributeId, compositeattributeId, name) values (68, 64, 'ATTESTATION');
insert into attribute (attributeId, compositeattributeId, name) values (69, 65, 'RT');
insert into attribute (attributeId, compositeattributeId, name) values (70, 65, 'THROUGHPUT');
insert into attribute (attributeId, compositeattributeId, name) values (71, 65, 'BANDWIDTH');
insert into attribute (attributeId, compositeattributeId, name) values (72, 66, 'REIDENTIFICATIONRISK');
insert into attribute (attributeId, compositeattributeId, name) values (73, 66, 'INFORMATIONLOSS');
insert into attribute (attributeId, compositeattributeId, name) values (74, 67, 'CONFIDENTIALITY');
insert into attribute (attributeId, compositeattributeId, name) values (75, 67, 'PERFORMANCE');
insert into attribute (attributeId, compositeattributeId, name) values (76, 67, 'FAULTTOLERANCE');
--NIVEL 6
insert into attribute (attributeId, compositeattributeId, name) values (77, 75, 'DBRT');
insert into attribute (attributeId, compositeattributeId, name) values (78, 75, 'DBTHROUGHPUT');

-----------------------------------------------------------------------------------------------------------------------------------------------

--################## leafattribute ##################------------------------------------------------------------------------------------------

--NIVEL 5
insert into leafattribute (attributeId, normalizationMin, normalizationMax, operator, numSamples, normalizationKind) values (68, 0.0, 1.0, 0, 1, 0);
insert into leafattribute (attributeId, normalizationMin, normalizationMax, operator, numSamples, normalizationKind) values (69, 0.0, 20.0, 0, 1, 1);
insert into leafattribute (attributeId, normalizationMin, normalizationMax, operator, numSamples, normalizationKind) values (70, 0.0, 5.0, 0, 1, 1);
insert into leafattribute (attributeId, normalizationMin, normalizationMax, operator, numSamples, normalizationKind) values (71, 0.0, 200.0, 0, 1, 1);
insert into leafattribute (attributeId, normalizationMin, normalizationMax, operator, numSamples, normalizationKind) values (72, 0.0, 1.0, 0, 1, 1);
insert into leafattribute (attributeId, normalizationMin, normalizationMax, operator, numSamples, normalizationKind) values (73, 0.0, 1.0, 0, 1, 1);
insert into leafattribute (attributeId, normalizationMin, normalizationMax, operator, numSamples, normalizationKind) values (74, 0.0, 1.0, 0, 1, 0);
insert into leafattribute (attributeId, normalizationMin, normalizationMax, operator, numSamples, normalizationKind) values (75, 0.0, 1.0, 0, 1, 1);
insert into leafattribute (attributeId, normalizationMin, normalizationMax, operator, numSamples, normalizationKind) values (76, 0.0, 1.0, 0, 1, 0);
--NIVEL 4
insert into leafattribute (attributeId, normalizationMin, normalizationMax, operator, numSamples, normalizationKind) values (77, 0.0, 10.0, 0, 1, 1);
insert into leafattribute (attributeId, normalizationMin, normalizationMax, operator, numSamples, normalizationKind) values (78, 0.0, 10.0, 0, 1, 1);

-----------------------------------------------------------------------------------------------------------------------------------------------

--################## configurationprofile ##################-----------------------------------------------------------------------------------

insert into configurationprofile (configurationprofileId) values (5); --DATA MANAGEMENT

-----------------------------------------------------------------------------------------------------------------------------------------------

--################## preference ##################---------------------------------------------------------------------------------------------

insert into preference (attributeId, configurationprofileId, weight, threshold) values (60, 5, 1, 1); -- SYSTEMTRUSTWORTHINESS
insert into preference (attributeId, configurationprofileId, weight, threshold) values (61, 5, 1, 1); -- DATAMANAGEMENTTRUSTWORTHINESS
insert into preference (attributeId, configurationprofileId, weight, threshold) values (62, 5, 0.6, 1); -- VALLUMTRUSTWORTHINESS
insert into preference (attributeId, configurationprofileId, weight, threshold) values (63, 5, 0.4, 1); -- DBENGINETRUSTWORTHINESS
insert into preference (attributeId, configurationprofileId, weight, threshold) values (64, 5, 0.4, 1); -- SECURITYVALLUM
insert into preference (attributeId, configurationprofileId, weight, threshold) values (65, 5, 0.3, 1); -- PERFORMANCEVALLUM
insert into preference (attributeId, configurationprofileId, weight, threshold) values (66, 5, 0.3, 1); -- DATAPRIVACY
insert into preference (attributeId, configurationprofileId, weight, threshold) values (67, 5, 1, 1); -- DBEn
insert into preference (attributeId, configurationprofileId, weight, threshold) values (68, 5, 1, 1); -- ATTESTATION
insert into preference (attributeId, configurationprofileId, weight, threshold) values (69, 5, 0.3, 1000); -- RT
insert into preference (attributeId, configurationprofileId, weight, threshold) values (70, 5, 0.3, 10); -- THROUGHPUT
insert into preference (attributeId, configurationprofileId, weight, threshold) values (71, 5, 0.4, 500); -- BANDWIDTH
insert into preference (attributeId, configurationprofileId, weight, threshold) values (72, 5, 0.9, 0.5); -- REIDENTIFICATIONRISK
insert into preference (attributeId, configurationprofileId, weight, threshold) values (73, 5, 0.1, 1); -- INFORMATIONLOSS
insert into preference (attributeId, configurationprofileId, weight, threshold) values (74, 5, 0.4, 1); -- CONFIDENTIALITY
insert into preference (attributeId, configurationprofileId, weight, threshold) values (75, 5, 0.4, 1); -- PERFORMANCE
insert into preference (attributeId, configurationprofileId, weight, threshold) values (76, 5, 0.2, 1); -- FAULTTOLERANCE
insert into preference (attributeId, configurationprofileId, weight, threshold) values (77, 5, 0.5, 200); -- DBRT
insert into preference (attributeId, configurationprofileId, weight, threshold) values (78, 5, 0.5, 30); -- DBTHROUGHPUT

-----------------------------------------------------------------------------------------------------------------------------------------------

--################## metricqm ##################-----------------------------------------------------------------------------------------------

insert into metricqm (attributeId, configurationprofileId, probeName, descriptionName, resourceName) values (68, 5, 'probe ATTESTATION', 'N/A', 'N/A');
insert into metricqm (attributeId, configurationprofileId, probeName, descriptionName, resourceName) values (69, 5, 'probe RT', 'N/A', 'N/A');
insert into metricqm (attributeId, configurationprofileId, probeName, descriptionName, resourceName) values (70, 5, 'probe THROUGHPUT', 'N/A', 'N/A');	
insert into metricqm (attributeId, configurationprofileId, probeName, descriptionName, resourceName) values (71, 5, 'probe BANDWIDTH', 'N/A', 'N/A');	
insert into metricqm (attributeId, configurationprofileId, probeName, descriptionName, resourceName) values (72, 5, 'probe REIDENTIFICATIONRISK', 'N/A', 'N/A');	
insert into metricqm (attributeId, configurationprofileId, probeName, descriptionName, resourceName) values (73, 5, 'probe INFORMATIONLOSS', 'N/A', 'N/A');	
insert into metricqm (attributeId, configurationprofileId, probeName, descriptionName, resourceName) values (74, 5, 'probe CONFIDENTIALITY', 'N/A', 'N/A');	
insert into metricqm (attributeId, configurationprofileId, probeName, descriptionName, resourceName) values (75, 5, 'probe PERFORMANCE', 'N/A', 'N/A');
insert into metricqm (attributeId, configurationprofileId, probeName, descriptionName, resourceName) values (76, 5, 'probe FAULTTOLERANCE', 'N/A', 'N/A');
insert into metricqm (attributeId, configurationprofileId, probeName, descriptionName, resourceName) values (77, 5, 'probe DBRT', 'N/A', 'N/A');
insert into metricqm (attributeId, configurationprofileId, probeName, descriptionName, resourceName) values (78, 5, 'probe DBTHROUGHPUT', 'N/A', 'N/A');

-----------------------------------------------------------------------------------------------------------------------------------------------