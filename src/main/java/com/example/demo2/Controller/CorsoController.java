package com.example.demo2.Controller;

import com.example.demo2.DTO.CorsoDTO;
import com.example.demo2.Service.CorsoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/corso")
public class CorsoController {

    public final CorsoService corsoService;

    public CorsoController(CorsoService corsoService) {
        this.corsoService = corsoService;
    }

    @GetMapping("")
    public List<CorsoDTO> getAllCorso(){
        return this.corsoService.getAllCorso();
    }
}
