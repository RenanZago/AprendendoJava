import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(73);
        a.add(67);
        a.add(38);
        a.add(33);

        System.out.println(gradingStudents(a));
    }

    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> newGrades = new ArrayList<>();
        for (Integer grade : grades) {
            if (grade < 38) {
                newGrades.add(grade);
            } else {
                for (int i = 0; i < 100; i++) {
                    if ((i % 5 == 0) && (i > grade) && (i - grade < 3)) {
                        newGrades.add(i);
                    }

                }
            }
        }
        return newGrades;
    }
}