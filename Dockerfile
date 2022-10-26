FROM openjdk:17

WORKDIR /app

COPY . /app/

RUN javac src/main/java/Main.java

CMD [ "java", "src/main/java/Main" ]
