

public class Model {


    public Model (String fio, String Address) {

        if (fio == "" || Address == "") throw new RuntimeException("ERROR, НЕККОРЕКТНЫЕ ДАННЫЕ ПРИ ИНИЦИАЛИЗАЦИИ ЭКЗЕМПЛЯРА КЛАССА!");
        this.FIO = fio;
        this.address = Address;
    }

    public Model() {
    }



    //ИНИЦИАЛИЗАЦИЯ ПЕРЕМЕННЫХ
    private String FIO;
    private String address;
    private String tariffPlan;
    private int price;
    private String dateCreate;


    //ИНИЦИАЛИЗАЦИЯ ГЕТТЕРОВ
    public String getFIO() { if(FIO == "" || FIO == null) {return "-ФИО ОТСУТСТВУЕТ-"; } return FIO; }

    public String getAddress() { if(address == "" || address == null) { return "-АДРЕС НЕ УСТАНОВЛЕН-"; } return address; }

    public String getTariffPlan() { if(tariffPlan == "" || tariffPlan == null) { return "-ТП НЕ УСТАНОВЛЕН-"; } return tariffPlan; }

    public int getPrice() { return price; }

    public String getDateCreate() { if(dateCreate == null) { return "- ДАТА ОТСУТСТВУЕТ-"; } return dateCreate; }



    //ИНИЦИАЛИЗАЦИЯ СЕТТЕРОВ
    public void setFIO(String input) {
        this.FIO = input.trim();
    }

    public void setAddress(String input) {
        this.address = input.trim();
    }

    public void setTariffPlan(String input) {
        this.tariffPlan = input.trim();
    }

    public void setPrice(int input) {
        this.price = input;
    }

    public void setDateCreate(String input) {
        this.dateCreate = input.trim();
    }
}
