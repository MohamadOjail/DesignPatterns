package com.ojail.facade.print;

import com.ojail.facade.services.FundService;
import com.ojail.facade.services.InvestmentAccountService;
import com.ojail.facade.services.OptionsService;
import com.ojail.facade.services.StockService;

import java.util.HashMap;

public class Printer {

    private final Colors colors;
    private static final Printer instance = new Printer();
    public static Printer getInstance(){
        return instance;
    }
    private Printer() {
        colors = new Colors();
    }

    public void printAssets(FundService fundService, StockService stockService, OptionsService optionsService, String userId){
        String text = "\n\t" + colors.WHITE_BACKGROUND_BRIGHT + colors.BLACK_BOLD + " " + userId + "'s list of Assets: " + colors.RESET
                + "\n\t" + colors.RED_BOLD_BRIGHT + "Stock: " + colors.RESET
                + " " + colors.WHITE_BOLD_BRIGHT + stockService.getAssetAmount(userId) + colors.RESET
                + "\n\t" + colors.GREEN_BOLD_BRIGHT + "Fund: " + colors.RESET
                + " " + colors.WHITE_BOLD_BRIGHT + fundService.getAssetAmount(userId) + colors.RESET
                + "\n\t" + colors.BLUE_BOLD_BRIGHT + "Options: " + colors.RESET
                + " " + colors.WHITE_BOLD_BRIGHT + optionsService.getAssetAmount(userId) + colors.RESET
                + "\n\t" + colors.GREEN_BACKGROUND + colors.WHITE_BOLD_BRIGHT + " Available funds for investment: "
                + InvestmentAccountService.getInstance().getAvailableFunds(userId) + " " + colors.RESET + "\n";
        System.out.println(text);
    }

    public void insufficientFunds(){
        System.out.println(colors.RED_BOLD_BRIGHT + "insufficient funds" + colors.RESET + "\n");
    }

    public void info(String message){
        System.out.println(colors.YELLOW_BOLD_BRIGHT + message + colors.RESET);
    }
}
