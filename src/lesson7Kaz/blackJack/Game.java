package lesson7Kaz.blackJack;

import java.util.ArrayList;

public class Game  {
    private Coloda col = new Coloda();
    private Player[] players = new Player[6];
    private ArrayList playerArr = new ArrayList<Player>();


    public Game(Player pl) {
        players[0] = pl;
    }

//    @Override
//    public void addPlayer(Player pl1) {
//        playerArr.add(pl1);
//    }
//
//
//    @Override
//    public void addTwoKartsToPlayer() {
//        for (Player player : playerArr) {
//            player.addKart(this.col.getRandomKart());
//        }
//
//        @Override
//        public void needMoreKarts () {
//            for (Player player : playerArr) {
//                while (player.needKartaHand()) {
//
//                    player.addKart(this.col.getRandomKart());
//
//            }
//        }
//
//
//        @Override
//        public void addKartsToPlayer (Player pl1){
//
//        }
//
//        @Override
//        public void printWin () {
//            // если больше 21 очко то проиграл
//        }
    }
