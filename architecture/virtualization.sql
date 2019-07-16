
--#############################################################################################################################################
--########################################################  VIRTUALIZATION  ###################################################################
--#############################################################################################################################################

--################## compositeattribute ##################-------------------------------------------------------------------------------------

--NIVEL 1
insert into compositeattribute (attributeId, operator) values (18, 0); -- VIRTUALTRUSTWORTHINESS
--NIVEL 2
insert into compositeattribute (attributeId, operator) values (19, 0); -- VSERVICETRUSTWORTHINESS
insert into compositeattribute (attributeId, operator) values (20, 0); -- VRESOURCETRUSTWORTHINESS
--NIVEL 3
insert into compositeattribute (attributeId, operator) values (23, 2); -- HOTSCALABILITY
insert into compositeattribute (attributeId, operator) values (24, 2); -- SCALABILITY
insert into compositeattribute (attributeId, operator) values (26, 2); -- ISOLATION
--NIVEL 4
insert into compositeattribute (attributeId, operator) values (27, 2); -- HOTCPU
insert into compositeattribute (attributeId, operator) values (28, 2); -- HOTMEMORY
insert into compositeattribute (attributeId, operator) values (29, 2); -- CPUSCALABILITY
insert into compositeattribute (attributeId, operator) values (30, 2); -- MEMORYSCALABILITY
insert into compositeattribute (attributeId, operator) values (31, 2); -- CPUISOLATION

-----------------------------------------------------------------------------------------------------------------------------------------------

--################## attribute ##################----------------------------------------------------------------------------------------------

--NIVEL 1
insert into attribute (attributeId, compositeattributeId, name) values (18, 18, 'VIRTUALTRUSTWORTHINESS');
--NIVEL 2
insert into attribute (attributeId, compositeattributeId, name) values (19, 18, 'VSERVICETRUSTWORTHINESS');
insert into attribute (attributeId, compositeattributeId, name) values (20, 18, 'VRESOURCETRUSTWORTHINESS');
--NIVEL 3
insert into attribute (attributeId, compositeattributeId, name) values (21, 19, 'VSERVICEAVAILABILITY');
insert into attribute (attributeId, compositeattributeId, name) values (22, 19, 'VSERVICEPERFORMANCE');
insert into attribute (attributeId, compositeattributeId, name) values (23, 20, 'HOTSCALABILITY');
insert into attribute (attributeId, compositeattributeId, name) values (24, 20, 'SCALABILITY');
insert into attribute (attributeId, compositeattributeId, name) values (25, 20, 'PERFORMANCEVR');
insert into attribute (attributeId, compositeattributeId, name) values (26, 20, 'ISOLATION');
--NIVEL 4
insert into attribute (attributeId, compositeattributeId, name) values (27, 23, 'HOTCPU');
insert into attribute (attributeId, compositeattributeId, name) values (28, 23, 'HOTMEMORY');
insert into attribute (attributeId, compositeattributeId, name) values (29, 24, 'CPUSCALABILITY');
insert into attribute (attributeId, compositeattributeId, name) values (30, 24, 'MEMORYSCALABILITY');
insert into attribute (attributeId, compositeattributeId, name) values (31, 26, 'CPUISOLATION');
--NIVEL 5
insert into attribute (attributeId, compositeattributeId, name) values (32, 27, 'CLUSTERUSEDHCPU');
insert into attribute (attributeId, compositeattributeId, name) values (33, 27, 'CLUSTERFREEHCPU');
insert into attribute (attributeId, compositeattributeId, name) values (34, 28, 'CLUSTERUSEDHMEMORY');
insert into attribute (attributeId, compositeattributeId, name) values (35, 28, 'CLUSTERFREEHMEMORY');
insert into attribute (attributeId, compositeattributeId, name) values (36, 29, 'CLUSTERUSEDCPU');
insert into attribute (attributeId, compositeattributeId, name) values (37, 29, 'CLUSTERTOTALCPU');
insert into attribute (attributeId, compositeattributeId, name) values (38, 30, 'CLUSTERUSEDMEMORY');
insert into attribute (attributeId, compositeattributeId, name) values (39, 30, 'CLUSTERTOTALMEMORY');
insert into attribute (attributeId, compositeattributeId, name) values (40, 31, 'PODUSAGE');
insert into attribute (attributeId, compositeattributeId, name) values (41, 31, 'NODEUSAGE');

-----------------------------------------------------------------------------------------------------------------------------------------------

--################## leafattribute ##################------------------------------------------------------------------------------------------

