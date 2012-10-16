package com.github.mt2309.horrors;

/**
 * Created with IntelliJ IDEA.
 * User: mthorpe
 * Date: 16/10/2012
 * Time: 14:39
 * To change this template use File | Settings | File Templates.
 */
abstract public class MyClassGettersSetters extends MyClassGetters {
    public String setMyval(float val) {
        this.myVal = new Float(val).intValue();
        return "OKAY";
    }

    public int setmyname_(StringBuffer name) {
        this.myName = name.toString();
        return 10;
    }
}
