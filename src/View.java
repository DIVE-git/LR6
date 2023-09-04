
public class View {

    public static String PrintAllClientData(Model input) {
        return "ФИО: " + input.getFIO() +
                "\nАдрес: " + input.getAddress() +
                "\nТариф: " + input.getTariffPlan() +
                "\nАбонентская плата: " + input.getPrice() +
                "\nДата подключения: " + input.getDateCreate();
    }


}
