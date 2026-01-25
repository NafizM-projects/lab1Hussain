/**
 * Represents a wheel for a motorcycle.
 * Stores the wheel size in inches.
 */
class Wheel {
    private double size;

    /**
     * Creates a new Wheel with specified size.
     *
     * @param size The diameter of the wheel in inches
     */
    public Wheel(double size) {
        this.size = size;
    }

    /**
     * Gets the size of the wheel.
     *
     * @return The wheel diameter in inches
     */
    public double getSize() {
        return size;
    }

    /**
     * Sets the size of the wheel.
     *
     * @param size The new wheel diameter in inches
     */
    public void setSize(double size) {
        this.size = size;
    }
}