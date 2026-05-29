package com.nasa.centralnasa.controller;

import com.nasa.centralnasa.dto.MissaoDTO;
import com.nasa.centralnasa.service.MissaoService;

import java.util.List;

import org.springframework.web.bind.annotation.*;

@RestController

@RequestMapping("/missoes")

public class MissaoController {

    private final MissaoService service;

    public MissaoController(
            MissaoService service) {

        this.service = service;
    }

    @PostMapping

    public MissaoDTO criar(

            @RequestBody
            MissaoDTO dto) {

        return service.criarMissao(dto);
    }

    @GetMapping

    public List<MissaoDTO> listar() {

        return service.listar();
    }
}