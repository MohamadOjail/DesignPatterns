package com.ojail.facade;

import com.ojail.facade.print.Printer;
import com.ojail.facade.services.FundService;
import com.ojail.facade.services.OptionsService;
import com.ojail.facade.services.StockService;

import static com.ojail.facade.services.InvestmentAccountService.*;

public class InvestmentFacade {

    FundService fundService = new FundService();
    StockService stockService = new StockService();
    OptionsService optionsService = new OptionsService();

    public void getAssets(String userId){
        Printer.getInstance().printAssets(fundService, stockService, optionsService, userId);
    }

    public void invest (String userId, investments type, Double amount){
        if(getInstance().getAvailableFunds(userId) < amount){
            Printer.getInstance().insufficientFunds();
            return;
        }
        switch (type){
            case FUND -> fundService.buy(userId, amount);
            case STOCK -> stockService.buy(userId, amount);
            case OPTIONS -> optionsService.buy(userId, amount);
        }
        getInstance().useAmount(userId, amount);
    }
}

