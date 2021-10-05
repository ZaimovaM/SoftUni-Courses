package CarInfo;

public class Car {
  private String brand;
  private String model;
  private int horsePower;

  public String getModel() {
    return model;
  }

  public int getHorsePower() {
    return horsePower;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public void setHorsePower(int horsePower) {
    this.horsePower = horsePower;
  }

  public void setModel(String model) {
    this.model = model;
  }

  @Override
  public String toString() {
    return ("The car is: " + this.brand + " " + this.model + " - " + this.horsePower + " HP.");
  }
}
