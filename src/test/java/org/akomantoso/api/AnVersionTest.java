package org.akomantoso.api;

import junit.framework.TestCase;

import javax.xml.bind.JAXBContext;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ashok on 20-May-17.
 */
public class AnVersionTest extends TestCase {

    List<AnVersion> versions = new ArrayList<>(0);
    class versionNum {
        Integer majorVersion;
        String minorVersion;
        versionNum(Integer mav, String miv) {
            this.majorVersion = mav;
            this.minorVersion = miv;
        }

    };
    versionNum[] vNums = {
        new versionNum(3, "csd06"),
        new versionNum(3, "csd06"),
        new versionNum(3, "csd07"),
        new versionNum(3, "csd08"),
        new versionNum(3, "csd09"),
        new versionNum(3, "csd10"),
        new versionNum(3, "csd11"),
        new versionNum(3, "csd12"),
        new versionNum(3, "csd13"),
        new versionNum(3, "release")
    };
    public void setUp() throws Exception {
        super.setUp();
        for(versionNum num: vNums) {
            versions.add(new AnVersion(num.majorVersion, num.minorVersion));
        }
    }

    public void tearDown() throws Exception {

    }

    public void testGetPackageForVersion() throws Exception {
        for(AnVersion v: versions) {
           String sV =  v.getPackageForVersion();
           assertNotNull(sV);
           System.out.println("package: " + sV);
        }
    }

    public void testGetContext() throws Exception {
        for(AnVersion v: versions) {
            JAXBContext cxt =  v.getContext();
            assertNotNull(cxt);
        }
    }

    public void testGetSchemaForVersion() throws Exception {
        for(AnVersion v: versions) {
            InputStream is =  v.getSchemaForVersion();
            assertNotNull(is);
            if (is != null) {is.close();}
        }
    }

}