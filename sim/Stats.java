package skittles.sim;

import java.util.List;
import java.util.Vector;

public class Stats {
	/** This variable will filter the information printed based on player index.
	 * 		if the vector contains -1, all information will be printed
	 * 		if the vector contains one or more index values that are not -1,
	 * 			then for certain types of data, only the data concerning the specified
	 * 			index values will be printed (this way if you know your player's index value
	 * 			based on the GameConfig file you can only print information about how your 
	 * 			player is performing) */
	public static Vector<Integer> playerFilter = new Vector<Integer>(0, 1);
	
	/** The happiness values for all the skittles
	 * 		same as original simulator
	 * 
	 * 		not altered when filtering by player */
	public static boolean happinessDistribution = true;
	
	/** The average happiness distribution.  The happiness values for all skittles
	 * 	are averaged together.  This is useful for large numbers of skittles to get an idea
	 * 	of how 'lucky' a player is with their happiness values.
	 * 
	 * 		not altered when filtering by player */
	public static boolean averageHappiness = true;

	/** The original skittles portfolio for all players
	 * 		same as original simulator
	 * 
	 *  	not altered when filtering by player */
	public static boolean skittlesDistribution = true;

	/**  */
	public static boolean noTradePotentialScore = true;
	/** */
	public static boolean maxHoardPotentialScore = true;
	/** */
	public static boolean consumption = true;
	/** */
	public static boolean allAcceptedTrades = true;
	/** */
	public static boolean allOffers = true;
	/** */
	public static boolean netTrade = true; 
	/** */
	public static boolean rawScore = true;
	/** */
	public static boolean othersAvgScore = true;
	/** */
	public static boolean finalScore = true;
	/** */
	public static boolean rawScoreRank = true;
	/** */
	public static boolean finalScoreRank = true;
}
