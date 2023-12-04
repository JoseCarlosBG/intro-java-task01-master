package com.epam.rd.autotasks;

import java.rmi.UnexpectedException;
import java.lang.Math;

class ConditionStatements {
    public static int task1(int n) {
        if (n>0){
            return (int) Math.pow(n,2);
        } else if (n<0) {
            return Math.abs(n);
        }
        else{
            return 0;
        }
    }
}
