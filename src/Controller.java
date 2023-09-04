import java.util.Scanner;

public class Controller {
    public static void WriteClientData(Model input) {
        while (true) {
            System.out.print("1)ФИО\n2)Адрес\n3)Тариф\n4)АП\n5)Дата подключения\nВаш вариант: ");
            Scanner sc = new Scanner(System.in);
            switch (sc.nextLine()) {
                case "1":
                    input.setFIO(sc.nextLine());
                    return;
                case "2":
                    input.setAddress(sc.nextLine());
                    return;
                case "3":
                    input.setTariffPlan(sc.nextLine());
                    return;
                case "4":
                    input.setPrice(sc.nextInt());
                    return;
                case "5":
                    input.setDateCreate(sc.nextLine());
                    return;
            }
        }
    }
}
