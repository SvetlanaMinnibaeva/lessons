package lesson10Mos;

import java.util.ArrayList;
import java.util.Scanner;

public class Player implements IPlayer {
    private String name;
    private ArrayList<Card> hand = new ArrayList<>();


    @Override
    public void addCardToHand(Card card) {
        hand.add(card);
    }

    @Override
    public boolean needsCard() {
        this.openHand();
        System.out.println("Нужна ли еще одна карта?");
        Scanner sc = new Scanner(System.in);
        String answer = sc.nextLine();
        if(answer.equalsIgnoreCase("Да")){
            return true;
        }
        return false;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void openHand() {
        System.out.println("-------Ваши карты-------" + this.name);
        for (Card c: hand){
            System.out.println(c.getName());
        }
    }

    public int valuesHand() {
        int values = 0;
        for (Card c: hand) {
            values += c.getValue();
        }
        return values;
    }
}
