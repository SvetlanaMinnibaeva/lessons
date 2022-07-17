package lesson7Kaz.blackJack;

public interface IGame {
    void addPlayer(Player pl1);
    void addTwoKartsToPlayer();
    void needMoreKarts();
    void addKartsToPlayer(Player pl1);
    void printWin();
}
