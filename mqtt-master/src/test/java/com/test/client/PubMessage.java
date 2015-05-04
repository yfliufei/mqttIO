package com.test.client;

import java.io.UnsupportedEncodingException;

import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttTopic;

public class PubMessage {
    public static void main(String[] args) throws MqttException,
            UnsupportedEncodingException {

        String tcpUrl = "tcp://127.0.0.1:65432";
        String clientId = "pub-msg/client";
        String topicName = "sub/client1";
        String message = "Hello Mqtt Server !";

        System.out.println("start...");
        pubMsg(tcpUrl, clientId, topicName, message);
        System.out.println("PUB Done!");
    }

    public static void pubMsg(String tcpUrl, String clientId, String topicName,
                              String message) throws MqttException, UnsupportedEncodingException {

//        for (int i = 0; i < 100; i++) {
        while (true) {
            MqttClient client = new MqttClient(tcpUrl, clientId);

            MqttConnectOptions mqcConf = new MqttConnectOptions();
            mqcConf.setConnectionTimeout(300);
            mqcConf.setKeepAliveInterval(1000);
            client.connect(mqcConf);

            MqttTopic topic = client.getTopic(topicName);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            }
            topic.publish(message.getBytes("utf8"), 0, false);
            client.disconnect();
        }


    }
}