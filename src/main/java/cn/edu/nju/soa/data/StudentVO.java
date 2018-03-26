package cn.edu.nju.soa.data;

import cn.edu.nju.soa.model.StudentBasicInformation;
import cn.edu.nju.soa.model.StudentScore;

public class StudentVO {
    public StudentBasicInformation studentBasicInformation;
    public StudentScore studentScore;

    public StudentVO(StudentBasicInformation studentBasicInformation, StudentScore studentScore) {
        this.studentBasicInformation = studentBasicInformation;
        this.studentScore = studentScore;
    }
}
