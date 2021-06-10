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
			// BR object to read file
			BufferedReader reader = new BufferedReader(new FileReader(fileName));
			
			// read file
			while ((line = reader.readLine()) != null) {
				String[] values = line.split(",");	// delimit with ,
				
				// First col of data is cities (vertices), map to unique int
				v.put(values[0], count++);
				// Create edge, where v = v1 and u = v2, with edge that has weight of type int
				// Uses first 3 cols of file
				e.add(new Edge(values[0], values[1], Integer.parseInt(values[2])));
				
				// Extract data pattern according to file
				// Adds according to adj list
				for (int i = 3; i < values.length; i += 2)
					e.add(new Edge(values[0], values[i], Integer.parseInt(values[i + 1])));
			}
			reader.close(); 	// done reading file
		}
		catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}
		catch (IOException ex) {
			ex.printStackTrace();
		}
	}
	
	public ArrayList<Edge> kruskalAlg(ArrayList<Edge> edges, HashMap<String, Integer> vertices) {
		
	}
	
	
	// setters and getters
	public String getU() {
		return u;
	}

	public String getV() {
		return v;
	}

	public int getWeight() {
		return weight;
	}

	@Override
	public int compareTo(Edge e) {
		if (this.weight > e.weight) return 1;
		if (this.weight < e.weight) return -1;
		return 0;
	}
		
	@Override
	public String toString() {
		return u + "  -----  " + v + " | Distance = " + weight + '\n';
	}
}
