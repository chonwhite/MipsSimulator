package com.chonwhite.mips;

import java.util.HashMap;

public class Register {

    public static final String RZERO = "$zero";

    public static final int $zero = 0;

    public static final int $at = 1;

    public static final int $v0 = 2;
    public static final int $v1 = 3;

    public static final int $a0 = 4;
    public static final int $a1 = 5;
    public static final int $a2 = 6;
    public static final int $a3 = 7;

    public static final int $t0 = 8;
    public static final int $t1 = 9;
    public static final int $t2 = 10;
    public static final int $t3 = 11;
    public static final int $t4 = 12;
    public static final int $t5 = 13;
    public static final int $t6 = 14;
    public static final int $t7 = 15;

    public static final int $s0 = 16;
    public static final int $s1 = 17;
    public static final int $s2 = 18;
    public static final int $s3 = 19;
    public static final int $s4 = 20;
    public static final int $s5 = 21;
    public static final int $s6 = 22;
    public static final int $s7 = 23;

    public static final int $t8 = 24;
    public static final int $t9 = 25;

    public static final int $k0 = 26;
    public static final int $k1 = 27;

    public static final int $gp = 28;
    public static final int $sp = 29;
    public static final int $fp = 30;
    public static final int $ra = 31;

    private int index;
    private int intValue;

    private static HashMap<String,Integer> sRegisterIndexMap = new HashMap<>();

    static {
        sRegisterIndexMap.put("$zero",0);
        sRegisterIndexMap.put("$at",1);
        sRegisterIndexMap.put("$v0",2);
        sRegisterIndexMap.put("$v1",3);

        for (int i = 0; i < 4; i++){
            sRegisterIndexMap.put("$a" + i, 4 + i);
        }

        for (int i = 0; i < 8; i++){
            sRegisterIndexMap.put("$t" + i, 8 + i);
        }

        for (int i = 0; i < 8; i++){
            sRegisterIndexMap.put("$s" + i, 16 + i);
        }

        sRegisterIndexMap.put("$t8",24);
        sRegisterIndexMap.put("$t9",25);

        sRegisterIndexMap.put("$k0",26);
        sRegisterIndexMap.put("$t1",27);

        sRegisterIndexMap.put("$gp",28);
        sRegisterIndexMap.put("$sp",29);
        sRegisterIndexMap.put("$fp",30);
        sRegisterIndexMap.put("$ra",31);
    }

    public static int getIndex(String name){
        return sRegisterIndexMap.get(name);
    }

    public Register() {

    }

    public Register(int value) {
        this.index = value;
    }

    public int getIntValue() {
        return intValue;
    }

    public void setIntValue(int intValue) {
        this.intValue = intValue;
    }

    @Override
    public String toString() {
        return "R" + index + "=" + intValue;
    }
}
