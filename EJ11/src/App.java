public class App {
    public static void main(String[] args) throws Exception {
        int contadorSuspenso = 0;
        int contadorSuficiente = 0;
        int contadorBien = 0;
        int contadorNotable = 0;
        int contadorSobresaliente = 0;
        for (int i=1;i<=20;i++) {
            int nota = (int)(Math.random()*10+1);
            if (nota>=0 && nota<=4) {
                System.out.print("Suspenso ");
                contadorSuspenso++;
            } else if (nota==5) {
                System.out.print("Suficiente ");
                contadorSuficiente++;
            } else if (nota==6) {
                System.out.print("Bien ");
                contadorBien++;
            } else if (nota==7 || nota==8) {
                System.out.print("Notable ");
                contadorNotable++;
            } else {
                System.out.print("Sobresaliente ");
                contadorSobresaliente++;
            }
        }
        System.out.printf("%nSuspensos: %d%n", contadorSuspenso);
        System.out.printf("Suficientes: %d%n", contadorSuficiente);
        System.out.printf("Bien: %d%n", contadorBien);
        System.out.printf("Notable: %d%n", contadorNotable);
        System.out.printf("Sobresaliente: %d%n", contadorSobresaliente);
    }
}