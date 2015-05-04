package io.mqtt.server;

/**
 * Created by IntelliJ IDEA.
 * User: yfliufei
 * Date: 15-4-7
 * Time: 下午12:33
 * To change this template use File | Settings | File Templates.
 */
public class ServerDestory extends Thread {
    private Server server;

    public ServerDestory(Server server) {
        this.server = server;

    }

    public void run() {
        server.destroy();
    }
}
