/***
 * 
 * @author selemon
 * 
 * */




/** SearchNode   */

public class SearchNode implements Comparable <SearchNode>{
    public final Node node;
    public final Node from;
    public final double costSoFar;
    public final double estRemCost;
//    private int cadar;


    /** Construct a new SearchNode object */
    public SearchNode(Node n, Node f, double c, double h){
	node = n;
	from = f;
	costSoFar = c;
	estRemCost = h;
    }

    public int compareTo(SearchNode other){
    	double cost1 = costSoFar + estRemCost;
    	double cost2 = other.costSoFar + other.estRemCost;
    	if(cost1 < cost2)
    		return -1;
    	else if(cost1 > cost2)
    		return 1;
    	else
    		return 0;
    }

}
