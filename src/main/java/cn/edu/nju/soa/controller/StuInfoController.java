package cn.edu.nju.soa.controller;


import cn.edu.nju.soa.model.StudentInfo;
import cn.edu.nju.soa.webservice.*;
import org.springframework.stereotype.Controller;

import javax.xml.ws.Holder;

@Controller
public class StuInfoController implements StuInfoInterface{
    @Override
    public void addInfo(Holder<StudentInfo> parameters) throws StudentIdFault, BasicMessageFault, CourseIdFault {

    }

    @Override
    public void modifyInfo(Holder<StudentInfo> parameters) throws StudentIdFault, BasicMessageFault, CourseIdFault {

    }

    @Override
    public StudentInfo getInfo(String parameters) throws IdNotFindFault {
        return null;
    }

    @Override
    public StudentInfo delInfo(String parameters) throws StudentIdFault, BasicMessageFault, CourseIdFault {
        return null;
    }
}
