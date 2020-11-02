FROM alpine:edge

ARG MAVEN_VERSION="3.6.3"
ENV PATH="${PATH}:/opt/apache-maven-${MAVEN_VERSION}/bin"

RUN addgroup -g 1000 node \
    && adduser -u 1000 -G node -s /bin/sh -D node \
    && apk add --no-cache \
        libstdc++ \
    && apk add --no-cache --virtual .build-deps \
        binutils-gold \
        curl \
        g++ \
        gcc \
        gnupg \
        libgcc \
        linux-headers \
        make \
        python3 \
        openjdk11-jdk \
    && mkdir /opt/temporary

ADD https://apache.mirrors.tworzy.net/maven/maven-3/${MAVEN_VERSION}/binaries/apache-maven-${MAVEN_VERSION}-bin.tar.gz /opt/temporary

RUN tar -C /opt/temporary -xf apache-maven-${MAVEN_VERSION}-bin.tar.gz -C /opt/