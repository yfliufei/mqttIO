package io.mqtt.processer;

import io.mqtt.tool.MemPool;
import io.netty.channel.ChannelHandlerContext;

import org.meqantt.message.DisconnectMessage;
import org.meqantt.message.Message;
import org.meqantt.message.PingRespMessage;

import javax.sound.midi.SysexMessage;

public class PingReqProcesser implements Processer {

	private static PingRespMessage PING_RESP = new PingRespMessage();

	private static DisconnectMessage DISCONNECT = new DisconnectMessage();

	public Message proc(Message msg, ChannelHandlerContext ctx) {
		if (MemPool.getClientId(ctx.channel()) == null) {
			return DISCONNECT;
		}
        System.out.println("server get the client:"+MemPool.getClientId( ctx.channel())+",heart beat");
		return PING_RESP;
	}
}