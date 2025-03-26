package com.example.demo2;

import com.example.demo2.DTO.DocenteDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name="gestionecorso",url="http://localhost:8080")
public interface BackEndClient {

    @GetMapping("/docente")
    List<DocenteDTO> getAllDocente();



}
