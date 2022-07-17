package lesson10Mos;

import java.util.ArrayList;

public class BlackJack implements IBlackJack {
    private Koloda koloda = new Koloda();
    private ArrayList<Player> players = new ArrayList<>();

    @Override
    public void addPlayerToGame(Player player) {
        if (players.size() < 9) {
            players.add(player);
        } else {
            System.out.println("Нет свободных мест");
        }
    }

    @Override
    public void dealTwoCardsToAllPlayers() {
        for (Player p : players) {
            p.addCardToHand(koloda.getRandomCard());
            p.addCardToHand(koloda.getRandomCard());
        }
    }

    @Override
    public void dealRestCardsToAllPlayers() {
        for (Player p : players) {
            while (p.needsCard()) { // полиморфный вызов метода
                p.addCardToHand(koloda.getRandomCard());
            }
        }
    }

    @Override
    public void printWinner() {

    }
}
