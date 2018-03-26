package cn.edu.nju.soa.model;


import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "\u6743\u9650\u7ea7\u522b")
@XmlEnum
public enum AuthLevel {
    普通学生,
    管理员;

    public String value() {
        return name();
    }

    public static AuthLevel fromValue(String v) {
        return valueOf(v);
    }
}
