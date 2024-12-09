package technic;

public class MobileDevice extends Technique {
    private String processor;
    private int ram;

    public MobileDevice(boolean isBroken, String model, String processor, int ram) {
        super(isBroken,model);
        this.processor = processor;
        this.ram = ram;
    }

    public String getModel() {
        return model;
    }

    public String getProcessor() {
        return processor;
    }

    public int getRam() {
        return ram;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }
}
