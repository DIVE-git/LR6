import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean isDataCreate = false; // этой переменной будем запускать внесение данных в каждого клиента при запуске программы
        int clients = 5; // Кол-во требуемых клиентов
        if (!isDataCreate) clients = 2;

        Model[] client  = new Model[clients];
        if (isDataCreate) {
            for (int i = 0; i < clients;i++) {
                System.out.println("ID клиента: " + i);
                client[i] = new Model();
                Controller.WriteAllClientData(client[i]);
            }
        }
        else {
            client[0] = new Model("Иванов Иван Иванович", "Ул. Колотушкина, д 16, кв 42");
            client[1] = new Model("Петров Андрей Сергеевич", "Ул. Пушкина, д 2, кв 65");
        }


        System.out.println("\u001B[33m" + "Эксперементальный режим: " + isDataCreate);
        System.out.println("Кол-во клиентов: " + clients);

        System.out.println("\u001B[32m" + "ЗАПУЩЕНО " + "\u001B[0m\n");




        Scanner sc = new Scanner(System.in);
       while (true) {
        System.out.print("\nВыберите действие:\n1)Вывести информацию\n2)Ввести информацию\n3)Выход из приложения\nВаш вариант: ");
        int idClient;
        switch (sc.next()) {
            case "1":
                System.out.print("\nВведите ID клиента: ");
                 idClient = sc.nextInt();
                 if (isDataCreate) {
                       if(idClient >= clients) {
                           System.out.println("\u001b[31m Ты дурак!? Верхний ID: " + (clients - 1) + "\u001b[0m");
                           break;
                       }
                     System.out.println(View.PrintAllClientData(client[idClient]));
                     break;
                 }

                switch (idClient) {
                    case 1:
                        System.out.println(View.PrintAllClientData(client[0]));
                        break;
                    case 2:
                        System.out.println(View.PrintAllClientData(client[1]));
                        break;
                    default:
                        System.out.println("ОШИБКА! Неккоректно введённые значения.");
                        break;
                }
                break;
            case "2":
                System.out.print("\nВведите ID клиента: ");
                idClient = sc.nextInt();
                if (isDataCreate) {
                    Controller.WriteClientData(client[idClient]);
                    break;
                }
                switch (idClient) {
                    case 1:
                        Controller.WriteClientData(client[0]);
                        break;
                    case 2:
                        Controller.WriteClientData(client[1]);
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
