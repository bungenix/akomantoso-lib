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
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xml.sax.SAXException;

/**
 * Encapsulates a parser for Akoma Ntoso documents.
 * You need to indicate the schema version, and it unmarshals the document for 
 * that schema and discovers the docType and returns a object handle to it.
 * 
 * See Issue 4 : https://github.com/kohsah/akomantoso-lib/issues/4 for the 
 * rationale for this.
 * 
 * @author ashok
 */
public class AnParser {
    
    private static Logger logger = LoggerFactory.getLogger(AnParser.class);
    
    public AnParser(){}
    
    /**
     * Unmarshalls an Akoma ntoso document - and returns an object of the identified type 
     * in the document. If the document type cannot be idenitifed, returns null. 
     * @param version an AnVersion object identifying the version of the schema to be used
     * @param fanXml the Akoma Ntoso xml document
     * @return AnDocType - this can be OpenStructure, HierarchialStructure etc.This returns the object
     * returned by getAct() , getBill() etc. whichever may be the appropriate doc type. Encapsulated with other
     * information related to the object
     * @throws JAXBException
     * @throws SAXException 
     */
    public static AnDocType parse(AnVersion version, File fanXml) throws JAXBException, SAXException {
        AnValidatorError vErr = AnValidator.validate(version, fanXml);
        AnDocType objDocType = null;
        if (vErr != null) {
            JAXBContext jc = version.getContext();
            Unmarshaller unmarshaller = jc.createUnmarshaller();
            JAXBElement anType = (JAXBElement) unmarshaller.unmarshal(fanXml);
            // returns the result Doc
            Object[] resultObj = AnTypeGetterHelper.getDocType(anType.getValue());
            if (resultObj != null) {
                String sType = (String)resultObj[0];
                Object methodResult = resultObj[1];
                objDocType = new AnDocType(methodResult, 
                        sType, 
                        methodResult.getClass().getName()
                        );
            }
        } else {
            logger.error("Error while validating XML document", vErr);
        }
        return objDocType;
    }

 }
