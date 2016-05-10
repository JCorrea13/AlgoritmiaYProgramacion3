/*
 * Esta clase contiene los metodos necesarios para 
 * manejar el arbol de codificacion
 */
package Trabajo2Parcial;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author 16171024
 */
public class ManejadorArbol {
    
    /**
     * Este metodo recibe una cadena y calcula las frecuencias 
     * de todos los caracteres que contiene la cadena.
     * @param s cadena de la cual se generara el arregle de frecuencias
     * @return HashMap<Caracter, Frecuencia>
     */
    public static HashMap<String, AtomicInteger> getFrecuencias(String s){
        
        String clave;
        HashMap <String, AtomicInteger> mapa = new HashMap <String, AtomicInteger> ();
        for (int i = 0; i < s.length(); i++){
            clave = s.substring(i,i+1);
            if((mapa.get(clave)) != null)
                mapa.get(clave).incrementAndGet();
            else
                mapa.put(clave, new AtomicInteger(1));
        }
        
        return mapa;
    }
    
    
    public static void muestraMapa(HashMap<String, AtomicInteger> hm){
        
        for (Map.Entry<String, AtomicInteger> pair : hm.entrySet()) {
            System.out.print(pair.getKey() + " - ");
            System.out.println(pair.getValue().intValue());
        }
    }
}
