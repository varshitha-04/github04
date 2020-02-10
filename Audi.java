public class Audi extends Car{

    @Override
    void applyBreaks() {
        System.out.println("Applying Breaks to Audi");
    }

    @Override
    void accelerate() {
        System.out.println("Accelerating Audi");
    }
}
