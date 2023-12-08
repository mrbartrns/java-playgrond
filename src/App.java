import animal.Animal;

public class App {
    public static void main(String[] args) {
        Car myCar = new Car("Model 1");
        Animal animal = new Animal();
        animal.setName("Dog");
        System.err.println(animal.getName());
        System.out.println(myCar.getCarName());
    }
}


class Car {
    private String carName;

    Car(String name) {
        carName = name;
    }

    String getCarName() {
        return this.carName;
    }
}

