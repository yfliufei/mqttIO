package com.test.client;

/**
 * Created by IntelliJ IDEA.
 * User: yfliufei
 * Date: 15-4-7
 * Time: 上午11:05
 * To change this template use File | Settings | File Templates.
 */
public class SubscribeThread extends Thread{
    private String clientId;
    String tcpUrl;

    public SubscribeThread(String client,String tcpUrl){
        this.tcpUrl=tcpUrl;
        this.clientId=client;
    }

    @Override
    public void run() {
//        String tcpUrl = "tcp://127.0.0.1:1883";
        String topicName = "sub/client1";

        new SubscribeMessage().doDemo(tcpUrl, clientId, topicName);
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
