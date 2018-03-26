package cn.edu.nju.soa.data;

import java.util.ArrayList;

public class StudentVO {
    public String studentId;
    public String name;
    public String gender;
    public String birthDate;
    public String cardId;
    public String inTime;
    public String phoneNumber;
    public boolean state;
    public ArrayList<CourseScore> courseScores;

    public StudentVO(String studentId, String name, String gender, String birthDate, String cardId, String inTime, String phoneNumber, boolean state, ArrayList<CourseScore> courseScores) {
        this.studentId = studentId;
        this.name = name;
        this.gender = gender;
        this.birthDate = birthDate;
        this.cardId = cardId;
        this.inTime = inTime;
        this.phoneNumber = phoneNumber;
        this.state = state;
        this.courseScores = courseScores;
    }
}
