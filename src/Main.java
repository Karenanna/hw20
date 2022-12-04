public class Main {
    public static void main(String[] args) {
        Car suzuki = new Car("Suzuki", "XC40", 5, 420,
                3, 4);
        Car honda = new Car("Honda", "Civic", 4, 400, 2, 6);

        Bus maz = new Bus("Maz", "6655", 2, 200, 3, 6);
        Bus kamaz = new Bus("Kamaz", "5566", 2, 230, 1, 4);

        System.out.println(suzuki);
        System.out.println(honda);
        System.out.println(maz);
        System.out.println(kamaz);

        DriverB<Car> golunov = new DriverB<>("Голунов Олег Петрович", true, 10);
        DriverB<Car> gusev = new DriverB<>("Гусев Алекскй Иванович", true, 11);

        DriverC<Bus> solovev = new DriverC<>("Соловев Владимир Олегович", true, 12);
        DriverC<Bus> antonov = new DriverC<>("Антонов Павел Михаилович", true, 10);

    }
}