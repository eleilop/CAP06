public class App {
    public static void main(String[] args) {
        for (int i=1;i<=14;i++) {
            int columna1 = (int)(Math.random()*3);
            String columna1_str = ""+columna1;
            int columna2 = (int)(Math.random()*3);
            String columna2_str = ""+columna2;
            int columna3 = (int)(Math.random()*3);
            String columna3_str = ""+columna3;
            System.out.printf("Partido %-2d | %s | %s | %s%n", i, (columna1==0)?"X":columna1_str, (columna2==0)?"X":columna2_str, (columna3==0)?"X":columna3_str);
        }
        int pleno = (int)(Math.random()*3);
        String pleno_str = ""+pleno;
        System.out.printf("Partido 15 | %s%n", pleno_str);
    }
}