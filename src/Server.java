public class Server {
    int port=0;
    String name="anonim";

    private Server(int port, String name){
        this.port = port;
        this.name = name;
    }
    private static Server instance;
    public static Server getInstance(){
        if(instance==null){
            Server.instance = new Server(1234, "Anonim");
            return Server.instance;
        }
        else{
            return Server.instance;
        }
    }

    public String showStatus(){
        Server server = Server.getInstance();
        return "Serverul"+ server.name + "Ruleaza la portul" + server.port;

    }
}
