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
 * <p>Java class for ForceMods.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ForceMods">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="entryIntoForce"/>
 *     &lt;enumeration value="endOfEnactment"/>
 *     &lt;enumeration value="postponementOfEntryIntoForce"/>
 *     &lt;enumeration value="prorogationOfForce"/>
 *     &lt;enumeration value="reEnactment"/>
 *     &lt;enumeration value="uncostitutionality"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ForceMods")
@XmlEnum
public enum ForceMods {

    @XmlEnumValue("entryIntoForce")
    ENTRY_INTO_FORCE("entryIntoForce"),
    @XmlEnumValue("endOfEnactment")
    END_OF_ENACTMENT("endOfEnactment"),
    @XmlEnumValue("postponementOfEntryIntoForce")
    POSTPONEMENT_OF_ENTRY_INTO_FORCE("postponementOfEntryIntoForce"),
    @XmlEnumValue("prorogationOfForce")
    PROROGATION_OF_FORCE("prorogationOfForce"),
    @XmlEnumValue("reEnactment")
    RE_ENACTMENT("reEnactment"),
    @XmlEnumValue("uncostitutionality")
    UNCOSTITUTIONALITY("uncostitutionality");
    private final String value;

    ForceMods(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ForceMods fromValue(String v) {
        for (ForceMods c: ForceMods.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
