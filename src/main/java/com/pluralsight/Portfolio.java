package com.pluralsight;

import java.util.ArrayList;

public class Portfolio {
    private ArrayList<Valuable> valuables;

    public Portfolio() {
        this.valuables = new ArrayList<>();
    }

    public void addValuable(Valuable valuable){
        this.valuables.add(valuable);
    }

    public double getValue(){
        double value = 0;

        for (Valuable v : valuables){
            value += v.getValue();
        }

        return value;
    }
}