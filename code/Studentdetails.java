package JavaLab;

// Parent class
class Students {
    // Method to display the details
    public void displaydetail() {
        System.out.println("Student Activity.");
    }
}

// Subclass for Apple
class StuA extends Students {
    // Overridden method
    @Override
    public void displaydetail() {
        System.out.println("This student is Reading.");
    }
}

// Subclass for Samsung
class StuB extends Students {
    // Overridden method
    @Override
    public void displaydetail() {
        System.out.println("This student is writing.");
    }
}

// Subclass for OnePlus
class StuC extends Students {
    // Overridden method
    @Override
    public void displaydetail() {
        System.out.println("This student is solving sums.");
    }
}

// Main class to demonstrate runtime polymorphism
public class Studentdetails {
    public static void main(String[] args) {
        // Creating objects of different types but referring to them as Students
        Students a = new StuA(); // Apple instance
        Students b = new StuB(); // Samsung instance
        Students c = new StuC(); // OnePlus instance

        // Demonstrating polymorphism - each call to displaydetail() invokes the overridden method
        a.displaydetail();
        b.displaydetail();
        c.displaydetail();
    }
}
