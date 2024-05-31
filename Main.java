import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Main.mulai();
    Main.info();

    Scanner scanner = new Scanner(System.in);
        int pilihan;
        do {
            System.out.println("Mau menanam apa?");
            System.out.println("1. Tomat");
            System.out.println("2. Stroberi");
            System.out.println("3. Persik");
            pilihan = scanner.nextInt();
            switch (pilihan) {
                case 1:
                    
                    break;
                case 2:
                    scanner.nextLine();
                    
                    break;
                case 3:
                    scanner.nextLine();
                
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
    }
        }
    }
    






    