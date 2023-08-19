ARG UBI_BUILD=bellsoft/liberica-runtime-container
ARG UBI_VERSION=jre-17-slim-musl

FROM ${UBI_BUILD}:${UBI_VERSION}

ARG SOURCE_DIR="."

WORKDIR /app

EXPOSE 8080

ADD ${SOURCE_DIR}/target/*.jar app.jar

USER root

RUN chown -R 185:185 /app
RUN chmod 755 /app

USER 185

ENTRYPOINT ["java","-jar","/app/app.jar","--spring.config.additional-location=file:///app/config"]