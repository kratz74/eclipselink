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
 *     01/28/2009-2.0 Guy Pelletier 
 *       - 248293: JPA 2.0 Element Collections (part 1)
 *     02/25/2009-2.0 Guy Pelletier 
 *       - 265359: JPA 2.0 Element Collections - Metadata processing portions
 *     11/06/2009-2.0 Guy Pelletier 
 *       - 286317: UniqueConstraint xml element is changing (plus couple other fixes, see bug)
 *     03/08/2010-2.1 Guy Pelletier 
 *       - 303632: Add attribute-type for mapping attributes to EclipseLink-ORM
 *     03/29/2010-2.1 Guy Pelletier 
 *       - 267217: Add Named Access Type to EclipseLink-ORM
 *     06/16/2010-2.2 Guy Pelletier 
 *       - 247078: eclipselink-orm.xml schema should allow lob and enumerated on version and id mappings
 *     10/15/2010-2.2 Guy Pelletier 
 *       - 322008: Improve usability of additional criteria applied to queries at the session/EM
 ******************************************************************************/  
package org.eclipse.persistence.testing.models.jpa.xml.advanced;

import org.eclipse.persistence.testing.framework.TogglingFastTableCreator;
import org.eclipse.persistence.tools.schemaframework.*;

public class AdvancedTableCreator extends TogglingFastTableCreator {

    public AdvancedTableCreator() {
        setName("EJB3EmployeeProject");

        addTableDefinition(buildADDRESSTable());
        addTableDefinition(buildCREDITCARDSTable());
        addTableDefinition(buildCREDITLINESTable());
        addTableDefinition(buildCUSTOMERTable());
        addTableDefinition(buildDEALERTable());
        addTableDefinition(buildEMPLOYEETable());
        addTableDefinition(buildLARGEPROJECTTable());
        addTableDefinition(buildMANTable());
        addTableDefinition(buildPARTNERLINKTable());
        addTableDefinition(buildPHONENUMBERTable());
        addTableDefinition(buildPROJECT_EMPTable());
        addTableDefinition(buildPROJECTTable());
        addTableDefinition(buildREADONLYCLASSTable());
        addTableDefinition(buildRESPONSTable());
        addTableDefinition(buildSALARYTable());
        addTableDefinition(buildWOMANTable());
        
        // Tables used only in extended test model
        addTableDefinition(buildLONERTable());
        addTableDefinition(buildLONERCHARACTERISTICSTable());
        addTableDefinition(buildCONFIDANTTable());
        
        addTableDefinition(buildSHOVELTable());
        addTableDefinition(buildSHOVELDIGGERTable());
        addTableDefinition(buildSHOVELOWNERTable());
        addTableDefinition(buildSHOVELPROJECTTable());
        addTableDefinition(buildSHOVELPROJECTSTable());

        addTableDefinition(buildVIOLATIONTable());
        addTableDefinition(buildVIOLATIONCODETable());
        addTableDefinition(buildVIOLATIONCODESTable());

		addTableDefinition(buildSTUDENTTable());
        addTableDefinition(buildSCHOOLTable());
        addTableDefinition(buildBOLTTable());
        addTableDefinition(buildNUTTable());
    }
    
    public static TableDefinition buildREADONLYCLASSTable() {
        TableDefinition table = new TableDefinition();
        table.setName("CMP3_XML_READONLY");
        
        FieldDefinition fieldID = new FieldDefinition();
        fieldID.setName("ID");
        fieldID.setTypeName("NUMERIC");
        fieldID.setSize(15);
        fieldID.setSubSize(0);
        fieldID.setIsPrimaryKey(true);
        fieldID.setIsIdentity(true);
        fieldID.setUnique(false);
        fieldID.setShouldAllowNull(false);
        table.addField(fieldID);
        
        return table;
    }
    
    public static TableDefinition buildADDRESSTable() {
        TableDefinition table = new TableDefinition();
        table.setName("CMP3_XML_ADDRESS");

        FieldDefinition fieldID = new FieldDefinition();
        fieldID.setName("ADDRESS_ID");
        fieldID.setTypeName("NUMERIC");
        fieldID.setSize(15);
        fieldID.setSubSize(0);
        fieldID.setIsPrimaryKey(true);
        fieldID.setIsIdentity(true);
        fieldID.setUnique(false);
        fieldID.setShouldAllowNull(false);
        table.addField(fieldID);

        FieldDefinition fieldSTREET = new FieldDefinition();
        fieldSTREET.setName("STREET");
        fieldSTREET.setTypeName("VARCHAR2");
        fieldSTREET.setSize(60);
        fieldSTREET.setSubSize(0);
        fieldSTREET.setIsPrimaryKey(false);
        fieldSTREET.setIsIdentity(false);
        fieldSTREET.setUnique(false);
        fieldSTREET.setShouldAllowNull(true);
        table.addField(fieldSTREET);

        FieldDefinition fieldCITY = new FieldDefinition();
        fieldCITY.setName("CITY");
        fieldCITY.setTypeName("VARCHAR2");
        fieldCITY.setSize(60);
        fieldCITY.setSubSize(0);
        fieldCITY.setIsPrimaryKey(false);
        fieldCITY.setIsIdentity(false);
        fieldCITY.setUnique(false);
        fieldCITY.setShouldAllowNull(true);
        table.addField(fieldCITY);

        FieldDefinition fieldPROVINCE = new FieldDefinition();
        fieldPROVINCE.setName("PROVINCE");
        fieldPROVINCE.setTypeName("VARCHAR2");
        fieldPROVINCE.setSize(60);
        fieldPROVINCE.setSubSize(0);
        fieldPROVINCE.setIsPrimaryKey(false);
        fieldPROVINCE.setIsIdentity(false);
        fieldPROVINCE.setUnique(false);
        fieldPROVINCE.setShouldAllowNull(true);
        table.addField(fieldPROVINCE);

        FieldDefinition fieldPOSTALCODE = new FieldDefinition();
        fieldPOSTALCODE.setName("P_CODE");
        fieldPOSTALCODE.setTypeName("VARCHAR2");
        fieldPOSTALCODE.setSize(67);
        fieldPOSTALCODE.setSubSize(0);
        fieldPOSTALCODE.setIsPrimaryKey(false);
        fieldPOSTALCODE.setIsIdentity(false);
        fieldPOSTALCODE.setUnique(false);
        fieldPOSTALCODE.setShouldAllowNull(true);
        table.addField(fieldPOSTALCODE);

        FieldDefinition fieldCOUNTRY = new FieldDefinition();
        fieldCOUNTRY.setName("COUNTRY");
        fieldCOUNTRY.setTypeName("VARCHAR2");
        fieldCOUNTRY.setSize(60);
        fieldCOUNTRY.setSubSize(0);
        fieldCOUNTRY.setIsPrimaryKey(false);
        fieldCOUNTRY.setIsIdentity(false);
        fieldCOUNTRY.setUnique(false);
        fieldCOUNTRY.setShouldAllowNull(true);
        table.addField(fieldCOUNTRY);
        
        FieldDefinition fieldType = new FieldDefinition();
        fieldType.setName("TYPE");
        fieldType.setTypeName("VARCHAR2");
        fieldType.setSize(150);
        fieldType.setSubSize(0);
        fieldType.setIsPrimaryKey(false);
        fieldType.setIsIdentity(false);
        fieldType.setUnique(false);
        fieldType.setShouldAllowNull(true);
        table.addField(fieldType);

        return table;
    }

