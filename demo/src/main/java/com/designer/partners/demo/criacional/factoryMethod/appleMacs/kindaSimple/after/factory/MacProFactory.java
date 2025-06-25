package com.designer.partners.demo.criacional.factoryMethod.appleMacs.kindaSimple.after.factory;

import com.designer.partners.demo.criacional.factoryMethod.appleMacs.kindaSimple.after.model.MacPro;
import com.designer.partners.demo.criacional.factoryMethod.appleMacs.kindaSimple.after.model.MacPro2016;
import com.designer.partners.demo.criacional.factoryMethod.appleMacs.kindaSimple.after.model.Macbook;

public class MacProFactory extends MacbookFactory {
    public Macbook createNotebook(String level) {
        switch (level) {
            case "standard":
                return new MacPro2016();
            case "hight":
                return new MacPro();
            default:
                return null;
        }
    }
}
