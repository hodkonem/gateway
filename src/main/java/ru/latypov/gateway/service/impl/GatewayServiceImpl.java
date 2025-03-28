package ru.latypov.gateway.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import ru.latypov.gateway.service.GatewayService;

@Service
@RequiredArgsConstructor
public class GatewayServiceImpl implements GatewayService {

    private final RestTemplate restTemplate;
    @Override
    public ResponseEntity<String> fetchInformationFromMainService() {
        return restTemplate.getForEntity("http://localhost:8081/api/test", String.class);
    }

    @Override
    public ResponseEntity<String> fetchInformationFromMainService1() {
        return restTemplate.getForEntity("http://localhost:8081/api/test1", String.class);
    }
}
