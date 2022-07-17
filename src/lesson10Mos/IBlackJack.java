package lesson10Mos;

public interface IBlackJack {

    void addPlayerToGame(Player player);

    void dealTwoCardsToAllPlayers();

    void dealRestCardsToAllPlayers();

    void printWinner();
}
