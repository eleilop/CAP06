public class App {
    public static void pintarAnchura(int anchura) {
        for (int i=1;i<=anchura;i++)
            System.out.print("* ");
        System.out.println("");
    }
    public static void pintarAltura(int anchura, int altura) {
        int XPez = (int)(Math.random()*(anchura-2)+1);
        int YPez = (int)(Math.random()*(altura-2)+1);
        for (int i=1; i<=altura-2;i++){
            for (int j=1;j<=anchura;j++){
                if (j==1 || j==anchura)
                    System.out.print("* ");
                else if (i==YPez && j==XPez)
                    System.out.print("& ");
                else
                    System.out.print("  ");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) throws Exception {
        System.out.print("Por favor, introduzca la altura de la pecera (como mínimo 4): ");
        int altura = Integer.parseInt(System.console().readLine());
        System.out.print("Ahora introduzca la anchura (como mínimo 4): ");
        int anchura = Integer.parseInt(System.console().readLine());
        pintarAnchura(anchura);
        pintarAltura(anchura, altura);
        pintarAnchura(anchura);
    }
}