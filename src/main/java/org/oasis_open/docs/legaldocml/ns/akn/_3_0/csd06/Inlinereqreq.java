//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.11 at 11:34:41 PM EAT 
//


package org.oasis_open.docs.legaldocml.ns.akn._3_0.csd06;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;type xmlns="http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Complex&lt;/type&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;name xmlns="http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;inlinereqreq&lt;/name&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;comment xmlns="http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;
 * the complex type inlinereq defines the content model and attributes shared by all blocks and inlines. Here the currentId attribute is required and also the refersTo is required&lt;/comment&gt;
 * </pre>
 * 
 * 
 * <p>Java class for inlinereqreq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="inlinereqreq">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;group ref="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06}inlineCM"/>
 *       &lt;/choice>
 *       &lt;attGroup ref="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06}corereqreq"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "inlinereqreq", propOrder = {
    "content"
})
@XmlSeeAlso({
    Party.class,
    Lawyer.class,
    Judge.class,
    Entity.class,
    Quantity.class,
    Person.class
})
public class Inlinereqreq {

    @XmlElementRefs({
        @XmlElementRef(name = "inline", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06", type = ElementInline.class, required = false),
        @XmlElementRef(name = "shortTitle", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "party", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06", type = Party.class, required = false),
        @XmlElementRef(name = "fillIn", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06", type = FillIn.class, required = false),
        @XmlElementRef(name = "docCommittee", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06", type = DocCommittee.class, required = false),
        @XmlElementRef(name = "eop", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "i", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "time", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06", type = Time.class, required = false),
        @XmlElementRef(name = "session", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06", type = Session.class, required = false),
        @XmlElementRef(name = "ins", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "br", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "remark", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06", type = Remark.class, required = false),
        @XmlElementRef(name = "a", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06", type = A.class, required = false),
        @XmlElementRef(name = "person", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06", type = Person.class, required = false),
        @XmlElementRef(name = "extractText", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06", type = ExtractText.class, required = false),
        @XmlElementRef(name = "docDate", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06", type = DocDate.class, required = false),
        @XmlElementRef(name = "sup", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "docPurpose", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "outcome", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "abbr", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "docProponent", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06", type = DocProponent.class, required = false),
        @XmlElementRef(name = "docAuthority", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "def", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "docStatus", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "docNumber", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "term", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "rmod", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06", type = Rmod.class, required = false),
        @XmlElementRef(name = "location", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "docketNumber", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "event", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "sub", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "date", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06", type = Date.class, required = false),
        @XmlElementRef(name = "ref", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06", type = Ref.class, required = false),
        @XmlElementRef(name = "quantity", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06", type = Quantity.class, required = false),
        @XmlElementRef(name = "organization", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "docType", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "process", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "u", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "opinion", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06", type = Opinion.class, required = false),
        @XmlElementRef(name = "decoration", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "subFlow", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "rref", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06", type = Rref.class, required = false),
        @XmlElementRef(name = "docJurisdiction", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "change", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "authorialNote", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06", type = AuthorialNote.class, required = false),
        @XmlElementRef(name = "affectedDocument", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06", type = AffectedDocument.class, required = false),
        @XmlElementRef(name = "docStage", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "extractStructure", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06", type = ExtractStructure.class, required = false),
        @XmlElementRef(name = "concept", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "span", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "mref", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "placeholder", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06", type = Placeholder.class, required = false),
        @XmlElementRef(name = "argument", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "judge", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06", type = Judge.class, required = false),
        @XmlElementRef(name = "courtType", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "img", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06", type = Img.class, required = false),
        @XmlElementRef(name = "noteRef", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06", type = NoteRef.class, required = false),
        @XmlElementRef(name = "entity", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06", type = Entity.class, required = false),
        @XmlElementRef(name = "neutralCitation", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "mmod", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "signature", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "recordedTime", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06", type = RecordedTime.class, required = false),
        @XmlElementRef(name = "b", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "omissis", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "docTitle", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "object", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "mod", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "relatedDocument", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06", type = RelatedDocument.class, required = false),
        @XmlElementRef(name = "del", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "docIntroducer", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "legislature", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06", type = Legislature.class, required = false),
        @XmlElementRef(name = "lawyer", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06", type = Lawyer.class, required = false),
        @XmlElementRef(name = "marker", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06", type = Marker.class, required = false),
        @XmlElementRef(name = "vote", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06", type = Vote.class, required = false),
        @XmlElementRef(name = "role", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "eol", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06", type = JAXBElement.class, required = false)
    })
    @XmlMixed
    protected List<Serializable> content;
    @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
    protected String lang;
    @XmlAttribute(name = "space", namespace = "http://www.w3.org/XML/1998/namespace")
    protected String space;
    @XmlAttribute(name = "alternativeTo")
    @XmlSchemaType(name = "anyURI")
    protected String alternativeTo;
    @XmlAttribute(name = "currentId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String currentId;
    @XmlAttribute(name = "originalId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String originalId;
    @XmlAttribute(name = "GUID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String guid;
    @XmlAttribute(name = "class")
    protected String clazz;
    @XmlAttribute(name = "style")
    protected String style;
    @XmlAttribute(name = "title")
    protected String titleAttr;
    @XmlAttribute(name = "refersTo", required = true)
    protected List<String> refersTo;
    @XmlAttribute(name = "status")
    protected StatusType status;
    @XmlAttribute(name = "period")
    @XmlSchemaType(name = "anyURI")
    protected String period;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;type xmlns="http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Complex&lt;/type&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;name xmlns="http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;inlinereqreq&lt;/name&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;comment xmlns="http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;
     * the complex type inlinereq defines the content model and attributes shared by all blocks and inlines. Here the currentId attribute is required and also the refersTo is required&lt;/comment&gt;
     * </pre>
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ElementInline }
     * {@link String }
     * {@link JAXBElement }{@code <}{@link ComplexTypeInline }{@code >}
     * {@link Party }
     * {@link FillIn }
     * {@link DocCommittee }
     * {@link JAXBElement }{@code <}{@link ComplexTypeInline }{@code >}
     * {@link JAXBElement }{@code <}{@link EolType }{@code >}
     * {@link Time }
     * {@link Session }
     * {@link JAXBElement }{@code <}{@link ComplexTypeInline }{@code >}
     * {@link Remark }
     * {@link JAXBElement }{@code <}{@link Markeropt }{@code >}
     * {@link Person }
     * {@link A }
     * {@link ExtractText }
     * {@link DocDate }
     * {@link JAXBElement }{@code <}{@link ComplexTypeInline }{@code >}
     * {@link JAXBElement }{@code <}{@link ComplexTypeInline }{@code >}
     * {@link JAXBElement }{@code <}{@link ComplexTypeInline }{@code >}
     * {@link JAXBElement }{@code <}{@link ComplexTypeInline }{@code >}
     * {@link DocProponent }
     * {@link JAXBElement }{@code <}{@link ComplexTypeInline }{@code >}
     * {@link JAXBElement }{@code <}{@link ComplexTypeInline }{@code >}
     * {@link JAXBElement }{@code <}{@link ComplexTypeInline }{@code >}
     * {@link JAXBElement }{@code <}{@link ComplexTypeInline }{@code >}
     * {@link JAXBElement }{@code <}{@link Inlinereqreq }{@code >}
     * {@link Rmod }
     * {@link JAXBElement }{@code <}{@link ComplexTypeInline }{@code >}
     * {@link JAXBElement }{@code <}{@link Inlinereqreq }{@code >}
     * {@link JAXBElement }{@code <}{@link Inlinereqreq }{@code >}
     * {@link JAXBElement }{@code <}{@link ComplexTypeInline }{@code >}
     * {@link Date }
     * {@link Ref }
     * {@link JAXBElement }{@code <}{@link Inlinereqreq }{@code >}
     * {@link Quantity }
     * {@link JAXBElement }{@code <}{@link ComplexTypeInline }{@code >}
     * {@link JAXBElement }{@code <}{@link Inlinereqreq }{@code >}
     * {@link JAXBElement }{@code <}{@link ComplexTypeInline }{@code >}
     * {@link Opinion }
     * {@link JAXBElement }{@code <}{@link ComplexTypeInline }{@code >}
     * {@link JAXBElement }{@code <}{@link SubFlowStructure }{@code >}
     * {@link Rref }
     * {@link JAXBElement }{@code <}{@link ComplexTypeInline }{@code >}
     * {@link JAXBElement }{@code <}{@link ComplexTypeInline }{@code >}
     * {@link AuthorialNote }
     * {@link JAXBElement }{@code <}{@link ComplexTypeInline }{@code >}
     * {@link AffectedDocument }
     * {@link JAXBElement }{@code <}{@link Inlinereqreq }{@code >}
     * {@link ExtractStructure }
     * {@link JAXBElement }{@code <}{@link ComplexTypeInline }{@code >}
     * {@link JAXBElement }{@code <}{@link ComplexTypeInline }{@code >}
     * {@link Placeholder }
     * {@link JAXBElement }{@code <}{@link ComplexTypeInline }{@code >}
     * {@link Judge }
     * {@link JAXBElement }{@code <}{@link ComplexTypeInline }{@code >}
     * {@link Entity }
     * {@link NoteRef }
     * {@link Img }
     * {@link JAXBElement }{@code <}{@link ModType }{@code >}
     * {@link JAXBElement }{@code <}{@link ComplexTypeInline }{@code >}
     * {@link RecordedTime }
     * {@link JAXBElement }{@code <}{@link ComplexTypeInline }{@code >}
     * {@link JAXBElement }{@code <}{@link ComplexTypeInline }{@code >}
     * {@link JAXBElement }{@code <}{@link ComplexTypeInline }{@code >}
     * {@link JAXBElement }{@code <}{@link ComplexTypeInline }{@code >}
     * {@link JAXBElement }{@code <}{@link Inlinereqreq }{@code >}
     * {@link JAXBElement }{@code <}{@link ModType }{@code >}
     * {@link JAXBElement }{@code <}{@link ComplexTypeInline }{@code >}
     * {@link RelatedDocument }
     * {@link JAXBElement }{@code <}{@link ComplexTypeInline }{@code >}
     * {@link Legislature }
     * {@link Lawyer }
     * {@link Vote }
     * {@link Marker }
     * {@link JAXBElement }{@code <}{@link Inlinereqreq }{@code >}
     * {@link JAXBElement }{@code <}{@link EolType }{@code >}
     * 
     * 
     */
    public List<Serializable> getContent() {
        if (content == null) {
            content = new ArrayList<Serializable>();
        }
        return this.content;
    }

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

    /**
     * Gets the value of the space property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpace() {
        return space;
    }

    /**
     * Sets the value of the space property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpace(String value) {
        this.space = value;
    }

    /**
     * Gets the value of the alternativeTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternativeTo() {
        return alternativeTo;
    }

    /**
     * Sets the value of the alternativeTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternativeTo(String value) {
        this.alternativeTo = value;
    }

    /**
     * Gets the value of the currentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentId() {
        return currentId;
    }

    /**
     * Sets the value of the currentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentId(String value) {
        this.currentId = value;
    }

    /**
     * Gets the value of the originalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalId() {
        return originalId;
    }

    /**
     * Sets the value of the originalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalId(String value) {
        this.originalId = value;
    }

    /**
     * Gets the value of the guid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGUID() {
        return guid;
    }

    /**
     * Sets the value of the guid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGUID(String value) {
        this.guid = value;
    }

    /**
     * Gets the value of the clazz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClazz() {
        return clazz;
    }

    /**
     * Sets the value of the clazz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClazz(String value) {
        this.clazz = value;
    }

    /**
     * Gets the value of the style property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStyle() {
        return style;
    }

    /**
     * Sets the value of the style property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStyle(String value) {
        this.style = value;
    }

    /**
     * Gets the value of the titleAttr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitleAttr() {
        return titleAttr;
    }

    /**
     * Sets the value of the titleAttr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitleAttr(String value) {
        this.titleAttr = value;
    }

    /**
     * Gets the value of the refersTo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the refersTo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefersTo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRefersTo() {
        if (refersTo == null) {
            refersTo = new ArrayList<String>();
        }
        return this.refersTo;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link StatusType }
     *     
     */
    public StatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusType }
     *     
     */
    public void setStatus(StatusType value) {
        this.status = value;
    }

    /**
     * Gets the value of the period property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriod() {
        return period;
    }

    /**
     * Sets the value of the period property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriod(String value) {
        this.period = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
