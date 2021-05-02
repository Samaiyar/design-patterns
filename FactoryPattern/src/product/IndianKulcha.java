package product;

public class IndianKulcha extends Food {

	public IndianKulcha() {
		foodName = "Kulcha";
		foodDescription = "It is north India food";
		cost=30.00;
	}
	
	
	@Override
	public String toString() {
		return "Food Name: "+foodName + " Description: " +foodDescription;
	}
}
