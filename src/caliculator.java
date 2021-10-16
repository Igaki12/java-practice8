
public class caliculator {
	int fare = 0;
	int Basic_fare_OC = 690;
	int Additional_permetors_OC = 272;
	int Additional_fare_OC = 80;
	int Additional_perseconds_OC = 100;
	int Basic_fare_LC = 760;
	int Additional_permetors_LC = 231;
	int Additional_fare_LC = 90;
	int Additional_perseconds_LC = 85;
	
	public int fare_OrdinaryCar(int mileage,int waiting) {
		fare = Basic_fare_OC + (mileage*1000 - 1500)*Additional_fare_OC/Additional_permetors_OC + waiting*60*Additional_fare_OC/Additional_perseconds_OC;
	    return fare;
	}
	public int fare_LargeCar(int mileage,int waiting) {
		fare = Basic_fare_LC + (mileage*1000 - 1500)*Additional_fare_LC/Additional_permetors_LC + waiting*60*Additional_fare_LC/Additional_perseconds_LC;
		return fare;
	}

}
