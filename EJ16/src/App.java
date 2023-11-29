public class App {
    public static String figura() {
        int figura = (int)(Math.random()*5);
        if (figura==0)
            return "corazón";
        else if (figura==1)
            return "diamante";
        else if (figura==2)
            return "herradura";
        else if (figura==3)
            return "campana";
        else
            return "limón";
    }
    public static void main(String[] args) throws Exception {
        String figura1 = figura();
        String figura2 = figura();
        String figura3 = figura();
        System.out.printf("%s %s %s%n", figura1, figura2, figura3);
        if (figura1.equals(figura2) && figura2.equals(figura3))
            System.out.println("Enhorabuena, ha ganado 10 monedas");
        else if (figura1.equals(figura2) || figura1.equals(figura3) || figura2.equals(figura3))
            System.out.println("Bien, ha recuperado su moneda");
        else
            System.out.println("Lo siento, ha perdido");
    }
}