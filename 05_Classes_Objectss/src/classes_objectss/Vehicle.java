package classes_objectss;

public class Vehicle {

    String type;
    String model;
    int power;
    double fuelConsumption;
    int yearProduced;
    int licenseNo;
    double weight;
    String color;
    double insurancePolicy;

    public Vehicle(String type, String model, int power, double fuelConsumption, int yearProduced,
            int licenseNo, double weight, String color, double insurancePolicy) {
        this.type = type;
        this.model = model;
        this.power = power;
        this.fuelConsumption = fuelConsumption;
        this.yearProduced = yearProduced;
        this.licenseNo = licenseNo;
        this.weight = weight;
        this.color = color;
        this.insurancePolicy = insurancePolicy;

    }

    public Vehicle(String type, String model, int power, double fuelConsumption, int yearProduced,
            int licenseNo, double insurancePolicy) {
        this.type = type;
        this.model = model;
        this.power = power;
        this.fuelConsumption = fuelConsumption;
        this.yearProduced = yearProduced;
        this.licenseNo = licenseNo;
        this.insurancePolicy = insurancePolicy;
    }

    public Vehicle(String type, String model, int power, double fuelConsumption, int yearProduced,
            int licenseNo, double weight, double insurancePolicy) {
        this.type = type;
        this.model = model;
        this.power = power;
        this.fuelConsumption = fuelConsumption;
        this.yearProduced = yearProduced;
        this.licenseNo = licenseNo;
        this.weight = weight;
        this.insurancePolicy = insurancePolicy;
    }

    public Vehicle(String type, String model, int power, double fuelConsumption, int yearProduced,
            int licenseNo, String color, double insurancePolicy) {
        this.type = type;
        this.model = model;
        this.power = power;
        this.fuelConsumption = fuelConsumption;
        this.yearProduced = yearProduced;
        this.licenseNo = licenseNo;
        this.color = color;
        this.insurancePolicy = insurancePolicy;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public void setYearProduced(int yearProduced) {
        this.yearProduced = yearProduced;
    }

    public void setLicenseNo(int licenseNo) {
        this.licenseNo = licenseNo;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setInsurancePolicy(double insurancePolicy) {
        this.insurancePolicy = insurancePolicy;
    }

    public String getType() {
        return type;
    }

    public String getModel() {
        return model;
    }

    public int getPower() {
        return power;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public int getYearProduced() {
        return yearProduced;
    }

    public int getLicenseNo() {
        return licenseNo;
    }

    public double getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public double getInsurancePolicy() {
        return insurancePolicy;
    }

    double calculateTripPrice(double fuelPrice, double distance) {
        double result = (distance / 100) * this.fuelConsumption * fuelPrice;

        return result;
    }

    double getInsurancePrice() {
        double insurPolicy;
        double carAge = 2017 - this.yearProduced;
        switch (this.type) {
            case "Car":
                insurPolicy = (0.16 * this.power) * (1.25 * carAge) * (0.05 * this.fuelConsumption) * 1;
                break;
            case "Suv":
                insurPolicy = (0.16 * this.power) * (1.25 * carAge) * (0.05 * this.fuelConsumption) * 1.12;
                break;
            case "Truck":
                insurPolicy = (0.16 * this.power) * (1.25 * carAge) * (0.05 * this.fuelConsumption) * 1.20;
                break;
            default:
                insurPolicy = (0.16 * this.power) * (1.25 * carAge) * (0.05 * this.fuelConsumption) * 1.50;
                break;
        }
        return insurPolicy;

    }
}
