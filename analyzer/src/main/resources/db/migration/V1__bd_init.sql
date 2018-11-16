CREATE TABLE privacy (
	id BIGINT NOT NULL AUTO_INCREMENT,
	risk BIGINT, 
	utility BIGINT, 
	k BIGINT,
	data_hora TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
	PRIMARY KEY (id) 
);

insert into privacy (risk, utility, k) values (2,4,3);
insert into privacy (risk, utility, k) values (3,1,2);
insert into privacy (risk, utility, k) values (2,1,5);
insert into privacy (risk, utility, k) values (4,5,3);
insert into privacy (risk, utility, k) values (1,3,4);

CREATE TABLE properties (
	id BIGINT NOT NULL AUTO_INCREMENT,  
	name varchar(30) NOT NULL,
  	relevance float NOT NULL,
  	threshold float NOT NULL,
  	periodicity float NOT NULL,
	PRIMARY KEY (id)
);

-- -- Quality Model -- --

DROP TABLE IF EXISTS historicaldata;
DROP TABLE IF EXISTS attribute;
DROP TABLE IF EXISTS preference;
DROP TABLE IF EXISTS metric;
DROP TABLE IF EXISTS configurationprofile;
DROP TABLE IF EXISTS leafattribute;
DROP TABLE IF EXISTS compositeattribute;

CREATE TABLE attribute (
    attributeId INT NOT NULL AUTO_INCREMENT,
    compositeattributeId INT NOT NULL,
    name VARCHAR(1024),
    primary key(attributeId)  
);

CREATE TABLE historicaldata (
    attributeId INT NOT NULL,
    instant TIMESTAMP(6),
    value DOUBLE PRECISION,
    PRIMARY KEY (attributeId)
);

CREATE TABLE configurationprofile (
    configurationprofileId INT NOT NULL AUTO_INCREMENT,
    PRIMARY KEY (configurationprofileId)
);

CREATE TABLE preference (
    attributeId INT NOT NULL,
    configurationprofileId INT NOT NULL,
    weight DOUBLE PRECISION,
    threshold DOUBLE PRECISION,
    PRIMARY KEY (attributeId)
);

CREATE TABLE leafattribute (
    attributeId INT NOT NULL,
    normalizationMin DOUBLE PRECISION,
    normalizationMax DOUBLE PRECISION,
    operator INT,
    numSamples INT,
    normalizationKind INT,
    PRIMARY KEY (attributeId)
);

CREATE TABLE metric (
    attributeId INT NOT NULL,
    configurationprofileId INT NOT NULL,
    probeName VARCHAR(1024),
    descriptionName VARCHAR(1024),
    resourceName VARCHAR(1024),
    PRIMARY KEY (attributeId)
);

CREATE TABLE compositeattribute (
    attributeId INT NOT NULL,
    operator INT,
    PRIMARY KEY (attributeId)
);


ALTER TABLE historicaldata ADD CONSTRAINT FK_HistoricalData_0 FOREIGN KEY (attributeId) REFERENCES attribute (attributeId);

ALTER TABLE preference ADD CONSTRAINT FK_Preference_0 FOREIGN KEY (configurationprofileId) REFERENCES configurationprofile (configurationprofileId);
ALTER TABLE metric ADD CONSTRAINT FK_Metric_0 FOREIGN KEY (configurationprofileId) REFERENCES configurationprofile (configurationprofileId);

ALTER TABLE preference ADD CONSTRAINT FK_Preference_1 FOREIGN KEY (attributeId) REFERENCES attribute (attributeId);
ALTER TABLE metric ADD CONSTRAINT FK_Metric_1 FOREIGN KEY (attributeId) REFERENCES leafattribute (attributeId);

ALTER TABLE attribute ADD CONSTRAINT FK_Attribute_0 FOREIGN KEY (attributeId) REFERENCES compositeattribute (attributeId);

