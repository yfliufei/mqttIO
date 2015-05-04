package io.mqtt.server;

import io.netty.channel.ChannelFuture;
import io.netty.util.internal.logging.InternalLogger;
import io.netty.util.internal.logging.InternalLoggerFactory;

/**
 * Created by IntelliJ IDEA.
 * User: yfliufei
 * Date: 15-4-7
 * Time: 上午11:50
 * To change this template use File | Settings | File Templates.
 */
public class ServerThread extends Thread {
    private static final InternalLogger logger = InternalLoggerFactory
            .getInstance(Server.class);
    int port;

    public ServerThread(int port) {
        this.port = port;
    }

    public void run() {
        logger.info("start mqtt.io server ...");
        Server server = new Server(port);
        ChannelFuture future = null;
        try {
            future = server.run();
        } catch (Exception e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

        Runtime.getRuntime().addShutdownHook(new ServerDestory(server));

        future.channel().closeFuture().syncUninterruptibly();
    }
}
