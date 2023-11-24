public class App {
    public static void carta(String nombre_palo) {
        int valor = (int)(Math.random()*13+1);
        if (valor==1)
            System.out.printf("A de %s", nombre_palo);
        else if (valor==11)
            System.out.printf("J de %s", nombre_palo);
        else if (valor==12)
            System.out.printf("Q de %s", nombre_palo);
        else if (valor==13)
            System.out.printf("K de %s", nombre_palo);
        else
            System.out.printf("%d de %s", valor, nombre_palo);
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Este programa muestra al azar el nombre de una carta de la baraja francesa");
        int palo = (int)(Math.random()*4);
        switch (palo) {
            case 0:
                carta("picas");
                break;
            case 1:
                carta("corazones");
                break;
            case 2:
                carta("diamantes");
                break;
            case 3:
                carta("treboles");
                break;
            default:
        }
    }
}