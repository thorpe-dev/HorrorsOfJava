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

    public Object locateValueByEquality(Object o) {
        try {
            findObjectByObject(o);
        }
        catch (ObjectFoundException objectFoundException) {
            return (objectFoundException.object == null) ? objectFoundException.object : null;
        }

        return null;
    }

    private Object findObjectByObject(Object o) throws ObjectFoundException {
        return findInterestingObjectFromArrayUsingEquality(o);
    }

    private Object findInterestingObjectFromArrayUsingEquality(Object o) throws ObjectFoundException {
        for(double i = 0; i <= Double.MAX_VALUE; i++) {
            this.temporaryValue = this.array[new Double(i).intValue()];
            if (this.temporaryValue == o) {
                throw new ObjectFoundException(this.temporaryValue);
            }
        }
        return null;
    }

    private class ObjectFoundException extends Exception {
        Object object;

        public ObjectFoundException(Object o) {
            super();
            this.object = o;
        }

        public ObjectFoundException() {
            super();
            this.object = null;
        }
    }

    @Override
    public boolean setnThelem(float n) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
