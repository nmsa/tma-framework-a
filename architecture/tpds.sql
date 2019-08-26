--#############################################################################################################################################
--########################################################  TPDS  ###################################################################
--#############################################################################################################################################

--################## compositeattribute ##################-------------------------------------------------------------------------------------

--NIVEL 1
insert into compositeattribute (attributeId, operator) values (42, 0); -- TDPSTRUSTWORTHINESS
--NIVEL 2
insert into compositeattribute (attributeId, operator) values (43, 0); -- WFMODEL1
-- WFMODELn...
--NIVEL 3
insert into compositeattribute (attributeId, operator) values (44, 0); -- FAIRNESS
insert into compositeattribute (attributeId, operator) values (45, 0); -- STABILITY
insert into compositeattribute (attributeId, operator) values (46, 0); -- TRANSPARENCY
insert into compositeattribute (attributeId, operator) values (47, 0); -- PRIVACYTDPS

-----------------------------------------------------------------------------------------------------------------------------------------------

--################## attribute ##################----------------------------------------------------------------------------------------------

--NIVEL 1
insert into attribute (attributeId, compositeattributeId, name) values (42, 42, 'TDPSTRUSTWORTHINESS');
--NIVEL 2
insert into attribute (attributeId, compositeattributeId, name) values (43, 42, 'WFMODEL1');
--NIVEL 3
insert into attribute (attributeId, compositeattributeId, name) values (44, 43, 'FAIRNESS');
insert into attribute (attributeId, compositeattributeId, name) values (45, 43, 'STABILITY');
insert into attribute (attributeId, compositeattributeId, name) values (46, 43, 'TRANSPARENCY');
insert into attribute (attributeId, compositeattributeId, name) values (47, 43, 'PRIVACYTDPS');
--NIVEL 4
insert into attribute (attributeId, compositeattributeId, name) values (48, 44, 'EQPARITY');
insert into attribute (attributeId, compositeattributeId, name) values (49, 44, 'PROPPARITY');
insert into attribute (attributeId, compositeattributeId, name) values (50, 44, 'FNRP');
insert into attribute (attributeId, compositeattributeId, name) values (51, 44, 'FPRP');
insert into attribute (attributeId, compositeattributeId, name) values (52, 44, 'FDR');
insert into attribute (attributeId, compositeattributeId, name) values (53, 44, 'OMISSIONRATE');
insert into attribute (attributeId, compositeattributeId, name) values (54, 45, 'EVALCONSENSUS');
insert into attribute (attributeId, compositeattributeId, name) values (55, 45, 'CONSEPTDRIFT');
insert into attribute (attributeId, compositeattributeId, name) values (56, 45, 'ACCURACY');
insert into attribute (attributeId, compositeattributeId, name) values (57, 46, 'EVALTRANSPARENCY');
insert into attribute (attributeId, compositeattributeId, name) values (58, 47, 'REIDENTIFICATIONRISK');

-----------------------------------------------------------------------------------------------------------------------------------------------

--################## leafattribute ##################------------------------------------------------------------------------------------------

--NIVEL 4
insert into leafattribute (attributeId, normalizationMin, normalizationMax, operator, numSamples, normalizationKind) values (48, 0.0, 2.0, 2.0, 1, 0);
insert into leafattribute (attributeId, normalizationMin, normalizationMax, operator, numSamples, normalizationKind) values (49, 0.0, 2.0, 2.0, 1, 0);
insert into leafattribute (attributeId, normalizationMin, normalizationMax, operator, numSamples, normalizationKind) values (50, 0.0, 2.0, 2.0, 1, 0);
insert into leafattribute (attributeId, normalizationMin, normalizationMax, operator, numSamples, normalizationKind) values (51, 0.0, 2.0, 2.0, 1, 0);
insert into leafattribute (attributeId, normalizationMin, normalizationMax, operator, numSamples, normalizationKind) values (52, 0.0, 2.0, 2.0, 1, 0);
insert into leafattribute (attributeId, normalizationMin, normalizationMax, operator, numSamples, normalizationKind) values (53, 0.0, 2.0, 2.0, 1, 0);
insert into leafattribute (attributeId, normalizationMin, normalizationMax, operator, numSamples, normalizationKind) values (54, 0.0, 1.0, 2.0, 1, 0);
insert into leafattribute (attributeId, normalizationMin, normalizationMax, operator, numSamples, normalizationKind) values (55, 0.0, 1.0, 2.0, 1, 0);
insert into leafattribute (attributeId, normalizationMin, normalizationMax, operator, numSamples, normalizationKind) values (56, 0.0, 1.0, 2.0, 1, 0);
insert into leafattribute (attributeId, normalizationMin, normalizationMax, operator, numSamples, normalizationKind) values (57, 0.0, 1.0, 2.0, 1, 0);
insert into leafattribute (attributeId, normalizationMin, normalizationMax, operator, numSamples, normalizationKind) values (58, 0.0, 1.0, 2.0, 1, 0);

