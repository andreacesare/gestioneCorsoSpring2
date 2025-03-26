package com.example.demo2.Service;

import com.example.demo2.DTO.DiscenteDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class DiscenteService {

    public final WebClient webClient;

    public DiscenteService(WebClient webClient) {
        this.webClient = webClient;
    }

    public Flux<DiscenteDTO> getAllDiscente() {
        return webClient.get()
                .uri("/discente")
                .retrieve()
                .bodyToFlux(DiscenteDTO.class);
    }
}

