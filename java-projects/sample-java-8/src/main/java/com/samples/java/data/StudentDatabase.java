package com.samples.java.data;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class StudentDatabase {

    public static Supplier<Student> studentSupplier = () -> {
        return new Student("Arun", "M", 4.5, 3, Arrays.asList("driving", "cricket"));
    };
    public static List<Student> getAll() {
        Student s1 = new Student("Prince", "M", 3.8, 1, Arrays.asList("music", "running"));
        Student s2 = new Student("Anshul", "M", 4.0, 2, Arrays.asList("music", "running"));
        Student s3 = new Student("Pradeep", "M", 3.7, 2, Arrays.asList("photography", "reading"));

        return Arrays.asList(s1, s2, s3);
    }
}
