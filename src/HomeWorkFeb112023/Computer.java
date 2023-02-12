package HomeWorkFeb112023;

public class Computer {
    /*
    Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
    Define common behavior within and some fields in parent class and override some methods in child classes
    Define some methods specific to child classes
    Create objects of child classes and store them into array. Loop through each object and execute available methods.
     */
    void Storage() {
        System.out.println("Computer has a hard desk to save data on it");
    }

    void OperatingSystem() {
        System.out.println("Computer has an operating system");
    }

    void UserInterface() {
        System.out.println("Each computer has a User interface");
    }

    void CPU() {
        System.out.println("CPU is or processor is a very important part in computer hardware");
    }
}

class Apple extends Computer {
    @Override
    void Storage() {
        System.out.println("Apple computer has 256mb,512mb or 1tb hard drives");
    }

    @Override
    void OperatingSystem() {
        System.out.println("Apple operating system is macOS");
    }

    @Override
    void UserInterface() {
        System.out.println("Apple Computer has a proprietary graphical user interface (GUI)");
    }
}

class Lenovo extends Computer {
    @Override
    void Storage() {
        System.out.println("Lenovo computers has 512mb,1tb or 2tb hard drives");
    }

    @Override
    void UserInterface() {
        System.out.println("Lenovo uses Microsoft Windows is a popular operating system with a graphical user interface (GUI)");
    }

    @Override
    void CPU() {
        System.out.println("Lenovo has Intel Core i9: This is a high-end CPU");
    }
}

class HP extends Computer {
    @Override
    void Storage() {
        System.out.println("HP computers has 512mb,1tb or 2tb hard drives");
    }

    @Override
    void OperatingSystem() {
        System.out.println("HP uses Microsoft windows as an operating system for their computers");
    }
}

class Dell extends Computer {
    @Override
    void OperatingSystem() {
        System.out.println("Dell uses Microsoft windows as an operating system for their computers");
    }

    @Override
    void CPU() {
        System.out.println("Dell has Intel Core i9: This is a high-end CPU");
    }
}


