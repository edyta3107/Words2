import java.util.HashMap;
import java.util.Objects;

public class Menu extends Thread{


   boolean order= false;
   void openOrder(){order=!order;
   if(order){
       System.out.print("Zamowienie otwarte:");
   }else {
       System.out.println("Zamowienie zamkniete.");
   }
   }static int iloscZamowien = 0;
   Menu(){iloscZamowien++;}

    String salatka ;
    String kotlet;
    String zupa;
    String deser;
    String ziemniaki;
double cenaSalatka;
double cenaKotlet ;
double cenaZupa ;
double cenaDeser ;
double cenaZiemniaki ;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Menu)) return false;
        Menu menu = (Menu) o;
        return order == menu.order &&
                salatka.equals(menu.salatka) &&
                kotlet.equals(menu.kotlet) &&
                zupa.equals(menu.zupa) &&
                deser.equals(menu.deser) &&
                ziemniaki.equals(menu.ziemniaki);
    }

    @Override
    public int hashCode() {
        return Objects.hash(order, salatka, kotlet, zupa, deser, ziemniaki, cenaSalatka, cenaKotlet, cenaZupa, cenaDeser, cenaZiemniaki);
    }

    @Override
    public void run() {
        for(int i =0; i<=Menu.iloscZamowien;i++){
            System.out.println(i + ". Numer " + Thread.currentThread().getId());



        }}

        public double oblicz(double x , double y ){
            return x + y ;
        }

        }



