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
