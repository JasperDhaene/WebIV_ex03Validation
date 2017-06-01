package domain;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Range;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.format.annotation.NumberFormat;
import validator.EvenNumber;

public class Numbers {
    
    /* amount
    	maximum is 5000.50 (grens inbegrepen)
	wordt steeds met twee cijfers na de komma afgebeeld
	initiële waarde = 2000.856
     */
    
    @DecimalMax("5000.50")
    @NumberFormat(pattern="#,##0.00")
    private double amount;
   
    /* number1
                moet ingevuld zijn
                moet liggen tussen 1 en 11000 (grenzen inbegrepen)
    	initiële waarde = 2000 (wordt afgebeeld als 2.000)
     */
        
    @NotNull
    @Range(min = 1, max = 11000)
    @NumberFormat(pattern="#,##0")
    @Value("2000")
    private Integer number1;
  
    /*     
    number2 
        moet ingevuld zijn
        initiële waarde = 1234566
     */
    @NotNull
    @Value("1234566")
    @EvenNumber
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
