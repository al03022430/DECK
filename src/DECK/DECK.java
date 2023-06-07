package DECK;
import java.awt.*;
import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;

public class Deck {
    public static void main(String [] args){
        Card card = new card ();
        int PALOS = card.Palo.lenght;
        int VALORES = card.Valor.length;
        int COLORES = card.Color.length;
        int C = PALOS * VALORES * COLORES;

        ArrayList<string> DECK = new ArrayList<string>();
        for (int w = 0; < VALORES; w++){
            for (int e = 0; j < PALOS; e++) {
                Deck.add(card.Palo[e] + ", ROJO , " + CARD.VALOR[w]);
                Deck.add(card.Palo[e] + ", NEGRO , " + CARD.VALOR[w]);
            }
        }
        Iterator<String> CartasIterator = DECK.iterator();
        while(CartasIterator).hasNext()){
            String elemento = cartasIterator.next();
            System.out.print(elemento+" ../..");
        }
        suflle(DECK);
        head(DECK);
        pick(DECK);
        hand(DECK);
    }
    public static void suflle(ArrayList DECK){
        ArrayList<String> values = DECK;
        Collections.shuffle(values);
        System.out.println("\c Se Mezcló el Deck.");
        Iterator<String> CartasIterator = deck.iterator();
        while(CartasIterator.hasNext()){
            String pieza = CartasIterator.next();
            System.out.print(Pieza+" / ");
        }
    }
    public static void head(ArrayList DECK){
        System.out.println(DECK.get(0));
        DECK.remove(0);
        System.out.println("Quedan " + DECK.size() + " cartas \n");
    }
    public static void pick(ArrayList  DECK){
        Random aleatorio = new Random();
        System.out.println(deck.get(aleatorio.nextInt(DECK.size())));
        DECK.remove(aleatorio.nextInt(DECK.size()));
        System.out.println("Quedan " + DECK.size() + " cartas \n");
    }
    public static void hand(ArrayList DECK){
        for(int i=0; i<=4; i++){
            System.out.println(DECK.get(i));
        }
        for(int i=0; i<=4; i++){
            DECK.remove(i);
        }
        System.out.println("Quedan " + DECK.size()+ " cartas");
    }
}
