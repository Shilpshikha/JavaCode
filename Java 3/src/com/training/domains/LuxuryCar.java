package com.training.domains;

import com.training.ifaces.Automobile;

public class LuxuryCar implements Automobile {

 @Override
 public String getColor() {
   return "Black";
 }

 @Override
 public double getPrice() {
   return 500000.00;
 }

 @Override
 public String getModel() {
   return "BMW-7";
 }

}
