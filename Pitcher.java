/**
 * 
 * @author sayeedgulmahamad
 *
 */
public class Pitcher extends BaseballPlayer{ //Extends BaseballPlayer so the information needed can be retrieved
private float ERA;
	
/**
 * 
 * @param number
 * @param last
 * @param first
 * @param batavg
 * @param ERA
 */
public Pitcher(int number, String last, String first, float batavg, float ERA) {
		super(number, last, first, batavg);
		this.ERA = ERA;
		
	}

public String getEverything(){  //returns all of the given information about the baseball player plus the new data; Earned Run Average
	String everything = super.getEverything()+","+ERA; //Adds the Earned Run Average ONLY for the Pitcher since the ERA is only applicable to Pitchers
	return everything;
}
}