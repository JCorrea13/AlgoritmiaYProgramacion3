package grafos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import grafos.Grafo;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 16171024
 */
public class GrafoTest {
    
    public GrafoTest() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void testPercursoLarguraG1() throws Exception{
        Grafo g = new Grafo("g1.txt");	
        List<Integer> expected = new ArrayList<>(1);
        expected.add(0);
        List<Integer> actual = g.percursoLargura(0);
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testPercursoLarguraG6() throws Exception{
        Grafo g = new Grafo("g6.txt");	
        List<Integer> expected = new ArrayList<>(1);
        for (int i = 0; i < 10; i++) 
            expected.add(i);
        
        List<Integer> actual = g.percursoLargura(0);
        
        assertEquals(expected, actual);
    }
}
