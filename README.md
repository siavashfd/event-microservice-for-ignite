# Event Microservice with Apache Ignite

Event Microservice that uses Apache Ignite as a high-performance in-memory database.
It comes with its native persistence that allows storing and processing data both in-memory and on disk.


## Run the Application

```
mvn spring-boot:run
```

get all the events that have a timestamp equal to or greater than the requested value:

```
curl http://localhost:8000/api/events?timestamp=1479250540110
```

The response will be as follows:

```
[{"id":6,"event":null,"timestamp":1606015875000},
{"id":5,"event":null,"timestamp":1605344019000},
{"id":4,"event":null,"timestamp":1535772675000},
{"id":2,"event":null,"timestamp":1479250540110}]
```

get the event with id:

```
curl http://localhost:8000/api/events/1
```
The response will be as follows:

```
{"id":1,"event":null,"timestamp":1452599645000}
```


