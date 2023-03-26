
public class Main {
    public static void main(String[] args) {

        Server server = Server.getInstance();
        System.out.println(server.name);
        Server x = Server.getInstance();
        System.out.println(x.port);
        System.out.println(x.showStatus());
        Fabrica fabrica = Fabrica.getInstance();
        System.out.println(fabrica.showStatus());
        fabrica.adauga();
        System.out.println(fabrica.showStatus());
        fabrica.modifica(19);
        System.out.println(fabrica.showStatus());



    }


}