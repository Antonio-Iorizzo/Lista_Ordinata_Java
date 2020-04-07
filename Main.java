class Main{
    public static void main(String[] Args){
        Lista l = new Lista();

        l.stampa();

        l.inserisci(4);
        l.stampa();

        l.inserisci(9);
        l.stampa();

        l.inserisci(15);
        l.stampa();

        l.inserisci(1);
        l.stampa();

        l.inserisci(6);
        l.stampa();

        l.rimuovi(1);
        l.stampa();

        l.rimuovi(6);
        l.stampa();

        l.rimuovi(50);

        l.rimuovi(15);
        l.stampa();
    }
}