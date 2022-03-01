import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("---------------------");
        System.out.println();
        System.out.println("(1) Program inditasa");
        System.out.println();
        System.out.println("(2) Nevjegy");
        System.out.println();
        System.out.println("(3) Kilepes");
        System.out.println();

        System.out.print("Valasztas > ");
        String choice = sc.nextLine();

        // switchcase

        switch (choice) {
            case "1":
                System.out.println("egyes");
                break;
            case "2":
                System.out.println("kettes");
                break;
            case "3":
                System.out.println("harmas");
                break;
            default:
                break;
        }

        // modositok

        sc.close();
    }
}
