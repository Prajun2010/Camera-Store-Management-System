/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Infotech;

import java.util.LinkedList;

/**
 *
 * @author Prajun
 */
public class PriceSearch {
    public int binaryPrice(LinkedList price, int low, int high, int value){ 
    if (low<=high){
        int mid =(low+high)/2;
        if (Integer.parseInt(price.get(mid).toString())==value){
        return Integer.parseInt(price.get(mid).toString());
        }else if(Integer.parseInt(price.get(mid).toString())>value)
          {
                    return binaryPrice(price,low,mid-1,value) ;
                }
        else if(Integer.parseInt(price.get(mid).toString())<value)
                {
                    return binaryPrice(price,mid+1,high,value);
                }
     }
      return -1; 
    }
}
