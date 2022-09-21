
public class Coffees {
	//Coffee Objects
			
				private String name;
				private double largePrice;
				private double mediumPrice;
				private double smallPrice;
				
				public String getName() {
					return name;
				}
				public void setName(String name) {
					this.name = name;
				}
				public double getLargePrice() {
					return largePrice;
				}
				public void setLargePrice(double largePrice) {
					this.largePrice = largePrice;
				}
				public double getMediumPrice() {
					return mediumPrice;
				}
				public void setMediumPrice(double mediumPrice) {
					this.mediumPrice = mediumPrice;
				}
				public double getSmallPrice() {
					return smallPrice;
				}
				public void setSmallPrice(double smallPrice) {
					this.smallPrice = smallPrice;
				}
				
				Coffees() 
				//default coffees constructor
				{
					
				}
				Coffees(String name, double largePrice, double mediumPrice, double smallPrice){
					this.name = name;
					this.largePrice = largePrice;
					this.mediumPrice = mediumPrice;
					this.smallPrice = smallPrice;
					
					}

			
}
