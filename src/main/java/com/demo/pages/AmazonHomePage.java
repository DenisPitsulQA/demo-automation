package com.demo.pages;

import com.demo.core.base.PageTools;
import com.demo.pages.components.HeaderComponent;

public class AmazonHomePage extends PageTools {

    private HeaderComponent header;

    private String headerXPath = "//header";

    public AmazonHomePage() {
        this.header = new HeaderComponent(headerXPath);
    }

    public HeaderComponent getHeader() {
        return header;
    }
}
