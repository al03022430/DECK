
import java.awt.*;
import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;

public class DECK {
    public static void main(String [] args){
        Card card = new Card();
        int PALOS = card.palo.length;
        int VALORES = card.valor.length;
        int COLORES = card.color.length;
        int N = PALOS * VALORES * COLORES;


        ArrayList<String> Deck = new ArrayList<String>();
        for (int w = 0; w < VALORES; w++){
            for (int e = 0; e < PALOS; e++) {
              Deck.add(card.palo[e] + ", ROJO, " + card.valor[w]);
                Deck.add(card.palo[e] + ", NEGRO, " + card.valor[w]);
                System.out.print("");
            }
        }
        Iterator<String> CartasIterator = Deck.iterator();
        while (CartasIterator.hasNext()){
            String cartas = CartasIterator.next();

        }

        suflle(Deck);
        head(Deck);
        pick(Deck);
        hand(Deck);
    }
    public static void suflle(ArrayList Deck){
        ArrayList<String> valores = Deck;
        Collections.shuffle(valores);
        Iterator<String> CartasIterator = Deck.iterator();
        while(CartasIterator.hasNext()){
          String car = CartasIterator.next();
            System.out.println(car+" / ");
        }

        System.out.println("Se Mezclo Deck");
    }
    public static void head(ArrayList Deck){
        System.out.println("     ");
        System.out.println("     ");
        System.out.println("Head");
        System.out.println(Deck.get(0));
        Deck.remove(0);
        System.out.println("Quedan " + Deck.size() + " cartas \n");
    }
    public static void pick(ArrayList  Deck){
        Random aleatorio = new Random();
        System.out.println("Pick");
        System.out.println(Deck.get(aleatorio.nextInt(Deck.size())));
        Deck.remove(aleatorio.nextInt(Deck.size()));
        System.out.println("Quedan " + Deck.size() + " cartas \n");
    }
    public static void hand(ArrayList Deck){
        System.out.println("Hand");
        for(int i=0; i<=4; i++){
            System.out.println(Deck.get(i));
        }
        for(int i=0; i<=4; i++){
            Deck.remove(i);
        }
        System.out.println("Quedan " + Deck.size()+ " cartas");
    }
}
