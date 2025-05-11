package JavaLab;

public class Overloading {

    // Constructor Overloading
    public Overloading() {
        System.out.println("Mobile Phone: Basic model with default features.");
    }

    public Overloading(String brand) {
        System.out.println("Mobile Phone Brand: " + brand);
    }

    public Overloading(String brand, String model) {
        System.out.println("Mobile Phone Brand: " + brand + ", Model: " + model);
    }

    public Overloading(String brand, String model, int storage) {
        System.out.println("Mobile Phone Brand: " + brand + ", Model: " + model + ", Storage: " + storage + "GB");
    }

    // Method Overloading: displayFeatures
    public void displayFeatures() {
        System.out.println("Displaying basic phone features...");
    }

    public void displayFeatures(String brand) {
        System.out.println("Displaying features for brand: " + brand);
    }

    public void displayFeatures(String brand, String model) {
        System.out.println("Displaying features for brand: " + brand + ", Model: " + model);
    }

    public void displayFeatures(String brand, String model, int storage) {
        System.out.println("Displaying features for brand: " + brand + ", Model: " + model + ", Storage: " + storage + "GB");
    }

    // Main method
    public static void main(String[] args) {
        // Creating objects using overloaded constructors
        Overloading phone1 = new Overloading();
        Overloading phone2 = new Overloading("Apple");
        Overloading phone3 = new Overloading("Samsung", "Galaxy S21");
        Overloading phone4 = new Overloading("OnePlus", "9 Pro", 256);

        // Calling overloaded displayFeatures methods
        phone1.displayFeatures();
        phone2.displayFeatures("Apple");
        phone3.displayFeatures("Samsung", "Galaxy S21");
        phone4.displayFeatures("OnePlus", "9 Pro", 256);
    }
}
