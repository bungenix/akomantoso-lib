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

/**
 * This class encapsulates the return type of the parse() API
 * @author ashok
 */
public class AnDocType {
    
    /**
     * The Actual object type - this is the output of getAct(), getBill(), getAmendmentList()
     * as the case may be.
     */
    public final Object objType;
    /**
     * This is the actual Akoma Ntoso type name. i.e. the name of the element 
     * <bill> , <act> etc..
     */
    public final String typeName;
    /**
     * This is purely for convenience, its resolved java class name of the underlying object
     */
    public final String objClass;
    
    public AnDocType(Object objType, String typeName, String objClass) {
        this.objType = objType;
        this.typeName = typeName;
        this.objClass = objClass;
    }
    
}
