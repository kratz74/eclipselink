/*******************************************************************************
 * Copyright (c) 2012, 2015 Oracle and/or its affiliates. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 and Eclipse Distribution License v. 1.0
 * which accompanies this distribution.
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * Contributors:
 *     Oracle - initial API and implementation
 *
 ******************************************************************************/
package org.eclipse.persistence.jpa.tests.jpql.parser;

import org.eclipse.persistence.jpa.jpql.parser.AbstractTraverseParentVisitor;

/**
 * This class is used to make sure the parent class {@link AbstractTraverseParentVisitor}
 * implements all the methods defined on the interface {@link ExpressionVisitor}.
 *
 * @version 2.4
 * @since 2.4
 * @author Pascal Filion
 */
final class TestAbstractTraverseParentVisitor extends AbstractTraverseParentVisitor {

    private TestAbstractTraverseParentVisitor() {
        super();
    }

    /**
     * IMPORTANT: NO METHODS TO IMPLEMENT. SHOULD ALL BE IMPLEMENTED BY AbstractTraverseParentVisitor.
     */
}
