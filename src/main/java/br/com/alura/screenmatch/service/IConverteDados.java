package br.com.alura.screenmatch.service;

import br.com.alura.screenmatch.model.DadosSerie;

public interface IConverteDados {
    //o <T> T é usado quando não sei especificar qual dado estou aguardando cmo retorno
    // Class<T> classe indica que estou esperando um retorno de uma classe
    <T> T obterDados(String json, Class<T> classe);
}
