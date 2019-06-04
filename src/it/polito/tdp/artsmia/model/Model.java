package it.polito.tdp.artsmia.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jgrapht.Graph;
import org.jgrapht.Graphs;
import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.graph.SimpleWeightedGraph;

import it.polito.tdp.artsmia.db.ArtsmiaDAO;

public class Model {

	
	private Graph<ArtObject, DefaultWeightedEdge> graph;
    private Map <Integer, ArtObject> idMap;
    
    public Model() {
    	this.idMap=new HashMap <Integer, ArtObject>();
    	this.graph=new SimpleWeightedGraph<>(DefaultWeightedEdge.class);
    }
    
    public void creaGrafo() {
    	
    	ArtsmiaDAO dao = new ArtsmiaDAO();
    	dao.listObjects(idMap);
    	
    	//aggiungo i vertici
    	
    	Graphs.addAllVertices(graph, idMap.values());
    	
    	//aggiungo fli archi
    	
        List<Adiacenza> adj = dao.listAdiacenze();
        
        for(Adiacenza a: adj) {
        	Graphs.addEdge(graph,idMap.get(a.getOggetto1()), idMap.get(a.getOggetto2()),a.getPeso());
        }
        
        System.out.println("Grafo creato!  "+graph.vertexSet().size() + "  vertici: "+graph.edgeSet().size());
    	
    }

	public int getVertexSize() {
		
		return graph.vertexSet().size();
	}

	public int getEdgeSize() {
		// TODO Auto-generated method stub
		return graph.edgeSet().size();
	}
	
}
