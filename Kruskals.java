import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.PriorityQueue;

public class Kruskals {
	public static void main(String[] args) {
		// contain list for edges and map for vertices
		ArrayList<Edge> edges = new ArrayList<>();
		HashMap<String, Integer> vertices = new HashMap<>();
		
		// construct Kruskals obj by reading file and storing edges and vertices
		Kruskals k = new Kruskals(edges, vertices);
  }

	public Kruskals(Array<Edge> e, HashMap<String, Integer> v) {
		// filename and line to extract from file
		String fileName = "src\\assn9_data.csv";
		String line = "";
		int count = 0;
		try {
		
		}
		catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}
		catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}
