package ipl_classes;

import java.util.*;
public class Tournament {
	private String tournamentName;
	private int year;
	private Team team[]=new Team[12];
	private int team_counter;
	public Tournament() {
//		super();
		team_counter=0;
	}
	public Tournament(String tournamentName, int year) {
//		super();
		this.tournamentName = tournamentName;
		this.year = year;
	}
   public String getTournamentName() {
		return tournamentName;
	}
	public void setTournamentName(String tournamentName) {
		this.tournamentName = tournamentName;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void addTeam() {
		Scanner scan=new Scanner(System.in);
		team[team_counter]=new Team();
		System.out.print("Enter the name of the team:");
		team[team_counter].setTeamName(scan.next());
		System.out.print("Enter the name of the ceo:");
		team[team_counter].setCeo(scan.next());
		System.out.print("Enter number of players in the team:");
		int nop=scan.nextInt();
		for(int i=0;i<nop;i++)
		{
			team[team_counter].addPlayer();
		}
		team_counter++;
		}
	public void displayTournament() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Tournament name: "+ tournamentName);
//		tournamentName=scan.next();
		System.out.println("year: "+ year);
//		year=scan.nextInt();
		for(int i=0;i<team_counter;i++)
		{
			team[i].displayTeam();
		}
	}
		
}
	
	
	
