package cn.edu.nju.soa.data;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Data {
    public static ArrayList<StudentVO> studentVOS = new ArrayList<>();
    static {
        try {
           studentVOS.addAll(Generator.generateData().getStudents().get(0).getStuGrade().get(0).getStudent().stream().map(t -> new StudentVO(t.getStudentBasicInfo(), t.getStudentScores())).collect(Collectors.toList()));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
