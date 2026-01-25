/**
 * course: IST 242
 * Author: Nafiz Hussain
 * Date developed:
 * Last date changed:
 *
 * Main class to demonstrate Motorcycle objects.
 * Creates three motorcycles and shows their details.
 */
public class Main {
    /**
     * Main method runs the program.
     * Creates motorcycles and displays their information.
     * @param args Not used
     */
    public static void main(String[] args) {
        // Create motorcycles
        Motorcycle bike1 = new Motorcycle("Red", 250.0, Material.ALUMINUM,
                "V-Twin", 17.0);
        Motorcycle bike2 = new Motorcycle("Black", 300.0, Material.STEEL,
                "Inline-4", 18.0);
        Motorcycle bike3 = new Motorcycle("Blue", 280.0, Material.CARBON_FIBER,
                "Single", 21.0);

        // Modify properties
        bike1.setColor("Orange");
        bike2.setSize(320.0);

        // Display information
        System.out.println("Motorcycle 1 color: " + bike1.getColor());
        System.out.println("Motorcycle 1 size: " + bike1.getSize());
        System.out.println("Motorcycle 1 frame: " + bike1.getFrameMaterial());
        System.out.println("Motorcycle 1 engine: " + bike1.getEngineType());
        System.out.println("Motorcycle 1 wheels: " + bike1.getWheelSize());

        bike1.start();
        bike1.stop();

        System.out.println("Motorcycle 2 color: " + bike2.getColor());
        System.out.println("Motorcycle 2 size: " + bike2.getSize());
        System.out.println("Motorcycle 2 frame: " + bike2.getFrameMaterial());
        System.out.println("Motorcycle 2 engine: " + bike2.getEngineType());
        System.out.println("Motorcycle 2 wheels: " + bike2.getWheelSize());

        bike2.start();
        bike2.stop();

        System.out.println("Motorcycle 3 color: " + bike3.getColor());
        System.out.println("Motorcycle 3 size: " + bike3.getSize());
        System.out.println("Motorcycle 3 frame: " + bike3.getFrameMaterial());
        System.out.println("Motorcycle 3 engine: " + bike3.getEngineType());
        System.out.println("Motorcycle 3 wheels: " + bike3.getWheelSize());

        bike3.start();
        bike3.stop();
    }
}