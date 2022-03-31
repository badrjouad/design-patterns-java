package com.pluralsight.creational.builder;

public class BuilderLunchOrderDemo {
    public static void main(String[] args) {
        LunchOrder.Builder builder=new LunchOrder.Builder();
         builder.bread("wheat")
                .condiments("Lettuce")
                .meat("Turkey")
                .veggies("veggies");

        LunchOrder lunchOrder =builder.build();

        System.out.println(lunchOrder.getBread());
        System.out.println(lunchOrder.getCondiments());
        System.out.println(lunchOrder.getMeat());
        System.out.println(lunchOrder.getVeggies());

    }
}
