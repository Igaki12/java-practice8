
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
		int times_per_unitDistance = 0;
		while (times_per_unitDistance*Additional_permetors_OC < (mileage*1000 - 1500)) {
			times_per_unitDistance += 1;
		}
		int times_per_unitTime = 0;
		while (times_per_unitTime*Additional_perseconds_OC < waiting*60) {
			times_per_unitTime += 1;
		}
		
		fare = Basic_fare_OC + times_per_unitDistance*Additional_fare_OC + times_per_unitTime*Additional_fare_OC;
	    return fare;

	}
	
	public int fare_LargeCar(int mileage,int waiting) {
		int times_per_unitDistance = 0;
		while (times_per_unitDistance*Additional_permetors_LC < (mileage*1000 - 1500)) {
			times_per_unitDistance += 1;
		}
		int times_per_unitTime = 0;
		while (times_per_unitTime*Additional_perseconds_LC < waiting*60) {
			times_per_unitTime += 1;
		}
		
		fare = Basic_fare_LC + times_per_unitDistance*Additional_fare_LC + times_per_unitTime*Additional_fare_LC;
	    return fare;
	}

}
