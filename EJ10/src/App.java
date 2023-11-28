public class App {
    public static void main(String[] args) throws Exception {
        for (int i=1;i<=10;i++) {
            int longitud = (int)(Math.random()*40+1);
            for (int j=1;j<=longitud;j++) {
                int caracter = (int)(Math.random()*6);
                switch (caracter) {
                    case 0:
                        System.out.print("*");
                        break;
                    case 1:
                        System.out.print("-");
                        break;
                    case 2:
                        System.out.print("=");
                        break;
                    case 3:
                        System.out.print(".");
                        break;
                    case 4:
                        System.out.print("|");
                        break;
                    case 5:
                        System.out.print("@");
                        break;
                    default:
                }
            }
            System.out.println("");
        }
    }
}