FROM openjdk:8
RUN echo 1
RUN apt-get update && apt-get install  -y curl
RUN curl -o /usr/bin/lein https://raw.githubusercontent.com/technomancy/leiningen/stable/bin/lein
RUN chmod +x /usr/bin/lein
