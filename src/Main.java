import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("ввыодит длину: ");
            double length = Double.parseDouble(scanner.nextLine());
            System.out.print("ввидит ширину: ");
            double width = Double.parseDouble(scanner.nextLine());
            System.out.print("ввыдит число");
            double height = Double.parseDouble(scanner.nextLine());

            Cuilnder cuilnder = new Cuilnder ();
            System.out.println("Oбьем: " + cuilnder.calculateVolume());
            System.out.println("Область: " + cuilnder.calculateVolume());
        } catch (NumberFormatException e) {
            System.out.println("Не вернный ввод пожалуйста повторите еще раз");
        } finally {
            scanner.close();
        }
    }
}

        

    


