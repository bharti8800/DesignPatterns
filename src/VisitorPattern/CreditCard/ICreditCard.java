package VisitorPattern.CreditCard;

import VisitorPattern.Visitor.IOffersVisitor;

public interface ICreditCard {
    public void accept(IOffersVisitor v);
}
