package br.com.alura.screanmatch.Service;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);
}
