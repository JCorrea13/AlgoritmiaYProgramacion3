package grafos;

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
            int d[] = new int[dados.length];
            
            //inicializamos d
            for(int i = 0; i < d.length; i++)
                if(i != origem) d[i] = 999999999;
                
            for(int i = 0; i< d.length; System.out.print(d[i++]));

            return d[destino];
	}

}
