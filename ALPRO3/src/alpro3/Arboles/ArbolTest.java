/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alpro3.Arboles;

/**
 *
 * @author 16171024
 */
public class ArbolTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Arbol a =  new Arbol();
        a.insertar(0);
        a.insertar(1);
        a.insertar(-1);
        a.insertar(-2);
        System.out.println(a.toString());
    }
    
}
