FROM java:8
VOLUME /tmp
ADD target/analyzer.jar analyzer.jar
RUN bash -c 'touch /analyzer.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/analyzer.jar"]
COPY dashboard usr/share/nginx/html