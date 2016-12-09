import java.io.*;
import java.util.*;

public class BFSTraversal {
	private LinkedList<Integer> adj[];
	private int V;

	public BFSTraversal(int v) {
		adj = new LinkedList[v]; 
		V = v;
		for (int i = 0; i < v; i++) {
			adj[i] = new LinkedList<Integer>();
		}
	}
	
	public void addNode(int v, int e){
		adj[v].add(e);
	}
	
	public void traverse(int s){
		boolean visited[] = new boolean[V];
		LinkedList<Integer> queue = new LinkedList<Integer>();
		visited[s] = true;
	
		queue.add(s);
		while(queue.size() !=0){
			s = queue.poll();
			System.out.print(s+" ");
			Iterator<Integer> i = adj[s].listIterator();
			
			
			while (i.hasNext()) {
				int next = i.next();
				
				if (!visited[next]) {
					visited[next] = true;
					queue.add(next);
				}
			}
		}
	}
	
	public static void main(String args[]){
		BFSTraversal g = new BFSTraversal(6);
		 
        g.addNode(3, 1);
        g.addNode(3, 2);
        g.addNode(3, 4);
        g.addNode(1, 0);
        g.addNode(1, 4);
        g.addNode(4, 6);
 
        System.out.println("Following is Breadth First Traversal "+
                           "(starting from vertex 3)");
 
        g.traverse(3);
	}
}
