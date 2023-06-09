/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soccer;

/**
 *
 * @author kevin.rosario
 */
public class League {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Player player1 = new Player();
        player1.playerName = "George Eliot";
        
        Player player2 = new Player();
        player2.playerName = "Graham Greene";
        
        Player player3 = new Player();
        player3.playerName = "Geoffrey Chaucer";
        
        Player[] thePlayers = { player1, player2, player3 };
        
        Team team1 = new Team();        
        team1.teamName = "The Greens";
        
        team1.playerArray = thePlayers;
        
        Team team2 = new Team();
        team2.teamName = "The Reds";
        
        team2.playerArray = new Player[3];
        
        team2.playerArray[0] = new Player();
        team2.playerArray[0].playerName = "Robert Service";
        
        team2.playerArray[1] = new Player();
        team2.playerArray[1].playerName = "Robbie Burns";
        
        team2.playerArray[2] = new Player();
        team2.playerArray[2].playerName = "Rafael Sabatini";
        
//        for (Player thePlayer : team1.playerArray) {
//            System.out.println(thePlayer.playerName);            
//        }
//        for (Player thePlayer : team2.playerArray) {
//            System.out.println(thePlayer.playerName);
//        }

    Game currGame = new Game();
    currGame.homeTeam = team1;
    currGame.awayTeam = team2;
    
    Goal goal1 = new Goal();
    goal1.thePlayer = currGame.homeTeam.playerArray[2];
    goal1.theTeam = currGame.homeTeam;
    goal1.theTime = 55;
    
    Goal[] theGoals = {goal1};
    currGame.goals = theGoals;
    
    System.out.println("Goal scored after " +
    currGame.goals[0].theTime + " mins by " +
    currGame.goals[0].thePlayer.playerName + " of " +
    currGame.goals[0].theTeam.teamName);
    }
    
}
