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
 * <p>人员信息类型 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="人员信息类型">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="姓名" type="{http://www.nju.edu.cn/schema}人员名称类型"/>
 *         &lt;element name="人员职务" type="{http://www.nju.edu.cn/schema}人员职务类型"/>
 *         &lt;element name="人员年龄" type="{http://www.nju.edu.cn/schema}人员年龄类型"/>
 *         &lt;element name="出生日期" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="性别" type="{http://www.nju.edu.cn/schema}人员性别类型"/>
 *         &lt;element name="身份证号" type="{http://www.nju.edu.cn/schema}身份证号类型"/>
 *         &lt;element name="手机号类型" type="{http://www.nju.edu.cn/schema}手机号类型"/>
 *         &lt;element name="入校时间" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="部门名称" type="{http://www.nju.edu.cn/schema}部门名称类型"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "人员信息类型", namespace = Namespace.NJU_URI, propOrder = {
    "name",
    "duty",
    "age",
    "birthDate",
    "sex",
    "pid",
    "phoneNumber",
    "inTime",
    "industryTitle"
})
public class PersonInfo {

    @XmlElement(name = "姓名", namespace = Namespace.NJU_URI, required = true)
    protected String name;
    @XmlElement(name = "人员职务", namespace = Namespace.NJU_URI, required = true)
    @XmlSchemaType(name = "string")
    protected Duty duty;
    @XmlElement(name = "人员年龄", namespace = Namespace.NJU_URI, required = true)
    @XmlSchemaType(name = "integer")
    protected int age;
    @XmlElement(name = "出生日期", namespace = Namespace.NJU_URI, required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar birthDate;
    @XmlElement(name = "性别", namespace = Namespace.NJU_URI, required = true)
    @XmlSchemaType(name = "string")
    protected Sex sex;
    @XmlElement(name = "身份证号", namespace = Namespace.NJU_URI, required = true)
    protected String pid;
    @XmlElement(name="手机号类型", namespace = Namespace.NJU_URI, required = true)
    protected String phoneNumber;
    @XmlElement(name = "入校时间", namespace = Namespace.NJU_URI, required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar inTime;
    @XmlElement(name = "部门名称", namespace = Namespace.NJU_URI, required = true)
    protected String industryTitle;

    /**
     * 获取姓名属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * 设置姓名属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * 获取人员职务属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Duty }
     *     
     */
    public Duty getDuty() {
        return duty;
    }

    /**
     * 设置人员职务属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Duty }
     *     
     */
    public void setDuty(Duty value) {
        this.duty = value;
    }

    /**
     * 获取人员年龄属性的值。
     * 
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置人员年龄属性的值。
     * 
     */
    public void setAge(int value) {
        this.age = value;
    }

    /**
     * 获取出生日期属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBirthDate() {
        return birthDate;
    }

    /**
     * 设置出生日期属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBirthDate(XMLGregorianCalendar value) {
        this.birthDate = value;
    }

    /**
     * 获取性别属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Sex }
     *     
     */
    public Sex getSex() {
        return sex;
    }

    /**
     * 设置性别属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Sex }
     *     
     */
    public void setSex(Sex value) {
        this.sex = value;
    }

    /**
     * 获取身份证号属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPid() {
        return pid;
    }

    /**
     * 设置身份证号属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPid(String value) {
        this.pid = value;
    }

    /**
     * 获取手机号类型属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * 设置手机号类型属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

    /**
     * 获取入校时间属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInTime() {
        return inTime;
    }

    /**
     * 设置入校时间属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInTime(XMLGregorianCalendar value) {
        this.inTime = value;
    }

    /**
     * 获取部门名称属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndustryTitle() {
        return industryTitle;
    }

    /**
     * 设置部门名称属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndustryTitle(String value) {
        this.industryTitle = value;
    }

}
