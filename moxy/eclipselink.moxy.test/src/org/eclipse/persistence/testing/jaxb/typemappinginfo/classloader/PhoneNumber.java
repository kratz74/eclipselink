/*******************************************************************************
* Copyright (c) 1998, 2015 Oracle and/or its affiliates. All rights reserved.
* This program and the accompanying materials are made available under the
* terms of the Eclipse Public License v1.0 and Eclipse Distribution License v. 1.0
* which accompanies this distribution.
* The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
* and the Eclipse Distribution License is available at
* http://www.eclipse.org/org/documents/edl-v10.php.
*
* Contributors:
*     bdoughan - February 5/2010 - 2.0.1 - Initial implementation
******************************************************************************/
package org.eclipse.persistence.testing.jaxb.typemappinginfo.classloader;

public class PhoneNumber {

    public String areaCode;
    public String number;

    public boolean equals(Object theObject){
        if(theObject instanceof PhoneNumber){
            PhoneNumber phone = (PhoneNumber)theObject;
           if(!areaCode.equals(phone.areaCode)){
               return false;
           }
           if(!number.equals(phone.number)){
               return false;
           }
           return true;
        }else{
           return false;
        }
    }

}
