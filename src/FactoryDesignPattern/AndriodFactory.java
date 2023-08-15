package FactoryDesignPattern;

import FactoryDesignPattern.components.Button.AndroidButton;
import FactoryDesignPattern.components.Button.Button;
import FactoryDesignPattern.components.Dropdown.AndroidDropdown;
import FactoryDesignPattern.components.Dropdown.Dropdown;
import FactoryDesignPattern.components.Menu.AndroidMenu;
import FactoryDesignPattern.components.Menu.Menu;

public class AndriodFactory implements UIFactory{



  @Override
  public Button createButton() {
    return new AndroidButton();
  }

  @Override
  public Menu createMenu() {
    return new AndroidMenu();
  }

  @Override
  public Dropdown createDropdown() {
    return new AndroidDropdown();
  }
}
