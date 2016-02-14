package com.itibo.lesson13;


public enum Sex {

    man,woman;

    public static Sex getSex(String sex){
        for(Sex sex1 : Sex.values()){
            if(sex1.toString().equals(sex)){
                return sex1;
            }
        }
        return Sex.man;
    }
}
