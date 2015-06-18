/*
 * Copyright 2014 Ashok Hariharan.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.akomantoso.api;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.net.URI;
import javax.xml.XMLConstants;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import org.akomantoso.api.impl.PackageResourceResolver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

/**
 * Class that encapsulates a validator for Akoma Ntoso documents to 
 * check against a specific version of the schema.
 * @author Ashok
 */
public class AnValidator {
    private static Logger logger = LoggerFactory.getLogger(AnValidator.class);

    public AnValidator() {
    }

    /**
     * Validates a schema against a specific version. The version of the schema is 
     * specified as an AnVersion object. Only schema versions packaged in the library can be validated.
     * @param version 
     * @param reader a stream reader object of the file to be validated
     * @return
     * @throws SAXException 
     */
    public static AnValidatorError validate(AnVersion version, Reader reader) throws SAXException {
        Source readerSource = new StreamSource(reader);
        return validate(version, readerSource);
    }

    /**
     * Validates a schema against a specific version. The version of the schema is 
     * specified as an AnVersion object. Only schema versions packaged in the library can be validated.
     * @param version 
     * @param iStream a stream object of the file to be validated
     * @return
     * @throws SAXException 
     */    
    public static AnValidatorError validate(AnVersion version, InputStream iStream) throws SAXException {
        Source streamSource = new StreamSource(iStream);
        return validate(version, streamSource);
    }   
    
    /**
     * Validates a schema against a specific version. The version of the schema is 
     * specified as an AnVersion object. Only schema versions packaged in the library can be validated.
     * @param version 
     * @param reader a URI to the file to be validated
     * @return
     * @throws SAXException 
     */
    public static AnValidatorError validate(AnVersion version, URI uri) throws SAXException {
        Source uriSource = new StreamSource(uri.toASCIIString());
        return validate(version, uriSource);
    }   
    
    /**
     * Validates a schema against a specific version. The version of the schema is 
     * specified as an AnVersion object. Only schema versions packaged in the library can be validated.
     * @param version 
     * @param ftoValidate a file handle to the file to be validated
     * @return
     * @throws SAXException 
     */    public static AnValidatorError validate(AnVersion version, File ftoValidate) throws SAXException {
        Source fileSource = new StreamSource(ftoValidate);
        return validate(version, fileSource);
    }
    
    /**
    * Validates a schema against a specific version. The version of the schema is 
    * specified as an AnVersion object. Only schema versions packaged in the library can be validated.
    * @param version 
    * @param reader a stream reader object of the file to be validated
    * @return
    * @throws SAXException 
    */
    public static AnValidatorError validate(AnVersion version, Source sSource) throws SAXException {
        AnValidatorError err = new AnValidatorError();
        Source schemaSource = new StreamSource(version.getSchemaForVersion());
        SchemaFactory schemaFactory = SchemaFactory.newInstance(
                XMLConstants.W3C_XML_SCHEMA_NS_URI
                );
        // to resolve things like xml.xsd
        schemaFactory.setResourceResolver(new PackageResourceResolver());
        final Schema schema = schemaFactory.newSchema(schemaSource);
        final Validator validator = schema.newValidator();
        try {
            validator.validate(sSource);
        } catch (IOException e) {
            logger.error("IO error during validation", e);
            err = new AnValidatorError(e);
            return err;
        } catch (SAXParseException e) {
            logger.error("VALIDATION ERROR: Sax Parse error Validation", e);
            err = new AnValidatorError(e);
            return err;
        } catch (SAXException e) {
            logger.error("VALIDATION ERROR: Sax Parse error Validation", e);
            err = new AnValidatorError(e);
            return err;
        }
        return err;
    }
}
