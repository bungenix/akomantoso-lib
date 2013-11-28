package org.akomantoso;

import java.io.InputStream;

/**
 * org.akomantoso
 * User: ashok
 * Date: 11/26/13
 * Time: 3:01 PM
 */
public class AnVersion {
    
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
    
    public InputStream getSchemaForVersion(){
        
        StringBuilder sb = new StringBuilder();
        sb.append("/").append(prefix.replace(".", "/")).
                append(this.majorVersionPath()).
                    append("/").append(minorVersion).append("/").append(anxsd);
        InputStream in = AnVersion.class.getResourceAsStream(sb.toString());
        return in;
    }
    
    private String majorVersionPath(){
        return "_" + majorVersion.replace(".", "_");
    }
    
    private String versionPath() {
        return majorVersionPath() + "/" + minorVersion;
    }

}
