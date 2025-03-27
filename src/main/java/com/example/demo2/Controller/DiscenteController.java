package com.example.demo2.Controller;

import com.example.demo2.DTO.DiscenteDTO;
import com.example.demo2.Service.DiscenteService;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

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

    @GetMapping("/getDiscenteById/{id}")
    public Mono<DiscenteDTO> getDiscenteById(@PathVariable("id") Integer id) {
        return this.discenteService.getDiscenteById(id);

    }

    @PostMapping("/saveDiscente")
    public Mono<DiscenteDTO> saveDiscente(@RequestBody DiscenteDTO discenteDTO) {
        return this.discenteService.saveDiscente(discenteDTO);
    }

}
