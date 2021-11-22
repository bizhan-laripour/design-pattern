package com.adapter;

public class TurkeyAdapter implements Duck{

   private Turkey turkey;

   public TurkeyAdapter(Turkey turkey){
       this.turkey = turkey;
   }
    @Override
    public void quake() {
       turkey.sound();
    }

    @Override
    public void fly() {
       turkey.fly();
    }
}
