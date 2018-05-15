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
public class TunnelClosed extends AbstractTunnelState {

    public TunnelClosed(DefaultTunnel tunnel) {
        super(tunnel);
    }

    @Override
    public String name() {
        return "Tunnel-Closed";
    }

    @Override
    public void forward(ByteBuf message, Session src) {
        throw new UnsupportedOperationException("Tunnel closed");
    }

    @Override
    protected TunnelState doNextAfterSuccess() {
        return null;
    }

    @Override
    protected TunnelState doNextAfterFail() {
        return null;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
