/*
    Name: Sujoy Chandra Das
    ID: 2012020269
    Section: F
    Email: cse_2012020269@lus.ac.bd
    Date: 12-09-2021
 */
package Sujoy;

public class Cricket extends Sports{
    String matchType;
    int over;
    Player player;

    Cricket(String matchType, int over, Player player)
    {
        this.matchType = matchType;
        this.over = over;
        this.player= player;
    }

    void display()
    {
        System.out.println("Match Type : " + matchType);
        System.out.println("Total Over : " + over);
        System.out.println("Name of the Player: " +player.playerName);
        System.out.println("Jersey Number of the Player: " + player.jerseyNumber);
    }
}
