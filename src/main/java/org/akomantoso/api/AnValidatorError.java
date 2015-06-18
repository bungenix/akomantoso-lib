package org.akomantoso.api;

import java.io.IOException;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

/**
 * Used by the AnValidator class.
 * Stores validation errors that occur during validation.
 * if there are no validation errors, the isError() API returns false.
 *
 */
public class AnValidatorError {

    private boolean isError = false;
    private String systemId;
    private String message;
    private Integer lineNumber;
    private Integer columnNumber;
    private String stackTraceMsg;

    public AnValidatorError(){
        isError = false;
    }

    public AnValidatorError(SAXParseException e){
        isError = true;
        systemId = e.getSystemId();
        lineNumber = e.getLineNumber();
        columnNumber = e.getColumnNumber();
        message = e.getLocalizedMessage();
        stackTraceMsg = getStackTraceStr(e.getStackTrace());
    }

    public AnValidatorError(IOException e){
        isError = true;
        message = e.getLocalizedMessage();
        stackTraceMsg = getStackTraceStr(e.getStackTrace());
    }
    
    public AnValidatorError(SAXException e){
        isError = true;
        message = e.getLocalizedMessage();
        stackTraceMsg = getStackTraceStr(e.getStackTrace());
    }


    private String getStackTraceStr(StackTraceElement[] elems){
        StringBuilder sttMsg = new StringBuilder();
        for (StackTraceElement t : elems){
            sttMsg.append(t.toString());
        }
        return sttMsg.toString();
    }

    public String getSystemId() {
        return systemId;
    }

    public String getMessage() {
        return message;
    }

    public Integer getLineNumber() {
        return lineNumber;
    }

    public Integer getColumnNumber() {
        return columnNumber;
    }

    public String getStackTraceMsg() {
        return stackTraceMsg;
    }
    
    public boolean isError(){
        return this.isError;
    }
}
