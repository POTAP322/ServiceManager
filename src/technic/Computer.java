package technic;

public class Computer extends Technique {
    private String processor;
    private String graphicsCard;
    //оперативная память
    private int ram;

    public Computer(boolean isBroken,String model, String processor, String graphicsCard, int ram) {
        super(isBroken,model);
        this.processor = processor;
        this.graphicsCard = graphicsCard;
        this.ram = ram;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    public void setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }
    public String getModel() {
        return model;
    }

}
