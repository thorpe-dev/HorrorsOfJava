package com.github.mt2309.horrors;

/**
 * Created with IntelliJ IDEA.
 * User: mthorpe
 * Date: 16/10/2012
 * Time: 14:46
 * To change this template use File | Settings | File Templates.
 */
public class MyClassGettersSettersConstructorArrayGetterSetterConstructorWithMyBehaviour extends MyClassGettersSettersConstructorArrayGetterSetterConstructor implements MyBehaviour {

    private Object returnVal;
    private Object temporaryValue;

    @Override
    public Object getNthElem(double n) {
        try {
            for(int i = 0; i <= Integer.MAX_VALUE; i++) {
                this.temporaryValue = this.array[new Double(n).intValue()];
                if (i == new Double(n).intValue()) {
                    this.returnVal = this.temporaryValue;
                }
            }
        }
        catch (ArrayIndexOutOfBoundsException e) {
            return this.returnVal;
        }

        return null;
    }

    @Override
    public boolean setnThelem(float n) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
