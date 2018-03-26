//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2018.03.06 时间 03:21:28 PM CST 
//


package cn.edu.nju.soa.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>学期类型的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="学期类型">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="大一第一学期"/>
 *     &lt;enumeration value="大一第二学期"/>
 *     &lt;enumeration value="大二第一学期"/>
 *     &lt;enumeration value="大二第二学期"/>
 *     &lt;enumeration value="大三第一学期"/>
 *     &lt;enumeration value="大三第二学期"/>
 *     &lt;enumeration value="大四第一学期"/>
 *     &lt;enumeration value="大四第二学期"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "学期类型")
@XmlEnum
public enum Semester {

    大一第一学期,
    大一第二学期,
    大二第一学期,
    大二第二学期,
    大三第一学期,
    大三第二学期,
    大四第一学期,
    大四第二学期;

    public String value() {
        return name();
    }

    public static Semester fromValue(String v) {
        return valueOf(v);
    }

}
