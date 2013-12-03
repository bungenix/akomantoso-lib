package org.akomantoso;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import junit.framework.TestCase;
import org.oasis_open.docs.legaldocml.ns.akn._3_0.csd06.AkomaNtosoType;
import org.oasis_open.docs.legaldocml.ns.akn._3_0.csd06.VersionType;


/**
 * Test marshalling and unmarshalling of xml files 
 * @author ashok
 */
public class AnUnmarshallAndMarshall extends TestCase {

    File _anDoc  = new File("./src/test/java/testdocs/akomantoso_doc.xml");    
  
    
    public AnUnmarshallAndMarshall(String testName)  {
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

    public void testUnmarshall() throws JAXBException{
        JAXBContext jc = 
            JAXBContext.newInstance("org.oasis_open.docs.legaldocml.ns.akn._3_0.csd06");
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
    
    
}
