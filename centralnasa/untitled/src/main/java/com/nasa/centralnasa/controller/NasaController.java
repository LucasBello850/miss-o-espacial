package com.nasa.centralnasa.controller;

import com.nasa.centralnasa.dto.NasaApodDTO;
import com.nasa.centralnasa.service.NasaService;

import org.springframework.web.bind.annotation.*;

@RestController

@RequestMapping("/nasa")

public class NasaController {

    private final NasaService service;

    public NasaController(
            NasaService service) {

        this.service = service;
    }

    @GetMapping("/apod")

    public NasaApodDTO apod() {

        return service.buscarApod();
    }
}