package com.example.demo2.Controller;

import com.example.demo2.DTO.DocenteDTO;
import com.example.demo2.Service.DocenteService;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/getDocenteById/{id}")
    public DocenteDTO getDocenteById(@PathVariable("id") Integer id) {
        return this.docenteService.getDocenteById(id);
    }

    @PostMapping("/saveDocente")
    public DocenteDTO saveDocente(@RequestBody DocenteDTO docenteDTO) {
        return this.docenteService.saveDocente(docenteDTO);
    }

    @DeleteMapping("/deleteDocente/{id}")
    public DocenteDTO deleteDocente(@PathVariable Integer id) {
        return this.docenteService.deleteDocente(id);
    }
}
