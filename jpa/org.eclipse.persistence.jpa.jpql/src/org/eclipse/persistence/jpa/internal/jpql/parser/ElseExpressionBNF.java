/*******************************************************************************
 * Copyright (c) 2006, 2012 Oracle and/or its affiliates. All rights reserved.
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
package org.eclipse.persistence.jpa.internal.jpql.parser;

/**
 * The query BNF for a else expression specified in the case expression.
 *
 * @version 2.3
 * @since 2.3
 * @author Pascal Filion
 */
@SuppressWarnings("nls")
public final class ElseExpressionBNF extends JPQLQueryBNF {

	/**
	 * The unique identifier of this BNF rule.
	 */
	public static final String ID = "else_expression";

	/**
	 * Creates a new <code>ElseExpressionBNF</code>.
	 */
	ElseExpressionBNF() {
		super(ID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	String getFallbackBNFId() {
		return ScalarExpressionBNF.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean handleAggregate() {
		return true;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	void initialize() {
		super.initialize();

		registerChild(ScalarExpressionBNF.ID);
	}
}