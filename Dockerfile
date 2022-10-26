FROM openjdk:17

WORKDIR /app

COPY . /app/

RUN javac  src/main/java/*.java -d ./

CMD [ "java", "Main" ]
