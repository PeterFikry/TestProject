package HomeWorkFeb112023;

public class ComputerTester {
    public static void main(String[] args) {
        Computer[] computers = {new Apple(), new Dell(), new HP(), new Lenovo()};

        for (Computer computer : computers) {
            computer.Storage();
            computer.OperatingSystem();
            computer.CPU();
            computer.UserInterface();
        }
    }
}
