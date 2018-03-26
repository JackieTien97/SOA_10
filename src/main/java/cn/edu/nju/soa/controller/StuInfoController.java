package cn.edu.nju.soa.controller;


import cn.edu.nju.soa.data.Data;
import cn.edu.nju.soa.data.StudentVO;
import cn.edu.nju.soa.model.StudentBasicInformation;
import cn.edu.nju.soa.model.StudentInfo;
import cn.edu.nju.soa.model.StudentScore;
import cn.edu.nju.soa.webservice.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.xml.ws.Holder;

@Controller
@RequestMapping("/stuinfo")
public class StuInfoController implements StuInfoInterface{


    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @Override
    public void addInfo(Holder<StudentInfo> parameters) throws StudentIdFault, BasicMessageFault, CourseIdFault {
        StudentBasicInformation studentBasicInformation = parameters.value.getStudentBasicInfo();
        StudentScore studentScore =  parameters.value.getStudentScores();
        Data.studentVOS.add(new StudentVO(studentBasicInformation, studentScore));
    }

    @RequestMapping(value = "/modify", method = RequestMethod.POST)
    @Override
    public void modifyInfo(Holder<StudentInfo> parameters) throws StudentIdFault, BasicMessageFault, CourseIdFault {
        StudentBasicInformation studentBasicInformation = parameters.value.getStudentBasicInfo();
        StudentScore studentScore =  parameters.value.getStudentScores();
        for (int i = 0; i < Data.studentVOS.size(); i++) {
            if (Data.studentVOS.get(i).studentBasicInformation.getSid().equals(studentBasicInformation.getSid())) {
                Data.studentVOS.get(i).studentBasicInformation = studentBasicInformation;
                Data.studentVOS.get(i).studentScore = studentScore;
            }
        }
    }

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @Override
    public StudentInfo getInfo(String parameters) throws IdNotFindFault {
        StudentInfo studentInfo = null;
        for (int i = 0; i < Data.studentVOS.size(); i++) {
            if (Data.studentVOS.get(i).studentBasicInformation.getSid().equals(parameters)) {
                studentInfo = new StudentInfo();
                studentInfo.setStudentBasicInfo(Data.studentVOS.get(i).studentBasicInformation);
                studentInfo.setStudentScores(Data.studentVOS.get(i).studentScore);
            }
        }
        return studentInfo;
    }

    @RequestMapping(value = "/del", method = RequestMethod.POST)
    @Override
    public StudentInfo delInfo(String parameters) throws StudentIdFault, BasicMessageFault, CourseIdFault {

        StudentInfo studentInfo = null;
        for (int i = 0; i < Data.studentVOS.size(); i++) {
            if (Data.studentVOS.get(i).studentBasicInformation.getSid().equals(parameters)) {
                studentInfo = new StudentInfo();
                studentInfo.setStudentBasicInfo(Data.studentVOS.get(i).studentBasicInformation);
                studentInfo.setStudentScores(Data.studentVOS.get(i).studentScore);
                Data.studentVOS.remove(i);
            }
        }
        return studentInfo;
    }
}
