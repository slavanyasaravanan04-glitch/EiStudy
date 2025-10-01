package creational.builder;

public class Computer {
    private String cpu;
    private String ram;
    private String storage;
    private String gpu;
    private boolean hasBluetooth;
    private boolean hasWifi;

    private Computer(ComputerBuilder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.gpu = builder.gpu;
        this.hasBluetooth = builder.hasBluetooth;
        this.hasWifi = builder.hasWifi;
    }

    public String getCpu() { return cpu; }
    public String getRam() { return ram; }
    public String getStorage() { return storage; }
    public String getGpu() { return gpu; }
    public boolean hasBluetooth() { return hasBluetooth; }
    public boolean hasWifi() { return hasWifi; }

    @Override
    public String toString() {
        return "Computer Configuration:\n" +
                "• CPU: " + cpu + "\n" +
                "• RAM: " + ram + "\n" +
                "• Storage: " + storage + "\n" +
                "• GPU: " + (gpu != null ? gpu : "Integrated") + "\n" +
                "• Bluetooth: " + (hasBluetooth ? "Yes" : "No") + "\n" +
                "• WiFi: " + (hasWifi ? "Yes" : "No");
    }

    public static class ComputerBuilder {
        private String cpu;
        private String ram;
        private String storage;
        private String gpu;
        private boolean hasBluetooth;
        private boolean hasWifi;

        public ComputerBuilder(String cpu, String ram, String storage) {
            if (cpu == null || cpu.trim().isEmpty()) {
                throw new IllegalArgumentException("CPU cannot be null or empty");
            }
            if (ram == null || ram.trim().isEmpty()) {
                throw new IllegalArgumentException("RAM cannot be null or empty");
            }
            if (storage == null || storage.trim().isEmpty()) {
                throw new IllegalArgumentException("Storage cannot be null or empty");
            }

            this.cpu = cpu;
            this.ram = ram;
            this.storage = storage;
        }

        public ComputerBuilder setGpu(String gpu) {
            this.gpu = gpu;
            return this;
        }

        public ComputerBuilder setBluetooth(boolean hasBluetooth) {
            this.hasBluetooth = hasBluetooth;
            return this;
        }

        public ComputerBuilder setWifi(boolean hasWifi) {
            this.hasWifi = hasWifi;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}
