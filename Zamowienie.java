import java.util.HashMap;

public class Zamowienie {

    public static void main(String[] args) {
long start = System.currentTimeMillis();

        Menu menu1 = new Menu();
        menu1.openOrder();
        System.out.println(Menu.iloscZamowien);
menu1.deser = "deser";
menu1.salatka = "salatka";
menu1.cenaDeser= 6.50;
menu1.cenaSalatka = 7.20;
        System.out.println(menu1.deser);
        System.out.println(menu1.salatka);
        System.out.println("Cena "+ " " + menu1.oblicz(menu1.cenaDeser , menu1.cenaSalatka));
        menu1.openOrder();

        System.out.println("\n");

Menu menu2 = new Menu();
menu2.openOrder();
        System.out.println(Menu.iloscZamowien);
        menu2.kotlet = "kotlet";
        menu2.deser = "deser";
        menu2.cenaKotlet = 8.00;
        menu2.cenaDeser = 6.50;

        System.out.println(menu2.kotlet);
        System.out.println(menu2.deser);
        System.out.println("Cena" + " "+ menu2.oblicz(menu2.cenaDeser, menu2.cenaKotlet));
menu2.openOrder();

menu1.run();
menu2.run();
        System.out.println(menu1.equals(menu2));
        System.out.println(menu1.hashCode());
        System.out.println(menu2.hashCode());
        System.out.println("Czas" + " " + (System.currentTimeMillis()- start));
    }
}
