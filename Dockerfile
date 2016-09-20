FROM java
MAINTAINER liviu_aurelian@yahoo.com

COPY build/libs/app.war .
COPY run.sh .

CMD ./run.sh