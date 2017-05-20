package org.akomantoso;

import junit.framework.TestCase;
import org.akomantoso.api.AnValidator;
import org.akomantoso.api.AnValidatorError;
import org.akomantoso.api.AnVersion;

import java.io.File;
import java.io.IOException;

/**
 * Created by ashok on 20-May-17.
 */
public class TestAnValidatorTest_30release extends TestCase {

    AnVersion _version = new AnVersion(3, "release");
    // test file 1 - this should validte
    File _validate1  = new File("./src/test/java/testdocs/akomantoso_doc_30release.xml");
    // test file 2 - this should fail
    File _validate2  = new File("./src/test/java/testdocs/akomantoso_doc_30release_fail.xml");

    AnValidator _validator = new AnValidator();

    public TestAnValidatorTest_30release(String testName) throws IOException {
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
        assertEquals("Validation of file failed when it should have succeeded",
                result.isError(), false);
        // file 2 should fail, but failure should match specific line and col number
        result = _validator.validate(_version, _validate2);
        assertEquals("Validation of file succeeded when it should have failed",
                result.isError(), true);
        System.out.println("error details : ");
        System.out.println(" line : " + result.getLineNumber() + ", "
                + "col : " + result.getColumnNumber());
        assertEquals("line number should be 42 !", result.getLineNumber(), (Integer)42);
        assertEquals("col number should be 102 !", result.getColumnNumber(), (Integer)102);
    }
}
