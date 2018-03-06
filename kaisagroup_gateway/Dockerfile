FROM java:8
VOLUME /tmp
ADD ./target/kaisagroup_gateway.jar /app.jar
RUN bash -c 'touch /app.jar'
EXPOSE 8060
ENTRYPOINT ["java","-jar","/app.jar"]