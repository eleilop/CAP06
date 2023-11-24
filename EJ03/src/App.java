public class App {
    public static void carta(String nombre_palo) {
        int valor = (int)(Math.random()*10+1);
        if (valor==1)
            System.out.printf("As de %s", nombre_palo);
        else if (valor==8)
            System.out.printf("Sota de %s", nombre_palo);
        else if (valor==9)
            System.out.printf("Caballo de %s", nombre_palo);
        else if (valor==10)
            System.out.printf("Rey de %s", nombre_palo);
        else
            System.out.printf("%d de %s", valor, nombre_palo);
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Este programa muestra al azar el nombre de una carta de la baraja española");
        int palo = (int)(Math.random()*4);
        switch (palo) {
            case 0:
                carta("oros");
                break;
            case 1:
                carta("copas");
                break;
            case 2:
                carta("espadas");
                break;
            case 3:
                carta("bastos");
                break;
            default:
        }
    }
}