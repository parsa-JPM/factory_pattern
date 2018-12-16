public class ComputerFactory {

    /**
     * We can keep Factory class Singleton or we can keep the method that returns the subclass as static.
     *
     * @param type
     * @param ram
     * @param hdd
     * @param cpu
     * @return Computer|null
     */
    public static Computer getComputer(String type, String ram, String hdd, String cpu) {

        if ("PC".equalsIgnoreCase(type)) return new PC(ram, hdd, cpu);
        if ("Server".equalsIgnoreCase(type)) return new Server(ram, hdd, cpu);

        return null;
    }

}
