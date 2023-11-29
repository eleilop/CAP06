public class App {
    public static void main(String[] args) throws Exception {
        while (true) {
            int dado1 = (int)(Math.random()*6+1);
            int dado2 = (int)(Math.random()*6+1);
            System.out.println(" _   _");
            System.out.printf("|%d| |%d|%n", dado1, dado2);
            System.out.println("¯¯¯ ¯¯¯");
            if (dado1==dado2)
                break;
        }
    }
}