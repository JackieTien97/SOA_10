
package cn.edu.nju.soa.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>NotFoundReasonType�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="NotFoundReasonType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ѧ�Ų�����"/&gt;
 *     &lt;enumeration value="δ�ҵ�����ѧ�ŵĳɼ�"/&gt;
 *     &lt;enumeration value="�γ̲�����"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NotFoundReasonType")
@XmlEnum
public enum NotFoundReasonType {

    ѧ�Ų�����,
    δ�ҵ�����ѧ�ŵĳɼ�,
    �γ̲�����;

    public String value() {
        return name();
    }

    public static NotFoundReasonType fromValue(String v) {
        return valueOf(v);
    }

}
