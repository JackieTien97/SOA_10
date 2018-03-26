package cn.edu.nju.soa.model;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u9a8c\u8bc1\u7c7b\u578b", propOrder = {
        "studentId",
        "level"
})
public class VerifyType {
    @XmlElement(required = true)
    protected String studentId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected AuthLevel level;

    /**
     * 获取学号属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStudentId() {
        return studentId;
    }

    /**
     * 设置学号属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStudentId(String value) {
        this.studentId = value;
    }

    /**
     * 获取权限属性的值。
     *
     * @return
     *     possible object is
     *     {@link AuthLevel }
     *
     */
    public AuthLevel getLevel() {
        return level;
    }

    /**
     * 设置权限属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link AuthLevel }
     *
     */
    public void set权限(AuthLevel value) {
        this.level = value;
    }
}
