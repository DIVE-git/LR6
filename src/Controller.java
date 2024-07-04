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
    public static void  WriteAllClientData(Model input) {
            Scanner sc = new Scanner(System.in);

            System.out.print("ФИО: ");
            input.setFIO(sc.nextLine());

            System.out.print("Адрес: ");
            input.setAddress(sc.nextLine());

            System.out.print("Тарифный план: ");
            input.setTariffPlan(sc.nextLine());

            System.out.print("Абонентская плата: ");
            input.setPrice(sc.nextInt());
            sc.nextLine(); // Костыль
            System.out.print("Дата подключения: ");
            input.setDateCreate(sc.nextLine());
    }
}

