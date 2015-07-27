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

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Helper class to resolve doc type of an input XML document
 * @author Ashok Hariharan
 */
public class AnTypeGetterHelper {
    
    private static Logger logger = LoggerFactory.getLogger(AnTypeGetterHelper.class);
    
    public AnTypeGetterHelper() {}
    /**
     * Stores the name of the doc type and its corresponding accessor method
     */
    private static class AnTypeMethod {
        
        public final String anType;
        public final String anGetMethod;
        
        AnTypeMethod(String type, String getMethod){
            this.anGetMethod = getMethod;
            this.anType = type;
        }
    }
    
    /**
     * Map of all supported doc types and accessor methods
     */
    private static final AnTypeMethod[] anTypeMethods = {
        new AnTypeMethod("act", "getAct"),
        new AnTypeMethod("amendment", "getAmendent"),
        new AnTypeMethod("amendmentList", "getAmendentList"),
        new AnTypeMethod("bill", "getBill"),
        new AnTypeMethod("debate", "getDebate"),
        new AnTypeMethod("debateReport", "getDebateReport"),
        new AnTypeMethod("doc", "getDoc"),
        new AnTypeMethod("documentCollection", "getDocumentCollection"),
        new AnTypeMethod("fragment", "getFragment"),
        new AnTypeMethod("judgement", "getJudgement"),
        new AnTypeMethod("officialGazette", "getOfficialGazette"),
        new AnTypeMethod("statement", "getStatement"), 
    };
    
    /**
     * Checks if an accessor method exists, returns it.
     * @param anType
     * @param anMethod
     * @return 
     */
    private Method getMethod(Object anType, String anMethod){
        Method typeMethod = null;
        try {
            typeMethod = anType.getClass().getMethod(anMethod, (Class<?>[]) null);
        } catch (NoSuchMethodException ex) {
            logger.info("Method : "+ anMethod + " was not found", ex);
        } catch (SecurityException ex) {
            logger.info("Accessing Method :" + anMethod + " threw a security exception", ex);
        }
        return typeMethod;
    }
    
    /**
     * We check the AkomaNtosoType object for the document type accessor methods
     * Only the valid document type accessor will return a non-null value.
     * @param anType 
     * @return an Object array whose first element is a String containing the name of the 
     * element type, and the second is the output object from getBill(), getAct() etc as 
     * it may resolve to.
     */
    public Object[] getDocType(Object anType) {
        Object[] retArr = null;
        // first we need to invoke getValue() on the unmarsshaled object 
        
        // iterate through all the accessor methods
        for (AnTypeMethod anMethod : anTypeMethods) {
            // get the method
            // we have to check if the method exists, because the supported doctypes
            // across AN versions may change
            Method typeMethod = getMethod(anType, anMethod.anGetMethod);
            Object methodResult = null;
            if (typeMethod != null) {
                try {
                    //now invoke the method
                    methodResult = typeMethod.invoke(anType, (Object[])null);
                } catch (IllegalAccessException ex) {
                    logger.info("Error while accessing method", ex);
                } catch (IllegalArgumentException ex) {
                    logger.info("Error while accessing method - wrong argument", ex);
                } catch (InvocationTargetException ex) {
                    logger.info("Error while accessing method", ex);
                }
                if (methodResult != null){
                    // if the result is not null - the type has been identified
                    retArr = new Object[]{
                      anMethod.anType,
                      methodResult
                    };
                    return retArr;
                }
            }
        }
        return retArr;
    }
    
}
