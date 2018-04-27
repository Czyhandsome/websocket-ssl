package com.yikesong.websocketssl.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

import javax.inject.Inject;


@Configuration
@EnableWebSocket
public class WebSocketConfig implements WebSocketConfigurer {
    private final YpsWebSocketHandler ypsWebSocketHandler;

    @Inject
    public WebSocketConfig(YpsWebSocketHandler ypsWebSocketHandler) {
        this.ypsWebSocketHandler = ypsWebSocketHandler;
    }

    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry webSocketHandlerRegistry) {
        webSocketHandlerRegistry.addHandler(ypsWebSocketHandler(), "/ws")
                .setAllowedOrigins("*");
    }

    private YpsWebSocketHandler ypsWebSocketHandler() {
        return ypsWebSocketHandler;
    }
}
