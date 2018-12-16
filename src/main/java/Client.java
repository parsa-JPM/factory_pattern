public class Client {
    public static void main(String[] args) {
        Server server = (Server) ComputerFactory.getComputer("server", "15GB", "1TB", "i7");
        System.out.println(server);
    }
}
