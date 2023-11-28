public class App {
    public static void main(String[] args) throws Exception {
        int contador = 0;
        int numero = 0;
        while (numero!=24) {
            numero = (int)(Math.random()*101);
            if (numero%2==0) {
                System.out.print(numero+" ");
                contador++;
            }
        }
        System.out.printf("%nSe han generado %d números.%n", contador);
    }
}