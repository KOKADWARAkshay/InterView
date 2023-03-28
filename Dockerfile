FROM adoptopenjdk/openjdk11:latest

# set working directory
WORKDIR /app

# copy the packaged jar file into the container
COPY target/myapp.jar /app

# set the startup command to execute the jar
CMD ["java", "-jar", "myapp.jar"]
