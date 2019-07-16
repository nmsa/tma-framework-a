--#############################################################################################################################################
--########################################################  INFRASTRUCTURE  ###################################################################
--#############################################################################################################################################

--################## compositeattribute ##################-------------------------------------------------------------------------------------

--NIVEL 1
insert into compositeattribute (attributeId, operator) values (4,0); -- INFRATRUSTWORTHINESS
--NIVEL 2
insert into compositeattribute (attributeId, operator) values (5,0); -- SITETRUSTWORTHINESS
insert into compositeattribute (attributeId, operator) values (6,0); -- SERVICETRUSTWORTHINESS
insert into compositeattribute (attributeId, operator) values (7,0); -- RESOURCETRUSTWORTHINESS
insert into compositeattribute (attributeId, operator) values (8,0); -- CONNECTIVITY
--NIVEL 3
insert into compositeattribute (attributeId, operator) values (9,0); -- SERVICEAVAILABILITY

-----------------------------------------------------------------------------------------------------------------------------------------------

--################## attribute ##################----------------------------------------------------------------------------------------------

--NIVEL 1
insert into attribute (attributeId, compositeattributeId, name) values (4, 4, 'INFRATRUSTWORTHINESS');
--NIVEL 2
insert into attribute (attributeId, compositeattributeId, name) values (5, 4, 'SITETRUSTWORTHINESS');
--NIVEL 3
insert into attribute (attributeId, compositeattributeId, name) values (6, 5, 'SERVICETRUSTWORTHINESS');
insert into attribute (attributeId, compositeattributeId, name) values (7, 5, 'RESOURCETRUSTWORTHINESS');
insert into attribute (attributeId, compositeattributeId, name) values (8, 5, 'CONNECTIVITY');
--NIVEL 4
insert into attribute (attributeId, compositeattributeId, name) values (9, 6, 'SERVICEAVAILABILITY');
insert into attribute (attributeId, compositeattributeId, name) values (10, 6, 'SERVICELATENCY');
insert into attribute (attributeId, compositeattributeId, name) values (11, 7, 'RESOURCEAVAILABILITY');
insert into attribute (attributeId, compositeattributeId, name) values (12, 7, 'RESOURCEISOLATION');
insert into attribute (attributeId, compositeattributeId, name) values (13, 7, 'RESOURCEPERFORMANCE');
insert into attribute (attributeId, compositeattributeId, name) values (14, 8, 'LINKLATENCY');
insert into attribute (attributeId, compositeattributeId, name) values (15, 8, 'LINKAVAILABILITY');
--NIVEL 5
insert into attribute (attributeId, compositeattributeId, name) values (16, 9, 'SERVICEREACHABILITY');
insert into attribute (attributeId, compositeattributeId, name) values (17, 9, 'SUCCESSRATE');

-----------------------------------------------------------------------------------------------------------------------------------------------

--################## leafattribute ##################------------------------------------------------------------------------------------------

--NIVEL 5
insert into leafattribute (attributeId, normalizationMin, normalizationMax, operator, numSamples, normalizationKind) values (16, 0.0, 1.0, 0, 1, 0);
insert into leafattribute (attributeId, normalizationMin, normalizationMax, operator, numSamples, normalizationKind) values (17, 0.0, 1.0, 0, 1, 0);
--NIVEL 4
insert into leafattribute (attributeId, normalizationMin, normalizationMax, operator, numSamples, normalizationKind) values (10, 0.0, 1.0, 0, 1, 1);
insert into leafattribute (attributeId, normalizationMin, normalizationMax, operator, numSamples, normalizationKind) values (11, 0.0, 1.0, 0, 1, 0);
insert into leafattribute (attributeId, normalizationMin, normalizationMax, operator, numSamples, normalizationKind) values (12, 0.0, 1.0, 0, 1, 0);
insert into leafattribute (attributeId, normalizationMin, normalizationMax, operator, numSamples, normalizationKind) values (13, 0.0, 1.0, 0, 1, 0);
insert into leafattribute (attributeId, normalizationMin, normalizationMax, operator, numSamples, normalizationKind) values (14, 0.0, 1.0, 0, 1, 1)
insert into leafattribute (attributeId, normalizationMin, normalizationMax, operator, numSamples, normalizationKind) values (15, 0.0, 1.0, 0, 1, 0);

