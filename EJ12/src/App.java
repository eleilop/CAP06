public class App {
    public static void main(String[] args) throws Exception {
            while (true) {
                int numero = (int)(Math.random()*95+32);
                char caracter = (char)(numero);
                System.out.print(caracter);
            }
    }
}