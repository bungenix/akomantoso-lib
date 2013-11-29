package org.akomantoso;

import java.io.File;
import java.io.IOException;
import junit.framework.TestCase;

/**
 *
 * @author Ashok Hariharan
 */
public class AnValidatorTest extends TestCase {
    
    AnVersion _version = new AnVersion("3.0", "CSD06");
    // test file 1 - this should validte
    File _validate1  = new File("./src/test/java/testdocs/akomantoso_doc.xml");    
    // test file 2 - this should fail 
    File _validate2  = new File("./src/test/java/testdocs/akomantoso_act.xml");    
    
    AnValidator _validator = new AnValidator();
    
    public AnValidatorTest(String testName) throws IOException {
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
    public void testValidate() throws Exception {
        System.out.println("validate");
        // file 1 should validate
        AnValidatorError result = _validator.validate(_version, _validate1);
        assertEquals(result.isError(), false);
        // file 2 should fail
        result = _validator.validate(_version, _validate2);
        assertEquals(result.isError(), true);
        System.out.println("error details : ");
        System.out.println(" line : " + result.getLineNumber() + ", "
                + "col : " + result.getColumnNumber());
        
    }
}
