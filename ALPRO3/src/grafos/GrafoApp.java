package grafos;

public class GrafoApp {

	public static void main(String[] args) throws Exception {
		System.out.println("Grafos");
		
		GrafoDirecionado g = new GrafoDirecionado("g7.txt");
                g.djikstra(0, 0);
		System.out.println(g);
		
		
	}
}
