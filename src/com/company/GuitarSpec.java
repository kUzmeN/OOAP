package com.company;


//Entity которая создана специально для использования в поиске.
//Т.к. в обычной Guitar не все поля использовались , а это не правильно
public class GuitarSpec extends InstrumentSpec {


    private int numStrings;

    public GuitarSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood, int numString) {
        super(builder, model, type, backWood, topWood);
        this.numStrings = numString;
    }

    public int getNumString() {
        return numStrings;
    }


    //Метод который сравнивает на месте  свои же объекты
    //в чем его плюс , если мы добавим несколько полей , то сможем сразу же
    //добавить их в этот метод, в тоже время на клиенте,
    //менять ничего не придеться.
    public boolean matches(InstrumentSpec otherSpec) {
        if (!super.matches(otherSpec))
            return false;
        if (!(otherSpec instanceof GuitarSpec))
            return false;
        GuitarSpec spec = (GuitarSpec) otherSpec;
        if (numStrings != spec.numStrings)
            return false;
        return true;
    }
}