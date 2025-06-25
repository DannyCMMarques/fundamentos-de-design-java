package com.designer.partners.demo.criacional.factoryMethod.appleMacs.kindaSimple.beforeImplementation.model;

public abstract class Macbook {

    public abstract void getHardware();

    public void assemble(){
        System.out.print("Assemble the notebook harware");
    }

    public void getCertificates(){
        System.out.print("Testing all the certificates");
    }

    public void pack(){
        System.err.println("pack the notebook");
    }
}
