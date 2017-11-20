package com.lc.test;

import com.lc.xmlReader.LocalUtil;
import org.junit.Test;

import java.util.List;

public class XmlTest {

    @Test
    public void testXml() {
        LocalUtil localUtil = LocalUtil.getInstance();
        List<String> countrys = localUtil.getCountry();
        for (String country : countrys) {
            System.out.println(country);
        }
    }
}
