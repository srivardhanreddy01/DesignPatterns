package PrototypeDesignPattern;

import java.util.HashMap;
import java.util.*;
public class Registry {

  Map<String, Student> map = new HashMap<>();

  void register(String batch, Student student){
    map.put(batch,student);
  }

  Student get(String batch){
    return map.get(batch);
  }
}