    public static TableDefinition buildCONFIDANTTable() {
        TableDefinition table = new TableDefinition();
        table.setName("XML_CONFIDANT");

        FieldDefinition fieldID = new FieldDefinition();
        fieldID.setName("ID");
        fieldID.setTypeName("NUMERIC");
        fieldID.setSize(15);
        fieldID.setSubSize(0);
        fieldID.setIsPrimaryKey(true);
        fieldID.setIsIdentity(true);
        fieldID.setUnique(false);
        fieldID.setShouldAllowNull(false);
        table.addField(fieldID);
        
        FieldDefinition fieldLONERID = new FieldDefinition();
        fieldLONERID.setName("LONER_ID");
        fieldLONERID.setTypeName("NUMERIC");
        fieldLONERID.setSize(15);
        fieldLONERID.setShouldAllowNull(true);
        fieldLONERID.setIsPrimaryKey(false);
        fieldLONERID.setUnique(false);
        fieldLONERID.setIsIdentity(false);
        fieldLONERID.setForeignKeyFieldName("XML_LONER.ID");
        table.addField(fieldLONERID);

        return table;
    }
    
    public static TableDefinition buildCREDITCARDSTable() {
        TableDefinition table = new TableDefinition();
        table.setName("XMLEmployee_CREDITCARDS");
    
        FieldDefinition fieldID = new FieldDefinition();
        fieldID.setName("EMP_ID");
        fieldID.setTypeName("NUMERIC");
        fieldID.setSize(15);
        fieldID.setShouldAllowNull(false);
        fieldID.setIsPrimaryKey(false);
        fieldID.setUnique(false);
        fieldID.setIsIdentity(false);
        fieldID.setForeignKeyFieldName("CMP3_XML_EMPLOYEE.EMP_ID");
        table.addField(fieldID);
    
        FieldDefinition fieldCARD = new FieldDefinition();
        fieldCARD.setName("CARD");
        fieldCARD.setTypeName("VARCHAR");
        fieldCARD.setSize(2);
        fieldCARD.setShouldAllowNull(false);
        fieldCARD.setIsPrimaryKey(false);
        fieldCARD.setUnique(true);
        fieldCARD.setIsIdentity(false);
        table.addField(fieldCARD);
        
        FieldDefinition fieldNUMB = new FieldDefinition();
        fieldNUMB.setName("NUMB");
        fieldNUMB.setTypeName("VARCHAR");
        fieldNUMB.setSize(10);
        fieldNUMB.setShouldAllowNull(false);
        fieldNUMB.setIsPrimaryKey(false);
        fieldNUMB.setUnique(false);
        fieldNUMB.setIsIdentity(false);
        table.addField(fieldNUMB);
    
        return table;
    }
    
    public static TableDefinition buildCREDITLINESTable() {
        TableDefinition table = new TableDefinition();
        table.setName("EMP_CREDITLINES");
    
        FieldDefinition fieldID = new FieldDefinition();
        fieldID.setName("EMP_ID");
        fieldID.setTypeName("NUMERIC");
        fieldID.setSize(15);
        fieldID.setShouldAllowNull(false);
        fieldID.setIsPrimaryKey(false);
        fieldID.setUnique(false);
        fieldID.setIsIdentity(false);
        fieldID.setForeignKeyFieldName("CMP3_XML_EMPLOYEE.EMP_ID");
        table.addField(fieldID);
    
        FieldDefinition fieldBANK = new FieldDefinition();
        fieldBANK.setName("BANK");
        fieldBANK.setTypeName("VARCHAR");
        fieldBANK.setSize(4);
        fieldBANK.setShouldAllowNull(false);
        fieldBANK.setIsPrimaryKey(false);
        fieldBANK.setUnique(true);
        fieldBANK.setIsIdentity(false);
        table.addField(fieldBANK);
        
        FieldDefinition fieldACCOUNT = new FieldDefinition();
        fieldACCOUNT.setName("ACCOUNT");
        fieldACCOUNT.setTypeName("VARCHAR");
        fieldACCOUNT.setSize(10);
        fieldACCOUNT.setShouldAllowNull(false);
        fieldACCOUNT.setIsPrimaryKey(false);
        fieldACCOUNT.setUnique(false);
        fieldACCOUNT.setIsIdentity(false);
        table.addField(fieldACCOUNT);
    
        return table;
    }
    
    public static TableDefinition buildCUSTOMERTable() {
        TableDefinition table = new TableDefinition();
        table.setName("CMP3_XML_ADV_CUSTOMER");

        FieldDefinition field = new FieldDefinition();
        field.setName("CUSTOMER_ID");
        field.setTypeName("NUMERIC");
        field.setSize(15);
        field.setShouldAllowNull(false);
        field.setIsPrimaryKey(true);
        field.setUnique(false);
        field.setIsIdentity(true);
        table.addField(field);
    
        FieldDefinition field0 = new FieldDefinition();
        field0.setName("FK_DEALER_ID");
        field0.setTypeName("NUMERIC");
        field0.setSize(15);
        field0.setShouldAllowNull(true);
        field0.setIsPrimaryKey(false);
        field0.setUnique(false);
        field0.setIsIdentity(false);
        field0.setForeignKeyFieldName("CMP3_XML_DEALER.DEALER_ID");
        table.addField(field0);
    
        FieldDefinition field1 = new FieldDefinition();
        field1.setName("F_NAME");
        field1.setTypeName("VARCHAR");
        field1.setSize(40);
        field1.setShouldAllowNull(true);
        field1.setIsPrimaryKey(false);
        field1.setUnique(false);
        field1.setIsIdentity(false);
        table.addField(field1);
    
        FieldDefinition field2 = new FieldDefinition();
        field2.setName("L_NAME");
        field2.setTypeName("VARCHAR");
        field2.setSize(40);
        field2.setShouldAllowNull(true);
        field2.setIsPrimaryKey(false);
        field2.setUnique(false);
        field2.setIsIdentity(false);
        table.addField(field2);
        
        FieldDefinition field3 = new FieldDefinition();
        field3.setName("BUDGET");
        field3.setTypeName("NUMERIC");
        field3.setSize(15);
        field3.setShouldAllowNull(true);
        field3.setIsPrimaryKey(false);
        field3.setUnique(false);
        field3.setIsIdentity(false);
        table.addField(field3);
        
        FieldDefinition field4 = new FieldDefinition();
        field4.setName("VERSION");
        field4.setTypeName("NUMERIC");
        field4.setSize(15);
        field4.setShouldAllowNull(true);
        field4.setIsPrimaryKey(false);
        field4.setUnique(false);
        field4.setIsIdentity(false);
        table.addField(field4);
        
        return table;
    }
    
