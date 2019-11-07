FROM payara/server-full
COPY target/dac-jpa.war $DEPLOY_DIR
