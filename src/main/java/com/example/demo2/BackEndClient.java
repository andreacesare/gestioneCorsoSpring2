package com.example.demo2;

import com.example.demo2.DTO.DocenteDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name="gestionecorso",url="http://localhost:8080")
public interface BackEndClient {

    @GetMapping("/docente")
    List<DocenteDTO> getAllDocente();

    @GetMapping("/docente/getDocenteById/{idDocente}")
    DocenteDTO getDocenteById(@PathVariable int idDocente);

    @PostMapping("/docente/saveDocente")
    DocenteDTO saveDocente(@RequestBody DocenteDTO docenteDTO);

    @DeleteMapping("docente/deleteDocente/{id}")
    DocenteDTO deleteDocente(@PathVariable Integer id);





}
