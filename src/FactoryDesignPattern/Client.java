package FactoryDesignPattern;

import FactoryDesignPattern.components.Button.Button;

public class Client {

  public static void main(String[] args) {
    Flutter flutter = new Flutter();
    UIFactory factory = flutter.createUIFactory(DeviceModel.IOS);
    Button button = factory.createButton();
    button.changeSize();

  }
}
