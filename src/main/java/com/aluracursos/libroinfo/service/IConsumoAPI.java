package com.aluracursos.libroinfo.service;

public interface IConsumoAPI {

    <T> T obtenerDatos (String json, Class<T> clase);

}