    public static TableDefinition buildDEALERTable() {
        TableDefinition table = new TableDefinition();
        table.setName("CMP3_XML_DEALER");

        FieldDefinition field = new FieldDefinition();
        field.setName("DEALER_ID");
        field.setTypeName("NUMERIC");
        field.setSize(15);
        field.setShouldAllowNull(false);
        field.setIsPrimaryKey(true);
        field.setUnique(false);
        field.setIsIdentity(true);
        table.addField(field);
    
        FieldDefinition field0 = new FieldDefinition();
        field0.setName("FK_EMP_ID");
        field0.setTypeName("NUMERIC");
        field0.setSize(15);
        field0.setShouldAllowNull(true);
        field0.setIsPrimaryKey(false);
        field0.setUnique(false);
        field0.setIsIdentity(false);
        field0.setForeignKeyFieldName("CMP3_XML_EMPLOYEE.EMP_ID");
        table.addField(field0);
    
        FieldDefinition field1 = new FieldDefinition();
        field1.setName("F_NAME");
        field1.setTypeName("VARCHAR");
        field1.setSize(40);
        field1.setShouldAllowNull(true);
        field1.setIsPrimaryKey(false);
        field1.setUnique(false);
        field1.setIsIdentity(false);
        table.addField(field1);
    
        FieldDefinition field2 = new FieldDefinition();
        field2.setName("L_NAME");
        field2.setTypeName("VARCHAR");
        field2.setSize(40);
        field2.setShouldAllowNull(true);
        field2.setIsPrimaryKey(false);
        field2.setUnique(false);
        field2.setIsIdentity(false);
        table.addField(field2);
        
        FieldDefinition field3 = new FieldDefinition();
        field3.setName("STATUS");
        field3.setTypeName("VARCHAR");
        field3.setSize(40);
        field3.setShouldAllowNull(true);
        field3.setIsPrimaryKey(false);
        field3.setUnique(false);
        field3.setIsIdentity(false);
        table.addField(field3);
        
        FieldDefinition field4 = new FieldDefinition();
        field4.setName("VERSION");
        field4.setTypeName("NUMERIC");
        field4.setSize(15);
        field4.setShouldAllowNull(true);
        field4.setIsPrimaryKey(false);
        field4.setUnique(false);
        field4.setIsIdentity(false);
        table.addField(field4);
        
        return table;
    }
    
    public static TableDefinition buildEMPLOYEETable() {
        TableDefinition table = new TableDefinition();
        // SECTION: TABLE
        table.setName("CMP3_XML_EMPLOYEE");
    
        // SECTION: FIELD
        org.eclipse.persistence.tools.schemaframework.FieldDefinition field = new org.eclipse.persistence.tools.schemaframework.FieldDefinition();
        field.setName("EMP_ID");
        field.setTypeName("NUMERIC");
        field.setSize(15);
        field.setShouldAllowNull(false );
        field.setIsPrimaryKey(true );
        field.setUnique(false );
        field.setIsIdentity(true );
        table.addField(field);
    
        // SECTION: FIELD
        org.eclipse.persistence.tools.schemaframework.FieldDefinition field1 = new org.eclipse.persistence.tools.schemaframework.FieldDefinition();
        field1.setName("F_NAME");
        field1.setTypeName("VARCHAR");
        field1.setSize(40);
        field1.setShouldAllowNull(true );
        field1.setIsPrimaryKey(false );
        field1.setUnique(false );
        field1.setIsIdentity(false );
        table.addField(field1);
    
        // SECTION: FIELD
        org.eclipse.persistence.tools.schemaframework.FieldDefinition field2 = new org.eclipse.persistence.tools.schemaframework.FieldDefinition();
        field2.setName("L_NAME");
        field2.setTypeName("VARCHAR");
        field2.setSize(40);
        field2.setShouldAllowNull(true );
        field2.setIsPrimaryKey(false );
        field2.setUnique(false );
        field2.setIsIdentity(false );
        table.addField(field2);
        
        org.eclipse.persistence.tools.schemaframework.FieldDefinition sin = new org.eclipse.persistence.tools.schemaframework.FieldDefinition();
        sin.setName("SIN");
        sin.setTypeName("VARCHAR");
        sin.setSize(10);
        sin.setShouldAllowNull(true );
        sin.setIsPrimaryKey(false );
        sin.setUnique(false );
        sin.setIsIdentity(false );
        table.addField(sin);
    
        FieldDefinition fieldGender = new FieldDefinition();
        fieldGender.setName("GENDER");
        fieldGender.setTypeName("VARCHAR");
        fieldGender.setSize(1);
        fieldGender.setShouldAllowNull(true);
        fieldGender.setIsPrimaryKey(false);
        fieldGender.setUnique(false);
        fieldGender.setIsIdentity(false);
        table.addField(fieldGender);
        
        // SECTION: FIELD
        org.eclipse.persistence.tools.schemaframework.FieldDefinition field3 = new org.eclipse.persistence.tools.schemaframework.FieldDefinition();
        field3.setName("START_DATE");
        field3.setTypeName("DATE");
        field3.setSize(23);
        field3.setShouldAllowNull(true );
        field3.setIsPrimaryKey(false );
        field3.setUnique(false );
        field3.setIsIdentity(false );
        table.addField(field3);
    
        // SECTION: FIELD
        org.eclipse.persistence.tools.schemaframework.FieldDefinition field4 = new org.eclipse.persistence.tools.schemaframework.FieldDefinition();
        field4.setName("END_DATE");
        field4.setTypeName("DATE");
        field4.setSize(23);
        field4.setShouldAllowNull(true );
        field4.setIsPrimaryKey(false );
        field4.setUnique(false );
        field4.setIsIdentity(false );
        table.addField(field4);
    
        FieldDefinition field5 = new FieldDefinition();
        field5.setName("START_TIME");
        field5.setTypeName("TIME");
        field5.setSize(23);
        field5.setShouldAllowNull(true);
        field5.setIsPrimaryKey(false);
        field5.setUnique(false);
        field5.setIsIdentity(false);
        table.addField(field5);

        FieldDefinition field6 = new FieldDefinition();
        field6.setName("END_TIME");
        field6.setTypeName("TIME");
        field6.setSize(23);
        field6.setShouldAllowNull(true);
        field6.setIsPrimaryKey(false);
        field6.setUnique(false);
        field6.setIsIdentity(false);
        table.addField(field6);

        FieldDefinition fieldOvertimeStart = new FieldDefinition();
        fieldOvertimeStart.setName("START_OVERTIME");
        fieldOvertimeStart.setTypeName("TIME");
        fieldOvertimeStart.setSize(23);
        fieldOvertimeStart.setShouldAllowNull(true);
        fieldOvertimeStart.setIsPrimaryKey(false);
        fieldOvertimeStart.setUnique(false);
        fieldOvertimeStart.setIsIdentity(false);
        table.addField(fieldOvertimeStart);

        FieldDefinition fieldOvertimeEnd = new FieldDefinition();
        fieldOvertimeEnd.setName("END_OVERTIME");
        fieldOvertimeEnd.setTypeName("TIME");
        fieldOvertimeEnd.setSize(23);
        fieldOvertimeEnd.setShouldAllowNull(true);
        fieldOvertimeEnd.setIsPrimaryKey(false);
        fieldOvertimeEnd.setUnique(false);
        fieldOvertimeEnd.setIsIdentity(false);
        table.addField(fieldOvertimeEnd);

        // SECTION: FIELD
        org.eclipse.persistence.tools.schemaframework.FieldDefinition field8 = new org.eclipse.persistence.tools.schemaframework.FieldDefinition();
        field8.setName("ADDR_ID");
        field8.setTypeName("NUMERIC");
        field8.setSize(15);
        field8.setShouldAllowNull(true );
        field8.setIsPrimaryKey(false );
        field8.setUnique(false );
        field8.setIsIdentity(false );
        field8.setForeignKeyFieldName("CMP3_XML_ADDRESS.ADDRESS_ID");
        table.addField(field8);
    
        // SECTION: FIELD
        org.eclipse.persistence.tools.schemaframework.FieldDefinition field9 = new org.eclipse.persistence.tools.schemaframework.FieldDefinition();
        field9.setName("MANAGER_EMP_ID");
        field9.setTypeName("NUMERIC");
        field9.setSize(15);
        field9.setShouldAllowNull(true );
        field9.setIsPrimaryKey(false );
        field9.setUnique(false );
        field9.setIsIdentity(false );
        field9.setForeignKeyFieldName("CMP3_XML_EMPLOYEE.EMP_ID");
        table.addField(field9);
    
        // SECTION: FIELD
        org.eclipse.persistence.tools.schemaframework.FieldDefinition field10 = new org.eclipse.persistence.tools.schemaframework.FieldDefinition();
        field10.setName("VERSION");
        field10.setTypeName("NUMERIC");
        field10.setSize(15);
        field10.setShouldAllowNull(true );
        field10.setIsPrimaryKey(false );
        field10.setUnique(false );
        field10.setIsIdentity(false );
        table.addField(field10);
        
        FieldDefinition fieldPayScale = new FieldDefinition();
        fieldPayScale.setName("PAY_SCALE");
        fieldPayScale.setTypeName("VARCHAR");
        fieldPayScale.setSize(40);
        fieldPayScale.setIsPrimaryKey(false);
        fieldPayScale.setUnique(false);
        fieldPayScale.setIsIdentity(false);
        fieldPayScale.setShouldAllowNull(true);
        table.addField(fieldPayScale);
        
        return table;
    }

