DROP TABLE IF EXISTS Event;

CREATE TABLE Event (
  ID INT PRIMARY KEY,
  Event VARCHAR,
  Timestamp BIGINT,
) WITH "template=partitioned, backups=1, CACHE_NAME=Event, VALUE_TYPE=ir.fallahdoust.ignitespring.model.Event";



INSERT INTO Event(ID, Event, Timestamp) VALUES (1,'transfer',1452599645000);
INSERT INTO Event(ID, Event, Timestamp) VALUES (2,'transfer',1479250540110);
INSERT INTO Event(ID, Event, Timestamp) VALUES (3,'transfer',1479249799770);
INSERT INTO Event(ID, Event, Timestamp) VALUES (4,'transfer',1535772675000);
INSERT INTO Event(ID, Event, Timestamp) VALUES (5,'transfer',1605344019000);
INSERT INTO Event(ID, Event, Timestamp) VALUES (6,'transfer',1606015875000);