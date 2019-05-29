package convert;

public class Converter {
	
	 double number;
	 
     public Converter() {
    	 
     }
     
     Converter(double number){
   	  this.number = number;
     }
     public  double toPounds( double number) {
   	  return number * 2.205;
     }
     public double toKilograms( double number) {
   	  return number * 0.4536;
     }
     public  double toInches( double number) {
   	  return number * 0.393701;
     }
     public  double toCentimetres( double number) {
   	  return number * 2.54;
     }
     public  double toFahrenheit( double number) {
   	  return number * 33.8 ;
     }
     public  double toCelsius( double number) {
   	  return (number - 32) / 1.8 ;
     }
}

