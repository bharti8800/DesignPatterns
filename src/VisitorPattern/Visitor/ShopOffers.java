package VisitorPattern.Visitor;

import VisitorPattern.CreditCard.ICreditCard;

public class ShopOffers implements IOffersVisitor {

    @Override
    public void visitGoldCreditCard(ICreditCard card) {
        // TODO Auto-generated method stub
        System.out.println("Shop Offer for Gold Credit Card");
    }

    @Override
    public void visitSilverCreditCard(ICreditCard card) {
        // TODO Auto-generated method stub
        System.out.println("Shop Offer for Silver Credit Card");
    }

}
