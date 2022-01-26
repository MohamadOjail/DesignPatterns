package com.ojail.facade.services;

import java.util.HashMap;

public class InvestmentAccountService {

    private final HashMap<String, Double> data = new HashMap<>();

    private static final InvestmentAccountService instance = new InvestmentAccountService();

    public static InvestmentAccountService getInstance() {
        return instance;
    }

    private InvestmentAccountService() {
        data.put("userX", 10000d);
    }

    public Double getAvailableFunds(String userId){
        if ( !data.containsKey(userId) ){
            System.out.println("The user is not in the list");
            return 0d;
        }
        return data.get(userId);
    }

    public void useAmount(String userId, Double amount){
        if(data.containsKey(userId)) data.put(userId, data.get(userId) - amount);
    }
}
