package com.designer.partners.demo.criacional.factoryMethod.appleMacs.kindaSimple.beforeImplementation;

import com.designer.partners.demo.criacional.factoryMethod.appleMacs.kindaSimple.beforeImplementation.model.MacPro;
import com.designer.partners.demo.criacional.factoryMethod.appleMacs.kindaSimple.beforeImplementation.model.MacPro2016;
import com.designer.partners.demo.criacional.factoryMethod.appleMacs.kindaSimple.beforeImplementation.model.Macbook;
import com.designer.partners.demo.criacional.factoryMethod.appleMacs.kindaSimple.beforeImplementation.model.McAir;

public class Client {

    public Macbook orderMac(String type, String level) {
        Macbook macbook = null;

        if ("pro".equalsIgnoreCase(type)) {
            if ("high".equalsIgnoreCase(level)) {
                macbook = new MacPro();
            } else if ("simple".equalsIgnoreCase(level)) {
                macbook = new MacPro2016();
            }
        } else if ("air".equalsIgnoreCase(type)) {
            if ("high".equalsIgnoreCase(level)) {
                macbook = new McAir();
            }
        }

        if (macbook != null) {
            macbook.getCertificates();
            macbook.assemble();
            macbook.pack();
        }
        return macbook;
    }

    public static void main(String[] args) {
        Client client = new Client();
        System.out.println("=== Ordering a MacPro");
        Macbook macbook = client.orderMac("pro", "high");
        System.out.println(macbook);

        System.out.println("=== Ordering a MacAir");
        Macbook macbook2 = client.orderMac("air", "high");
        System.out.println(macbook2);
    }
}
