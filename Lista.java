class Lista{
    private Nodo head;
    private int contatore;
    
    public Lista(){
        this.head=null;
        this.contatore=0;
    }
    
    public void stampa(){
        Nodo attuale=this.head;
        
        System.out.printf("[%d]",this.contatore);
        
        while(attuale!=null){
            System.out.printf("%d\t",attuale.val);
            attuale=attuale.next;
        }
        System.out.printf("NULL\n");
    }
    
    public void inserisci(int valore){
        Nodo attuale=this.head;
        Nodo app=null;
        Nodo temp=new Nodo(valore);
        
        while(attuale!= null && attuale.val<valore){
            app=attuale;
            attuale=attuale.next;
        }
        
        if(app==null){
            temp.next=this.head;
            this.head=temp;
        }else{
            app.next=temp;
            temp.next=attuale;
        }
        
        this.contatore++;
    }
    
    public void rimuovi(int valore){
        Nodo attuale=this.head;
        Nodo app=null;
        Nodo temp=null;
        
        while(attuale!=null && attuale.val<valore){
            app=attuale;
            attuale=attuale.next;
        }
        
        if(attuale==null){
            System.out.printf("Elemento %d non trovato, non faccio nulla\n", valore);
            return;
        }
        
        System.out.printf("Elemento %d trovato, faccio qualcosa\n", valore);
        this.contatore--;
        
        if(app==null){
            System.out.printf("L'elemento da eliminare e' in testa, elimina\n");
            this.head=this.head.next;  
            return;
        }
        
        System.out.printf("L'elemento da eliminare non e' in testa, elimina\n");
        app.next=app.next.next;
    }
}