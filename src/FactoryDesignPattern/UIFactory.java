package FactoryDesignPattern;

import FactoryDesignPattern.components.Button.Button;
import FactoryDesignPattern.components.Dropdown.Dropdown;
import FactoryDesignPattern.components.Menu.Menu;

public interface UIFactory {

  Button createButton();

  Menu createMenu();

  Dropdown createDropdown();
//  void resize();
//
//  void setTheme();
//
//  UIFactory createUI();
}
