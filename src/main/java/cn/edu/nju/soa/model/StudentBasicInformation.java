//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2018.03.06 时间 03:21:28 PM CST 
//


package cn.edu.nju.soa.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>学生基本信息类型 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="学生基本信息类型">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="学号" type="{http://jw.nju.edu.cn/schema}学号类型"/>
 *         &lt;element name="姓名" type="{http://www.nju.edu.cn/schema}人员名称类型"/>
 *         &lt;element name="性别" type="{http://www.nju.edu.cn/schema}人员性别类型"/>
 *         &lt;element name="出生日期" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="身份证号" type="{http://www.nju.edu.cn/schema}身份证号类型"/>
 *         &lt;element name="专业" type="{http://www.nju.edu.cn/schema}部门名称类型"/>
 *         &lt;element name="入学时间" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="联系方式" type="{http://www.nju.edu.cn/schema}手机号类型"/>
 *         &lt;element name="学籍状态" type="{http://jw.nju.edu.cn/schema}学籍状态类型"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "学生基本信息类型", namespace = Namespace.JW_URI, propOrder = {
    "sid",
    "name",
    "gender",
    "birthday",
    "pid",
    "major",
    "admissionTime",
    "phone",
    "studentStatus"
})
public class StudentBasicInformation {

    @XmlElement(name="学号", required = true)
    protected String sid;
    @XmlElement(name="姓名", required = true)
    protected String name;
    @XmlElement(name="性别", required = true)
    @XmlSchemaType(name = "string")
    protected Sex gender;
    @XmlElement(name="出生日期", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar birthday;
    @XmlElement(name="身份证号", required = true)
    protected String pid;
    @XmlElement(name="专业", required = true)
    protected String major;
    @XmlElement(name="入学时间", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar admissionTime;
    @XmlElement(name="联系方式", required = true)
    protected String phone;
    @XmlElement(name="学籍状态", required = true)
    @XmlSchemaType(name = "string")
    protected StudentStatusType studentStatus;

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sex getGender() {
        return gender;
    }

    public void setGender(Sex gender) {
        this.gender = gender;
    }

    public XMLGregorianCalendar getBirthday() {
        return birthday;
    }

    public void setBirthday(XMLGregorianCalendar birthday) {
        this.birthday = birthday;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public XMLGregorianCalendar getAdmissionTime() {
        return admissionTime;
    }

    public void setAdmissionTime(XMLGregorianCalendar admissionTime) {
        this.admissionTime = admissionTime;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public StudentStatusType getStudentStatus() {
        return studentStatus;
    }

    public void setStudentStatus(StudentStatusType studentStatus) {
        this.studentStatus = studentStatus;
    }
}
