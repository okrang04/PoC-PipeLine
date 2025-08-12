FROM openjdk:17-jdk-slim
LABEL app_name="KTdsPOC"
COPY build/libs/*.jar /deploy/app.jar
EXPOSE 8888
CMD java -jar -Dserver.port=8888 /deploy/app.jar