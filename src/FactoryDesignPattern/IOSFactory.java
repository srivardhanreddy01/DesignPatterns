package FactoryDesignPattern;

import FactoryDesignPattern.components.Button.Button;
import FactoryDesignPattern.components.Button.IOSButton;
import FactoryDesignPattern.components.Dropdown.Dropdown;
import FactoryDesignPattern.components.Dropdown.IOSDropdown;
import FactoryDesignPattern.components.Menu.IOSMenu;
import FactoryDesignPattern.components.Menu.Menu;

public class IOSFactory implements UIFactory{

  @Override
  public Button createButton() {
    return new IOSButton();
  }

  @Override
  public Menu createMenu() {
    return new IOSMenu();
  }

  @Override
  public Dropdown createDropdown() {
    return new IOSDropdown();
  }
}
