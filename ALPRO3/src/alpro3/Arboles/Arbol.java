package alpro3.Arboles;

public class Arbol {
    
    private Nodo raiz;
    
    public void insertar(int llave){
        raiz = insertar0(llave, raiz);
    }

    private Nodo insertar0(int llave, Nodo nodo) {
        if(nodo == null)
            return new Nodo(llave);
        
        if(llave < nodo.llave)
            nodo.nodoI = insertar0(llave, nodo.nodoI);
        else if(llave > nodo.llave)
            nodo.nodoD = insertar0(llave, nodo.nodoD);
        
        return nodo;
    }
    
    @Override
    public String toString(){
        recorrePorCentro(raiz);
        return null;
    }
    
    private void recorrePorCentro(Nodo nodo){
        if(nodo == null)
            return;
        
        recorrePorCentro(nodo.nodoI);
        System.out.println(nodo.llave);
        recorrePorCentro(nodo.nodoD);
    }
    
    private static class Nodo{
        
        int llave;
        Nodo nodoI;
        Nodo nodoD;

        public Nodo(int llave) {
            this.llave = llave;
        }
    }
}
