package com.nasa.centralnasa.service;

import com.nasa.centralnasa.dto.MissaoDTO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class MissaoService {

    private final List<MissaoDTO> missoes =
            new ArrayList<>();

    public MissaoDTO criarMissao(
            MissaoDTO missao) {

        missoes.add(missao);

        return missao;
    }

    public List<MissaoDTO> listar() {

        return missoes;
    }
}