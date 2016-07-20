package coffee;

import dagger.Component;
import javax.inject.Singleton;

public class CoffeeApp {
  @Singleton
  @Component(modules = { DripCoffeeModule.class })
  public interface Coffee {
    CoffeeMaker maker();
  }

  public static void main(String[] args) {
    Coffee coffee = DaggerCoffeeApp_Coffee.builder().build();
    //Coffee coffee = new CoffeeMaker();
    coffee.maker().brew();
    CoffeeMaker coffeeMaker = coffee.maker();
    System.out.println(coffee.maker().getHeater().getR() + " == " + coffee.maker().getPump().getH().getR());
    System.out.println(coffee.maker().getHeater().equals(coffee.maker().getPump().getH()));
    Heater heater = coffee.maker().getHeater();
    System.out.println(heater.getR());

    System.out.println("");
    coffeeMaker.brew();
    coffeeMaker.brew();

    Heater heater1 = new ElectricHeater();
    System.out.println(heater1.getR());
  }
}
