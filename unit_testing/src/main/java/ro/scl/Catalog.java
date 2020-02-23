package ro.scl;

import java.util.*;

public class Catalog {
    private Map<String, List<Integer>> studentsToGrades = new LinkedHashMap<>();

    public void addGrade(String student, int grade) {
        List<Integer> grades;
        //ha tartalmazza a diakot
        if (studentsToGrades.containsKey(student)) {
            grades = studentsToGrades.get(student);
        } else {
            grades = new LinkedList<>();
        }
        grades.add(grade);
        studentsToGrades.put(student, grades);
    }

    public void print() {
        /*for (String key : studentsToGrades.keySet()) {
            List<Integer> grades = studentsToGrades.get(key);
            System.out.println(key + ": " + getGradesAsString(grades));
        }*/

        for (Map.Entry<String,List<Integer>> kv : studentsToGrades.entrySet()) {
            System.out.println(kv.getKey() + ": " + getGradesAsString(kv.getValue()));
        }

    }


    private String getGradesAsString(List<Integer> grades) {
        String result = "";
        if (grades != null) {
            int i = 0;
            for (Integer grade: grades) {
                if (i > 0 ) {
                    result += ", ";
                }
                result = result + grade;
                i++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Catalog catalog = new Catalog();
        catalog.addGrade("Radu",10);
        catalog.addGrade("Radu",8);
        catalog.addGrade("Mihai",10);
        catalog.addGrade("Lorand",10);

        catalog.print();
    }
}
