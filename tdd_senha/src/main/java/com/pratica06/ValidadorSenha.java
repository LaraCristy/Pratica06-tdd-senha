package com.pratica06;

import java.util.ArrayList;
import java.util.List;

public class ValidadorSenha {

    public ResultadoValidacao validar(String senha) {
        List<String> erros = new ArrayList<>();

        if (senha.length() < 8) {
            erros.add("A senha deve ter pelo menos 8 caracteres");
        }

        long quantidadeDigitos = senha.chars()
                .filter(Character::isDigit)
                .count();

        if (quantidadeDigitos < 2) {
            erros.add("A senha deve conter pelo menos 2 dígitos");
        }

        boolean possuiMaiuscula = senha.chars()
                .anyMatch(Character::isUpperCase);

        if (!possuiMaiuscula) {
            erros.add("A senha deve conter pelo menos uma letra maiuscula");
        }

        return new ResultadoValidacao(erros.isEmpty(), erros);
    }
}