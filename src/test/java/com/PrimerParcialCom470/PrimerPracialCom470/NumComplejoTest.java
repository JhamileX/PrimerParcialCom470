/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.PrimerParcialCom470.PrimerPracialCom470;

import java.util.List;
import org.assertj.core.util.Arrays;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author jhamil
 */
@RunWith(Parameterized.class)
public class NumComplejoTest {
    
    @Parameterized.Parameters
    public static List<Object> datos() {
        //devolvera una lista
        return Arrays.asList(new Object[][]{
            {-4, 92},{6, 2},{5, 5},{-10, 2},{1, 2},
            {1, -2},{1, 7},{4, 5},{11, 2},{52, 8}
        });
    }
    @Parameterized.Parameter(0)
    public int parteEntera;
    @Parameterized.Parameter(1)
    public int parteImaginaria;
    
    
    @Test
    public void testSumar() {
            NumComplejo instancia = new NumComplejo(1, 1);

            NumComplejo resultado = instancia.sumar(new NumComplejo(parteEntera, parteImaginaria));
            NumComplejo esperado = new NumComplejo(parteEntera + 1, parteImaginaria + 1);

            assertEquals(resultado.getParteReal(), esperado.getParteReal());
            assertEquals(resultado.getParteImaginaria(), esperado.getParteImaginaria());
    }

    @Test
    public void testRestar() {
            NumComplejo instancia = new NumComplejo(1, 1);

            NumComplejo resultado = instancia.restar(new NumComplejo(parteEntera, parteImaginaria));
            NumComplejo esperado = new NumComplejo(1 - parteEntera, 1 - parteImaginaria);

            assertEquals(resultado.getParteReal(), esperado.getParteReal());
            assertEquals(resultado.getParteImaginaria(), esperado.getParteImaginaria());
    }

}
