package dsa_graph;

public class Graph {
	private final String notes = """
			Graph is a non-linear data structure that consists of vertices (nodes) and edges.
			UseCase
			  - Social Network - Each person is a vertex, and relationships(like friendship) are the edge.
			                   - User can easily suggest the mutual friends and potential friends.
			  - Maps and Navigation - Location, Like a town or bus stops, are stoed as vertices and roads are 
			                         stored as edges. Alogorith can find the shortest rout between two location
			                         when stored as a graph
			""";
	private int[][] adjMatrix;
	private char[] vertxData;
	private int size;
	
	
}
