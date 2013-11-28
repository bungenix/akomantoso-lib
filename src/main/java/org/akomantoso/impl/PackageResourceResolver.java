package org.akomantoso.impl;

import java.io.InputStream;
import java.io.InputStreamReader;
import org.w3c.dom.ls.LSInput;
import org.w3c.dom.ls.LSResourceResolver;

/**
 *
 * @author ashok
 */
public class PackageResourceResolver implements LSResourceResolver {

    public static final String RESOURCE_PREFIX = "/org/akomantoso/impl";
    
    @Override
    public LSInput resolveResource(String type, String namespaceURI, String publicId, String systemId, String baseURI) {
        LSInputImpl impl = new LSInputImpl();
        // systemId 
        InputStream in = getClass().getResourceAsStream(RESOURCE_PREFIX + "/" + systemId);
        InputStreamReader inr = new InputStreamReader(in);
        impl.setPublicId(publicId);
        impl.setSystemId(systemId);
        impl.setBaseURI(baseURI);
        impl.setCharacterStream(inr);
        return impl;
    }
    
}
