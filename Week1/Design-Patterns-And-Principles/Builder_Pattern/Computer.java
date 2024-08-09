public class Computer {
    private final String CPU;
    private final int RAM; // in GB
    private final int Storage; // in GB
    private final String GPU;
    private final boolean isGamingComputer;

    // Private constructor to be used by the Builder
    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.Storage = builder.Storage;
        this.GPU = builder.GPU;
        this.isGamingComputer = builder.isGamingComputer;
    }

    // Getters for the attributes
    public String getCPU() {
        return CPU;
    }

    public int getRAM() {
        return RAM;
    }

    public int getStorage() {
        return Storage;
    }

    public String getGPU() {
        return GPU;
    }

    public boolean isGamingComputer() {
        return isGamingComputer;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "CPU='" + CPU + '\'' +
                ", RAM=" + RAM +
                ", Storage=" + Storage +
                ", GPU='" + GPU + '\'' +
                ", isGamingComputer=" + isGamingComputer +
                '}';
    }

    // Static nested Builder class
    public static class Builder {
        private final String CPU; // Required parameter
        private int RAM; // Optional parameter
        private int Storage; // Optional parameter
        private String GPU; // Optional parameter
        private boolean isGamingComputer; // Optional parameter

        // Constructor for required parameters
        public Builder(String CPU) {
            this.CPU = CPU;
        }

        // Setter methods for optional parameters
        public Builder RAM(int RAM) {
            this.RAM = RAM;
            return this;
        }

        public Builder Storage(int Storage) {
            this.Storage = Storage;
            return this;
        }

        public Builder GPU(String GPU) {
            this.GPU = GPU;
            return this;
        }

        public Builder isGamingComputer(boolean isGamingComputer) {
            this.isGamingComputer = isGamingComputer;
            return this;
        }

        // Build method to create a Computer instance
        public Computer build() {
            return new Computer(this);
        }
    }
}
