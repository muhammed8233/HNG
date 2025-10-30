package Arrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] gradesArray = {{87, 96, 70}, {68, 87, 90},
                {94, 100, 90}, {100, 81, 82}, {83, 65, 85}, {78, 87, 65},
                {85, 75, 83}, {91, 94, 100}, {76, 72, 84}, {87, 93, 73}};

        MultipleArrayGradeBook multiple = new MultipleArrayGradeBook("CS101 Introduction to Java Programming", gradesArray);
        System.out.printf("Welcome to the grade book for%n%s%n%n", multiple.getCourseName());
        multiple.processGrades();
        output();


       // System.out.println(Arrays.deepToString(output(board)));

    }
        public static  void output () {
            String[][] boards = new String[6][6];
            for (int row = 0; row < boards.length; row++) {
                for (int j = 0; j < boards[row].length; j++) {
                    System.out.printf("%s ", boards[row][row]= "X");;
                    System.out.printf("%s ", boards[j][j]= "O");;
                }
                System.out.println();
                //System.out.println(Arrays.deepToString(boards));
            }
            //System.out.print(Arrays.deepToString(boards));
           // return boards;
        }

    }

