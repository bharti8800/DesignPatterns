package VisitorPattern.CreditCard;

import VisitorPattern.Visitor.IOffersVisitor;

public class SilverCreditCard implements ICreditCard {

    @Override
    public void accept(IOffersVisitor v) {
        // TODO Auto-generated method stub
        v.visitSilverCreditCard(this);
    }

}
