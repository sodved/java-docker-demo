FROM openjdk:8-jre-alpine

COPY setup.sh run.sh /
COPY maven/sod-java-${project.version}.jar /
RUN /setup.sh

CMD ["/run.sh"]
