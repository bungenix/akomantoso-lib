package org.akomantoso;

import org.xml.sax.SAXParseException;

import java.io.IOException;

/**
 *
 * User: ashok
 * Date: 11/26/13
 * Time: 2:31 PM
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
}