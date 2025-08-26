.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties
.\bin\windows\kafka-server-start.bat .\config\server.properties
.\bin\windows\kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic tttest
.\bin\windows\kafka-console-producer.bat --broker-list localhost:9092 --topic product
.\bin\windows\kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic product
