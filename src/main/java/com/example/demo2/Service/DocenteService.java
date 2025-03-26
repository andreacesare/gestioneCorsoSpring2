package com.example.demo2.Service;

import com.example.demo2.BackEndClient;
import com.example.demo2.DTO.DocenteDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocenteService {
    private final BackEndClient backEndClient;

    public DocenteService(BackEndClient backEndClient) {
        this.backEndClient = backEndClient;
    }

    public List<DocenteDTO> getAllDocente() {
    return this.backEndClient.getAllDocente();
    }
}
