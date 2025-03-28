package ru.latypov.gateway.service;

import org.springframework.http.ResponseEntity;

public interface GatewayService {

    ResponseEntity<String> fetchInformationFromMainService();
    ResponseEntity<String> fetchInformationFromMainService1();
}
