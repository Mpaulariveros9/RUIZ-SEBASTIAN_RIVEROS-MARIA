package com.backend.integrador.dao.impl;

import com.backend.integrador.dao.IDao;
import com.backend.integrador.entity.Odontologo;
import org.apache.log4j.Logger;

import java.util.List;

public class OdontologoDaoEnMemoria implements IDao<Odontologo> {
    private static final Logger LOGGER = Logger.getLogger(OdontologoDaoEnMemoria.class);

    private final List<Odontologo> odontologosRepository;

    public OdontologoDaoEnMemoria(List<Odontologo> odontologosRepository) {
        this.odontologosRepository = odontologosRepository;
    }

    @Override
    public Odontologo registrarOdontologo(Odontologo odontologo) {
        odontologosRepository.add(odontologo);
        LOGGER.info("Odontólogo registrado: " + odontologo);
        return odontologo;
    }

    @Override
    public List<Odontologo> listarOdontologos() {
        LOGGER.info("Listado de todos los odontólogos: " + odontologosRepository);
        return odontologosRepository;
    }
}
