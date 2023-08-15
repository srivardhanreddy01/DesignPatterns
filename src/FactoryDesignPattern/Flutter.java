package FactoryDesignPattern;

public class Flutter {
  void setSize(){

  }

  void setTheme(){

  }

  UIFactory createUIFactory(DeviceModel model){
    if(model.equals(model.ANDROID)){
      return new AndriodFactory();
    }
    if(model.equals(model.IOS)){
      return new IOSFactory();
    }
    return null;
  }


}
