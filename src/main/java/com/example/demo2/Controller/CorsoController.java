package com.example.demo2.Controller;

import com.example.demo2.DTO.CorsoDTO;
import com.example.demo2.Service.CorsoService;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/getCorsoById/{id}")
    public CorsoDTO getCorsoById(@PathVariable("id") Integer id){
        return this.corsoService.getCorsoById(id);
    }

    @PostMapping("/saveCorso")
    public CorsoDTO saveCorso(@RequestBody CorsoDTO corsoDTO){
        return this.corsoService.saveCorso(corsoDTO);
    }

    @DeleteMapping("/deleteCorso/{id}")
    public void deleteCorso(@PathVariable("id") Integer id){
        this.corsoService.deleteCorso(id);
    }
}
