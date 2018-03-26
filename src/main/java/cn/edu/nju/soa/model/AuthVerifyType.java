package cn.edu.nju.soa.model;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u8d26\u53f7\u8ba4\u8bc1\u7c7b\u578b", propOrder = {
        "account",
        "password"
})
public class AuthVerifyType {

    @XmlElement(required = true)
    protected String account;
    @XmlElement(required = true)
    protected String password;

    /**
     * 获取账号属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAccount() {
        return account;
    }

    /**
     * 设置账号属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAccount(String value) {
        this.account = value;
    }

    /**
     * 获取密码属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPassword(String value) {
        this.password = value;
    }
}
