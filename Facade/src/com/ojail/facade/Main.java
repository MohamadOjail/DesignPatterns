package com.ojail.facade;

import com.ojail.facade.print.Printer;

import static com.ojail.facade.print.Printer.*;

public class Main {
    public static void main(String[] args) {
        InvestmentFacade investmentFacade = new InvestmentFacade();
        getInstance().info("Assets before investment:");
        investmentFacade.getAssets("userX");

        investmentFacade.invest("userX", investments.FUND, 1000d);
        investmentFacade.invest("userX", investments.OPTIONS, 200d);
        investmentFacade.invest("userX", investments.STOCK, 150d);

        getInstance().info("Assets after investment:");
        investmentFacade.getAssets("userX");
    }
}
