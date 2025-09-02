package kh.virakchantrak.api_gateway.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class MessageController {

    @Value("${spring.api-gateway.default-name}")
    private String defaultName;

    @GetMapping("api/default-name")
    public String getDefaultName() {
        return defaultName;
    }
}
