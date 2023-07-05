package Questions;

import java.util.Stack;

public class CelebrityProblem {
    public static void main(String[] args) {
        int[][] matrix = { { 0, 1, 0 }, { 0, 0, 0 }, { 0, 1, 0 } };
        int celeb = findCeleb(matrix);
        System.out.println(celeb);

        int[][] matrix1 = { { 1, 0 }, { 0, 1 } };
        celeb = findCeleb(matrix1);
        System.out.println(celeb);

    }

    public static int findCeleb(int[][] array) {
        Stack<Integer> people = new Stack<Integer>();
        for (int i = 0; i < array.length; i++) {
            people.push(i);
        }

        // finding the potential celebrity by checking the two top mosts
        while (people.size() >= 2) {
            int idxA = people.pop();
            int idxB = people.pop();

            // check either A knows B -> A will not be celeb
            // or B knows A -> B not celeb
            // check any one

            if (array[idxA][idxB] == 1)
                people.push(idxB); // A knows B so A not celeb
            else
                people.push(idxA);
        }
        int potentialCeleb = people.pop();
        // Now we will be left with 1 element in stack which is the potential celeb.
        // But we havent check all the conditions.

        // Check all the people know the celeb
        // that is people[potentialCeleb][potentialCeleb] == 0
        // and people[rows][potentialCeleb] == 1

        // Check celeb dont know anyone
        // people[potentialCeleb][cols] == 0s

        for (int row = 0; row < array.length; row++) {
            if (row != potentialCeleb && array[row][potentialCeleb] != 1)
                return -1;
        }

        for (int col = 0; col < array[0].length; col++) {
            if (col != potentialCeleb && array[potentialCeleb][col] != 0)
                return -1;
        }

        return potentialCeleb;
    }
}
