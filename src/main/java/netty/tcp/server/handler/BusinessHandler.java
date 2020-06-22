package netty.tcp.server.handler;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import org.apache.log4j.Logger;
import netty.tcp.utils.ByteUtils;

public class BusinessHandler extends ChannelInboundHandlerAdapter {
    private ObjectMapper objectMapper = ByteUtils.InstanceObjectMapper();
    private Logger logger = Logger.getLogger(this.getClass());

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        System.out.println(msg.toString());
    }
}
