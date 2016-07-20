package coffee;

import java.util.Random;


class ElectricHeater implements Heater {
  boolean heating;
    public int h;

  public ElectricHeater(){
    System.out.println("heater created");
    this.heating = false;
      Random random = new Random();
      this.h = random.nextInt(100);
      System.out.println("random: " + random.nextInt(100));
  }

  @Override public void on() {
    System.out.println("~ ~ ~ heating ~ ~ ~");
    this.heating = true;
  }

  @Override public void off() {
    this.heating = false;
  }

  @Override public boolean isHot() {
    return heating;
  }

    @Override public int getR(){
        return this.h;
    }
}
