package org.akomantoso;

/**
 *
 * User: ashok
 * Date: 11/25/13
 * Time: 2:08 PM
 *
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

import javax.xml.XMLConstants;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;
import java.io.IOException;
import java.net.URL;


public class AnValidator {
    Logger logger = LoggerFactory.getLogger(AnValidator.class);

    public AnValidator() {
    }

    public AnValidatorError validate(URL schemaFile, File ftoValidate) throws SAXException {
        AnValidatorError err = new AnValidatorError();
        Source validateThisFile = new StreamSource(ftoValidate);
        SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_INSTANCE_NS_URI);
        final Schema schema = schemaFactory.newSchema(schemaFile);
        final Validator validator = schema.newValidator();
        try {
            validator.validate(validateThisFile);
        } catch (IOException e) {
            logger.error("IO error during validation", e);
            err = new AnValidatorError(e);
            return err;
        } catch (SAXParseException e) {
            logger.error("Sax Parse error Validation", e);
            err = new AnValidatorError(e);
            return err;
        }
        return err;
    }
}
