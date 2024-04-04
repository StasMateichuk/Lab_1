public class Facade {
    Number Object = new Number();
    Task_1 Task_1 = new Task_1();
    Task_2 Task_2 = new Task_2();
    User andrii = new User();
    User stepan = new User();
    User stas = new User();
    User john = new User();
    User alice = new User();
    User bob = new User();
    User emma = new User();
    User michael = new User();
    User sophia = new User();
    User james = new User();
    Car car1 = new Car();
    Car car2 = new Car();
    Car car3 = new Car();
    Car car4 = new Car();
    Car car5 = new Car();
    Car car6 = new Car();
    Car car7 = new Car();
    Car car8 = new Car();
    Car car9 = new Car();
    Car car10 = new Car();
    Task_5 Math = new Task_5();
    public void run() {
        Object.Numero();
        Task_1.Var();
        Object.Numero();
        Task_2.Words();
        Object.Numero();

        andrii.id = 1;
        andrii.age = 28;
        andrii.name = "Andrii";
        andrii.surname = "Bazylchuk";
        andrii.height = 1.75;
        andrii.weight = 65.7;

        stepan.id = 2;
        stepan.age = 19;
        stepan.name = "Stepan";
        stepan.surname = "Beretha";
        stepan.height = 1.77;
        stepan.weight = 57.4;

        stas.id = 3;
        stas.age = 18;
        stas.name = "Stas";
        stas.surname = "Mateichuk";
        stas.height = 1.79;
        stas.weight = 64.8;

        john.id = 4;
        john.age = 25;
        john.name = "John";
        john.surname = "Doe";
        john.weight = 70.5;
        john.height = 180.0;

        alice.id = 5;
        alice.age = 30;
        alice.name = "Alice";
        alice.surname = "Smith";
        alice.weight = 65.0;
        alice.height = 165.0;

        bob.id = 6;
        bob.age = 40;
        bob.name = "Bob";
        bob.surname = "Johnson";
        bob.weight = 80.0;
        bob.height = 175.0;

        emma.id = 7;
        emma.age = 22;
        emma.name = "Emma";
        emma.surname = "Brown";
        emma.weight = 55.0;
        emma.height = 160.0;

        michael.id = 8;
        michael.age = 35;
        michael.name = "Michael";
        michael.surname = "Davis";
        michael.weight = 90.0;
        michael.height = 190.0;

        sophia.id = 9;
        sophia.age = 28;
        sophia.name = "Sophia";
        sophia.surname = "Wilson";
        sophia.weight = 60.0;
        sophia.height = 170.0;

        james.id = 10;
        james.age = 45;
        james.name = "James";
        james.surname = "Martinez";
        james.weight = 75.0;
        james.height = 175.0;

        int sumAge = andrii.age + stepan.age + stas.age + john.age + alice.age + bob.age + emma.age + michael.age + sophia.age + james.age;
        System.out.println("Сума віку: " + sumAge);

        double sumWeight = andrii.weight + stepan.weight + stas.weight + john.weight + alice.weight + bob.weight + emma.weight + michael.weight + sophia.weight + james.weight;
        System.out.println("Сума ваги: " + sumWeight);

        double sumHeight = andrii.height + stepan.height + stas.height + john.height + alice.height + bob.height + emma.height + michael.height + sophia.height + james.height;
        System.out.println("Сума зросту: " + sumHeight);

        Object.Numero();

        car1.horsepower = 150;
        car1.engineVolume = 2.0;
        car1.brand = "Toyota";
        car1.model = "Corolla";
        car1.color = "Red";
        car1.year = 2018;
        car1.isAutomatic = true;
        car1.fuelConsumption = 7.5;
        car1.isFourWheelDrive = false;
        car1.fuelType = "Petrol";

        car2.horsepower = 200;
        car2.engineVolume = 2.5;
        car2.brand = "Honda";
        car2.model = "Civic";
        car2.color = "Blue";
        car2.year = 2019;
        car2.isAutomatic = false;
        car2.fuelConsumption = 8.0;
        car2.isFourWheelDrive = true;
        car2.fuelType = "Petrol";

        car3.horsepower = 180;
        car3.engineVolume = 2.2;
        car3.brand = "Ford";
        car3.model = "Focus";
        car3.color = "Silver";
        car3.year = 2020;
        car3.isAutomatic = true;
        car3.fuelConsumption = 7.2;
        car3.isFourWheelDrive = false;
        car3.fuelType = "Diesel";

        car4.horsepower = 170;
        car4.engineVolume = 1.8;
        car4.brand = "Volkswagen";
        car4.model = "Golf";
        car4.color = "Black";
        car4.year = 2017;
        car4.isAutomatic = false;
        car4.fuelConsumption = 6.8;
        car4.isFourWheelDrive = true;
        car4.fuelType = "Petrol";

        car5.horsepower = 220;
        car5.engineVolume = 2.8;
        car5.brand = "BMW";
        car5.model = "3 Series";
        car5.color = "White";
        car5.year = 2021;
        car5.isAutomatic = true;
        car5.fuelConsumption = 9.0;
        car5.isFourWheelDrive = true;
        car5.fuelType = "Petrol";

        car6.horsepower = 190;
        car6.engineVolume = 2.4;
        car6.brand = "Audi";
        car6.model = "A4";
        car6.color = "Gray";
        car6.year = 2019;
        car6.isAutomatic = false;
        car6.fuelConsumption = 7.8;
        car6.isFourWheelDrive = false;
        car6.fuelType = "Diesel";

        car7.horsepower = 250;
        car7.engineVolume = 3.0;
        car7.brand = "Mercedes-Benz";
        car7.model = "C-Class";
        car7.color = "Red";
        car7.year = 2022;
        car7.isAutomatic = true;
        car7.fuelConsumption = 9.5;
        car7.isFourWheelDrive = true;
        car7.fuelType = "Petrol";

        car8.horsepower = 160;
        car8.engineVolume = 1.6;
        car8.brand = "Hyundai";
        car8.model = "Elantra";
        car8.color = "Green";
        car8.year = 2018;
        car8.isAutomatic = false;
        car8.fuelConsumption = 7.0;
        car8.isFourWheelDrive = false;
        car8.fuelType = "Petrol";

        car9.horsepower = 210;
        car9.engineVolume = 2.6;
        car9.brand = "Kia";
        car9.model = "Optima";
        car9.color = "Blue";
        car9.year = 2020;
        car9.isAutomatic = true;
        car9.fuelConsumption = 8.2;
        car9.isFourWheelDrive = false;
        car9.fuelType = "Petrol";

        car10.horsepower = 230;
        car10.engineVolume = 2.9;
        car10.brand = "Subaru";
        car10.model = "Impreza";
        car10.color = "Black";
        car10.year = 2019;
        car10.isAutomatic = false;
        car10.fuelConsumption = 8.5;
        car10.isFourWheelDrive = true;
        car10.fuelType = "Petrol";

        double totalEngineVolume = car1.engineVolume + car2.engineVolume + car3.engineVolume + car4.engineVolume + car5.engineVolume +
                car6.engineVolume + car7.engineVolume + car8.engineVolume + car9.engineVolume + car10.engineVolume;
        System.out.println("Сума об'ємів двигунів: " + totalEngineVolume);

        int totalHorsepower = car1.horsepower + car2.horsepower + car3.horsepower + car4.horsepower + car5.horsepower +
                car6.horsepower + car7.horsepower + car8.horsepower + car9.horsepower + car10.horsepower;
        System.out.println("Сума потужностей: " + totalHorsepower);

        Object.Numero();

        Math.Solution();
    }
}