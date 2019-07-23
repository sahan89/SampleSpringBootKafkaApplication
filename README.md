## *Overview*
Sample Spring Boot Application with Kafka and Zookeeper.

## *Prerequisites*
* Java 1.8
* Maven
* Spring Boot
* Kafka
* Zookeeper


Start Zookeeper `zkserver`

Start kafka `.\bin\windows\kafka-server-start.bat .\config\server.properties`

Start the consumer listening to the sample_topic `.\bin\windows\kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic java_in_use_topic --from-beginning`

