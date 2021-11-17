Reproduces https://github.com/smallrye/smallrye-reactive-messaging/issues/1507

## Steps

1. `docker-compose up`
2. Produce 100 or so messages into `messages` topics
3. `./gradlew quarkusDev` and notice logs start slowing down to 1 or 2 per second