    public static TableDefinition buildEMPLOYEE_SEQTable() {
        TableDefinition table = new TableDefinition();
        table.setName("CMP3_XML_EMPLOYEE_SEQ");

        FieldDefinition fieldSEQ_COUNT = new FieldDefinition();
        fieldSEQ_COUNT.setName("SEQ_COUNT");
        fieldSEQ_COUNT.setTypeName("NUMBER");
        fieldSEQ_COUNT.setSize(15);
        fieldSEQ_COUNT.setSubSize(0);
        fieldSEQ_COUNT.setIsPrimaryKey(false);
        fieldSEQ_COUNT.setIsIdentity(false);
        fieldSEQ_COUNT.setUnique(false);
        fieldSEQ_COUNT.setShouldAllowNull(false);
        table.addField(fieldSEQ_COUNT);

        FieldDefinition fieldSEQ_NAME = new FieldDefinition();
        fieldSEQ_NAME.setName("SEQ_NAME");
        fieldSEQ_NAME.setTypeName("VARCHAR2");
        fieldSEQ_NAME.setSize(80);
        fieldSEQ_NAME.setSubSize(0);
        fieldSEQ_NAME.setIsPrimaryKey(true);
        fieldSEQ_NAME.setIsIdentity(false);
        fieldSEQ_NAME.setUnique(false);
        fieldSEQ_NAME.setShouldAllowNull(false);
        table.addField(fieldSEQ_NAME);

        return table;
    }
    public static TableDefinition buildLARGEPROJECTTable() {
        TableDefinition table = new TableDefinition();
        table.setName("CMP3_XML_LPROJECT");

        // SECTION: FIELD
        org.eclipse.persistence.tools.schemaframework.FieldDefinition field = new org.eclipse.persistence.tools.schemaframework.FieldDefinition();
        field.setName("PROJ_ID");
        field.setTypeName("NUMERIC");
        field.setSize(15);
        field.setShouldAllowNull(false );
        field.setIsPrimaryKey(true );
        field.setUnique(false );
        field.setIsIdentity(false );
        field.setForeignKeyFieldName("CMP3_XML_PROJECT.PROJ_ID");
        table.addField(field);
    
        // SECTION: FIELD
        org.eclipse.persistence.tools.schemaframework.FieldDefinition field1 = new org.eclipse.persistence.tools.schemaframework.FieldDefinition();
        field1.setName("BUDGET");
        field1.setTypeName("DOUBLE PRECIS");
        field1.setSize(18);
        field1.setShouldAllowNull(true );
        field1.setIsPrimaryKey(false );
        field1.setUnique(false );
        field1.setIsIdentity(false );
        table.addField(field1);
    
        return table;
    }
    
    public static TableDefinition buildLONERCHARACTERISTICSTable() {
        TableDefinition table = new TableDefinition();
        table.setName("XML_LONER_CHARACTERISTICS");
    
        FieldDefinition fieldID = new FieldDefinition();
        fieldID.setName("LONER_ID");
        fieldID.setTypeName("NUMERIC");
        fieldID.setSize(15);
        fieldID.setShouldAllowNull(false);
        fieldID.setIsPrimaryKey(false);
        fieldID.setUnique(false);
        fieldID.setIsIdentity(false);
        fieldID.setForeignKeyFieldName("XML_LONER.ID");
        table.addField(fieldID);
    
        FieldDefinition fieldCHARACTERISTIC = new FieldDefinition();
        fieldCHARACTERISTIC.setName("CHARACTERISTIC");
        fieldCHARACTERISTIC.setTypeName("VARCHAR");
        fieldCHARACTERISTIC.setSize(50);
        fieldCHARACTERISTIC.setShouldAllowNull(false);
        fieldCHARACTERISTIC.setIsPrimaryKey(false);
        fieldCHARACTERISTIC.setUnique(false);
        fieldCHARACTERISTIC.setIsIdentity(false);
        table.addField(fieldCHARACTERISTIC);
    
        return table;
    }
    
    public static TableDefinition buildLONERTable() {
        TableDefinition table = new TableDefinition();
        table.setName("XML_LONER");

        FieldDefinition fieldID = new FieldDefinition();
        fieldID.setName("ID");
        fieldID.setTypeName("NUMERIC");
        fieldID.setSize(15);
        fieldID.setSubSize(0);
        fieldID.setIsPrimaryKey(true);
        fieldID.setIsIdentity(true);
        fieldID.setUnique(false);
        fieldID.setShouldAllowNull(false);
        table.addField(fieldID);

        FieldDefinition fieldVERSION = new FieldDefinition();
        fieldVERSION.setName("VERSION");
        fieldVERSION.setTypeName("NUMERIC");
        fieldVERSION.setSize(15);
        fieldVERSION.setShouldAllowNull(true);
        fieldVERSION.setIsPrimaryKey(false);
        fieldVERSION.setUnique(false);
        fieldVERSION.setIsIdentity(false);
        table.addField(fieldVERSION);

        FieldDefinition fieldFIRSTNAME = new FieldDefinition();
        fieldFIRSTNAME.setName("F_NAME");
        fieldFIRSTNAME.setTypeName("VARCHAR");
        fieldFIRSTNAME.setSize(40);
        fieldFIRSTNAME.setShouldAllowNull(true);
        fieldFIRSTNAME.setIsPrimaryKey(false);
        fieldFIRSTNAME.setUnique(false);
        fieldFIRSTNAME.setIsIdentity(false);
        table.addField(fieldFIRSTNAME);
        
        FieldDefinition fieldLASTNAME = new FieldDefinition();
        fieldLASTNAME.setName("L_NAME");
        fieldLASTNAME.setTypeName("VARCHAR");
        fieldLASTNAME.setSize(40);
        fieldLASTNAME.setShouldAllowNull(true);
        fieldLASTNAME.setIsPrimaryKey(false);
        fieldLASTNAME.setUnique(false);
        fieldLASTNAME.setIsIdentity(false);
        table.addField(fieldLASTNAME);        

        return table;
    }