--------------------------------------------------------------------------------
--------------------------------------------------------------------------------
-- ATMOSPHERE - http://www.atmosphere-eubrazil.eu/
-- 
-- 
-- Trustworthiness Monitoring & Assessment Framework
-- Component: Knowledge - database
-- 
-- Repository: https://github.com/eubr-atmosphere/tma-framework
-- License: https://github.com/eubr-atmosphere/tma-framework/blob/master/LICENSE
--------------------------------------------------------------------------------
--------------------------------------------------------------------------------
--
-- Normalized MySQL version of the script for the knowledge 
-- database creation. 
--
-- @author José Pereira <josep@dei.uc.pt>
-- @author Nuno Antunes <nmsa@dei.uc.pt>
-- 
--------------------------------------------------------------------------------
--------------------------------------------------------------------------------

DROP TABLE IF EXISTS data;
DROP TABLE IF EXISTS configuration;

DROP TABLE IF EXISTS actuator;
DROP TABLE IF EXISTS description;
DROP TABLE IF EXISTS probe;
DROP TABLE IF EXISTS resource;
DROP TABLE IF EXISTS action;

-- -- Table time was removed for normalization.
-- DROP TABLE IF EXISTS Time;

CREATE TABLE actuator (
    actuatorId INT NOT NULL AUTO_INCREMENT,
    address VARCHAR(1024),
    pubKey VARCHAR(1024),
    PRIMARY KEY (actuatorId)
);

CREATE TABLE description (
    descriptionId INT NOT NULL AUTO_INCREMENT,
    dataType VARCHAR(16),
    descriptionName VARCHAR(128),
    unit VARCHAR(16),
    PRIMARY KEY (descriptionId)
);

CREATE TABLE probe (
    probeId INT NOT NULL AUTO_INCREMENT,
    probeName VARCHAR(128),
    password VARCHAR(128),
    salt VARCHAR(128) NOT NULL,
    token VARCHAR(256),
    tokenExpiration TIMESTAMP(6),
    PRIMARY KEY (probeId)
);


CREATE TABLE resource (
    resourceId INT NOT NULL AUTO_INCREMENT,
    resourceName VARCHAR(128),
    resourceType VARCHAR(16),
    resourceAddress VARCHAR(1024),
    PRIMARY KEY (resourceId)
);

-- -- Table time was removed for normalization.
-- CREATE TABLE Time (
-- valueTime TIMESTAMP(6) NOT NULL,
-- PRIMARY KEY (valueTime)
-- );


CREATE TABLE action (
    actionId INT NOT NULL AUTO_INCREMENT,
    actuatorId INT NOT NULL,
    resourceId INT NOT NULL,
    actionName VARCHAR(128),
    PRIMARY KEY (actionId)
);

CREATE TABLE configuration (
    actionId INT NOT NULL,
    keyName VARCHAR(128),
    domain VARCHAR(1024),
    PRIMARY KEY (actionId)
);

CREATE TABLE data (
    probeId INT NOT NULL,
    descriptionId INT NOT NULL,
    resourceId INT NOT NULL,
    attributeId INT NOT NULL,
    valueTime TIMESTAMP(6) NOT NULL,
    value DOUBLE PRECISION,
    PRIMARY KEY (probeId,descriptionId,resourceId,valueTime)
);

ALTER TABLE action ADD CONSTRAINT FK_Action_0 FOREIGN KEY (actuatorId) REFERENCES actuator (actuatorId);
ALTER TABLE action ADD CONSTRAINT FK_Action_1 FOREIGN KEY (resourceId) REFERENCES resource (resourceId);

ALTER TABLE configuration ADD CONSTRAINT FK_Configuration_0 FOREIGN KEY (actionId) REFERENCES action (actionId);

ALTER TABLE data ADD CONSTRAINT FK_Data_0 FOREIGN KEY (probeId) REFERENCES probe (probeId);
ALTER TABLE data ADD CONSTRAINT FK_Data_1 FOREIGN KEY (descriptionId) REFERENCES description (descriptionId);
ALTER TABLE data ADD CONSTRAINT FK_Data_2 FOREIGN KEY (resourceId) REFERENCES resource (resourceId);
ALTER TABLE data ADD CONSTRAINT FK_Data_3 FOREIGN KEY (attributeId) REFERENCES metric (attributeId);

-- -- Table time was removed for normalization.
-- ALTER TABLE Data ADD CONSTRAINT FK_Data_3 FOREIGN KEY (valueTime) REFERENCES Time (valueTime);