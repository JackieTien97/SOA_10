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


/**
 * <p>课程信息类型 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="课程信息类型">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="课程编号" type="{http://jw.nju.edu.cn/schema}课程编号类型"/>
 *         &lt;element name="课程名称" type="{http://jw.nju.edu.cn/schema}课程名称类型"/>
 *         &lt;element name="授课教师" type="{http://www.nju.edu.cn/schema}人员名称类型"/>
 *         &lt;element name="上课时间与地点表" type="{http://jw.nju.edu.cn/schema}上课时间与地点表类型"/>
 *         &lt;element name="选课类型" type="{http://jw.nju.edu.cn/schema}CourseType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "课程信息类型", namespace = cn.edu.nju.soa.model.Namespace.JW_URI,propOrder = {
        "courseId",
        "courseName",
        "courseTeacher",
        "timeNplace",
        "choiceType"
})
public class CourseInfo {

    @XmlElement(name="课程编号",required = true)
    protected String courseId;

    @XmlElement(name="课程名称",required = true)
    protected String courseName;

    @XmlElement(name="授课教师",required = true)
    protected String courseTeacher;

    @XmlElement(name="上课时间与地点表",required = true)
    protected cn.edu.nju.soa.model.CourseTimeAndAddress timeNplace;

    @XmlElement(name="选课类型",required = true)
    @XmlSchemaType(name = "string")
    protected cn.edu.nju.soa.model.CourseType choiceType;

    /**
     * 获取课程编号属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourseId() {
        return this.courseId;
    }

    /**
     * 设置课程编号属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourseId(String value) {
        this.courseId = value;
    }

    /**
     * 获取课程名称属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourseName() {
        return this.courseName;
    }

    /**
     * 设置课程名称属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourseName(String value) {
        this.courseName = value;
    }

    /**
     * 获取授课教师属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourseTeacher() {
        return this.courseTeacher;
    }

    /**
     * 设置授课教师属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourseTeacher(String value) {
        this.courseTeacher = value;
    }

    /**
     * 获取上课时间与地点表属性的值。
     * 
     * @return
     *     possible object is
     *     {@link cn.edu.nju.soa.model.CourseTimeAndAddress }
     *     
     */
    public cn.edu.nju.soa.model.CourseTimeAndAddress getTimeNplace() {
        return this.timeNplace;
    }

    /**
     * 设置上课时间与地点表属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link cn.edu.nju.soa.model.CourseTimeAndAddress }
     *     
     */
    public void setTimeNplace(cn.edu.nju.soa.model.CourseTimeAndAddress value) {
        this.timeNplace = value;
    }

    /**
     * 获取选课类型属性的值。
     * 
     * @return
     *     possible object is
     *     {@link cn.edu.nju.soa.model.CourseType }
     *     
     */
    public cn.edu.nju.soa.model.CourseType getChoiceType() {
        return this.choiceType;
    }

    /**
     * 设置选课类型属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link cn.edu.nju.soa.model.CourseType }
     *     
     */
    public void setChoiceType(cn.edu.nju.soa.model.CourseType value) {
        this.choiceType = value;
    }

}
