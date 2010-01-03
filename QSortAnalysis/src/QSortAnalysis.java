
public class QSortAnalysis {
	public static void main(String[] args) {
		QSortAnalysis qsa = new QSortAnalysis();
		qsa.run();
	}
	
	private int numSubjects;
	private int[] shuffle;
		//- array to contain column numbers - this is what gets shuffled
		//- first half is CEO, last half is Psycho
	private int[][] surveyData;
		//- 2d array of data - which CQ vs. data
		// This data does *not* get changed
	private float[][] Djs;
		//- 2d array - which CQ vs. accumulated list of Djs
	    //^This would contain data from every test that was carried out
	

	public void run()
	{
		//init shuffle
	}
	
	private void readSheet()
	{
	    //initial reading & parse to data
	    //determine numSubjects
	    //initialize arrays
	}
	
	private void writeSheet()
	{
		
	}
	
	private void randomize()
	{
	    //randomly distribute columns of data
	    //this method goes in a for loop somewhere
	}
	
	private void doOutcomes(int sampleSize)
	{
	    //does yea many random assignments and calculates
	    //calls computeDj() and randomize()		
	}
	
	private void everyPossibleAssignment()
	{
	    //instead of random, it does every assignment 
	    //ensuring one and only one of every possible outcome
	    //scrambles and then calls computeDj()
	}
	
	private void computeDj(CQ #, startingColumn, endingColumn)
	{
	    //computes Dj for given CQ number
	    //put in a for loop
	}
	
	private void tallyPvalue(CQ #, pvalue, Ceo or psycho?)
	{
		
	}
}
