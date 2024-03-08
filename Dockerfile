FROM ubuntu:latest
LABEL authors="hwang"

ENTRYPOINT ["top", "-b"]