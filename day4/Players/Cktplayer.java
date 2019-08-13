package Players;

public class Cktplayer implements printable{
	private String cname;
	private int runs;
	
	public Cktplayer() {
		cname=null;
		runs=0;
	}
	public Cktplayer(String cn,int r) {
		cname=cn;
		runs=r;
	}
	@Override
	public void printDetails() {
		System.out.println("Player Name = "+cname);
		System.out.println("Runs Scored = "+runs);
		
	}
	
	
}
