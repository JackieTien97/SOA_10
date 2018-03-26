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
 * <p>教师信息类型 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="教师信息类型">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="教工号" type="{http://jw.nju.edu.cn/schema}教工号类型"/>
 *         &lt;element name="教师名称" type="{http://www.nju.edu.cn/schema}人员名称类型"/>
 *         &lt;element name="年龄" type="{http://www.nju.edu.cn/schema}人员年龄类型"/>
 *         &lt;element name="入职年份" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="院系" type="{http://www.nju.edu.cn/schema}部门名称类型"/>
 *         &lt;element name="职称" type="{http://jw.nju.edu.cn/schema}职称类型"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "教师信息类型", propOrder = {
    "teacherNum",
    "teacherName",
    "age",
    "yearOfInduction",
    "college",
    "title"
})
public class TeacherInfoType {

    @XmlElement(name="教工号", required = true)
    protected String teacherNum;
    @XmlElement(name="教师名称", required = true)
    protected String teacherName;
    @XmlElement(name="年龄", required = true)
    protected int age;
    @XmlElement(name="入职年份", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar yearOfInduction;
    @XmlElement(name="院系", required = true)
    protected String college;
    @XmlElement(name="职称", required = true)
    @XmlSchemaType(name = "string")
    protected TitleType title;

    /**
     * 获取教工号属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTeacherNum() {
        return teacherNum;
    }

    /**
     * 设置教工号属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTeacherNum(String value) {
        this.teacherNum = value;
    }

    /**
     * 获取教师名称属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTeacherName() {
        return teacherName;
    }

    /**
     * 设置教师名称属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTeacherName(String value) {
        this.teacherName = value;
    }

    /**
     * 获取年龄属性的值。
     * 
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置年龄属性的值。
     * 
     */
    public void setAge(int value) {
        this.age = value;
    }

    /**
     * 获取入职年份属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getYearOfInduction() {
        return yearOfInduction;
    }

    /**
     * 设置入职年份属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setYearOfInduction(XMLGregorianCalendar value) {
        this.yearOfInduction = value;
    }

    /**
     * 获取院系属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollege() {
        return college;
    }

    /**
     * 设置院系属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollege(String value) {
        this.college = value;
    }

    /**
     * 获取职称属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TitleType }
     *     
     */
    public TitleType getTitle() {
        return title;
    }

    /**
     * 设置职称属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TitleType }
     *     
     */
    public void setTitle(TitleType value) {
        this.title = value;
    }

}
