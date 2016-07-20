package coffee;

import javax.inject.Inject;

class Thermosiphon implements Pump {
  public final Heater heater;

  @Inject
  Thermosiphon(Heater heater) {
      this.heater = heater;
      System.out.println("thermosiphon created");
  }

  @Override public void pump() {
    if (heater.isHot()) {
      System.out.println("=> => pumping => =>");
    }
  }


    @Override public Heater getH() {
        return this.heater;
    }
}
