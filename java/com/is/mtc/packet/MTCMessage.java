package com.is.mtc.packet;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import io.netty.buffer.ByteBuf;

public class MTCMessage implements IMessage {
	public int id;

	public MTCMessage() {
	}

	public MTCMessage(int id) {
		this.id = id;
	}

	@Override
	public void toBytes(ByteBuf buf) {
		buf.writeInt(id);
	}

	@Override
	public void fromBytes(ByteBuf buf) {
		id = buf.readInt();
	}
}
