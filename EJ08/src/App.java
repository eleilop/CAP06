public class App {
    public static void main(String[] args) {
        for (int i=1;i<=14;i++) {
            int columna1 = (int)(Math.random()*6);
            String columna1_str = (columna1>=0 && columna1<=2)?"1":(columna1==3 || columna1==4)?"X":"2";
            int columna2 = (int)(Math.random()*6);
            String columna2_str = (columna2>=0 && columna2<=2)?"1":(columna2==3 || columna2==4)?"X":"2";
            int columna3 = (int)(Math.random()*6);
            String columna3_str = (columna3>=0 && columna3<=2)?"1":(columna3==3 || columna3==4)?"X":"2";
            System.out.printf("Partido %-2d | %s | %s | %s%n", i, columna1_str, columna2_str, columna3_str);
        }
        int pleno = (int)(Math.random()*6);
        String pleno_str = (pleno>=0 && pleno<=2)?"1":(pleno==3 || pleno==4)?"X":"2";
        System.out.printf("Partido 15 | %s%n", pleno_str);
    }
}