-----------------------------------------------------------------------------------------------------------------------------------------------

--################## configurationprofile ##################-----------------------------------------------------------------------------------

insert into configurationprofile (configurationprofileId) values (4); --TDPS

-----------------------------------------------------------------------------------------------------------------------------------------------

--################## preference ##################---------------------------------------------------------------------------------------------

insert into preference (attributeId, configurationprofileId, weight, threshold) values (42, 4, 1, 1); -- TDPSTRUSTWORTHINESS
insert into preference (attributeId, configurationprofileId, weight, threshold) values (43, 4, 1, 1); -- WFMODEL1
insert into preference (attributeId, configurationprofileId, weight, threshold) values (44, 4, 0.25, 1); -- FAIRNESS
insert into preference (attributeId, configurationprofileId, weight, threshold) values (45, 4, 0.25, 1); -- STABILITY
insert into preference (attributeId, configurationprofileId, weight, threshold) values (46, 4, 0.25, 1); -- TRANSPARENCY
insert into preference (attributeId, configurationprofileId, weight, threshold) values (47, 4, 0.25, 1); -- PRIVACYTDPS
insert into preference (attributeId, configurationprofileId, weight, threshold) values (48, 4, 0.25, 2); -- EQPARITY
insert into preference (attributeId, configurationprofileId, weight, threshold) values (49, 4, 0.25, 2); -- PROPPARITY
insert into preference (attributeId, configurationprofileId, weight, threshold) values (50, 4, 0.125, 2); -- FNRP
insert into preference (attributeId, configurationprofileId, weight, threshold) values (51, 4, 0.125, 2); -- FPRP
insert into preference (attributeId, configurationprofileId, weight, threshold) values (52, 4, 0.125, 2); -- FDR
insert into preference (attributeId, configurationprofileId, weight, threshold) values (53, 4, 0.125, 2); -- OMISSIONRATE
insert into preference (attributeId, configurationprofileId, weight, threshold) values (54, 4, 0.4, 1); -- EVALCONSENSUS
insert into preference (attributeId, configurationprofileId, weight, threshold) values (55, 4, 0.3, 1); -- CONSEPTDRIFT
insert into preference (attributeId, configurationprofileId, weight, threshold) values (56, 4, 0.3, 1); -- ACCURACY
insert into preference (attributeId, configurationprofileId, weight, threshold) values (57, 4, 1, 1); -- EVALTRANSPARENCY
insert into preference (attributeId, configurationprofileId, weight, threshold) values (58, 4, 1, 0.2); -- REIDENTIFICATIONRISK

-----------------------------------------------------------------------------------------------------------------------------------------------

--################## metricqm ##################-----------------------------------------------------------------------------------------------

insert into metricqm (attributeId, configurationprofileId, probeName, descriptionName, resourceName) values (48, 4, 'probe EQPARITY', 'N/A', 'N/A');
insert into metricqm (attributeId, configurationprofileId, probeName, descriptionName, resourceName) values (49, 4, 'probe PROPPARITY', 'N/A', 'N/A');
insert into metricqm (attributeId, configurationprofileId, probeName, descriptionName, resourceName) values (50, 4, 'probe FNRP', 'N/A', 'N/A');	
insert into metricqm (attributeId, configurationprofileId, probeName, descriptionName, resourceName) values (51, 4, 'probe FPRP', 'N/A', 'N/A');	
insert into metricqm (attributeId, configurationprofileId, probeName, descriptionName, resourceName) values (52, 4, 'probe FDR', 'N/A', 'N/A');	
insert into metricqm (attributeId, configurationprofileId, probeName, descriptionName, resourceName) values (53, 4, 'probe OMISSIONRATE', 'N/A', 'N/A');	
insert into metricqm (attributeId, configurationprofileId, probeName, descriptionName, resourceName) values (54, 4, 'probe EVALCONSENSUS', 'N/A', 'N/A');	
insert into metricqm (attributeId, configurationprofileId, probeName, descriptionName, resourceName) values (55, 4, 'probe CONSEPTDRIFT', 'N/A', 'N/A');
insert into metricqm (attributeId, configurationprofileId, probeName, descriptionName, resourceName) values (56, 4, 'probe ACCURACY', 'N/A', 'N/A');
insert into metricqm (attributeId, configurationprofileId, probeName, descriptionName, resourceName) values (57, 4, 'probe EVALTRANSPARENCY', 'N/A', 'N/A');
insert into metricqm (attributeId, configurationprofileId, probeName, descriptionName, resourceName) values (58, 4, 'probe REIDENTIFICATIONRISK', 'N/A', 'N/A');

-----------------------------------------------------------------------------------------------------------------------------------------------