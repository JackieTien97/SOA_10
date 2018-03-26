package cn.edu.nju.soa.data;


import cn.edu.nju.soa.model.*;

import javax.xml.datatype.DatatypeConfigurationException;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Generator {
    private final static String path="./data";

    public static StudentList generateData() throws FileNotFoundException {
        File file=new File(path);
        File[] files=file.listFiles();

        List<StudentInfo> stus=new ArrayList<>();

        for (File curStu:files) {
            if(curStu.getName().startsWith(".")){
                continue;
            }
            StudentInfo student=getStudent(curStu);
            if(student!=null){
                stus.add(student);
            }
        }

        StudentList studentList=new StudentList();
        DepartmentStu departmentStu=new DepartmentStu();
        StudentGrade sg=new StudentGrade();
        sg.setStudent(stus);
        sg.setGrade(GradeType.大三);
        departmentStu.setDepartmentId("1250");
        List<StudentGrade> studentGrades = new ArrayList<>();
        studentGrades.add(sg);
        departmentStu.setStuGrade(studentGrades);
        List<DepartmentStu> departmentStus=new ArrayList<>();
        departmentStus.add(departmentStu);
        studentList.setStudents(departmentStus);

        return studentList;
    }

    private static StudentInfo getStudent(File file){
        try{
            BufferedReader br=new BufferedReader(new FileReader(file));
            String line=null;
            ArrayList<String> list=new ArrayList<>();
            while ((line=br.readLine())!=null){
                list.add(line);
            }
            br.close();
            StudentInfo student=new StudentInfo(list);
            return student;
        }catch (IOException ioe){
            ioe.printStackTrace();
            return null;
        } catch (DatatypeConfigurationException e) {
            e.printStackTrace();
            return null;
        }
    }


}
