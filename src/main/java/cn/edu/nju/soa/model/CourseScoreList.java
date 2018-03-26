//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2018.03.06 时间 03:21:28 PM CST 
//


package cn.edu.nju.soa.model;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>CourseScoreList complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CourseScoreList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="课程成绩" type="{http://jw.nju.edu.cn/schema}CourseScore"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement(name = "课程成绩列表", namespace = Namespace.JW_URI)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "课程成绩列表类型", namespace = cn.edu.nju.soa.model.Namespace.JW_URI, propOrder = {
    "courseScore"
})
public class CourseScoreList {

    @XmlElements(value = @XmlElement(name="课程成绩",namespace = cn.edu.nju.soa.model.Namespace.JW_URI))
    protected List<CourseScore> courseScore;

    /**
     * Gets the value of the 课程成绩 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the 课程成绩 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    get课程成绩().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CourseScore }
     * 
     * 
     */
    public List<CourseScore> getCourseScore() {
        if (this.courseScore == null) {
            this.courseScore = new ArrayList<CourseScore>();
        }
        return this.courseScore;
    }

    public void setCourseScore(List<CourseScore> courseScore) {
        this.courseScore = courseScore;
    }
}
