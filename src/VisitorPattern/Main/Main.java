package VisitorPattern.Main;

import VisitorPattern.CreditCard.ICreditCard;
import VisitorPattern.CreditCard.SilverCreditCard;
import VisitorPattern.Visitor.GasOffers;
import VisitorPattern.Visitor.IOffersVisitor;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ICreditCard silver = new SilverCreditCard();
        IOffersVisitor offer = new GasOffers();
        silver.accept(offer);
    }

}
