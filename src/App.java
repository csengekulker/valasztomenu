import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String choice;



        // switchcase (do whileba)

        do {
            System.out.println("---------------------");
            System.out.println();
            System.out.println("(1) Program inditasa");
            System.out.println();
            System.out.println("(2) Nevjegy");
            System.out.println();
            System.out.println("(3) Kilepes");
            System.out.println();
    
            System.out.print("Valasztas > ");
            choice = sc.nextLine();

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
            }

        } while ( !choice.equals("3") );



        // modositok

        sc.close();
    }
}
