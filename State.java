
public class State implements Comparable<State> {
	
	public String chain;
	public int cost;
	public int curr;
	@Override
	public int compareTo(State o) {
		return this.cost - o.cost ;
	}
	public State(int curr, String chain, int cost) {
		super();
		this.curr = curr;
		this.chain = chain;
		this.cost = cost;
	}
	
	@Override
	public String toString(){
		return cost + " : " +chain;
	}
	
	


	
	
	

}
