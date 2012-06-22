/*******************************************************************************
 * Copyright (c) 1998, 2012 Oracle and/or its affiliates. All rights reserved.
 * This program and the accompanying materials are made available under the 
 * terms of the Eclipse Public License v1.0 and Eclipse Distribution License v. 1.0 
 * which accompanies this distribution. 
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at 
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * Contributors:
 *     Oracle - initial API and implementation from Oracle TopLink
 ******************************************************************************/  
package org.eclipse.persistence.testing.jaxb.xmlvalue;

import java.util.ArrayList;
import java.util.Calendar;
import org.eclipse.persistence.testing.jaxb.JAXBTestCases;

public class XmlValueTestCases extends JAXBTestCases {

    private final static String XML_RESOURCE = "org/eclipse/persistence/testing/jaxb/xmlvalue/phone_number.xml";
    private final static String CONTROL_NUMBER = "123-4567";

    public XmlValueTestCases(String name) throws Exception {
        super(name);
        setControlDocument(XML_RESOURCE);        
        Class[] classes = new Class[1];
        classes[0] = PhoneNumber.class;
        setClasses(classes);
    }

    protected Object getControlObject() {
        PhoneNumber pn = new PhoneNumber();
        pn.number = CONTROL_NUMBER;

        return pn;
    }
}
