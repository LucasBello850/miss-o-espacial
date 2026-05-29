package com.nasa.centralnasa.dto;

import java.util.List;

public record MissaoDTO(

        String nome,

        String foguete,

        List<String> satelites

) {}