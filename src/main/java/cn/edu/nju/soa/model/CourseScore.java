//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2018.03.06 时间 03:21:28 PM CST 
//


package cn.edu.nju.soa.model;

import java.util.ArrayList;
import java.util.List;
import javax.naming.Name;
import javax.xml.bind.annotation.*;


/**
 * <p>CourseScore complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CourseScore">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="成绩" type="{http://jw.nju.edu.cn/schema}成绩类型"/>
 *       &lt;/sequence>
 *       &lt;attribute name="课程编号" type="{http://jw.nju.edu.cn/schema}课程编号类型" />
 *       &lt;attribute name="成绩性质" type="{http://jw.nju.edu.cn/schema}成绩性质类型" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "课程成绩类型", namespace = cn.edu.nju.soa.model.Namespace.JW_URI, propOrder = {
    "score"
})
public class CourseScore {

    @XmlElement(name = "成绩",namespace = cn.edu.nju.soa.model.Namespace.JW_URI)
    protected List<cn.edu.nju.soa.model.ScoreType> score;
    @XmlAttribute(name="课程编号",namespace = cn.edu.nju.soa.model.Namespace.JW_URI)
    protected String courseId;
    @XmlAttribute(name="成绩性质",namespace = cn.edu.nju.soa.model.Namespace.JW_URI)
    protected cn.edu.nju.soa.model.ScoreAttributeType scoreType;

    public List<ScoreType> getScore() {
        return score;
    }

    public void setScore(List<ScoreType> score) {
        this.score = score;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public ScoreAttributeType getScoreType() {
        return scoreType;
    }

    public void setScoreType(ScoreAttributeType scoreType) {
        this.scoreType = scoreType;
    }
}
