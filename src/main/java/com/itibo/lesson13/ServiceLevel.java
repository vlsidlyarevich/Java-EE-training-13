package com.itibo.lesson13;


public enum ServiceLevel {

    Basic,Medium,Premium;

    public static ServiceLevel getServiceLevel(String serviceLevel){
        for(ServiceLevel serviceLevel1 : ServiceLevel.values()){
            if(serviceLevel1.toString().equals(serviceLevel)){
                return serviceLevel1;
            }
        }
        return ServiceLevel.Basic;
    }
}
