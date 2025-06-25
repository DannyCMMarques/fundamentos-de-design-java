package com.designer.partners.demo.criacional.factoryMethod.appleMacs.kindaSimple.after.factory;

import com.designer.partners.demo.criacional.factoryMethod.appleMacs.kindaSimple.after.model.Macbook;

public abstract class MacbookFactory {


    public Macbook orderMacbook(String level){
        Macbook macbook = null;
        macbook = createNotebook(level);
        macbook.getCertificates();
        macbook.assemble();
        macbook.pack();
        return macbook;
    }
    protected abstract Macbook createNotebook(String level);
}

