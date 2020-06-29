import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number;
        do {
            System.out.println("Podaj liczbę ");
            number = scan.nextInt();

            if (number <= 100) {
                System.out.println("podana liczba jest za mala");
                continue;
            }
            if (number >= 200) {
                System.out.println("podana liczba jest za duza");
                continue;
            }

            if (number % 3 != 0) {
                System.out.println("Podana liczba nie jest podzielna przez 3");
                continue;
            }
            System.out.println("Twoja liczba jest ok ");
            break;
        }
        while (true);
    }
}
