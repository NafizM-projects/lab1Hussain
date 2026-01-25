/**
 * Represents a motorcycle with various attributes.
 * This class models a motorcycle with color, size, frame material,
 * engine type, and wheels.
 */
class Motorcycle {
    private String color;
    private double size;
    private Material frameMaterial;
    private Engine engine;
    private Wheel[] wheels = new Wheel[2];

    /**
     * Creates a new Motorcycle with specified attributes.
     *
     * @param color The color of the motorcycle
     * @param size The size of the motorcycle in centimeters
     * @param frameMaterial The material used for the motorcycle frame
     * @param engineType The type of engine (e.g., "V-Twin", "Inline-4")
     * @param wheelSize The diameter of the wheels in inches
     */
    public Motorcycle(String color, double size, Material frameMaterial,
                      String engineType, double wheelSize) {
        this.color = color;
        this.size = size;
        this.frameMaterial = frameMaterial;
        this.engine = new Engine(engineType);
        this.wheels[0] = new Wheel(wheelSize);
        this.wheels[1] = new Wheel(wheelSize);
    }

    /**
     * Gets the color of the motorcycle.
     *
     * @return The current color as a String
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets the color of the motorcycle.
     *
     * @param color The new color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Gets the size of the motorcycle.
     *
     * @return The size in centimeters
     */
    public double getSize() {
        return size;
    }

    /**
     * Sets the size of the motorcycle.
     *
     * @param size The new size in centimeters
     */
    public void setSize(double size) {
        this.size = size;
    }

    /**
     * Gets the frame material of the motorcycle.
     *
     * @return The frame material
     */
    public Material getFrameMaterial() {
        return frameMaterial;
    }

    /**
     * Gets the type of engine in the motorcycle.
     *
     * @return The engine type as a String
     */
    public String getEngineType() {
        return engine.getType();
    }

    /**
     * Gets the wheel size of the motorcycle.
     *
     * @return The wheel diameter in inches
     */
    public double getWheelSize() {
        return wheels[0].getSize();
    }

    /**
     * Starts the motorcycle engine.
     * Prints a message to indicate the engine has started.
     */
    public void start() {
        System.out.println("Motorcycle engine started: Vroom!");
    }

    /**
     * Stops the motorcycle engine.
     * Prints a message to indicate the engine has stopped.
     */
    public void stop() {
        System.out.println("Motorcycle stopped");
    }
}