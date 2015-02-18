FROM samirtalwar/gradle-build

EXPOSE 8080
EXPOSE 8081

RUN tar xf build/distributions/app-0.1-SNAPSHOT.tar -C /usr/share
RUN mv /usr/share/app-0.1-SNAPSHOT /usr/share/app
ENTRYPOINT /usr/share/app/bin/app server
