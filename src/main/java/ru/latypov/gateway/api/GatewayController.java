package ru.latypov.gateway.api;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.latypov.gateway.service.GatewayService;

@RestController
@RequestMapping("api")
@RequiredArgsConstructor
public class GatewayController {

    private final GatewayService gatewayService;

    @GetMapping("test")
    public ResponseEntity<String> test() {
        return gatewayService.fetchInformationFromMainService();
    }

    @GetMapping("test1")
    public String test1() {
        return "Test1";
    }

    @GetMapping("test2")
    public ResponseEntity<String> test2() {
        return gatewayService.fetchInformationFromMainService1();
    }
}
