package blackJack;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    private Koloda koloda = new Koloda();
    private ArrayList<Player> players = new ArrayList<>();

    public void addPlayerToGame(Player player){
        players.add(player);
    }
    public void addTwoCardsToPlayer(){
        for (Player p: players) {
            Card randomCard = koloda.randomCard();
            p.saveCardToHand(randomCard);

            Card randomCard2 = koloda.randomCard();
            p.saveCardToHand(randomCard2);
        }
    }
    public void addCardsTillNeed(Player player) {
        player.printCardsInHand();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you need one more card? (yes/no)");
        String answer = scanner.nextLine();
        if (answer.equals("yes")) {
            Card card = koloda.randomCard();
            player.saveCardToHand(card);
            addCardsTillNeed(player);
        }
    }
    public void addCardsTillNeed(Dealer dealer) {

        if (dealer.countValueInHand() < 18) {
            Card card = koloda.randomCard();
            dealer.saveCardToHand(card);
            addCardsTillNeed(dealer);
        }
    }
    public void printWinner(Player player, Dealer dealer){
        if (player.countValueInHand() > 21){
            System.out.println("Dealer won");
            dealer.printCardsInHand();
            return;
        }
        if (player.countValueInHand() <= 21 && dealer.countValueInHand() > 21){
            System.out.println("Congratulation, You won!!");
            player.printCardsInHand();
            return;
        }
        if (player.countValueInHand() >= dealer.countValueInHand()){
            System.out.println("Congratulation, You won!!");
            player.printCardsInHand();
        }else {
            System.out.println("Dealer won");
            dealer.printCardsInHand();
        }
    }
}
