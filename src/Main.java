/**
 * Kevin Roberts
 * 01/14/2024
 * CS201 Assignment - Part One
 * This program is designed to test a user's knowledge of U.S. state capitals. It prompts the user to enter the capital
 * of a U.S. state, checks if the input is correct, and then provides feedback on the total number of correct answers.
 * The program utilizes a two-dimensional array to store the list of 50 U.S. states and their corresponding capitals.
 * The array is stored in alphabetical order based on U.S. state. After running the program and displaying the array
 * in alphabetical order based on U.S. states, the array is then sorted in alphabetical order based on US capital
 * cities using a bubble sort algorithm.
 */

import java.util.*;

public class Main {
    // 2D array for capitals and their respective states
    static String[][] statesAndCapitals = {
            {"Alabama", "Montgomery"},
            {"Alaska", "Juneau"},
            {"Arizona", "Phoenix"},
            {"Arkansas", "Little Rock"},
            {"California", "Sacramento"},
            {"Colorado", "Denver"},
            {"Connecticut", "Hartford"},
            {"Delaware", "Dover"},
            {"Florida", "Tallahassee"},
            {"Georgia", "Atlanta"},
            {"Hawaii", "Honolulu"},
            {"Idaho", "Boise"},
            {"Illinois", "Springfield"},
            {"Indiana", "Indianapolis"},
            {"Iowa", "Des Moines"},
            {"Kansas", "Topeka"},
            {"Kentucky", "Frankfort"},
            {"Louisiana", "Baton Rouge"},
            {"Maine", "Augusta"},
            {"Maryland", "Annapolis"},
            {"Massachusetts", "Boston"},
            {"Michigan", "Lansing"},
            {"Minnesota", "Saint Paul"},
            {"Mississippi", "Jackson"},
            {"Missouri", "Jefferson City"},
            {"Montana", "Helena"},
            {"Nebraska", "Lincoln"},
            {"Nevada", "Carson City"},
            {"New Hampshire", "Concord"},
            {"New Jersey", "Trenton"},
            {"New Mexico", "Santa Fe"},
            {"New York", "Albany"},
            {"North Carolina", "Raleigh"},
            {"North Dakota", "Bismarck"},
            {"Ohio", "Columbus"},
            {"Oklahoma", "Oklahoma City"},
            {"Oregon", "Salem"},
            {"Pennsylvania", "Harrisburg"},
            {"Rhode Island", "Providence"},
            {"South Carolina", "Columbia"},
            {"South Dakota", "Pierre"},
            {"Tennessee", "Nashville"},
            {"Texas", "Austin"},
            {"Utah", "Salt Lake City"},
            {"Vermont", "Montpelier"},
            {"Virginia", "Richmond"},
            {"Washington", "Olympia"},
            {"West Virginia", "Charleston"},
            {"Wisconsin", "Madison"},
            {"Wyoming", "Cheyenne"},
    };

    private static final int STATE_INDEX_POS = 0; // 2D index position for states
    private static final int CAPITAL_INDEX_POS = 1; // 2D index position for capitals

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in); // Initializing userInput scanner

        displayArray();
        bubbleSortArrayByCapital(statesAndCapitals);
        answerStateCapitalQuestions(userInput);

        userInput.close(); // Closing userInput Scanner
    }

    // Displays the current contents of the statesAndCapitals array
    private static void displayArray() {
        for(String[] statesAndCapital : statesAndCapitals) {
            System.out.println(Arrays.toString(statesAndCapital));
        }
    }

    // Checks to see if answer is correct
    private static boolean isAnswerCorrect(String userAnswer, String correctAnswer) {
        return userAnswer.equalsIgnoreCase(correctAnswer);
    }

    // Prompts the user to answer which capital city belongs to each state
    private static void answerStateCapitalQuestions(Scanner userInput) {
        int score = 0;

        for (String[] statesAndCapital : statesAndCapitals) {
            // Setting variables for state and capital indices.
            String state = statesAndCapital[STATE_INDEX_POS];
            String capital = statesAndCapital[CAPITAL_INDEX_POS];

            // Get user answer
            System.out.println("What is the capital of " + state + "?");
            String answer = userInput.nextLine();

            // If correct, add to the score. Also print whether the answer was correct or not
            if (isAnswerCorrect(answer, capital)) {
                score++;
                System.out.println("Correct!");
            } else
                System.out.println("Incorrect. The correct capital is " + statesAndCapital[CAPITAL_INDEX_POS] + ".");
        }

        // Print the score
        System.out.println("You answered " + score + " out of " + statesAndCapitals.length + " correctly.");
    }

    // Bubble sorting the statesAndCapitals array by capital city
    private static void bubbleSortArrayByCapital(String[][] array) {
        boolean swapped;
        int length = array.length;

        for(int i = 0; i < length - 1; i++) {
            swapped = false;
            for(int j = 0; j < length - i - 1; j++) {
                // Check to see if positions are in alphabetical order
                if(array[j][CAPITAL_INDEX_POS].compareTo(array[j + 1][CAPITAL_INDEX_POS]) > 0) {
                    // Swap elements
                    String[] temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no two elements were swapped in the inner loop, then the array is already sorted and can safely exit
            if(!swapped)
                break;
        }
    }
}