FROM eclipse-temurin:18

RUN apt-get update && apt-get upgrade -y
RUN apt-get install -y x11vnc xvfb
RUN mkdir ~/.vnc /app
RUN x11vnc -storepasswd 1234 ~/.vnc/passwd
COPY entrypoint.sh /entrypoint.sh
RUN chmod +x entrypoint.sh
ENTRYPOINT ["/entrypoint.sh"]