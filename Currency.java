package currencyConverter;
import java.util.*;
public class Currency
{private String name,shortName;
 private HashMap<String,Double> exchangeValues=new HashMap<String,Double>();
 public Currency(String nameValue,String shortNameValue)
 {this.name=nameValue;
  this.shortName=shortNameValue;
 }
 public String getName()
 {return this.name;}
 public void setName()
 {this.name=name;}
 public String getShortName()
 {return this.shortName;}
 public void setShortName()
 {this.shortName=shortName;}
 public HashMap<String,Double> getExchangeValues()
 {return this.exchangeValues;}
 public void setExchangeValues()
 {this.exchangeValues=exchangeValues;}
 public void defaultValues()
 {String currency=this.name;
  switch(currency)
        {case "US Dollar":this.exchangeValues.put("USD",1.00);
                          this.exchangeValues.put("EUR",0.97);
                          this.exchangeValues.put("JPY",140.35);
                          this.exchangeValues.put("GBP",0.84);
                          this.exchangeValues.put("INR",81.62);
                          this.exchangeValues.put("AED",3.67);
                          break;
         case "Euro":this.exchangeValues.put("USD",1.03);
                     this.exchangeValues.put("EUR",1.00);
                     this.exchangeValues.put("JPY",144.90);
                     this.exchangeValues.put("GBP",0.87);
                     this.exchangeValues.put("INR",84.26);
                     this.exchangeValues.put("AED",3.79);
                     break;
         case "Japanese Yen":this.exchangeValues.put("USD",0.0071);
                             this.exchangeValues.put("EUR",0.0069);
                             this.exchangeValues.put("JPY",1.00);
                             this.exchangeValues.put("GBP",0.006);
                             this.exchangeValues.put("INR",0.58);
                             this.exchangeValues.put("AED",0.026);
                             break;
         case "Pound Stirling":this.exchangeValues.put("USD",1.19);
                               this.exchangeValues.put("EUR",1.15);
                               this.exchangeValues.put("JPY",166.79);
                               this.exchangeValues.put("GBP",1.00);
                               this.exchangeValues.put("INR",96.99);
                               this.exchangeValues.put("AED",4.36);
                               break;
         case "Indian Rupee":this.exchangeValues.put("USD",0.012);
                             this.exchangeValues.put("EUR",0.012);
                             this.exchangeValues.put("JPY",1.72);
                             this.exchangeValues.put("GBP",0.01);
                             this.exchangeValues.put("INR",1.00);
                             this.exchangeValues.put("AED",0.045);
                             break;
         case "Emirati Dirham":this.exchangeValues.put("USD",0.27);
                               this.exchangeValues.put("EUR",0.26);
                               this.exchangeValues.put("JPY",38.21);
                               this.exchangeValues.put("GBP",0.23);
                               this.exchangeValues.put("INR",22.22);
                               this.exchangeValues.put("AED",1.00);
                               break;
        }
    } 
 public static ArrayList<Currency> init()
 {ArrayList<Currency> currencies=new ArrayList<Currency>();
  currencies.add(new Currency("US Dollar", "USD"));
  currencies.add(new Currency("Euro", "EUR"));
  currencies.add(new Currency("Japanese Yen", "JPY"));
  currencies.add(new Currency("Pound Stirling", "GBP"));
  currencies.add(new Currency("Indian Rupee", "INR"));
  currencies.add(new Currency("Emirati Dirham", "AED"));
  for(Integer i=0;i<currencies.size();i++)
      currencies.get(i).defaultValues();
  return currencies;
 }
 public static Double convert(Double amount,Double exchangeValue)
 {Double price;
  price=amount*exchangeValue;
  price=Math.round(price*100d)/100d;
  return price;
 }
}