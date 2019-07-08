package controller;

import calculations.CustomerOrderFacade;
import domain.Cash;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "calculator",eager = true)
@RequestScoped
public class CashCalculator {

    @EJB
    private CustomerOrderFacade customerOrderFacade;
    private double amountPaid;
    private Cash change;

    public double getAmountDue() {
        return customerOrderFacade.getCashAmountDue();
    }

    public double getAmountPaid() {
        return this.amountPaid;
    }

    public void setAmountPaid(double amountPaid) {
        this.amountPaid = amountPaid;
    }

    public String pay(){
        change = customerOrderFacade.makePayment(amountPaid);
        return "display_denomination";
    }

    public Cash getChange() {
        return change;
    }

}