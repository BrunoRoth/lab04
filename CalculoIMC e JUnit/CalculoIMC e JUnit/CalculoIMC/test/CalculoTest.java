/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 31514456
 */
public class CalculoTest {
    
    public CalculoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calcularIMC method, of class Calculo.
     */
    @Test
    public void testCalcularIMC() {
        System.out.println("calcularIMC");
        double peso = 60;
        double altura = 1.60;
        String nome = "Nome da Pessoa";
        char sexo = 'm';
        Calculo instance = new Calculo();
        instance.calcularIMC(peso, altura, nome, sexo);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of mensagemRiscoBaixo method, of class Calculo.
     */
    @Test
    public void testMensagemRiscoBaixo() {
        System.out.println("mensagemRiscoBaixo");
        Calculo instance = new Calculo();
        instance.mensagemRiscoBaixo();
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of mensagemIdeal method, of class Calculo.
     */
    @Test
    public void testMensagemIdeal() {
        System.out.println("mensagemIdeal");
        Calculo instance = new Calculo();
        instance.mensagemIdeal();
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of mensagemRiscoModerado method, of class Calculo.
     */
    @Test
    public void testMensagemRiscoModerado() {
        System.out.println("mensagemRiscoModerado");
        Calculo instance = new Calculo();
        instance.mensagemRiscoModerado();
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of mensagemRiscoElevado method, of class Calculo.
     */
    @Test
    public void testMensagemRiscoElevado() {
        System.out.println("mensagemRiscoElevado");
        Calculo instance = new Calculo();
        instance.mensagemRiscoElevado();
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
