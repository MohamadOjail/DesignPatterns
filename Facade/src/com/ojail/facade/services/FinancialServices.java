package com.ojail.facade.services;

import java.util.HashMap;

abstract class FinancialServices{

    protected HashMap<String, Double> data = new HashMap<>();

     public Double getAssetAmount(String userId) {
         if ( !data.containsKey(userId)){
             System.out.println("The user is not in the list");
             return 0d;
         }
         return data.get(userId);
     }


     public void buy(String userId, Double amount) {
         data.put(userId, data.get(userId) + amount);
     }
 }
