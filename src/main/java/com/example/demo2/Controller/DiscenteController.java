package com.example.demo2.Controller;

import com.example.demo2.DTO.DiscenteDTO;
import com.example.demo2.Service.DiscenteService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/discente")
public class DiscenteController {

    private final DiscenteService discenteService;

    public DiscenteController(DiscenteService discenteService) {
        this.discenteService = discenteService;
    }

    @GetMapping("")
    public Flux<DiscenteDTO> getAllDiscente() {
        return this.discenteService.getAllDiscente();
    }

}
