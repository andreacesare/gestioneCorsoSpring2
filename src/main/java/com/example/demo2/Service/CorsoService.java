package com.example.demo2.Service;

import com.example.demo2.DTO.CorsoDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class CorsoService {
    private final RestTemplate restTemplate;

    public CorsoService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public List<CorsoDTO> getAllCorso() {
        return restTemplate.getForObject("http://localhost:8080/corso", List.class);
    }

}
