package ipl_classes;

import java.util.Scanner;

public class Team {
     private String teamName;
     private String ceo;
     private Player[] Player=new Player[20];
     private int player_counter;
	public Team() {
//		super();
		player_counter=0;
	}
	public Team(String teamName, String ceo) {
//		super();
		this.teamName = teamName;
		this.ceo = ceo;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getCeo() {
		return ceo;
	}
	public void setCeo(String ceo) {
		this.ceo = ceo;
	}
	public void addPlayer() {
		int choice;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 1->Batsman 2->Bowler 3->Wicket");
		 choice=scan.nextInt();
		if(choice==1) {
			Player[player_counter]=new Batsman();
			Player[player_counter].read();
		}
		else if(choice==2){
			Player[player_counter]=new Bowler();
			Player[player_counter].read();
			
		}
		else if(choice==3) {
			Player[player_counter]=new Wicket();
			Player[player_counter].read();
		}
		player_counter++;
	}
	public void displayTeam() {
		System.out.println("TeamName: "+teamName);
		System.out.println("ceo: "+ceo);
		for(int i=0;i<player_counter;i++)
		{
			System.out.println(Player[i]);
		}
		
	}
	
     
     
}
