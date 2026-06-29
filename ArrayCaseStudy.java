package src;

public class ArrayCaseStudy {
    public static void main(String[] args) {
        int[] scores = {6, 8, 4, 9, 7, 5, 10, 3, 8, 2};
        
        int totalSum = 0;
        int maxScore = scores[0];
        int minScore = scores[0];
        int passedCount = 0;

        for (int score : scores) {
            totalSum += score;
            
            if (score > maxScore) {
                maxScore = score;
            }
            if (score < minScore) {
                minScore = score;
            }
            if (score >= 7) {
                passedCount++;
            }
        }
        
        double averageScore = (double) totalSum / scores.length;
      
        System.out.println("=== Pre-test Score Analysis Results ===");
        System.out.println("1. Total score of all students: " + totalSum + " points");
        System.out.println("2. Average score: " + averageScore + " points");
        System.out.println("3. Maximum score: " + maxScore + " points");
        System.out.println("4. Minimum score: " + minScore + " points");
        System.out.println("5. Number of students with score >= 7: " + passedCount + " students");
        
        System.out.print("6. List of students who need additional review (score < 5): ");
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] < 5) {
                System.out.print("Student #" + (i + 1) + " (Score: " + scores[i] + ") ");
            }
        }
        System.out.println();
    }
}
