FROM eclipse-temurin:17-jdk-jammy

WORKDIR /app
COPY . ./
RUN javac

COPY src ./src

CMD ["./mvnw", "spring-boot:run"]