docker build -t dac-jpa/postgres ./postgres  # Build Dockerfile
docker run -p 5433:5432 --name postgres -d dac-jpa/postgres

mvn clean package                      #Constuir o projeto.

chmod -R 777 ./target
docker build -t dac-jpa/app .          # Build Dockerfile
docker run -p 8080:8080 --name app --link bd:host-container dac-jpa/app
docker logs -f app
docker logs -f postgres
