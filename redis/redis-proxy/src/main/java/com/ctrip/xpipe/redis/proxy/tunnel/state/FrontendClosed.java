package com.ctrip.xpipe.redis.proxy.tunnel.state;

import com.ctrip.xpipe.redis.proxy.Session;
import com.ctrip.xpipe.redis.proxy.tunnel.DefaultTunnel;
import com.ctrip.xpipe.redis.proxy.tunnel.TunnelState;
import io.netty.buffer.ByteBuf;

/**
 * @author chen.zhu
 * <p>
 * May 12, 2018
 */
public class FrontendClosed extends AbstractTunnelState {

    public FrontendClosed(DefaultTunnel tunnel) {
        super(tunnel);
    }

    @Override
    public String name() {
        return "Frontend-Closed";
    }

    @Override
    public void forward(ByteBuf message, Session src) {
        throw new UnsupportedOperationException("frontend closed");
    }

    @Override
    protected TunnelState doNextAfterSuccess() {
        return new TunnelClosing(tunnel);
    }

    @Override
    protected TunnelState doNextAfterFail() {
        return new TunnelClosing(tunnel);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
