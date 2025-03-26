package com.example.demo2.Controller;

import com.example.demo2.DTO.DocenteDTO;
import com.example.demo2.Service.DocenteService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/docente")
public class DocenteController {
    private final DocenteService docenteService;

    public DocenteController(DocenteService docenteService) {
        this.docenteService = docenteService;

    }
    @GetMapping("")
    public List<DocenteDTO> getAllDocente() {
        return this.docenteService.getAllDocente();
    }
}