    public static TableDefinition buildMANTable() {
        TableDefinition table = new TableDefinition();
        table.setName("XML_MAN");

        FieldDefinition fieldID = new FieldDefinition();
        fieldID.setName("ID");
        fieldID.setTypeName("NUMERIC");
        fieldID.setSize(15);
        fieldID.setSubSize(0);
        fieldID.setIsPrimaryKey(true);
        fieldID.setIsIdentity(true);
        fieldID.setUnique(false);
        fieldID.setShouldAllowNull(false);
        table.addField(fieldID);

        FieldDefinition field1 = new FieldDefinition();
        field1.setName("F_NAME");
        field1.setTypeName("VARCHAR");
        field1.setSize(40);
        field1.setShouldAllowNull(true);
        field1.setIsPrimaryKey(false);
        field1.setUnique(false);
        field1.setIsIdentity(false);
        table.addField(field1);
    
        FieldDefinition field2 = new FieldDefinition();
        field2.setName("L_NAME");
        field2.setTypeName("VARCHAR");
        field2.setSize(40);
        field2.setShouldAllowNull(true);
        field2.setIsPrimaryKey(false);
        field2.setUnique(false);
        field2.setIsIdentity(false);
        table.addField(field2);        

        return table;
    }

    public static TableDefinition buildPARTNERLINKTable() {
        TableDefinition table = new TableDefinition();
        table.setName("XML_MW");

        FieldDefinition fieldMID = new FieldDefinition();
        fieldMID.setName("M");
        fieldMID.setTypeName("NUMERIC");
        fieldMID.setSize(15);
        fieldMID.setSubSize(0);
        fieldMID.setIsPrimaryKey(false);
        fieldMID.setIsIdentity(false);
        fieldMID.setUnique(false);
        fieldMID.setShouldAllowNull(true);
        fieldMID.setForeignKeyFieldName("XML_MAN.ID");
        table.addField(fieldMID);
        
        FieldDefinition fieldWID = new FieldDefinition();
        fieldWID.setName("W");
        fieldWID.setTypeName("NUMERIC");
        fieldWID.setSize(15);
        fieldWID.setSubSize(0);
        fieldWID.setIsPrimaryKey(false);
        fieldWID.setIsIdentity(false);
        fieldWID.setUnique(false);
        fieldWID.setShouldAllowNull(true);
        fieldWID.setForeignKeyFieldName("XML_WOMAN.ID");
        table.addField(fieldWID);
        
        return table;
    }

    public static TableDefinition buildPHONENUMBERTable() {
        TableDefinition table = new TableDefinition();
        table.setName("CMP3_XML_PHONENUMBER");

        // SECTION: FIELD
        org.eclipse.persistence.tools.schemaframework.FieldDefinition field = new org.eclipse.persistence.tools.schemaframework.FieldDefinition();
        field.setName("OWNER_ID");
        field.setTypeName("NUMERIC");
        field.setSize(15);
        field.setShouldAllowNull(false );
        field.setIsPrimaryKey(true );
        field.setUnique(false );
        field.setIsIdentity(false );
        field.setForeignKeyFieldName("CMP3_XML_EMPLOYEE.EMP_ID");
        table.addField(field);
    
        // SECTION: FIELD
        org.eclipse.persistence.tools.schemaframework.FieldDefinition field1 = new org.eclipse.persistence.tools.schemaframework.FieldDefinition();
        field1.setName("TYPE");
        field1.setTypeName("VARCHAR");
        field1.setSize(15);
        field1.setShouldAllowNull(false );
        field1.setIsPrimaryKey(true );
        field1.setUnique(false );
        field1.setIsIdentity(false );
        table.addField(field1);
    
        // SECTION: FIELD
        org.eclipse.persistence.tools.schemaframework.FieldDefinition field2 = new org.eclipse.persistence.tools.schemaframework.FieldDefinition();
        field2.setName("AREA_CODE");
        field2.setTypeName("VARCHAR");
        field2.setSize(3);
        field2.setShouldAllowNull(true );
        field2.setIsPrimaryKey(false );
        field2.setUnique(false );
        field2.setIsIdentity(false );
        table.addField(field2);
    
        // SECTION: FIELD
        org.eclipse.persistence.tools.schemaframework.FieldDefinition field3 = new org.eclipse.persistence.tools.schemaframework.FieldDefinition();
        field3.setName("NUMB");
        field3.setTypeName("VARCHAR");
        field3.setSize(8);
        field3.setShouldAllowNull(true );
        field3.setIsPrimaryKey(false );
        field3.setUnique(false );
        field3.setIsIdentity(false );
        table.addField(field3);

        return table;
    }

    public static TableDefinition buildPROJECT_EMPTable() {
        TableDefinition table = new TableDefinition();

        table.setName("CMP3_XML_PROJ_EMP");

        // SECTION: FIELD
        org.eclipse.persistence.tools.schemaframework.FieldDefinition field = new org.eclipse.persistence.tools.schemaframework.FieldDefinition();
        field.setName("EMP_ID");
        field.setTypeName("NUMERIC");
        field.setSize(15);
        field.setShouldAllowNull(false );
        field.setIsPrimaryKey(true );
        field.setUnique(false );
        field.setIsIdentity(false );
        field.setForeignKeyFieldName("CMP3_XML_EMPLOYEE.EMP_ID");
        table.addField(field);
    
        // SECTION: FIELD
        org.eclipse.persistence.tools.schemaframework.FieldDefinition field1 = new org.eclipse.persistence.tools.schemaframework.FieldDefinition();
        field1.setName("PROJ_ID");
        field1.setTypeName("NUMERIC");
        field1.setSize(15);
        field1.setShouldAllowNull(false );
        field1.setIsPrimaryKey(true );
        field1.setUnique(false );
        field1.setIsIdentity(false );
        field1.setForeignKeyFieldName("CMP3_XML_PROJECT.PROJ_ID");
        table.addField(field1);

        return table;
    }

    public static TableDefinition buildPROJECTTable() {
        TableDefinition table = new TableDefinition();

        table.setName("CMP3_XML_PROJECT");

        // SECTION: FIELD
        org.eclipse.persistence.tools.schemaframework.FieldDefinition field = new org.eclipse.persistence.tools.schemaframework.FieldDefinition();
        field.setName("PROJ_ID");
        field.setTypeName("NUMERIC");
        field.setSize(15);
        field.setShouldAllowNull(false );
        field.setIsPrimaryKey(true );
        field.setUnique(false );
        field.setIsIdentity(true );
        table.addField(field);
    
        // SECTION: FIELD
        org.eclipse.persistence.tools.schemaframework.FieldDefinition field1 = new org.eclipse.persistence.tools.schemaframework.FieldDefinition();
        field1.setName("PROJ_TYPE");
        field1.setTypeName("VARCHAR");
        field1.setSize(1);
        field1.setShouldAllowNull(true );
        field1.setIsPrimaryKey(false );
        field1.setUnique(false );
        field1.setIsIdentity(false );
        table.addField(field1);
    
        // SECTION: FIELD
        org.eclipse.persistence.tools.schemaframework.FieldDefinition field2 = new org.eclipse.persistence.tools.schemaframework.FieldDefinition();
        field2.setName("PROJ_NAME");
        field2.setTypeName("VARCHAR");
        field2.setSize(30);
        field2.setShouldAllowNull(true );
        field2.setIsPrimaryKey(false );
        field2.setUnique(false );
        field2.setIsIdentity(false );
        table.addField(field2);
    
        // SECTION: FIELD
        org.eclipse.persistence.tools.schemaframework.FieldDefinition field3 = new org.eclipse.persistence.tools.schemaframework.FieldDefinition();
        field3.setName("DESCRIP");
        field3.setTypeName("VARCHAR");
        field3.setSize(200);
        field3.setShouldAllowNull(true );
        field3.setIsPrimaryKey(false );
        field3.setUnique(false );
        field3.setIsIdentity(false );
        table.addField(field3);
    
        // SECTION: FIELD
        org.eclipse.persistence.tools.schemaframework.FieldDefinition field4 = new org.eclipse.persistence.tools.schemaframework.FieldDefinition();
        field4.setName("LEADER_ID");
        field4.setTypeName("NUMERIC");
        field4.setSize(15);
        field4.setShouldAllowNull(true );
        field4.setIsPrimaryKey(false );
        field4.setUnique(false );
        field4.setIsIdentity(false );
        field4.setForeignKeyFieldName("CMP3_XML_EMPLOYEE.EMP_ID");
        table.addField(field4);
    
        // SECTION: FIELD
        org.eclipse.persistence.tools.schemaframework.FieldDefinition field5 = new org.eclipse.persistence.tools.schemaframework.FieldDefinition();
        field5.setName("VERSION");
        field5.setTypeName("NUMERIC");
        field5.setSize(15);
        field5.setShouldAllowNull(true );
        field5.setIsPrimaryKey(false );
        field5.setUnique(false );
        field5.setIsIdentity(false );
        table.addField(field5);

        return table;
    }

