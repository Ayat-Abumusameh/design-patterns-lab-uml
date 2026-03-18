package Composition;

/**
 * Represents a Computer.
 * 
 * UML Concept: Composition
 * - Computer strongly owns Processor
 * - Processor cannot exist without Computer
 */
public class Computer {

    private Processor processor;

    public Computer() {
        // Processor is created inside Computer
        // → strong ownership (Composition)
        this.processor = new Processor("Intel i7");
    }
}