--NIVEL 3
insert into leafattribute (attributeId, normalizationMin, normalizationMax, operator, numSamples, normalizationKind) values (21, 0.0, 1.0, 2, 1, 0);
insert into leafattribute (attributeId, normalizationMin, normalizationMax, operator, numSamples, normalizationKind) values (22, 0.0, 1.0, 2, 1, 0);
insert into leafattribute (attributeId, normalizationMin, normalizationMax, operator, numSamples, normalizationKind) values (25, 0.0, 1.0, 0, 1, 0);
--NIVEL 5
insert into leafattribute (attributeId, normalizationMin, normalizationMax, operator, numSamples, normalizationKind) values (32, 0.0, 1.0, 2, 1, 1);
insert into leafattribute (attributeId, normalizationMin, normalizationMax, operator, numSamples, normalizationKind) values (33, 0.0, 1.0, 2, 1, 0);
insert into leafattribute (attributeId, normalizationMin, normalizationMax, operator, numSamples, normalizationKind) values (34, 0.0, 1.0, 2, 1, 0);
insert into leafattribute (attributeId, normalizationMin, normalizationMax, operator, numSamples, normalizationKind) values (35, 0.0, 1.0, 2, 1, 0);
insert into leafattribute (attributeId, normalizationMin, normalizationMax, operator, numSamples, normalizationKind) values (36, 0.0, 1.0, 2, 1, 1)
insert into leafattribute (attributeId, normalizationMin, normalizationMax, operator, numSamples, normalizationKind) values (37, 0.0, 1.0, 2, 1, 0);
insert into leafattribute (attributeId, normalizationMin, normalizationMax, operator, numSamples, normalizationKind) values (38, 0.0, 1.0, 2, 1, 0);
insert into leafattribute (attributeId, normalizationMin, normalizationMax, operator, numSamples, normalizationKind) values (39, 0.0, 1.0, 2, 1, 0);
insert into leafattribute (attributeId, normalizationMin, normalizationMax, operator, numSamples, normalizationKind) values (40, 0.0, 1.0, 2, 1, 0);
insert into leafattribute (attributeId, normalizationMin, normalizationMax, operator, numSamples, normalizationKind) values (41, 0.0, 1.0, 2, 1, 0);

-----------------------------------------------------------------------------------------------------------------------------------------------

--################## configurationprofile ##################-----------------------------------------------------------------------------------

insert into configurationprofile (configurationprofileId) values (3); -- Virtualization

-----------------------------------------------------------------------------------------------------------------------------------------------

--################## preference ##################---------------------------------------------------------------------------------------------

insert into preference (attributeId, configurationprofileId, weight, threshold) values (18, 3, 1, 1); -- VIRTUALTRUSTWORTHINESS
insert into preference (attributeId, configurationprofileId, weight, threshold) values (19, 3, 0.4, 0.65); -- VSERVICETRUSTWORTHINESS
insert into preference (attributeId, configurationprofileId, weight, threshold) values (20, 3, 0.6, 0.8); -- VRESOURCETRUSTWORTHINESS
insert into preference (attributeId, configurationprofileId, weight, threshold) values (21, 3, 0.6, 0.9); -- VSERVICEAVAILABILITY        threshold min/max = 0.75-0.90
insert into preference (attributeId, configurationprofileId, weight, threshold) values (22, 3, 0.4, 0.6); -- VSERVICEPERFORMANCE
insert into preference (attributeId, configurationprofileId, weight, threshold) values (23, 3, 0.4, 0.9); -- HOTSCALABILITY
insert into preference (attributeId, configurationprofileId, weight, threshold) values (24, 3, 0.2, 0.9); -- SCALABILITY
insert into preference (attributeId, configurationprofileId, weight, threshold) values (25, 3, 0.2, 0.1); -- PERFORMANCEVR               threshold min/max = 0.05-0.10
insert into preference (attributeId, configurationprofileId, weight, threshold) values (26, 3, 0.2, 0.95); -- ISOLATION

insert into preference (attributeId, configurationprofileId, weight, threshold) values (27, 3, 0.6, 0.9); -- HOTCPU
insert into preference (attributeId, configurationprofileId, weight, threshold) values (28, 3, 0.4, 0.9); -- HOTMEMORY
insert into preference (attributeId, configurationprofileId, weight, threshold) values (29, 3, 0.6, 0.9); -- CPUSCALABILITY
insert into preference (attributeId, configurationprofileId, weight, threshold) values (30, 3, 0.4, 0.9); -- MEMORYSCALABILITY
insert into preference (attributeId, configurationprofileId, weight, threshold) values (31, 3, 1, 0.95); -- CPUISOLATION

