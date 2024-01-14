# CS201 Assignment - Part One

## Overview

- **Author:** Kevin Roberts
- **Date:** 01/14/2024
- **Assignment:** CS201 Assignment - Part One

This Java program is a fun way to test your knowledge of U.S. state capitals. It prompts you to enter the capital of each U.S. state, checks your answers, and provides your total score. Additionally, it demonstrates sorting the U.S. states and capitals alphabetically using a bubble sort algorithm.

## How to Use

1. Compile and run the program.
2. The program will display a list of U.S. states and their capitals, sorted alphabetically by state.
3. You will be prompted to enter the capital for each state one by one.
4. Enter your answer.
5. The program will tell you if your answer is correct and keep track of your score.
6. After answering all questions, it will display your total score.

## Program Structure

The program includes:

- `statesAndCapitals`: A two-dimensional array containing U.S. states and capitals.
- `displayArray()`: Shows the current state and capital list.
- `isAnswerCorrect(String userAnswer, String correctAnswer)`: Checks the correctness of your answers.
- `answerStateCapitalQuestions(Scanner userInput)`: Prompts you to answer state capital questions and calculates your score.
- `bubbleSortArrayByCapital(String[][] array)`: Sorts the state and capital list alphabetically by capital using a bubble sort.

## Example Output

When you run the program, it will look something like this:

```
What is the capital of Alabama?
Montgomery
Correct!
What is the capital of Alaska?
Juneau
Correct!
...

You answered 50 out of 50 correctly.
```
