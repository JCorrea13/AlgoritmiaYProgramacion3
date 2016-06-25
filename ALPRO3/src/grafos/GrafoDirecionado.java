package grafos;

import java.util.Set;
import java.util.TreeSet;

public class GrafoDirecionado extends Grafo {

	public GrafoDirecionado(int tamanho) {
		super(tamanho);
	}

	public GrafoDirecionado(String nomeDoArquivo) throws Exception {
		super(nomeDoArquivo);
	}

	public void floydWarshall() {
		// TODO: completar
	}

        @SuppressWarnings("empty-statement")
	public int djikstra(int origem, int destino) {
            
            int i, v, u, z, j;
            
            int D[] = new int[dados.length];
            int P[] = new int[dados.length];
            
            for (v = 0; v < dados.length; v++) {
                D[v] = Integer.MAX_VALUE;
                P[v] = -1;
            }
            
            D[origem] = 0;
            Set<Integer> Q = new TreeSet<Integer>();
            
            for(v = 0; v < dados.length; v++)
                Q.add(v);
            
            while(!Q.isEmpty()){
                u = smallestDist(Q, D);
                if(D[u] == Integer.MAX_VALUE) break;
                
                Q.remove(u);
                for(z = 0; z < dados.length; z++){
                    if(dados[u][z] != 0 && Q.contains(z)){
                        int d = D[u] + dados[u][z];
                        if(d < D[z]){
                            D[z] = d;
                            P[z] = u;
                        }
                    }
                }
            }

            return D[destino];
	}
        
        private int smallestDist(Set<Integer> Q, int[] D) {
            int res = -1;
            int menor = Integer.MAX_VALUE;
            
            for (Integer node: Q)
                if (D[node] <= menor) {
                    menor = D[node];
                    res = node;
                }
            
            return res;
        }

}
