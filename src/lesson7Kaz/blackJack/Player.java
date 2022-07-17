package lesson7Kaz.blackJack;

import java.util.Scanner;

public class Player {
    private Karta[] kartas = new Karta[10];

    public Player() {
    }

    public Player(Karta k1, Karta k2) {
        kartas[0] = k1;
        kartas[1] = k2;
    }

    public void vskritie() {
        for (int i = 0; i < this.kartas.length; i++) {
            if (this.kartas[i] != null) {
                System.out.println(this.kartas[i].getName());
            }
        }
    }
public void addKart(Karta k){
        
}
    public boolean needKartaHand(){
        System.out.println("---------------------");
       this.vskritie();

        Scanner sc = new Scanner(System.in);
        String res = sc.nextLine();
        if(res == "+"){
            return true;
        } else {
            return false;
        }
    }
}
