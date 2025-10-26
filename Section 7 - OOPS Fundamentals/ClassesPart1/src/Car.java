public class Car {

    private String company = "Tesla";

    private String model = "Model X";

    private String color = "Gray";

    private int doors = 2;

    private boolean isConvertible = true;

    public String getCompany() {
        return company;
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
        return isConvertible;
    }

    public void setCompany(String company) {
        if(company == null) company = "Unknown";

        String lowerCaseCompany = company.toLowerCase();

        switch (lowerCaseCompany) {
            case "bugatti", "porsche", "tesla" -> this.company = company;
            default -> {
                this.company = "Unsupported";
            }
        }
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
        isConvertible = convertible;
    }



    public void describeCar() {

        System.out.println(doors + "-Door " + color + " " + company + " " + model + " "
                + (isConvertible ? "convertible" : ""));


    }
}
