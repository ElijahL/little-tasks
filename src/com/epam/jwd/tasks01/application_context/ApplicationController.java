package com.epam.jwd.tasks01.application_context;

import java.text.MessageFormat;
import java.util.Calendar;

public class ApplicationController {
    public static void start() {
        try {
            String sixthAnswer = sixthTaskAnswer();
            String seventhAnswer = seventhTaskAnswer(1, 2, 2, 1);
            String answer = MessageFormat.format("1) The last digit of the squared number is {0}.\n" +
                            "2) There are {1} days in May of 1997.\n" +
                            "3) The area of the inscribed square is {2}. Areas are differ 2 times.\n" +
                            "4) {3}\n" +
                            "5) {4}\n" +
                            "6) {5}\n" +
                            "7) {6}\n" +
                            "8) F(x) = {7}\n" +
                            "9) Perimeter:  {8}. Area: {9}.\n",
                    Solution.firstTask(5),
                    Solution.secondTask(5, 1997),
                    Solution.thirdTask(1.6),
                    Solution.fourthTask(1, 2, 3, 4),
                    Solution.fifthTask(6),
                    sixthAnswer,
                    seventhAnswer,
                    Solution.eightsTask(2.99),
                    Solution.ninthTask(5)[0], Solution.ninthTask(5)[1]);
            double[][] tenthTask = Solution.tenthTask(.0, 1.0, 0.1);
            StringBuilder ans = new StringBuilder();
            for (double[] doubles : tenthTask) {
                ans.append(doubles[0]).append("\t").append(doubles[1]).append("\n");
            }
            String tenthTaskAnswer = ans.toString();
            System.out.println(answer);
            System.out.println(tenthTaskAnswer);
        } catch (IllegalArgumentException ex) {
            ex.printStackTrace();
        }
    }

    private static String sixthTaskAnswer() {
        Calendar result = Solution.sixthTask(1678);
        return MessageFormat.format("Hours: {0} Minutes: {1} Seconds: {2}",
                result.get(Calendar.HOUR),
                result.get(Calendar.MINUTE),
                result.get(Calendar.SECOND));
    }

    private static String seventhTaskAnswer(double x1, double y1, double x2, double y2) {
        int result = Solution.seventhTask(x1, y1, x2, y2);
        if(result != 0){
            return "Dot No." + result + " is closer to zero.";
        }
        return "They are at the same distance.";
    }
}
