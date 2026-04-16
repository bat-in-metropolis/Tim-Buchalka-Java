public class Car {
    private String make = "Tesla";
    private String model = "Model X";
    private String color = "Gray";
    private int doors = 2;
    private boolean convertible = true;

    private enum TRUSTED_MAKERS {
        TATA, MAHINDRA, SUZUKI
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public String getMake() {
        return make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public void setMake(String make) {
        if (make == null) {
            this.make = "unknown";
            return;
        }

        try {
            TRUSTED_MAKERS.valueOf(make.toUpperCase());
            this.make = make;
        } catch (IllegalArgumentException e) {
            this.make = "unsupported";
        }
    }

    public void describeCar() {
        System.out.println(doors + "-Door " + color + " " + make + " " + model + " " + (convertible ? "Convertible" : " "));
    }
}
