    class Motorcycle {
       private String color;
       private double size;
       private Material frameMaterial;
       private Engine engine;
       private Wheel[] wheels = new Wheel[2];

       public Motorcycle(String color, double size, Material frameMaterial,
                         String engineType, double wheelSize) {
           this.color = color;
           this.size = size;
           this.frameMaterial = frameMaterial;
           this.engine = new Engine(engineType);
           this.wheels[0] = new Wheel(wheelSize);
           this.wheels[1] = new Wheel(wheelSize);
       }

       public String getColor() {
           return color;
       }

       public void setColor(String color) {
           this.color = color;
       }

       public double getSize() {
           return size;
       }

       public void setSize(double size) {
           this.size = size;
       }

       public Material getFrameMaterial() {
           return frameMaterial;
       }

       public String getEngineType() {
           return engine.getType();
       }

       public double getWheelSize() {
           return wheels[0].getSize();
       }

       public void start() {
           System.out.println("Motorcycle engine started: Vroom!");
       }

       public void stop() {
           System.out.println("Motorcycle stopped");
       }
   }
