package technic;

//абстрактный класс для всех видов техники. Его наследуют все классы техники и создаются по его образцу( но могут добавлять свои уникальные черны)
public abstract class Technique {
    protected boolean isBroken = false;
    protected String model;

    public Technique(boolean isBroken, String model) {
        this.isBroken = isBroken;
        this.model = model;
    }

    public void setBroken(boolean broken) {
        isBroken = broken;
    }

    // Метод для поломки техники
    public void breakTechnique() {
        this.isBroken = true;
        System.out.println("Техника сломалась " + this.model);
    }

    // Метод для проверки состояния техники

    public boolean checkStatus() {
        return this.isBroken;

    }

    public String getModel() {
        return model;
    }
}
