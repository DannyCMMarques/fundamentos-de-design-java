package com.designer.partners.demo.criacional.factoryMethod.appleMacs.kindaSimple.beforeImplementation.model;

public class McAir extends Macbook {

    @Override
    public void getHardware(){
        System.out.println("Hard. list");
        System.out.println("\t - Retina Screen");
        System.out.println("\t - 16GB");
    }
}
