FROM openjdk:17

WORKDIR /app

COPY . /app/

RUN javac /src/java/Main.java

CMD [ "java", "Main" ]
