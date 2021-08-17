/********************************************************** 
Program Name: Stocks4You.java
Programmer's Name: Bethany Hampton
Program Description: This application will allow you to add and delete stocks, and see the profit or loss you would make.
***********************************************************/


/**
 *
 * @author hambetn
 */
public class Stock 
{ 
    private String companyName;
    private double numberOfShares;
    private double purchasePrice;
    private double currentPrice;
    
    public Stock()
    {
        companyName = "N/A";
        numberOfShares = 0.0;
        purchasePrice = 0.0;
        currentPrice = 0.0;
    }
    
    public Stock(String companyName, double numberOfShares, double purchasePrice, double currentPrice)
    {
        this.setCompanyName(companyName);
        this.setNumberOfShares(numberOfShares);
        this.setPurchasePrice(purchasePrice);
        this.setCurrentPrice(currentPrice);
    }
    //behaviors
    public double getProfitLoss(){
        return numberOfShares *(currentPrice - purchasePrice);
    }

    @Override
    public String toString(){
        return companyName + ": " + this.numberOfShares + " shares";
    }
    
    //getters and setters
    public String getCompanyName(){
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName= companyName;
    }

    public double getNumberOfShares() {
        return numberOfShares;
    }

    public void setNumberOfShares(double numberOfShares) {
        if(numberOfShares>0)
            this.numberOfShares = numberOfShares;
        else
            this.numberOfShares = 0;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(double purchasePrice) {
        if(purchasePrice>0)
            this.purchasePrice = purchasePrice;
        else
            this.purchasePrice = 0;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        if(currentPrice>0)
            this.currentPrice = currentPrice;
        else
            this.currentPrice = 0;
    }
}