    public static TableDefinition buildRESPONSTable() {
        TableDefinition table = new TableDefinition();
        // SECTION: TABLE
        table.setName("CMP3_XML_RESPONS");
    
        // SECTION: FIELD
        FieldDefinition field = new FieldDefinition();
        field.setName("EMP_ID");
        field.setTypeName("NUMERIC");
        field.setSize(15);
        field.setShouldAllowNull(false);
        field.setIsPrimaryKey(false);
        field.setUnique(false);
        field.setIsIdentity(false);
        field.setForeignKeyFieldName("CMP3_XML_EMPLOYEE.EMP_ID");
        table.addField(field);
    
        // SECTION: FIELD
        FieldDefinition field1 = new FieldDefinition();
        field1.setName("DESCRIPTION");
        field1.setTypeName("VARCHAR");
        field1.setSize(200);
        field1.setShouldAllowNull(false);
        field1.setIsPrimaryKey(false);
        field1.setUnique(false);
        field1.setIsIdentity(false);
        table.addField(field1);
    
        return table;
    }

    public static TableDefinition buildSALARYTable() {
        TableDefinition table = new TableDefinition();
        table.setName("CMP3_XML_SALARY");

        FieldDefinition fieldEMP_ID = new FieldDefinition();
        fieldEMP_ID.setName("E_ID");
        fieldEMP_ID.setTypeName("NUMERIC");
        fieldEMP_ID.setSize(15);
        fieldEMP_ID.setSubSize(0);
        fieldEMP_ID.setIsPrimaryKey(true);
        fieldEMP_ID.setIsIdentity(false);
        fieldEMP_ID.setUnique(false);
        fieldEMP_ID.setShouldAllowNull(false);
        fieldEMP_ID.setForeignKeyFieldName("CMP3_XML_EMPLOYEE.EMP_ID");
        table.addField(fieldEMP_ID);

        FieldDefinition fieldSALARY = new FieldDefinition();
        fieldSALARY.setName("SALARY");
        fieldSALARY.setTypeName("NUMBER");
        fieldSALARY.setSize(15);
        fieldSALARY.setSubSize(0);
        fieldSALARY.setIsPrimaryKey(false);
        fieldSALARY.setIsIdentity(false);
        fieldSALARY.setUnique(false);
        fieldSALARY.setShouldAllowNull(true);
        table.addField(fieldSALARY);

        return table;
    }

	public TableDefinition buildSCHOOLTable() {
        TableDefinition table = new TableDefinition();
        table.setName("JPA_XML_AC_SCHOOL");

        FieldDefinition fieldID = new FieldDefinition();
        fieldID.setName("ID");
        fieldID.setTypeName("NUMERIC");
        fieldID.setSize(15);
        fieldID.setShouldAllowNull(false);
        fieldID.setIsPrimaryKey(true);
        fieldID.setUnique(false);
        fieldID.setIsIdentity(true);
        table.addField(fieldID);
        
        FieldDefinition fieldNAME = new FieldDefinition();
        fieldNAME.setName("NAME");
        fieldNAME.setTypeName("VARCHAR2");
        fieldNAME.setSize(60);
        fieldNAME.setSubSize(0);
        fieldNAME.setIsPrimaryKey(false);
        fieldNAME.setIsIdentity(false);
        fieldNAME.setUnique(false);
        fieldNAME.setShouldAllowNull(true);
        table.addField(fieldNAME);
    
        return table;
    }
    
    public TableDefinition buildSTUDENTTable() {
        TableDefinition table = new TableDefinition();
        table.setName("JPA_XML_AC_STUDENT");

        FieldDefinition fieldID = new FieldDefinition();
        fieldID.setName("ID");
        fieldID.setTypeName("NUMERIC");
        fieldID.setSize(15);
        fieldID.setShouldAllowNull(false);
        fieldID.setIsPrimaryKey(true);
        fieldID.setUnique(false);
        fieldID.setIsIdentity(true);
        table.addField(fieldID);
        
        FieldDefinition fieldNAME = new FieldDefinition();
        fieldNAME.setName("NAME");
        fieldNAME.setTypeName("VARCHAR2");
        fieldNAME.setSize(60);
        fieldNAME.setSubSize(0);
        fieldNAME.setIsPrimaryKey(false);
        fieldNAME.setIsIdentity(false);
        fieldNAME.setUnique(false);
        fieldNAME.setShouldAllowNull(true);
        table.addField(fieldNAME);

        FieldDefinition fieldSCHOOL_ID = new FieldDefinition();
        fieldSCHOOL_ID.setName("SCHOOL_ID");
        fieldSCHOOL_ID.setTypeName("NUMERIC");
        fieldSCHOOL_ID.setSize(15);
        fieldSCHOOL_ID.setIsPrimaryKey(false);
        fieldSCHOOL_ID.setIsIdentity(false);
        fieldSCHOOL_ID.setUnique(false);
        fieldSCHOOL_ID.setShouldAllowNull(false);
        fieldSCHOOL_ID.setForeignKeyFieldName("JPA_XML_AC_SCHOOL.ID");
        table.addField(fieldSCHOOL_ID);
        
        return table;
    }
    
    public TableDefinition buildBOLTTable() {
        TableDefinition table = new TableDefinition();
        table.setName("JPA_XML_AC_BOLT");

        FieldDefinition fieldID = new FieldDefinition();
        fieldID.setName("ID");
        fieldID.setTypeName("NUMERIC");
        fieldID.setSize(15);
        fieldID.setShouldAllowNull(false);
        fieldID.setIsPrimaryKey(true);
        fieldID.setUnique(false);
        fieldID.setIsIdentity(true);
        table.addField(fieldID);

        FieldDefinition fieldNUT_ID = new FieldDefinition();
        fieldNUT_ID.setName("NUT_ID");
        fieldNUT_ID.setTypeName("NUMERIC");
        fieldNUT_ID.setSize(15);
        fieldNUT_ID.setIsPrimaryKey(false);
        fieldNUT_ID.setIsIdentity(false);
        fieldNUT_ID.setUnique(false);
        fieldNUT_ID.setShouldAllowNull(false);
        fieldNUT_ID.setForeignKeyFieldName("JPA_XML_AC_NUT.ID");
        table.addField(fieldNUT_ID);
        
        return table;
    }
    
