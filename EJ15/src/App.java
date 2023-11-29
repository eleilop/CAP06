public class App {
    public static void nota(){
        int nota = (int)(Math.random()*7);
        switch (nota) {
            case 0:
                System.out.print("do ");
                break;
            case 1:
                System.out.print("re ");
                break;
            case 2:
                System.out.print("mi ");
                break;
            case 3:
                System.out.print("fa ");
                break;
            case 4:
                System.out.print("sol ");
                break;
            case 5:
                System.out.print("la ");
                break;
            case 6:
                System.out.print("si ");
                break;
            default:
        }
    }
    public static void compas(){
        for (int i=1;i<=4;i++)
            nota();
            System.out.print("| ");
    }
    public static void main(String[] args) throws Exception {
        int melodia = (int)(Math.random()*7+1);
        for (int i=1;i<=melodia;i++){
            compas();
        }
        System.out.println("|");
    }
}