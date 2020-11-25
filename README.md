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


get the event with id:

```
curl http://localhost:8000/api/events/1
```

