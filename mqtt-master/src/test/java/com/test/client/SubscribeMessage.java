package com.test.client;

import org.eclipse.paho.client.mqttv3.*;

public class SubscribeMessage implements MqttCallback {

    private MqttClient client;

    public SubscribeMessage() {
    }

    public static void main(String[] args) {
//		String tcpUrl = "tcp://127.0.0.1:1883";
//		String clientId = "sub-msg/client1";
//		String topicName = "sub/client1";
//
//		new SubscribeMessage().doDemo(tcpUrl, clientId, topicName);
//        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < 10000; i++) {
        new SubscribeThread("client_" + 0 + i, "tcp://127.0.0.1:" + (65432 + 0 * 2)).start();
            }
//        }

    }

    public void doDemo(String tcpUrl, String clientId, String topicName) {
        try {
            client = new MqttClient(tcpUrl, clientId);
            MqttConnectOptions mqcConf = new MqttConnectOptions();
            mqcConf.setConnectionTimeout(300);
            mqcConf.setKeepAliveInterval(1000);
            client.connect(mqcConf);
            client.setCallback(this);
            client.subscribe(topicName);
        } catch (MqttException e) {
            e.printStackTrace();
        }
    }

    public void connectionLost(Throwable cause) {
        cause.printStackTrace();
    }

    public void messageArrived(String topic, MqttMessage message)
            throws Exception {
        System.out.println("[GOT PUBLISH MESSAGE] : " + message);
    }

    public void deliveryComplete(IMqttDeliveryToken token) {
    }
}