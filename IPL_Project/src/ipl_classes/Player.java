package ipl_classes;

import java.util.Scanner;

public  abstract class Player {
	private int playerId;
	private String playerName;
	
	public Player() {
		
	}

	public Player(int playerId, String playerName) {
		super();
		this.playerId = playerId;
		this.playerName = playerName;
	}

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	@Override
	public String toString() {
		return "Player [playerId=" + playerId + ", playerName=" + playerName + "]";
	}
	public void read() {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter  the playerId:");
		playerId=scan.nextInt();
		System.out.print("Enter  the playerName:");
		playerName=scan.next();
		}
}
