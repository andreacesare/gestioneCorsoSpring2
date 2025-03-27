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

    public CorsoDTO getCorsoById(int id) {
        return restTemplate.getForObject("http://localhost:8080/corso/getCorsoById/" + id, CorsoDTO.class);
    }

    public CorsoDTO saveCorso(CorsoDTO corso) {
        return restTemplate.postForObject("http://localhost:8080/corso/saveCorso", corso, CorsoDTO.class);
    }

    public void deleteCorso(Integer id) {
         restTemplate.delete("http://localhost:8080/corso/deleteCorso/"+id);
    }

}
