package org.wisdom.server.business;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import org.apache.log4j.Logger;
import org.wisdom.utils.ByteUtils;

public class BusinessHandler_3_0 extends ChannelInboundHandlerAdapter {
    private ObjectMapper objectMapper = ByteUtils.InstanceObjectMapper();
    private Logger logger = Logger.getLogger(this.getClass());

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        System.out.println(msg.toString());
    }
}
