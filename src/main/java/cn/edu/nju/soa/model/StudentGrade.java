//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2018.03.06 时间 03:21:28 PM CST 
//


package cn.edu.nju.soa.model;

import javax.xml.bind.annotation.*;
import java.util.List;


/**
 * <p>学生年级类型 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="学生年级类型">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="学生" type="{http://jw.nju.edu.cn/schema}学生信息类型"/>
 *       &lt;/sequence>
 *       &lt;attribute name="年级" type="{http://jw.nju.edu.cn/schema}年级类型" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "学生年级类型", namespace = Namespace.JW_URI, propOrder = {
    "student", "grade"
})
public class StudentGrade {

    @XmlElements(value = {@XmlElement(name = "学生", namespace = Namespace.JW_URI)})
    protected List<StudentInfo> student;
    @XmlAttribute(name="年级")
    protected GradeType grade;

    public List<StudentInfo> getStudent() {
        return student;
    }

    public void setStudent(List<StudentInfo> student) {
        this.student = student;
    }

    public GradeType getGrade() {
        return grade;
    }

    public void setGrade(GradeType grade) {
        this.grade = grade;
    }
}
