#getting base image ubuntu
FROM ubuntu:latest
RUN apt-get update
CMD ["echo","Helloworld...!from my first docker image"]


