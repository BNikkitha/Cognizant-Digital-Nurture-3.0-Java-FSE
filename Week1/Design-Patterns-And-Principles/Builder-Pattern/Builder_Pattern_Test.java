public class Builder_Pattern_Test {
    public static void main(String[] args) {
        // Create a basic Computer
        Computer basicComputer = new Computer.Builder("Intel i5")
                .RAM(8)
                .Storage(256)
                .build();

        // Create a gaming Computer
        Computer gamingComputer = new Computer.Builder("AMD Ryzen 9")
                .RAM(32)
                .Storage(1024)
                .GPU("NVIDIA RTX 3080")
                .isGamingComputer(true)
                .build();

        // Print the computers
        System.out.println("Basic Computer: " + basicComputer);
        System.out.println("Gaming Computer: " + gamingComputer);
    }
}
