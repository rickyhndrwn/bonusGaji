package bonusgaji;

public class hitungBonus {
    double sethitungBonus(double gaji, double jam) {
        if(gaji>79&&jam>7)
            return gaji;
        else if(gaji>59&&gaji<70)
            return gaji/2;
        else 
            return 0;
    }
}