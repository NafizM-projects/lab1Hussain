/**
 * Represents an engine for a motorcycle.
 * Stores the type of engine.
 */
class Engine {
    private String type;

    /**
     * Creates a new Engine with specified type.
     *
     * @param type The type of engine (e.g., "V-Twin", "Inline-4", "Single")
     */
    public Engine(String type) {
        this.type = type;
    }

    /**
     * Gets the type of the engine.
     *
     * @return The engine type as a String
     */
    public String getType() {
        return type;
    }
}