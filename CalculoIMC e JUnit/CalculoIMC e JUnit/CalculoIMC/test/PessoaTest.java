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
public class PessoaTest {

    public PessoaTest() {
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
     * Test of Calcular method, of class Pessoa.
     */
    @Test
    public void testCalcular() {
        System.out.println("Calcular");
        Pessoa instance = new Pessoa();
        instance.Calcular();
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setSexo method, of class Pessoa.
     */
    @Test
    public void testSetSexo() {
        System.out.println("setSexo");
        char sexo = 'm';
        Pessoa instance = new Pessoa();
        instance.setSexo(sexo);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getAltura method, of class Pessoa.
     */
    @Test
    public void testGetAltura() {
        System.out.println("getAltura");
        Pessoa instance = new Pessoa();
        double expResult = 1.60;
        double result = instance.getAltura();
        assertEquals(expResult, result, 1.60);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setAltura method, of class Pessoa.
     */
    @Test
    public void testSetAltura() {
        System.out.println("setAltura");
        double altura = 1.60;
        Pessoa instance = new Pessoa();
        instance.setAltura(altura);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setPeso method, of class Pessoa.
     */
    @Test
    public void testSetPeso() {
        System.out.println("setPeso");
        double peso = 60;
        Pessoa instance = new Pessoa();
        instance.setPeso(peso);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setNome method, of class Pessoa.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "Nome da Pessoa";
        Pessoa instance = new Pessoa();
        instance.setNome(nome);
        // TODO review the generated test code and remove the default call to fail.
    }

}
