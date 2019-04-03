package bonusgaji;

public class BonusGaji {
    
    public static void main(String[] args) {       
        hitungBonus hb = new hitungBonus();
        double bonus = hb.sethitungBonus(60.5, 100);
        System.out.println("Bonus gaji = "+bonus);
    }
}