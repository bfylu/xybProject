安裝zipkin 步驟：
curl -sSL https://zipkin.io/quickstart.sh | bash -s

启动有几种方法：
java -jar zipkin.jar

or  经过rabbit传输
RABBIT_ADDRESSES=192.168.1.202:5672 RABBIT_USER=admin RABBIT_PASSWORD=admin  java -jar zipkin.jar

or  经过rabbit传输并存入es中 --ok
RABBIT_ADDRESSES=192.168.1.202:5672 RABBIT_USER=admin RABBIT_PASSWORD=admin STORAGE_TYPE=elasticsearch ES_HOSTS=http://localhost:9200 java -jar zipkin.jar

查看界面：
http://localhost:9411/zipkin/