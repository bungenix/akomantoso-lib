//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.11 at 11:34:41 PM EAT 
//


package org.oasis_open.docs.legaldocml.ns.akn._3_0.csd06;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for remarkType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="remarkType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="sceneDescription"/>
 *     &lt;enumeration value="phenomenon"/>
 *     &lt;enumeration value="caption"/>
 *     &lt;enumeration value="translation"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "remarkType")
@XmlEnum
public enum RemarkType {

    @XmlEnumValue("sceneDescription")
    SCENE_DESCRIPTION("sceneDescription"),
    @XmlEnumValue("phenomenon")
    PHENOMENON("phenomenon"),
    @XmlEnumValue("caption")
    CAPTION("caption"),
    @XmlEnumValue("translation")
    TRANSLATION("translation");
    private final String value;

    RemarkType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RemarkType fromValue(String v) {
        for (RemarkType c: RemarkType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