-----------------------------------------------------------------------------------------------------------------------------------------------

--################## configurationprofile ##################-----------------------------------------------------------------------------------

insert into configurationprofile (configurationprofileId) values (2); --Infrastructure

-----------------------------------------------------------------------------------------------------------------------------------------------

--################## preference ##################---------------------------------------------------------------------------------------------

insert into preference (attributeId, configurationprofileId, weight, threshold) values (4, 2, 1, 1); -- INFRATRUSTWORTHINESS
insert into preference (attributeId, configurationprofileId, weight, threshold) values (5, 2, 1, 1); -- SITETRUSTWORTHINESS
insert into preference (attributeId, configurationprofileId, weight, threshold) values (6, 2, 0.334, 1); -- SERVICETRUSTWORTHINESS
insert into preference (attributeId, configurationprofileId, weight, threshold) values (7, 2, 0.333, 1); -- RESOURCETRUSTWORTHINESS
insert into preference (attributeId, configurationprofileId, weight, threshold) values (8, 2, 0.333, 1); -- CONNECTIVITY
insert into preference (attributeId, configurationprofileId, weight, threshold) values (9, 2, 0.5, 1); -- SERVICEAVAILABILITY
insert into preference (attributeId, configurationprofileId, weight, threshold) values (10, 2, 0.5, 1); -- SERVICELATENCY
insert into preference (attributeId, configurationprofileId, weight, threshold) values (11, 2, 0.334, 1); -- RESOURCEAVAILABILITY
insert into preference (attributeId, configurationprofileId, weight, threshold) values (12, 2, 0.333, 1); -- RESOURCEISOLATION
insert into preference (attributeId, configurationprofileId, weight, threshold) values (13, 2, 0.333, 1); -- RESOURCEPERFORMANCE
insert into preference (attributeId, configurationprofileId, weight, threshold) values (14, 2, 0.5, 1); -- LINKLATENCY
insert into preference (attributeId, configurationprofileId, weight, threshold) values (15, 2, 0.5, 1); -- LINKAVAILABILITY
insert into preference (attributeId, configurationprofileId, weight, threshold) values (16, 2, 0.5, 1); -- SERVICEREACHABILITY
insert into preference (attributeId, configurationprofileId, weight, threshold) values (17, 2, 0.5, 1); -- SUCCESSRATE

-----------------------------------------------------------------------------------------------------------------------------------------------

--################## metricqm ##################-----------------------------------------------------------------------------------------------

insert into metricqm (attributeId, configurationprofileId, probeName, descriptionName, resourceName) values (16, 2, 'probe SERVICEREACHABILITY', 'N/A', 'N/A');
insert into metricqm (attributeId, configurationprofileId, probeName, descriptionName, resourceName) values (17, 2, 'probe SUCCESSRATE', 'N/A', 'N/A');
insert into metricqm (attributeId, configurationprofileId, probeName, descriptionName, resourceName) values (14, 2, 'probe SERVICELATENCY', 'N/A', 'N/A');	
insert into metricqm (attributeId, configurationprofileId, probeName, descriptionName, resourceName) values (11, 2, 'probe RESOURCEAVAILABILITY', 'N/A', 'N/A');	
insert into metricqm (attributeId, configurationprofileId, probeName, descriptionName, resourceName) values (12, 2, 'probe RESOURCEISOLATION', 'N/A', 'N/A');	
insert into metricqm (attributeId, configurationprofileId, probeName, descriptionName, resourceName) values (13, 2, 'probe RESOURCEPERFORMANCE', 'N/A', 'N/A');	
insert into metricqm (attributeId, configurationprofileId, probeName, descriptionName, resourceName) values (14, 2, 'probe LINKLATENCY', 'N/A', 'N/A');	
insert into metricqm (attributeId, configurationprofileId, probeName, descriptionName, resourceName) values (15, 2, 'probe LINKAVAILABILITY', 'N/A', 'N/A');

-----------------------------------------------------------------------------------------------------------------------------------------------