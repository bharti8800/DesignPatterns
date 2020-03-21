package VisitorPattern.Visitor;

import VisitorPattern.CreditCard.ICreditCard;

public interface IOffersVisitor {
    public void visitGoldCreditCard(ICreditCard card);
    public void visitSilverCreditCard(ICreditCard card);
}
