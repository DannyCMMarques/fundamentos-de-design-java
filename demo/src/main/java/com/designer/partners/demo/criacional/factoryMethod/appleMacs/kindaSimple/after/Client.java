package com.designer.partners.demo.criacional.factoryMethod.appleMacs.kindaSimple.after;

import com.designer.partners.demo.criacional.factoryMethod.appleMacs.kindaSimple.after.factory.MacProFactory;
import com.designer.partners.demo.criacional.factoryMethod.appleMacs.kindaSimple.after.factory.MacbookFactory;
import com.designer.partners.demo.criacional.factoryMethod.appleMacs.kindaSimple.after.factory.McAirFactory;
import com.designer.partners.demo.criacional.factoryMethod.appleMacs.kindaSimple.after.model.Macbook;

public class Client {

    public static void main(String[] args) {
        Client client = new Client();
        MacbookFactory levelAirFactory = new McAirFactory();
        MacbookFactory levelProFactory = new MacProFactory();

        System.out.println("=== Ordering a MacPro");
        Macbook macbook = levelProFactory.orderMacbook("high");
        System.out.println(macbook);

        System.out.println("=== Ordering a MacAir");
        Macbook macbook2 = levelAirFactory.orderMacbook("standard");
        System.out.println(macbook2);
    }
}
