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
 * <p>DepartmentInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="DepartmentInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="部门编号" type="{http://www.nju.edu.cn/schema}部门编号类型"/>
 *         &lt;element name="部门名称" type="{http://www.nju.edu.cn/schema}部门名称类型"/>
 *         &lt;element name="部门电话" type="{http://www.nju.edu.cn/schema}办公室电话类型"/>
 *         &lt;element name="校区" type="{http://www.nju.edu.cn/schema}校区类型"/>
 *         &lt;element name="部门地址" type="{http://www.nju.edu.cn/schema}地址类型"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "部门信息类型", namespace = cn.edu.nju.soa.model.Namespace.NJU_URI, propOrder = {
        "departmentId",
        "departmentName",
        "departmentTel",
        "campus",
        "departmentAddress"
})
public class DepartmentInfo {

    @XmlElement(name = "部门编号",required = true,namespace = cn.edu.nju.soa.model.Namespace.NJU_URI)
    protected String departmentId;
    @XmlElement(name="部门名称",required = true,namespace = cn.edu.nju.soa.model.Namespace.NJU_URI)
    protected String departmentName;
    @XmlElement(name="部门电话",required = true,namespace = cn.edu.nju.soa.model.Namespace.NJU_URI)
    protected String departmentTel;
    @XmlElement(name="校区",required = true,namespace = cn.edu.nju.soa.model.Namespace.NJU_URI)
    @XmlSchemaType(name = "string")
    protected cn.edu.nju.soa.model.SchoolCampusType campus;
    @XmlElement(name="部门地址",required = true,namespace = cn.edu.nju.soa.model.Namespace.NJU_URI)
    protected String departmentAddress;

    /**
     * 获取部门编号属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartmentId() {
        return this.departmentId;
    }

    /**
     * 设置部门编号属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartmentId(String value) {
        this.departmentId = value;
    }

    /**
     * 获取部门名称属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartmentName() {
        return this.departmentName;
    }

    /**
     * 设置部门名称属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartmentName(String value) {
        this.departmentName = value;
    }

    /**
     * 获取部门电话属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartmentTel() {
        return this.departmentTel;
    }

    /**
     * 设置部门电话属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartmentTel(String value) {
        this.departmentTel = value;
    }

    /**
     * 获取校区属性的值。
     * 
     * @return
     *     possible object is
     *     {@link cn.edu.nju.soa.model.SchoolCampusType }
     *     
     */
    public cn.edu.nju.soa.model.SchoolCampusType getCampus() {
        return this.campus;
    }

    /**
     * 设置校区属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link cn.edu.nju.soa.model.SchoolCampusType }
     *     
     */
    public void setCampus(cn.edu.nju.soa.model.SchoolCampusType value) {
        this.campus = value;
    }

    /**
     * 获取部门地址属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartmentAddress() {
        return departmentAddress;
    }

    /**
     * 设置部门地址属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartmentAddress(String value) {
        this.departmentAddress = value;
    }

}
