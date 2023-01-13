package ipl_classes;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scan=new Scanner(System.in);
      Tournament t=new Tournament();
      System.out.print("Enter  the name of the tournament: ");
      t.setTournamentName(scan.next());
      System.out.print("Enter  the year of the tournament: ");
      t.setYear(scan.nextInt());
      int choice;
      do {
    	  System.out.println("Enter 1->Add team 2->Display all team 3->Exit");
    	   choice=scan.nextInt();
    	  switch(choice){
    		  case 1:t.addTeam();
    		  break;
    		  case 2:t.displayTournament();
    		  break;
    		  case 3:break;
    	  }
      }
      while(choice != 3);
      
	}
}