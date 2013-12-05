package org.akomantoso.api;

import java.io.InputStream;
import java.util.HashMap;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
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
    
    public class SchemaInfo{
        
        public final String prefix;
        public final String anxsd;
        
        public SchemaInfo(String prefix, String anxsd){
            this.prefix = prefix;
            this.anxsd = anxsd;
        }
    }
    
    public HashMap<String, SchemaInfo> schemaInfo = new HashMap<String, SchemaInfo>(){
        {
            put("2.0", new SchemaInfo("org.akomantoso.", "schema.xsd"));
            put("3.0", new SchemaInfo("org.oasis_open.docs.legaldocml.ns.akn.", "schema.xsd"));
        }
    };
    
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
     * Use this Constructor if there is no minor version
     * @param majorVersion 
     */
    public AnVersion(String majorVersion){
        this(majorVersion, null);
    }
    
    /**
     * Get package URN for specific AN version
     * @return 
     */
    public String getPackageForVersion(){
        return schemaInfo.get(majorVersion).prefix.concat("_").
                concat(majorVersion.replace(".", "_")).
                    concat(
                        minorVersion == null ? 
                        "" : 
                        "".concat(".").concat(minorVersion)
                );
    }
    
    /**
     * Returns a new JAXBContext handle for the specific Akoma Ntoso package
     * version
     * @return
     * @throws JAXBException 
     */
    public JAXBContext getContext() throws JAXBException{
        String sPackage = getPackageForVersion();
        return JAXBContext.newInstance(sPackage);
    }
    
    /**
     * Returns the schema xsd as a stream from within the package
     * @return 
     */
    public InputStream getSchemaForVersion(){
        StringBuilder sb = new StringBuilder();
        SchemaInfo vInfo = schemaInfo.get(majorVersion);
        sb.append("/").append(vInfo.prefix.replace(".", "/")).
                append(this.majorVersionPath()).
                    append("/").append(minorVersion).append("/").append(vInfo.anxsd);
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
