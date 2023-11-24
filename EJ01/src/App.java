public class App {
    public static void main(String[] args) throws Exception {
        int dado1 = (int)(Math.random()*6+1);
        int dado2 = (int)(Math.random()*6+1);
        int dado3 = (int)(Math.random()*6+1);
        System.out.printf("Ha salido un %d en el primer dado%n", dado1);
        System.out.printf("Ha salido un %d en el segundo dado%n", dado2);
        System.out.printf("Ha salido un %d en el tercer dado%n", dado3);
        System.out.printf("La puntuación total es de %d puntos", dado1+dado2+dado3);
    }
}