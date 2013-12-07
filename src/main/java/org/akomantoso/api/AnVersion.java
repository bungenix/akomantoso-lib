package org.akomantoso.api;

import java.io.FileNotFoundException;
import java.io.InputStream;
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
public final class AnVersion {
    
    Logger logger = LoggerFactory.getLogger(AnValidator.class);

    Integer majorVersion;
    String minorVersion;
    
    // the schema versions are always package within this package
    // hierarchy
    public final String prefix = "org.akomantoso.schema.";
    // the schema in the version package of the schema must always be called
    // by this name
    public final String anxsd = "schema.xsd";

    /**
     * Major and minor version of Akoma Ntoso 
     * @param majorVersion e.g. 3.0
     * @param minorVersion e.g. CSD06
     */
    public AnVersion(Integer majorVersion, String minorVersion) throws FileNotFoundException{
       this.majorVersion = majorVersion;
       if (null != minorVersion) {
        this.minorVersion = minorVersion.toLowerCase();
       }
       checkIfSchemaExists();
    }

    /**
     * Use this Constructor if there is no minor version
     * @param majorVersion 
     * @throws FileNotFoundException when a version that does not exist in the package
     * is requested in the parameter
     */
    public AnVersion(Integer majorVersion) throws FileNotFoundException{
        this(majorVersion, null);
    }
    
    public void checkIfSchemaExists() throws FileNotFoundException{
        String schemaPackage = this.prefix + "v" + majorVersion.toString() + (minorVersion == null ? "" : "." + minorVersion);
        // check if package exists 
        String schemaPackagePath = schemaPackage.replace(".", "/");
        if (getClass().getClassLoader().getResource(schemaPackagePath) != null){
           if (getClass().getClassLoader().getResource(schemaPackagePath + "/schema.xsd") == null) {
               throw new FileNotFoundException(
                       "The schema for the version does not exist !"
                       );
           }
        } else {
            throw new FileNotFoundException(
                    "The package for the version does not exist !"
                    );
        }
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
