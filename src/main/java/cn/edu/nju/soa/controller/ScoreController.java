package cn.edu.nju.soa.controller;

import cn.edu.nju.soa.data.Data;
import cn.edu.nju.soa.model.*;
import cn.edu.nju.soa.webservice.*;
import org.springframework.stereotype.Controller;

import javax.xml.ws.Holder;
import java.util.ArrayList;
import java.util.List;


@Controller
public class ScoreController implements StuScoreInterface {

    @Override
    public void modify(Holder<CourseScoreList> parameters) throws CourseIdFault, StudentIdFault, ScoreUpdateFault, ScoreTypeFault {

        CourseScoreList courseScoreList = parameters.value;
        String studentId = parameters.value.getCourseScore().get(0).getScore().get(0).getSchoolNum();

        ArrayList<StudentVO> studentVO = Data.studentVOS;

        List<ScoreDetailType> scoreDetail = new ArrayList<>();
        ScoreDetailType scoreDetailType = new ScoreDetailType();
        scoreDetailType.setSemester(Semester.大一第一学期);
        scoreDetailType.setScoreList(courseScoreList);
        scoreDetail.add(scoreDetailType);

        studentVO.forEach(student -> {
            if (student.getStudentBasicInformation().getSid().equals(studentId)) {
                StudentScore studentScore = new StudentScore();
                studentScore.setScoreDetail(scoreDetail);
                student.setStudentScore(studentScore);
            }
        });
    }

    @Override
    public void add(Holder<CourseScoreList> parameters) throws CourseIdFault, StudentIdFault, ScoreUpdateFault, ScoreTypeFault {
        CourseScoreList courseScoreList = parameters.value;
        ArrayList<StudentVO> studentVO = Data.studentVOS;

        List<ScoreDetailType> scoreDetail = new ArrayList<>();
        ScoreDetailType scoreDetailType = new ScoreDetailType();
        scoreDetailType.setSemester(Semester.大一第一学期);
        scoreDetailType.setScoreList(courseScoreList);
        scoreDetail.add(scoreDetailType);

        StudentScore studentScore = new StudentScore();
        studentScore.setScoreDetail(scoreDetail);

        StudentVO studentVO1 = new StudentVO();
        studentVO1.setStudentScore(studentScore);
        studentVO.add(studentVO1);
    }

    @Override
    public CourseScoreList get(String parameters) throws IdNotFindFault {

        String studentId = parameters;

        ArrayList<StudentVO> studentVO = Data.studentVOS;

        CourseScoreList courseScoreList = new CourseScoreList();
        for (int i = 0; i < studentVO.size(); i++) {
            StudentVO studentVO1 = new StudentVO();
            if (studentVO1.getStudentBasicInformation().getSid().equals(studentId)) {
                courseScoreList = studentVO1.getStudentScore().getScoreDetail().get(0).getScoreList();
            }
        }
        return courseScoreList;
    }

    @Override
    public void delete(Holder<CourseScoreList> parameters) throws CourseIdFault, StudentIdFault, ScoreUpdateFault, ScoreTypeFault {

        String studentId = parameters.value.getCourseScore().get(0).getScore().get(0).getSchoolNum();

        ArrayList<StudentVO> studentVO = Data.studentVOS;

        studentVO.forEach(student -> {
            if (student.getStudentBasicInformation().getSid().equals(studentId)) {
                student = null;
            }
        });
    }
}