    public TableDefinition buildNUTTable() {
        TableDefinition table = new TableDefinition();
        table.setName("JPA_XML_AC_NUT");

        FieldDefinition fieldID = new FieldDefinition();
        fieldID.setName("ID");
        fieldID.setTypeName("NUMERIC");
        fieldID.setSize(15);
        fieldID.setShouldAllowNull(false);
        fieldID.setIsPrimaryKey(true);
        fieldID.setUnique(false);
        fieldID.setIsIdentity(true);
        table.addField(fieldID);
        
        FieldDefinition fieldCOLOR = new FieldDefinition();
        fieldCOLOR.setName("COLOR");
        fieldCOLOR.setTypeName("VARCHAR2");
        fieldCOLOR.setSize(60);
        fieldCOLOR.setSubSize(0);
        fieldCOLOR.setIsPrimaryKey(false);
        fieldCOLOR.setIsIdentity(false);
        fieldCOLOR.setUnique(false);
        fieldCOLOR.setShouldAllowNull(true);
        table.addField(fieldCOLOR);
        
        FieldDefinition fieldSIZE = new FieldDefinition();
        fieldSIZE.setName("B_SIZE");
        fieldSIZE.setTypeName("NUMERIC");
        fieldSIZE.setSize(15);
        fieldSIZE.setShouldAllowNull(true);
        fieldSIZE.setIsPrimaryKey(false);
        fieldSIZE.setUnique(false);
        fieldSIZE.setIsIdentity(false);
        table.addField(fieldSIZE);
        
        return table;
    }

    public static TableDefinition buildSHOVELDIGGERTable() {
        TableDefinition table = new TableDefinition();
        table.setName("XML_SHOVEL_DIGGER");

        FieldDefinition fieldID = new FieldDefinition();
        fieldID.setName("ID");
        fieldID.setTypeName("NUMERIC");
        fieldID.setSize(15);
        fieldID.setSubSize(0);
        fieldID.setIsPrimaryKey(true);
        fieldID.setIsIdentity(true);
        fieldID.setUnique(false);
        fieldID.setShouldAllowNull(false);
        table.addField(fieldID);

        FieldDefinition fieldNAME = new FieldDefinition();
        fieldNAME.setName("DIGGER_NAME");
        fieldNAME.setTypeName("VARCHAR");
        fieldNAME.setSize(40);
        fieldNAME.setShouldAllowNull(true);
        fieldNAME.setIsPrimaryKey(false);
        fieldNAME.setUnique(false);
        fieldNAME.setIsIdentity(false);
        table.addField(fieldNAME);  
        
        FieldDefinition fieldSHOVEL = new FieldDefinition();
        fieldSHOVEL.setName("SHOVEL_ID");
        fieldSHOVEL.setTypeName("NUMERIC");
        fieldSHOVEL.setSize(15);
        fieldSHOVEL.setShouldAllowNull(true);
        fieldSHOVEL.setIsPrimaryKey(false);
        fieldSHOVEL.setUnique(false);
        fieldSHOVEL.setIsIdentity(false);
        fieldSHOVEL.setForeignKeyFieldName("XML_SHOVEL.ID");
        table.addField(fieldSHOVEL);

        return table;
    }
    
    public static TableDefinition buildSHOVELOWNERTable() {
        TableDefinition table = new TableDefinition();
        table.setName("XML_SHOVEL_OWNER");

        FieldDefinition fieldID = new FieldDefinition();
        fieldID.setName("ID");
        fieldID.setTypeName("NUMERIC");
        fieldID.setSize(15);
        fieldID.setSubSize(0);
        fieldID.setIsPrimaryKey(true);
        fieldID.setIsIdentity(true);
        fieldID.setUnique(false);
        fieldID.setShouldAllowNull(false);
        table.addField(fieldID);

        FieldDefinition fieldNAME = new FieldDefinition();
        fieldNAME.setName("OWNER_NAME");
        fieldNAME.setTypeName("VARCHAR");
        fieldNAME.setSize(40);
        fieldNAME.setShouldAllowNull(true);
        fieldNAME.setIsPrimaryKey(false);
        fieldNAME.setUnique(false);
        fieldNAME.setIsIdentity(false);
        table.addField(fieldNAME);  

        return table;
    }
    
    public static TableDefinition buildSHOVELPROJECTSTable() {
        TableDefinition table = new TableDefinition();
        table.setName("XML_SHOVEL_PROJECTS");

        FieldDefinition fieldSHOVEL = new FieldDefinition();
        fieldSHOVEL.setName("SHOVEL_ID");
        fieldSHOVEL.setTypeName("NUMERIC");
        fieldSHOVEL.setSize(15);
        fieldSHOVEL.setShouldAllowNull(true);
        fieldSHOVEL.setIsPrimaryKey(false);
        fieldSHOVEL.setUnique(false);
        fieldSHOVEL.setIsIdentity(false);
        fieldSHOVEL.setForeignKeyFieldName("XML_SHOVEL.ID");
        table.addField(fieldSHOVEL);

        FieldDefinition fieldPROJECT = new FieldDefinition();
        fieldPROJECT.setName("PROJECT_ID");
        fieldPROJECT.setTypeName("NUMERIC");
        fieldPROJECT.setSize(15);
        fieldPROJECT.setShouldAllowNull(true);
        fieldPROJECT.setIsPrimaryKey(false);
        fieldPROJECT.setUnique(false);
        fieldPROJECT.setIsIdentity(false);
        fieldPROJECT.setForeignKeyFieldName("XML_SHOVEL_PROJECT.ID");
        table.addField(fieldPROJECT);

        return table;
    }
    
    public static TableDefinition buildSHOVELPROJECTTable() {
        TableDefinition table = new TableDefinition();
        table.setName("XML_SHOVEL_PROJECT");

        FieldDefinition fieldID = new FieldDefinition();
        fieldID.setName("ID");
        fieldID.setTypeName("NUMERIC");
        fieldID.setSize(15);
        fieldID.setSubSize(0);
        fieldID.setIsPrimaryKey(true);
        fieldID.setIsIdentity(true);
        fieldID.setUnique(false);
        fieldID.setShouldAllowNull(false);
        table.addField(fieldID);

        FieldDefinition fieldDESCRIPTION = new FieldDefinition();
        fieldDESCRIPTION.setName("DESCRIP");
        fieldDESCRIPTION.setTypeName("VARCHAR");
        fieldDESCRIPTION.setSize(40);
        fieldDESCRIPTION.setShouldAllowNull(true);
        fieldDESCRIPTION.setIsPrimaryKey(false);
        fieldDESCRIPTION.setUnique(false);
        fieldDESCRIPTION.setIsIdentity(false);
        table.addField(fieldDESCRIPTION);  

        return table;
    }
    
