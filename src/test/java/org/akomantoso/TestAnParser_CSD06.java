    package org.akomantoso;

    import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
    import java.io.IOException;
    import junit.framework.TestCase;
    import org.akomantoso.api.AnDocType;
    import org.akomantoso.api.AnParser;
    import org.akomantoso.api.AnVersion;

    /**
     * Test the validation of Akoma Ntoso documents, returns line number
       and column number when validation fails
     * @author Ashok Hariharan
     */
    public class TestAnParser_CSD06 extends TestCase {

        AnVersion _version = new AnVersion(3, "csd06");
        // file to parse and discover type
        File _parse  = new File("./src/test/java/testdocs/akomantoso_act_csd06.xml");    
        FileInputStream fstream = new FileInputStream(_parse);

        public TestAnParser_CSD06(String testName) throws IOException {
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

        /**
         * Test of validate method, of class AnValidator.
         */
        public void testParse() throws Exception {
            System.out.println("parse");
            // file 1 should validate
            AnDocType resultDoc = (new AnParser()).parse(_version, fstream );
            //assertEquals(resultDoc.objClass, 
               //     "org.akomantoso.schema.v3.csd06.OpenStructure");
            assertEquals(resultDoc.typeName, 
                    "act");

        }
    }
