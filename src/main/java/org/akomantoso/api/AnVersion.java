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

    Integer majorVersion;
    String minorVersion;
    
    public final String prefix = "org.akomantoso.schema.";
    public final String anxsd = "schema.xsd";

    /**
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
            put("2.0", new SchemaInfo("org.akomantoso.schema.", "schema.xsd"));
            put("3.0", new SchemaInfo("org.oasis_open.docs.legaldocml.ns.akn.", "schema.xsd"));
        }
    };
    **/
    
    /**
     * Major and minor version of Akoma Ntoso 
     * @param majorVersion e.g. 3.0
     * @param minorVersion e.g. CSD06
     */
    public AnVersion(Integer majorVersion, String minorVersion){
       this.majorVersion = majorVersion;
       this.minorVersion = minorVersion.toLowerCase();
    }

    /**
     * Use this Constructor if there is no minor version
     * @param majorVersion 
     */
    public AnVersion(Integer majorVersion){
        this(majorVersion, null);
    }
    
    /**
     * Get package URN for specific AN version
     * @return 
     */
    public String getPackageForVersion(){
        
        return this.prefix.
                concat("v").concat(this.majorVersion.toString()).
                    concat(
                        this.minorVersion == null ?
                        "" :
                        "".concat(".").concat(this.minorVersion)
                    );
        /**
        return schemaInfo.get(majorVersion).prefix.concat("_").
                concat(majorVersion.replace(".", "_")).
                    concat(
                        minorVersion == null ? 
                        "" : 
                        "".concat(".").concat(minorVersion)
                );
                */ 
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
        String sPackage = "." + getPackageForVersion() + ".";
        String sPathToSchema = sPackage.replace(".", "/").concat(this.anxsd);
        InputStream in = getClass().getResourceAsStream(
                sPathToSchema
                );
        if (in == null) {
            logger.error("inputstream is null !! "+ sb.toString());
        }
        return in;
    }
    
}
