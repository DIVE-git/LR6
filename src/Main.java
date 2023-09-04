import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("ЗАПУЩЕНО\n");
//Инициализация экземпляров класса для теста работы разрабатываемой системы
       Model client1 = new Model("Иванов Иван Иванович", "Ул. Колотушкина, д 16, кв 42");
       Model client2 = new Model("Петров Андрей Сергеевич", "Ул. Пушкина, д 2, кв 65");
      // Model client  = new Model("","");




        Scanner sc = new Scanner(System.in);
       while (true) {
        System.out.print("\nВыберите действие:\n1)Вывести информацию\n2)Ввести информацию\n3)Выход из приложения\nВаш вариант: ");
        switch (sc.next()) {
            case "1":
                System.out.print("\nВведите ID клиента: ");
                switch (sc.next()) {
                    case "1":
                        System.out.println(View.PrintAllClientData(client1));
                        break;
                    case "2":
                        System.out.println(View.PrintAllClientData(client2));
                        break;
                    default:
                        System.out.println("ОШИБКА! Неккоректно введённые значения.");
                        break;
                }
                break;
            case "2":
                System.out.print("\nВведите ID клиента: ");
                switch (sc.next()) {
                    case "1":
                        Controller.WriteClientData(client1);
                        break;
                    case "2":
                        Controller.WriteClientData(client2);
                        break;
                    default:
                        System.out.println("ОШИБКА! Неккоректно введённые значения.");
                        break;
                }


                break;
            case "3":
                System.out.println("Спасибо за использование!");
                System.exit(0);
                break;
            default:
                System.out.println("...");
        }
       }

    }
}
