package ObjectOrientedPrograms;
import java.util.Random;

public class DeckOfCards {
    private String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
    private String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    private String[][] deck = new String[4][13];

    public DeckOfCards() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                deck[i][j] = ranks[j] + " of " + suits[i];
            }
        }
    }

    public void shuffle() {
        Random rand = new Random();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                int k = rand.nextInt(13);
                int l = rand.nextInt(4);
                String temp = deck[i][j];
                deck[i][j] = deck[l][k];
                deck[l][k] = temp;
            }
        }
    }

    public void distribute(String[][] players, int numCards) {
        int k = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < numCards; j++) {
                players[i][j] = deck[k / 13][k % 13];
                k++;
            }
        }
    }

    public void printCards(String[][] players) {
        for (int i = 0; i < 4; i++) {
            System.out.println("Player " + (i + 1) + ":");
            for (int j = 0; j < players[0].length; j++) {
                System.out.println(players[i][j]);
            }
        }
    }

    public static void main(String[] args) {
        DeckOfCards deck = new DeckOfCards();
        deck.shuffle();
        String[][] players = new String[4][9];
        deck.distribute(players, 9);
        deck.printCards(players);
    }

}
