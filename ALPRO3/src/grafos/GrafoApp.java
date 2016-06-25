package grafos;

public class GrafoApp {

	public static void main(String[] args) throws Exception {
		System.out.println("Grafos");
		
		GrafoDirecionado g = new GrafoDirecionado("g7.txt");
                System.out.println("Costo camino: " + g.djikstra(0, 2));
		System.out.println(g);
		
		
	}
}
