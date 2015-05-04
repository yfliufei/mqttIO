package com.test.client;

import org.eclipse.paho.client.mqttv3.MqttClientPersistence;
import org.eclipse.paho.client.mqttv3.MqttPersistable;
import org.eclipse.paho.client.mqttv3.MqttPersistenceException;

import java.util.Enumeration;

/**
 * Created by IntelliJ IDEA.
 * User: yfliufei
 * Date: 15-4-8
 * Time: 上午10:51
 * To change this template use File | Settings | File Templates.
 */
public class MqClientPersistence implements MqttClientPersistence{
    @Override
    public void open(String s, String s1) throws MqttPersistenceException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void close() throws MqttPersistenceException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void put(String s, MqttPersistable mqttPersistable) throws MqttPersistenceException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public MqttPersistable get(String s) throws MqttPersistenceException {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void remove(String s) throws MqttPersistenceException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Enumeration keys() throws MqttPersistenceException {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void clear() throws MqttPersistenceException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean containsKey(String s) throws MqttPersistenceException {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
