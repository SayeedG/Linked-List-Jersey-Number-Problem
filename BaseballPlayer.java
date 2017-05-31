/**
 * 
 * @author sayeedgulmahamad
 *
 */
public class BaseballPlayer{ //sets the baseball player's information
	private int BaseballplayerNumber;
	private String BaseballlastName;
	private String BaseballfirstName;
	private float battingAverage;
  
	/**
	 * 
	 * @param number
	 * @param last
	 * @param first
	 * @param batavg
	 */
	public BaseballPlayer(int number, String last, String first,  float batavg){
		BaseballlastName = last;
		BaseballfirstName = first;
		battingAverage = batavg;
		BaseballplayerNumber = number;
	}
	
	/**
	 * 
	 * @return The last name of the baseball player
	 */
	public String getLastName(){ //method to retrieve the last name of the baseball player
		return BaseballlastName.toLowerCase();
	}
		public int compareTo(BaseballPlayer b1){ //compares the last name of one baseball player to the other
		int value = getLastName().compareTo(b1.getLastName());
		return value;
	}
	
	public String getEverything(){ //returns all of the given information about the baseball player
		String all = BaseballplayerNumber+","+ BaseballlastName+","+BaseballfirstName+","+battingAverage;
		return all;
	}
	
	public int getTheNumber(){ //retrieves the player's number
		return BaseballplayerNumber;
	}
}