    public static TableDefinition buildSHOVELTable() {
        TableDefinition table = new TableDefinition();
        table.setName("XML_SHOVEL");

        FieldDefinition fieldID = new FieldDefinition();
        fieldID.setName("ID");
        fieldID.setTypeName("NUMERIC");
        fieldID.setSize(15);
        fieldID.setSubSize(0);
        fieldID.setIsPrimaryKey(true);
        fieldID.setIsIdentity(true);
        fieldID.setUnique(false);
        fieldID.setShouldAllowNull(false);
        table.addField(fieldID);

        FieldDefinition fieldCOST = new FieldDefinition();
        fieldCOST.setName("COST");
        fieldCOST.setTypeName("DOUBLE PRECIS");
        fieldCOST.setSize(15);
        fieldCOST.setShouldAllowNull(true);
        fieldCOST.setIsPrimaryKey(false);
        fieldCOST.setUnique(false);
        fieldCOST.setIsIdentity(false);
        table.addField(fieldCOST);
        
        FieldDefinition fieldVERSION = new FieldDefinition();
        fieldVERSION.setName("VERSION");
        fieldVERSION.setTypeName("NUMERIC");
        fieldVERSION.setSize(15);
        fieldVERSION.setShouldAllowNull(true);
        fieldVERSION.setIsPrimaryKey(false);
        fieldVERSION.setUnique(false);
        fieldVERSION.setIsIdentity(false);
        table.addField(fieldVERSION);

        FieldDefinition fieldOWNERID = new FieldDefinition();
        fieldOWNERID.setName("OWNER_ID");
        fieldOWNERID.setTypeName("NUMERIC");
        fieldOWNERID.setSize(15);
        fieldOWNERID.setShouldAllowNull(true);
        fieldOWNERID.setIsPrimaryKey(false);
        fieldOWNERID.setUnique(false);
        fieldOWNERID.setIsIdentity(false);
        fieldOWNERID.setForeignKeyFieldName("XML_SHOVEL_OWNER.ID");
        table.addField(fieldOWNERID);
        
        FieldDefinition fieldHANDLE = new FieldDefinition();
        fieldHANDLE.setName("HANDLE");
        fieldHANDLE.setTypeName("VARCHAR");
        fieldHANDLE.setSize(25);
        fieldHANDLE.setShouldAllowNull(true);
        fieldHANDLE.setIsPrimaryKey(false);
        fieldHANDLE.setUnique(false);
        fieldHANDLE.setIsIdentity(false);
        table.addField(fieldHANDLE);
        
        FieldDefinition fieldSHAFT = new FieldDefinition();
        fieldSHAFT.setName("SHAFT");
        fieldSHAFT.setTypeName("VARCHAR");
        fieldSHAFT.setSize(25);
        fieldSHAFT.setShouldAllowNull(true);
        fieldSHAFT.setIsPrimaryKey(false);
        fieldSHAFT.setUnique(false);
        fieldSHAFT.setIsIdentity(false);
        table.addField(fieldSHAFT);
        
        FieldDefinition fieldSCOOP = new FieldDefinition();
        fieldSCOOP.setName("SCOOP");
        fieldSCOOP.setTypeName("VARCHAR");
        fieldSCOOP.setSize(25);
        fieldSCOOP.setShouldAllowNull(true);
        fieldSCOOP.setIsPrimaryKey(false);
        fieldSCOOP.setUnique(false);
        fieldSCOOP.setIsIdentity(false);
        table.addField(fieldSCOOP);
        
        return table;
    }

public static TableDefinition buildVIOLATIONTable() {
	    TableDefinition table = new TableDefinition();
	    table.setName("XML_VIOLATION");
	    
        FieldDefinition fieldID = new FieldDefinition();
        fieldID.setName("ID");
        fieldID.setTypeName("VARCHAR");
        fieldID.setSize(2);
        fieldID.setSubSize(0);
        fieldID.setIsPrimaryKey(true);
        fieldID.setIsIdentity(true);
        fieldID.setUnique(false);
        fieldID.setShouldAllowNull(false);
        table.addField(fieldID);
        
	    return table;
	}
	
	public static TableDefinition buildVIOLATIONCODETable() {
	    TableDefinition table = new TableDefinition();
	    table.setName("XML_VIOLATION_CODE");
	    
        FieldDefinition fieldID = new FieldDefinition();
        fieldID.setName("ID");
        fieldID.setTypeName("NUMERIC");
        fieldID.setSize(15);
        fieldID.setSubSize(0);
        fieldID.setIsPrimaryKey(true);
        fieldID.setIsIdentity(true);
        fieldID.setUnique(false);
        fieldID.setShouldAllowNull(false);
        table.addField(fieldID);
        
        FieldDefinition fieldDESCRIP = new FieldDefinition();
        fieldDESCRIP.setName("DESCRIP");
        fieldDESCRIP.setTypeName("VARCHAR");
        fieldDESCRIP.setSize(100);
        fieldDESCRIP.setShouldAllowNull(true);
        fieldDESCRIP.setIsPrimaryKey(false);
        fieldDESCRIP.setUnique(false);
        fieldDESCRIP.setIsIdentity(false);
        table.addField(fieldDESCRIP);
	    
	    return table;
    }
	
	public static TableDefinition buildVIOLATIONCODESTable() {
        TableDefinition table = new TableDefinition();
        table.setName("XML_VIOLATION_CODES");
        
        FieldDefinition fieldVIOLATIONID = new FieldDefinition();
        fieldVIOLATIONID.setName("VIOLATION_ID");
        fieldVIOLATIONID.setTypeName("VARCHAR");
        fieldVIOLATIONID.setSize(2);
        fieldVIOLATIONID.setSubSize(0);
        fieldVIOLATIONID.setIsPrimaryKey(false);
        fieldVIOLATIONID.setIsIdentity(false);
        fieldVIOLATIONID.setUnique(false);
        fieldVIOLATIONID.setShouldAllowNull(false);
        fieldVIOLATIONID.setForeignKeyFieldName("XML_VIOLATION.ID");
        table.addField(fieldVIOLATIONID);
        
        FieldDefinition fieldVIOLATIONCODEID = new FieldDefinition();
        fieldVIOLATIONCODEID.setName("VIOLATION_CODE_ID");
        fieldVIOLATIONCODEID.setTypeName("NUMERIC");
        fieldVIOLATIONCODEID.setSize(15);
        fieldVIOLATIONCODEID.setSubSize(0);
        fieldVIOLATIONCODEID.setIsPrimaryKey(false);
        fieldVIOLATIONCODEID.setIsIdentity(false);
        fieldVIOLATIONCODEID.setUnique(false);
        fieldVIOLATIONCODEID.setShouldAllowNull(false);
        fieldVIOLATIONCODEID.setForeignKeyFieldName("XML_VIOLATION_CODE.ID");
        table.addField(fieldVIOLATIONCODEID);
        
        return table;
    }

    public static TableDefinition buildWOMANTable() {
         TableDefinition table = new TableDefinition();
         table.setName("XML_WOMAN");

         FieldDefinition fieldID = new FieldDefinition();
         fieldID.setName("ID");
         fieldID.setTypeName("NUMERIC");
         fieldID.setSize(15);
         fieldID.setSubSize(0);
         fieldID.setIsPrimaryKey(true);
         fieldID.setIsIdentity(true);
         fieldID.setUnique(false);
         fieldID.setShouldAllowNull(false);
         table.addField(fieldID);

         FieldDefinition field1 = new FieldDefinition();
         field1.setName("F_NAME");
         field1.setTypeName("VARCHAR");
         field1.setSize(40);
         field1.setShouldAllowNull(true);
         field1.setIsPrimaryKey(false);
         field1.setUnique(false);
         field1.setIsIdentity(false);
         table.addField(field1);

         FieldDefinition field2 = new FieldDefinition();
         field2.setName("L_NAME");
         field2.setTypeName("VARCHAR");
         field2.setSize(40);
         field2.setShouldAllowNull(true);
         field2.setIsPrimaryKey(false);
         field2.setUnique(false);
         field2.setIsIdentity(false);
         table.addField(field2);        

         return table;
     }
}
