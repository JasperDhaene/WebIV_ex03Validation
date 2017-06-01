package domain;

public class Numbers {
    
    /* amount
    	maximum is 5000.50 (grens inbegrepen)
	wordt steeds met twee cijfers na de komma afgebeeld
	initiële waarde = 2000.856
     */
    private double amount;
   
    /* number1
                moet ingevuld zijn
                moet liggen tussen 1 en 11000 (grenzen inbegrepen)
    	initiële waarde = 2000 (wordt afgebeeld als 2.000)
     */
        

    private Integer number1;
  
    /*     
    number2 
        moet ingevuld zijn
        initiële waarde = 1234566
     */
    
    private Integer number2;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Integer getNumber1() {
        return number1;
    }

    public void setNumber1(Integer number1) {
        this.number1 = number1;
    }
    
    public Integer getNumber2() {
        return number2;
    }

    public void setNumber2(Integer number2) {
        this.number2 = number2;
    }
}
