package com.yikesong.websocketssl.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.AbstractWebSocketHandler;

@Component
@Configuration
public class YpsWebSocketHandler extends AbstractWebSocketHandler {
    private static final Logger logger = LoggerFactory.getLogger(YpsWebSocketHandler.class);

    @Override
    public void afterConnectionEstablished(WebSocketSession session) {
        logger.info("登录成功， 会话: {}", session);
    }

    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus status) {
        logger.info("连接断开，会话: {}, 状态: {}", session);
    }
}
