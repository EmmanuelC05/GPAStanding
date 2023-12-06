public class GPA {
    public static String checkStanding(double gpa) {
        if (gpa < 1.7) return "Needs Help";
        else if (gpa > 1.7 || gpa < 3.0) return "Good Standing";
        else return "Very Good Standing";
    }
}