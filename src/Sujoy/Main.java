/*
    Name: Sujoy Chandra Das
    ID: 2012020269
    Section: F
    Email: cse_2012020269@lus.ac.bd
    Date: 12-09-2021
 */
package Sujoy;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Player player = new Player("Sakib", 75);
        Cricket cricket = new Cricket("International Match", 20, player);

        cricket.display();

        Football football = new Football();
    }
}
