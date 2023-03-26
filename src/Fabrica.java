// o fab de masini care implemeteaza un sistem centralizat de monitorizaare a productiei.
// Sistemul trebuie sa asigure adaugarea si modificarea datelor despre masinile fabricate la nivelul sediului centtral, intr un mediu securizat
//Ssitemul va exista sub forma unui server dispus in datacenterul din HQ. Programul trebuie sa se asigure ca sistemul nu va putea fi replicat si ca toate datele
// vor fi manageriate prin intermediul sg server mentionat anterior.


public class Fabrica {
    String nume;
    String locatie;

    int nrMasiniPeOra;
    private Fabrica(String nume, String locatie, int nrMAsini){
        this.nume = nume;
        this.locatie = locatie;
        this.nrMasiniPeOra =nrMAsini;
    }
    private static Fabrica instance;
    public static Fabrica getInstance(){
        if(instance==null){
            Fabrica.instance = new Fabrica("Dacia", "Mioveni", 12);
            return Fabrica.instance;
        }
        else{
            return Fabrica.instance;
        }
    }

    public String showStatus(){
        Fabrica fabrica = Fabrica.getInstance();
        return "Fabrica"+ fabrica.nume + "se afla la" + fabrica.locatie  +  "si produce" + fabrica.nrMasiniPeOra ;

    }

    public Fabrica adauga(){
        Fabrica fabrica = Fabrica.getInstance();
        fabrica.nrMasiniPeOra++;
        return fabrica;
    }

    public Fabrica modifica( int nr){
        Fabrica fabrica = Fabrica.getInstance();
        fabrica.nrMasiniPeOra = nr;
        return fabrica;
    }

}
