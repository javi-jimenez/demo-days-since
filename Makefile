all: run

run:
	./mvnw spring-boot:run

test-endpoint:
	curl http://localhost:8090/api/public-holidays/first/2025/ES

