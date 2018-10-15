package prove2;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        int[] v1 = {10, 20, 30, 70, 50, 60, 70, 80, 90, 10, 110, 120};
        // uso di ArryList

//        ArrayList lista = new ArrayList(); // creazione di un nuovo ArrayList
//
//        for (int i = 0; i < 10; i++) {
//            lista.add(11 * i); // aggiungi a lista 11*i
//        }
//        lista.add(1, 5); // aggiungi in posizione 1 il valore 5
//        lista.remove(4); // rimuovi il 4 elemento di lista
//        lista.add(0, "Siamo in tanti"); // nell'ArrayList si possono mettere tipi differenti
//        // aggiungo in posizione 0 la Stringa "Siamo in tanti"
//        System.out.println(lista.indexOf(44)); // restituisce la posizione del valore indicato(44)
//        System.out.println(lista);
//        lista.set(0, 111); // modifico la posizione 0 con il valore indicato (111)
//        System.out.println(lista); // stampa lista
//        System.out.println(lista.size()); // restituisce la dimensione di lista
//        
        Anagrafica.test();

    }

}

class Anagrafica {

    String nominativo, comune; // default --> private
    SimpleDate nascita;
//         private String nominativo, comune, nascita; --> è la stessa cosa

    public Anagrafica(String n, String c, String d) {
        nominativo = n;
        comune = c;
        nascita = new SimpleDate(d);
    }

//        funzione equals 
//        confronto il nominativo tutto minuscolo con un'altro nominativo tutto minuscolo
//        e nascita con un'altra nascita
//        per vedere se sono uguali
    public boolean equals(Anagrafica other) {
        return nominativo.toLowerCase().equals(other.nominativo.toLowerCase())
                && nascita.equals(other.nascita);
//            per confrontare stringhe si usa equals e non ==
//            è la stessa cosa di:
//            if (nominativo.toLowerCase().equals(other.nominativo.toLowerCase())
//                    && nascita.equals(other.nascita)) {
//                return true;
//            }
//           questo if è ridondante
    }

//        controllo che i dati nella lista siano uguali a un oggetto specifico indicato tra ()
//        se è vero ritorno 0
//        altrimenti se nominativo tutto minuscolo è uguale all'altro nominativo tutto minuscolo
//        se nascita è precedente a un'altra nascita
//        ritorno -1
//        altrimenti ritorno 1
//        altrimenti 
//        restituisci il risultato del confronto tra nominativo tutto minuscolo e
//        un altro nominativo tutto minuscolo (1 o -1)
//        public int compareTo(Anagrafica other) {
//            if (this.equals(other)) {
//                return 0;
//            } else if (nominativo.toLowerCase().equals(other.nominativo.toLowerCase())) {
//                if (nascita.before(other.nascita)) {
//                    return -1;
//                } else {
//                    return 1;
//                }
//            } else {
//                return nominativo.toLowerCase().compareTo(other.nominativo.toLowerCase());
//
//            }
//        }
//        
//        E UGUALE A:
    public int compareTo(Anagrafica other) {
        if (nominativo.toLowerCase().compareTo(other.nominativo.toLowerCase()) == 0) {
            if (nascita.before(other.nascita)) {
                return -1;
            } else {
                return 1;
            }
        }
        return nominativo.toLowerCase().compareTo(other.nominativo.toLowerCase());

    }

    @Override
    public String toString() {
        return nominativo + "-" + nascita + "-" + comune;
    }

    public static void test() {

        Anagrafica a1 = new Anagrafica("Pippo Baudo", "Catania", "10-10-1940");
        Anagrafica a2 = new Anagrafica("Vasco Rossi", "Reggio E", "10-10-1950");
        Anagrafica a3 = new Anagrafica("Pippo Baudo", "Catania", "10-10-1940");

        ArrayList list = new ArrayList();
        list.add(a1);
        list.add(a2);
        list.add(a3);

        System.out.println(list);
        list.remove(a2);
        System.out.println(list);

    }
}
