FROM ubuntu:14.04

RUN apt-get update && apt-get install -y \
    python2.7 \
    g++ \
    software-properties-common \
    make 

RUN add-apt-repository ppa:openjdk-r/ppa && \
    apt-get update && \
    apt-get install -y openjdk-8-jdk

WORKDIR /github/workspace

CMD ["entrypoint.sh"]