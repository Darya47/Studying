package blackJack;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Koloda {
    private ArrayList<Card> cards = new ArrayList<>();

    public Koloda() {
        Card card1 = new Card("двойка крести", 2);
        Card card2 = new Card("двойка черви", 2);
        Card card3 = new Card("двойка пика", 2);
        Card card4 = new Card("двойка бубни", 2);

        Card card5 = new Card("тройка крести", 3);
        Card card6 = new Card("тройка черви", 3);
        Card card7 = new Card("тройка пика", 3);
        Card card8 = new Card("тройка бубни", 3);

        Card card9 = new Card("четверка крести", 4);
        Card card10 = new Card("четверка черви", 4);
        Card card11 = new Card("четверка пика", 4);
        Card card12 = new Card("четверка бубни", 4);

        Card card13 = new Card("пятерка крести", 5);
        Card card14 = new Card("пятерка черви", 5);
        Card card15 = new Card("пятерка пика", 5);
        Card card16 = new Card("пятерка бубни", 5);

        Card card17 = new Card("шестерка крести", 6);
        Card card18 = new Card("шестерка черви", 6);
        Card card19 = new Card("шестерка пика", 6);
        Card card20 = new Card("шестерка бубни", 6);

        Card card21 = new Card("семерка крести", 7);
        Card card22 = new Card("семерка черви", 7);
        Card card23 = new Card("семерка пика", 7);
        Card card24 = new Card("семерка бубни", 7);

        Card card25 = new Card("восьмерка крести", 8);
        Card card26 = new Card("восьмерка черви", 8);
        Card card27 = new Card("восьмерка пика", 8);
        Card card28 = new Card("восьмерка бубни", 8);

        Card card29 = new Card("девятка крести", 9);
        Card card30 = new Card("девятка черви", 9);
        Card card31 = new Card("девятка пика", 9);
        Card card32 = new Card("девятка бубни", 9);

        Card card33 = new Card("десятка крести", 10);
        Card card34 = new Card("десятка черви", 10);
        Card card35 = new Card("десятка пика", 10);
        Card card36 = new Card("десятка бубни", 10);

        Card card37 = new Card("валет крести", 10);
        Card card38 = new Card("валет черви", 10);
        Card card39 = new Card("валет пика", 10);
        Card card40 = new Card("валет бубни", 10);

        Card card41 = new Card("дама крести", 10);
        Card card42 = new Card("дама черви", 10);
        Card card43 = new Card("дама пика", 10);
        Card card44 = new Card("дама бубни", 10);

        Card card45 = new Card("король крести", 10);
        Card card46 = new Card("король черви", 10);
        Card card47 = new Card("король пика", 10);
        Card card48 = new Card("король бубни", 10);

        Card card49 = new Card("туз крести", 1);
        Card card50 = new Card("туз черви", 1);
        Card card51 = new Card("туз пика", 1);
        Card card52 = new Card("туз бубни", 1);

        cards.add(card1);
        cards.add(card2);
        cards.add(card3);
        cards.add(card4);
        cards.add(card5);
        cards.add(card6);
        cards.add(card7);
        cards.add(card8);
        cards.add(card9);
        cards.add(card10);
        cards.add(card11);
        cards.add(card12);
        cards.add(card13);
        cards.add(card14);
        cards.add(card15);
        cards.add(card16);
        cards.add(card17);
        cards.add(card18);
        cards.add(card19);
        cards.add(card20);
        cards.add(card21);
        cards.add(card22);
        cards.add(card23);
        cards.add(card24);
        cards.add(card25);
        cards.add(card26);
        cards.add(card27);
        cards.add(card28);
        cards.add(card29);
        cards.add(card30);
        cards.add(card31);
        cards.add(card32);
        cards.add(card33);
        cards.add(card34);
        cards.add(card35);
        cards.add(card36);
        cards.add(card37);
        cards.add(card38);
        cards.add(card39);
        cards.add(card40);
        cards.add(card41);
        cards.add(card42);
        cards.add(card43);
        cards.add(card44);
        cards.add(card45);
        cards.add(card46);
        cards.add(card47);
        cards.add(card48);
        cards.add(card49);
        cards.add(card50);
        cards.add(card51);
        cards.add(card52);
    }

    public Card randomCard(){
        int randomNum = ThreadLocalRandom.current().nextInt(0, 52);
        return cards.get(randomNum);
    }
}
