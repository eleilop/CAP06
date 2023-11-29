public class App {
    public static void main(String[] args) throws Exception {
        int secreto = (int)(Math.random()*101);
        for (int i=4;i>=0;i--){
            System.out.print("Adivina el número: ");
            int numero = Integer.parseInt(System.console().readLine());
            if (numero==secreto) {
                System.out.println("ENHORABUENA!!! Has acertado el número.");
                break;
            }
            else 
                System.out.printf("Número incorrecto.%nTe quedan %d intento/s.%n%s%n%n", i, (numero>secreto)?"El número es menor que "+numero:"El número es mayor que "+numero);
        }
    }
}