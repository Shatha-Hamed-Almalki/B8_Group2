


public class Payment {
    //payment info
    String CardNum;  
    String NameOnCard;
    String  ExpiryDate;
    int  CVV;
    
    
    //constructor
    public Payment(String CardNum, String NameOnCard, String ExpiryDate, int CVV) {
        this.CardNum = CardNum;
        this.NameOnCard = NameOnCard;
        this.ExpiryDate = ExpiryDate;
        this.CVV = CVV;
    }
  
    
    //Getters and setters
    public String getCardNum() {
        return CardNum;
    }

    public String getNameOnCard() {
        return NameOnCard;
    }

    public String getExpiryDate() {
        return ExpiryDate;
    }

    public int getCVV() {
        return CVV;
    }

    public void setCardNum(String CardNum) {
        this.CardNum = CardNum;
    }

    public void setNameOnCard(String NameOnCard) {
        this.NameOnCard = NameOnCard;
    }

    public void setExpiryDate(String ExpiryDate) {
        this.ExpiryDate = ExpiryDate;
    }

    public void setCVV(int CVV) {
        this.CVV = CVV;
    }

}
