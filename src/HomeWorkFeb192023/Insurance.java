package HomeWorkFeb192023;
/*
Create a class Insurance that will have an attribute as insuranceName and unimplemented behaviour as getQuote and cancelInsurance.
Create 3 subclasses Car, Pet, Health. Car class has it’s own attribute as carModel and Class Pet has petType attribute.
Create 3 objects of the sub classes and store them in ArrayList. Using for loop/advanced for loop/ iterator access all methods of the class.
 */
import java.util.ArrayList;
import java.util.Iterator;

abstract class Insurance {
    protected String insuranceName;

    public Insurance(String insuranceName) {
        this.insuranceName = insuranceName;
    }

    public abstract void getQuote();
    public abstract void cancelInsurance();
}

class Car extends Insurance {
    private String carModel;

    public Car(String insuranceName, String carModel) {
        super(insuranceName);
        this.carModel = carModel;
    }

    @Override
    public void getQuote() {
        System.out.println("Getting quote for car insurance");
    }

    @Override
    public void cancelInsurance() {
        System.out.println("Cancelling car insurance");
    }
}

class Pet extends Insurance {
    private String petType;

    public Pet(String insuranceName, String petType) {
        super(insuranceName);
        this.petType = petType;
    }

    @Override
    public void getQuote() {
        System.out.println("Getting quote for pet insurance");
    }

    @Override
    public void cancelInsurance() {
        System.out.println("Cancelling pet insurance");
    }
}

class Health extends Insurance {
    public Health(String insuranceName) {
        super(insuranceName);
    }

    @Override
    public void getQuote() {
        System.out.println("Getting quote for health insurance");
    }

    @Override
    public void cancelInsurance() {
        System.out.println("Cancelling health insurance");
    }
}

class InsuranceTest {
    public static void main(String[] args) {
        ArrayList<Insurance> insuranceList = new ArrayList<>();

        Car carInsurance = new Car("Car Insurance", "Sedan");
        Pet petInsurance = new Pet("Pet Insurance", "Dog");
        Health healthInsurance = new Health("Health Insurance");

        insuranceList.add(carInsurance);
        insuranceList.add(petInsurance);
        insuranceList.add(healthInsurance);

        for (Insurance insurance : insuranceList) {
            insurance.getQuote();
            insurance.cancelInsurance();
            System.out.println();
        }

        // Using iterator
        Iterator<Insurance> iterator = insuranceList.iterator();
        while (iterator.hasNext()) {
            Insurance insurance = iterator.next();
            insurance.getQuote();
            insurance.cancelInsurance();
            System.out.println();
        }
    }
}
