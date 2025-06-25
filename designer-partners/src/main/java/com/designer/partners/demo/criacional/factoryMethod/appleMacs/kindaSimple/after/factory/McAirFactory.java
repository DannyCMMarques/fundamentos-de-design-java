package com.designer.partners.demo.criacional.factoryMethod.appleMacs.kindaSimple.after.factory;

import com.designer.partners.demo.criacional.factoryMethod.appleMacs.kindaSimple.after.model.Macbook;
import com.designer.partners.demo.criacional.factoryMethod.appleMacs.kindaSimple.after.model.McAir;

public class McAirFactory extends MacbookFactory {

    public Macbook createNotebook(String level) {
        if ("standart".equalsIgnoreCase(level)) {
            return new McAir();
        }
        return null;
    }
}
