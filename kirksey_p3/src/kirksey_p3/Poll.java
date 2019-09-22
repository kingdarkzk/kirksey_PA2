package kirksey_p3;
import java.util.Scanner;
public class Poll {

	public static void main(String[] args) {
	Scanner scnr = new Scanner(System.in);
	String[] topics = new String[] {"Video Games", "Chick-fil-a", "Memes", "Anime", "Lo-fi Hip-Hop"};
	int[][] responses = new int[5][10];
	int keepGoing = 1, userCounter = 0, i, j, rating, totalRating, max = 0, maxIndex = 0, min = 0, minIndex = 0;
	double averageRating;
	
	//while loop that structures each user output
	while(keepGoing != 0) {
		System.out.println("Please rate the following topics on a scale of 1-10:\n");
		
		//prompts the user to rate each topic and increments the counters in the responses 2D array
		for(i = 0; i < 5; i++) {
			System.out.print(topics[i] + ": ");
			rating = scnr.nextInt();
			responses[i][rating - 1]++;
		}
		
		//counter is used later to calculate average rating | asks user if they would like to enter another set of values
		userCounter++;
		System.out.print("\nTo quit and view the results of the survey please enter 0, enter any other number to take the survey again: ");
		keepGoing = scnr.nextInt();
		System.out.println();
	}
	
	//beginning of the results
	System.out.println("Survey Results:");
	System.out.println();
	System.out.println("|\tTopic\t\t| 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10 | Average |");	
	
	//loop that prints each topic
	for(i = 0; i < 5; i++) {	
		totalRating = 0;
		
		//formatting
		System.out.println("----------------------------------------------------------------------------");
		System.out.print("|\t" + topics[i] + "\t");
		
		//keeps formatting for the two smaller topic names
		if((i == 2) || (i == 3)) {	
			System.out.print("\t");		
		}
		
		System.out.print("| ");
		
		//loop that prints each value for each topic
		for(j = 0; j < 10; j++) {
			System.out.print(responses[i][j] + " | ");
			totalRating += responses[i][j] * (j + 1);		
		}
		
		//initializing minimum value 
		if(i == 0) {		
			min = totalRating;
		}
		
		//finds max value and topic
		if(max < totalRating) {
			max = totalRating;
			maxIndex = i;
		}
		
		//finds min value and topic
		if(min > totalRating) {		
			min = totalRating;
			minIndex = i;
		}
		
		//calculating and printing the average rating for each topic
		averageRating = (double)totalRating / userCounter;
		System.out.printf("  %.1f   |\n", averageRating);		
	}
	
	//after the table ends the highest and lowest rated topic and values are shown
	System.out.println();
	System.out.println("Highest Rated Topic: \"" + topics[maxIndex] + "\" with the value of " + max);
	System.out.println();
	System.out.println("Lowest Rated Topic: \"" + topics[minIndex] + "\" with the value of " + min);
	
	}

}
