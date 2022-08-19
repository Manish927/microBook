
It builds a container image, without a dockerfile via jib

.\mvnw compile jib:build -Dimage=<your image repository name>

example
.\mvnw compile jib:build -Dimage=$IMAGE_PATH        where 'IMAGE_PATH' is the target path in the container registry 'docker hub'

docker run -it -p 8080:8080 stepsawesome/myboot:v1