insert into preference (attributeId, configurationprofileId, weight, threshold) values (32, 3, 0.5, 0.9); -- CLUSTERUSEDHCPU
insert into preference (attributeId, configurationprofileId, weight, threshold) values (33, 3, 0.5, 0.2); -- CLUSTERFREEHCPU             threshold min/max = 0.1-0.2
insert into preference (attributeId, configurationprofileId, weight, threshold) values (34, 3, 0.5, 0.9); -- CLUSTERUSEDHMEMORY
insert into preference (attributeId, configurationprofileId, weight, threshold) values (35, 3, 0.5, 0.9); -- CLUSTERFREEHMEMORY          threshold min/max = 0.1-0.2
insert into preference (attributeId, configurationprofileId, weight, threshold) values (36, 3, 0.5, 0.9); -- CLUSTERUSEDCPU
insert into preference (attributeId, configurationprofileId, weight, threshold) values (37, 3, 0.5, 0.9); -- CLUSTERTOTALCPU
insert into preference (attributeId, configurationprofileId, weight, threshold) values (38, 3, 0.5, 0.9); -- CLUSTERUSEDMEMORY
insert into preference (attributeId, configurationprofileId, weight, threshold) values (39, 3, 0.5, 0.9); -- CLUSTERTOTALMEMORY          threshold min/max = 0.8-0.9
insert into preference (attributeId, configurationprofileId, weight, threshold) values (40, 3, 0.6, 0.9); -- PODUSAGE                    threshold min/max = 0.8-0.9
insert into preference (attributeId, configurationprofileId, weight, threshold) values (41, 3, 0.4, 0.9); -- NODEUSAGE                   threshold min/max = 0.8-0.9

-----------------------------------------------------------------------------------------------------------------------------------------------

--################## metricqm ##################-----------------------------------------------------------------------------------------------

insert into metricqm (attributeId, configurationprofileId, probeName, descriptionName, resourceName) values (21, 3, 'probe VSERVICEAVAILABILITY', 'N/A', 'N/A');
insert into metricqm (attributeId, configurationprofileId, probeName, descriptionName, resourceName) values (22, 3, 'probe VSERVICEPERFORMANCE', 'N/A', 'N/A');
insert into metricqm (attributeId, configurationprofileId, probeName, descriptionName, resourceName) values (25, 3, 'probe PERFORMANCEVR', 'N/A', 'N/A');

insert into metricqm (attributeId, configurationprofileId, probeName, descriptionName, resourceName) values (32, 3, 'probe CLUSTERUSEDHCPU', 'N/A', 'N/A');	
insert into metricqm (attributeId, configurationprofileId, probeName, descriptionName, resourceName) values (33, 3, 'probe CLUSTERFREEHCPU', 'N/A', 'N/A');	
insert into metricqm (attributeId, configurationprofileId, probeName, descriptionName, resourceName) values (34, 3, 'probe CLUSTERUSEDHMEMORY', 'N/A', 'N/A');	
insert into metricqm (attributeId, configurationprofileId, probeName, descriptionName, resourceName) values (35, 3, 'probe CLUSTERFREEHMEMORY', 'N/A', 'N/A');	
insert into metricqm (attributeId, configurationprofileId, probeName, descriptionName, resourceName) values (36, 3, 'probe CLUSTERUSEDCPU', 'N/A', 'N/A');
insert into metricqm (attributeId, configurationprofileId, probeName, descriptionName, resourceName) values (37, 3, 'probe CLUSTERTOTALCPU', 'N/A', 'N/A');
insert into metricqm (attributeId, configurationprofileId, probeName, descriptionName, resourceName) values (38, 3, 'probe CLUSTERUSEDMEMORY', 'N/A', 'N/A');
insert into metricqm (attributeId, configurationprofileId, probeName, descriptionName, resourceName) values (39, 3, 'probe CLUSTERTOTALMEMORY', 'N/A', 'N/A');
insert into metricqm (attributeId, configurationprofileId, probeName, descriptionName, resourceName) values (40, 3, 'probe PODUSAGE', 'N/A', 'N/A');
insert into metricqm (attributeId, configurationprofileId, probeName, descriptionName, resourceName) values (41, 3, 'probe NODEUSAGE', 'N/A', 'N/A');

-----------------------------------------------------------------------------------------------------------------------------------------------