package org.akomantoso;

import java.io.File;
import java.io.FileNotFoundException;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import junit.framework.TestCase;
import org.akomantoso.api.AnVersion;
import org.akomantoso.schema.v3.csd13.AkomaNtosoType;
import org.akomantoso.schema.v3.csd13.FRBRWork;
import org.akomantoso.schema.v3.csd13.Identification;
import org.akomantoso.schema.v3.csd13.Meta;
import org.akomantoso.schema.v3.csd13.ObjectFactory;
import org.akomantoso.schema.v3.csd13.OpenStructure;
import org.akomantoso.schema.v3.csd13.Publication;
import org.akomantoso.schema.v3.csd13.ValueType;
import org.akomantoso.schema.v3.csd13.VersionType;


/**
 * Test marshalling and unmarshalling of xml files 
 * @author Ashok Hariharan
 */
public class TestAnUnmarshallAndMarshall_CSD13 extends TestCase {

    File _anDoc  = new File("./src/test/java/testdocs/akomantoso_doc_csd13.xml");
  
    
    public TestAnUnmarshallAndMarshall_CSD13(String testName)  {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testUnmarshall_3_0() throws JAXBException{
        
        AnVersion version = null ;
        try {
            version = new AnVersion(3, "CSD13");
        } catch (FileNotFoundException ex) {
            // version does not exist !
        }
        if (null == version) {
            fail("Schema not found !");
        }
        JAXBContext jc = version.getContext();
        Unmarshaller unmarshaller = jc.createUnmarshaller();
        JAXBElement<AkomaNtosoType> anType = (JAXBElement<AkomaNtosoType>)unmarshaller.unmarshal(_anDoc);
        AkomaNtosoType anDoc  = anType.getValue();
        /**
         * <doc name="memorandum" contains="originalVersion">
         */
        String aName = anDoc.getDoc().getName();
        assertEquals("name attribute should be memorandum !", aName, 
                (String)"memorandum");
        VersionType vType = anDoc.getDoc().getContains();
        assertEquals("contains should be 'originalVersion'", 
                vType.value(), "originalVersion");
   }
   
    /**
     * This test always passes, it demonstrates marshalling an Akoma Ntoso document
     * @throws JAXBException 
     */
   public void testMarshall_3_0() throws JAXBException{
        AnVersion ver=null;
        try {
            ver = new AnVersion(3, "CSD13");
        } catch (FileNotFoundException ex) {
            // schema does not exist
        }
        if (null == ver) {
            fail("Schema not found !");
        }
        JAXBContext jc = ver.getContext();
        Marshaller marshaller = jc.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, 
                true);
        
        // create the root akomaNtoso element
        ObjectFactory of = new ObjectFactory();
        AkomaNtosoType anType = new AkomaNtosoType();
        OpenStructure ost = new OpenStructure();
        ost.setName("test_doc");
        ost.setContains(VersionType.SINGLE_VERSION);
        
        // create the meta element
        Meta meta = new Meta();
        // create the publication tag
        Publication pub = new Publication();
        pub.setWId("test_pub");
        pub.setName("pub");
        pub.setDate("2013-01-01");
        pub.setNumber("42");
        // add the publication element to the meta element
        meta.setPublication(pub);
        //create the identification element
        Identification idf = new Identification();
        idf.setSource("#a_source");
        //create a work element
        FRBRWork work = of.createFRBRWork();
        //set FRBRthis on work
        ValueType vThis = new ValueType();
        vThis.setValue("/ak/bill/2013-01-01/A1/memorandum");
        work.setFRBRthis(vThis);
        //set FRBRuri on work
        ValueType vURI = new ValueType();
        vURI.setValue("/ak/bill/2013-01-01/A1");
        work.getFRBRuri().add(vURI);
        //add the identification to the work
        idf.setFRBRWork(work);
        //add the identifcatin on the meta
        meta.setIdentification(idf);
        //add the meta 
        ost.setMeta(meta);
        //add the doc type to the akomaNtoso element
        anType.setDoc(ost);
        JAXBElement<AkomaNtosoType> rootElem = of.createAkomaNtoso(anType);
        marshaller.marshal(rootElem, System.out);
        assertEquals(true, true);
   }
    
}
