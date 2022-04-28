package kr.digitcom.basicwebsocket.config;

import kr.digitcom.basicwebsocket.handler.BasicHandler;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

@Configuration
@EnableWebSocket
public class BasicWebSocketConfig implements WebSocketConfigurer {

    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        registry.addHandler(basicHandler(), "/basicHandler");
    }

    private WebSocketHandler basicHandler() {
        return new BasicHandler();
    }
}
