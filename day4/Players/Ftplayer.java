package Players;

public class Ftplayer implements printable {
	private String fname;
	private int goals;
	
	public Ftplayer() {
		fname=null;
		goals=0;
	}
	public Ftplayer(String fn,int g) {
		fname=fn;
		goals=g;
	}
	@Override
	public void printDetails() {
		System.out.println("Player Name = "+fname);
		System.out.println("Goals Scored = "+goals);
		
	}
	

}
