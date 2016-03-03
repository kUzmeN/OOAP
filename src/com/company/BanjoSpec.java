package com.company;

/**
 * Created by Vladok on 03.03.2016.
 */
public class BanjoSpec extends InstrumentSpec {
    private int numString;

    public BanjoSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood, int numString) {
        super(builder, model, type, backWood, topWood);
        this.numString = numString;
    }

    public int getNumString() {
        return numString;
    }

    public boolean matches(BanjoSpec otherSpec){
        if(!super.matches(otherSpec))
            return false;
        if(!(otherSpec instanceof BanjoSpec))
            return false;
        BanjoSpec spec  = (BanjoSpec)otherSpec;
        if((numString != spec.numString))
            return false;
        return true;
    }
}
