//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.23 at 11:05:46 AM IST 
//


package org.wso2.carbon.identity.workflow.mgt.bean.metadata.type;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InputType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InputType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Select"/&gt;
 *     &lt;enumeration value="Multiple_Select"/&gt;
 *     &lt;enumeration value="Option"/&gt;
 *     &lt;enumeration value="Single_CheckBox"/&gt;
 *     &lt;enumeration value="Multiple_CheckBox"/&gt;
 *     &lt;enumeration value="TextArea"/&gt;
 *     &lt;enumeration value="Password"/&gt;
 *     &lt;enumeration value="Text"/&gt;
 *     &lt;enumeration value="Multiple_Steps_User_Role"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InputType", namespace = "http://type.metadata.bean.mgt.workflow.identity.carbon.wso2.org")
@XmlEnum
public enum InputType {

    @XmlEnumValue("Select")
    SELECT("Select"),
    @XmlEnumValue("Multiple_Select")
    MULTIPLE_SELECT("Multiple_Select"),
    @XmlEnumValue("Option")
    OPTION("Option"),
    @XmlEnumValue("Single_CheckBox")
    SINGLE_CHECK_BOX("Single_CheckBox"),
    @XmlEnumValue("Multiple_CheckBox")
    MULTIPLE_CHECK_BOX("Multiple_CheckBox"),
    @XmlEnumValue("TextArea")
    TEXT_AREA("TextArea"),
    @XmlEnumValue("Password")
    PASSWORD("Password"),
    @XmlEnumValue("Text")
    TEXT("Text"),
    @XmlEnumValue("Multiple_Steps_User_Role")
    MULTIPLE_STEPS_USER_ROLE("Multiple_Steps_User_Role");
    private final String value;

    InputType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InputType fromValue(String v) {
        for (InputType c: InputType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
