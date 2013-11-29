package org.akomantoso;

import java.io.File;
import java.io.IOException;
import junit.framework.TestCase;

/**
 *
 * @author ashok
 */
public class AnValidatorTest extends TestCase {
    
    AnVersion _version = new AnVersion("3.0", "CSD06");
    File _validate  = new File("src/test/java/testdocs/akomantoso_doc.xml");    
    AnValidator _validator = new AnValidator();
    
    public AnValidatorTest(String testName) throws IOException {
        super(testName);
        System.out.println(_validate.getCanonicalPath());
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        if (_validate.exists()) {
            fail("Test file does not exist");
        }
                
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of validate method, of class AnValidator.
     */
    public void testValidate() throws Exception {
        System.out.println("validate");
        AnValidatorError result = _validator.validate(_version, _validate);
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
