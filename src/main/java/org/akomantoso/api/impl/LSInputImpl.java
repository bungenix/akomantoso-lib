package org.akomantoso.api.impl;

import java.io.InputStream;
import java.io.Reader;
import org.w3c.dom.ls.LSInput;

/**
 * This class is required implementation for setting up a custom 
 * package resolver
 * @author Ashok Hariharan
 */
public class LSInputImpl implements LSInput {

    Reader characterStream;
    InputStream byteStream;
    String stringData;
    String systemId;
    String publicId;
    String baseUri;
    boolean certifiedText;
    String encoding;
    
    @Override
    public Reader getCharacterStream() {
        return characterStream;
    }

    @Override
    public void setCharacterStream(Reader characterStream) {
        this.characterStream = characterStream;
    }

    @Override
    public InputStream getByteStream() {
        return byteStream;
    }

    @Override
    public void setByteStream(InputStream byteStream) {
        this.byteStream = byteStream;
    }

    @Override
    public String getStringData() {
        return this.stringData;
    }

    @Override
    public void setStringData(String stringData) {
        this.stringData = stringData;
    }

    @Override
    public String getSystemId() {
        return this.systemId;
    }

    @Override
    public void setSystemId(String systemId) {
        this.systemId = systemId;
    }

    @Override
    public String getPublicId() {
        return this.publicId;
    }

    @Override
    public void setPublicId(String publicId) {
        this.publicId = publicId;
    }

    @Override
    public String getBaseURI() {
        return this.baseUri;
    }

    @Override
    public void setBaseURI(String baseURI) {
        this.baseUri = baseURI;
    }

    @Override
    public String getEncoding() {
        return encoding;
    }

    @Override
    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }

    @Override
    public boolean getCertifiedText() {
        return this.certifiedText;
    }

    @Override
    public void setCertifiedText(boolean certifiedText) {
        this.certifiedText = certifiedText;
    }
    
}
