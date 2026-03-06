FROM tomcat:9.0-jdk17

# Remove default apps
RUN rm -rf /usr/local/tomcat/webapps/*

# Copy your project to Tomcat
COPY . /usr/local/tomcat/webapps/ROOT

# Expose port
EXPOSE 8080

# Start Tomcat
CMD ["catalina.sh", "run"]
