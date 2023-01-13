package ipl_classes;

import java.util.Scanner;

public class Wicket extends Batsman{
	private int stamp;
	private int catches;
	public Wicket() {
		super();
	}
	
	public Wicket(int playerId, String playerName, int runs, int hundreds, int fifties, int stamp, int catch1) {
		super(playerId, playerName, runs, hundreds, fifties);
		this.stamp = stamp;
		this.catches = catches;
	}

	public int getStamp() {
		return stamp;
	}
	public void setStamp(int stamp) {
		this.stamp = stamp;
	}
	public int getCatch() {
		return catches;
	}
	public void setCatch(int catches) {
		catches = catches;
	}
	@Override
	public String toString() {
		return super.toString() +" Wicket [stamp=" + stamp + ", Catch=" + catches + "]";
	}
	public void read() {
		Scanner scan=new Scanner(System.in);
		super.read();
		System.out.print("Enter number of stamp:");
		stamp=scan.nextInt();
		System.out.print("Enter number of Catch:");
		catches=scan.nextInt();
		
	}
	
	

}
