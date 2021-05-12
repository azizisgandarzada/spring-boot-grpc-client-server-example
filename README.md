# spring-boot-grpc-client-server-example
Spring Boot gRPC Client Server Example (Gradle)

## Step 1:

* Go to project root folder

* Run command to generate java files from CardService.proto file
```bash
./gradlew build
```

## Step 2:

* Go to spring-boot-grpc-server-example

```bash
cd spring-boot-grpc-server-example
```

* Run Docker Compose file

```bash
docker-compose up -d
```

* Go to spring-boot-grpc-client-example

```bash
cd spring-boot-grpc-client-example
```

* Run Docker Compose file

```bash
docker-compose up -d
```


## Step 3: 

* Go to project root folder

* Run Command to start server

```bash
./gradlew spring-boot-grpc-server-example:bootRun
```

* Run Command to start client

```bash
./gradlew spring-boot-grpc-client-example:bootRun
```

## Step 4: 

* Import postman collection file and start tests



