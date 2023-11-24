public class App {
    public static void main(String[] args) throws Exception {
        int maximo = 0;
        int minimo = 199;
        int media = 0;
        for (int i=1;i<=50;i++) {
            int numero = (int)(Math.random()*100)+100;
            System.out.print(numero+" ");
            if (numero>maximo)
                maximo=numero;
            if (numero<minimo)
                minimo=numero;
            media=media+numero;
        }
        System.out.printf("%nEl número máximo es %d%n", maximo);
        System.out.printf("El número mínimo es %d%n", minimo);
        System.out.printf("La media es %d", media/50);
    }
}