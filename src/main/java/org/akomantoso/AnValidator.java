package org.akomantoso;

/**
 *
 * User: Ashok Hariharan
 * Date: 11/25/13
 * Time: 2:08 PM
 *
 */

import java.io.File;
import java.io.IOException;
import javax.xml.XMLConstants;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import org.akomantoso.impl.PackageResourceResolver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;


public class AnValidator {
    Logger logger = LoggerFactory.getLogger(AnValidator.class);

    public AnValidator() {
    }

    public AnValidatorError validate(AnVersion version, File ftoValidate) throws SAXException {

        AnValidatorError err = new AnValidatorError();
        Source schemaSource = new StreamSource(version.getSchemaForVersion());
        Source fileSource = new StreamSource(ftoValidate);
        SchemaFactory schemaFactory = SchemaFactory.newInstance(
                XMLConstants.W3C_XML_SCHEMA_NS_URI
                );
        // to resolve things like xml.xsd
        schemaFactory.setResourceResolver(new PackageResourceResolver());
        final Schema schema = schemaFactory.newSchema(schemaSource);
        final Validator validator = schema.newValidator();
        try {
            validator.validate(fileSource);
        } catch (IOException e) {
            logger.error("IO error during validation", e);
            err = new AnValidatorError(e);
            return err;
        } catch (SAXParseException e) {
            logger.error("Sax Parse error Validation", e);
            err = new AnValidatorError(e);
            return err;
        } catch (SAXException e) {
            logger.error("Sax Parse error Validation", e);
            err = new AnValidatorError(e);
            return err;
        }
        return err;
    }
}
