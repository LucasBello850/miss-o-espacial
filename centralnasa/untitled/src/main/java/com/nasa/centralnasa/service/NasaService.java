package com.nasa.centralnasa.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import com.nasa.centralnasa.dto.NasaApodDTO;

@Service
public class NasaService {

    private final RestClient client;

    public NasaService() {

        client = RestClient.builder()

                .baseUrl(
                        "https://api.nasa.gov")

                .build();
    }

    public NasaApodDTO buscarApod() {

        return client.get()

                .uri("/planetary/apod?api_key=DEMO_KEY")

                .retrieve()

                .body(
                        NasaApodDTO.class
                );
    }
}