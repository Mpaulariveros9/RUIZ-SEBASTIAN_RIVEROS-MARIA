package com.backend.integrador.test;

import com.backend.integrador.dao.impl.OdontologoDaoH2;
import com.backend.integrador.entity.Odontologo;
import com.backend.integrador.service.OdontologoService;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OdontologoServiceTest {
    private static Connection connection = null;

    private OdontologoService odontologoService = new OdontologoService(new OdontologoDaoH2());

    @Test
    public void deberiaAgregarUnOdontologo(){
        Odontologo odontologoTest = new Odontologo(216652 , "Maria", "Solsire");

        Odontologo odontologoResult = odontologoService.registrarOdontologo(odontologoTest);

        assertNotNull(odontologoResult);
        assertEquals(216652, odontologoResult.getMatricula());
        //el test no prueba que se haya agregado el registro a la bdd
    }


    @Test
    public void deberiaListarTodosLosOdontologos() {
        List<Odontologo> odontologosTest = odontologoService.listarOdontologos();
        assertFalse(odontologosTest.isEmpty());
    }
}