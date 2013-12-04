package org.akomantoso;

import java.io.InputStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Loads a specific version of the AN schema
 * User: Ashok Hariharan
 * Date: 11/26/13
 * Time: 3:01 PM
 */
public class AnVersion {
    
    Logger logger = LoggerFactory.getLogger(AnValidator.class);

    String majorVersion;
    String minorVersion;
    
    public final String prefix = "org.oasis_open.docs.legaldocml.ns.akn.";
    public final String anxsd = "akomantoso30.xsd"; 

    
    /**
     * Major and minor version of Akoma Ntoso 
     * @param majorVersion e.g. 3.0
     * @param minorVersion e.g. CSD06
     */
    public AnVersion(String majorVersion, String minorVersion){
       this.majorVersion = majorVersion;
       this.minorVersion = minorVersion.toLowerCase();
    }

    /**
     * Returns the schema xsd as a stream from within the package
     * @return 
     */
    public InputStream getSchemaForVersion(){
        StringBuilder sb = new StringBuilder();
        sb.append("/").append(prefix.replace(".", "/")).
                append(this.majorVersionPath()).
                    append("/").append(minorVersion).append("/").append(anxsd);
        InputStream in = getClass().getResourceAsStream(
                sb.toString().trim()
                );
        if (in == null) {
            logger.error("inputstream is null !! "+ sb.toString());
        }
        return in;
    }
    
    private String majorVersionPath(){
        return "_" + majorVersion.replace(".", "_");
    }
    
    private String versionPath() {
        return majorVersionPath() + "/" + minorVersion;
    }

}
