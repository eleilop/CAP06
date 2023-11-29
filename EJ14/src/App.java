public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Piensa un número del 0 al 100 (entero). Intentaré adivinarlo en 5 intentos.");
        System.out.println("Pulsa la tecla INTRO cuando estés preparado.");
        System.console().readLine();
        boolean acierto = false;
        int intervaloMin = 0;
        int intervaloMax = 100;
        for (int i=5;i>0 && !acierto;i--) {
            int valor = 0;
            System.out.printf("%d - %d%n", intervaloMin, intervaloMax);
            System.out.printf("¿Es el %d?%n", valor = (int)((intervaloMax-intervaloMin+1)/2 + intervaloMin));
            System.out.print("El número que estás pensando es 1) mayor 2) menor 3) el mismo: ");
            int respuesta = Integer.parseInt(System.console().readLine());
            switch(respuesta){
                case 1:
                    intervaloMin = valor;
                    break;
                case 2:
                    intervaloMax = valor;
                    break;
                case 3:
                    acierto = true;
                    break;
                default:
            }
        }
        System.out.printf("%s", (acierto)?"¡Bien! ¡He acertado!":"Vaya, no he conseguido acertar el número.");
    }
}