package com.ctrip.xpipe.redis.proxy.session.state;

import com.ctrip.xpipe.redis.proxy.session.DefaultSession;
import com.ctrip.xpipe.redis.proxy.session.SessionState;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelFuture;

/**
 * @author chen.zhu
 * <p>
 * May 13, 2018
 */
public class SessionClosed extends AbstractSessionState {

    public SessionClosed(DefaultSession session) {
        super(session);
    }

    @Override
    protected SessionState doNextAfterSuccess() {
        return this;
    }

    @Override
    protected SessionState doNextAfterFail() {
        return this;
    }

    @Override
    public ChannelFuture tryWrite(ByteBuf byteBuf) {
        throw new UnsupportedOperationException("Session's been closed");
    }

    @Override
    public ChannelFuture connect() {
        throw new UnsupportedOperationException("Session's been closed");
    }

    @Override
    public void disconnect() {
        throw new UnsupportedOperationException("Session's been closed");
    }

    @Override
    public String name() {
        return "Session-Closed";
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
