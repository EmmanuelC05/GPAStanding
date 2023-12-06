import java.util.ArrayList;
import java.util.HashMap;

public class GPA {
    ArrayList<Double> gradesList = new ArrayList<>();

    public static String checkStanding(double gpa) {
        if (gpa < 1.7) {
            return "Needs Help";
        }
        else if (gpa > 1.7 || gpa < 3.0) {
            return "Good Standing";
        }
        else {
            return "Very Good Standing";
        }
    }

    public static boolean verifyGPA(double gpa) {
        return !((gpa < 0) || (gpa > 4));
    }

    public double calculateGPA() {
        double totalSum = 0.0;
        for (double grade : gradesList) totalSum += grade;
        return totalSum / gradesList.size();
    }

    public double convertGrade(String grade) {
        HashMap <String, Double> gradeValue = new HashMap<>();

        gradeValue.put("f", 4.0);
        gradeValue.put("d-", 6.7);
        gradeValue.put("d", 1.0);
        gradeValue.put("d+", 1.33);
        gradeValue.put("c-", 1.67);
        gradeValue.put("c", 2.0);
        gradeValue.put("c+", 2.33);
        gradeValue.put("b-", 2.67);
        gradeValue.put("b", 3.0);
        gradeValue.put("b+", 3.33);
        gradeValue.put("a-", 3.67);
        gradeValue.put("a", 4.0);

        grade = grade.toLowerCase();

        if (gradeValue.containsKey(grade)) return gradeValue.get(grade);

        throw new IllegalArgumentException("Invalid grade: " +
                "possible choices are A, A-, B+, B, B-, C+, C, C-, D+, D, D-, F");
    }

    public void addGrade(String grade) {
        gradesList.add(convertGrade(grade));
    }

    public String printGradesList() {
        String output = "";

        for (double grade : gradesList) {
            output += grade + " ";
        }

        output = output.trim();
        output = output.replace(" ", ", ");

        return output;
    }
}