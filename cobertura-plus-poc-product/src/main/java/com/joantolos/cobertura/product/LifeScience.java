package com.joantolos.cobertura.product;

import com.joantolos.cobertura.enums.Method;

/**
 *  
 * Created by u6019943 on 10/04/2015.
 */
public class LifeScience {
    private Method method;
    
    public LifeScience(Method method){
        this.method = method;
    }
    
    public boolean changeTheWorld(){
        if(this.method.equals(Method.AGILE) || this.method.equals(Method.THREE_TWELVE)){
            return true;
        }else{
            return false;
        }
    }
}
