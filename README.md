# Spring Boot Application with high-performance in-memory database

The Apache Ignite comes with its native persistence that allows storing and processing data both **in-memory** and on **disk**.

## Start the Apache Ignite Cluster

1. Download and unzip the [Apache Ignite 2.9](https://ignite.apache.org/download.cgi#binaries)
2. Overwrite the default configuration settings {ignite-path}/config/default-config.xml with src/main/resources/default-config.xml
3. Open a command line and go to the {ignite-path}/bin folder
4. Start Ignite cluster node:
    ```
    ignite.bat
    ```
5. Open another command line window and activate the cluster:
    ```
    control.bat --activate
    ```
   
## Load the Event Database

1. Copy src/main/resources/event.sql to {ignite-path}/examples/sql
2. Open a command line and go to the {ignite-path}/bin folder
3. Use SQLLine to connect to the cluster:
    ```
    sqlline.bat -u jdbc:ignite:thin://127.0.0.1/
    ```
4. Load the event database:
    ```
    !run ..\examples\sql\event.sql
    ```
4. Check the database creation:
    ```
    select * from Event;
    ```
5. Quit SQLLine: ```!q```
   
## Run the Application

```
mvn spring-boot:run
```

Get all the events that have a timestamp equal to or greater than the requested value:

```
curl http://localhost:8000/api/events?timestamp=1479250540110
```

The response will be as follows:

```
[{"id":6,"event":"transfer","timestamp":1606015875000},
{"id":5,"event":"transfer","timestamp":1605344019000},
{"id":4,"event":"transfer","timestamp":1535772675000},
{"id":2,"event":"transfer","timestamp":1479250540110}]
```

Get the event with id 1:

```
curl http://localhost:8000/api/events/1
```
The response will be as follows:

```
{"id":1,"event":"transfer","timestamp":1452599645000}
```


