#!/bin/bash

echo "Cleaning and building project..."
./gradlew -p server clean build

if [ $? -ne 0 ]; then
  echo "Gradle build failed. Exiting."
  exit 1
fi

echo
echo "Gradle build successful."
echo "Starting Docker Compose..."
cd docker
docker-compose up --build backend
