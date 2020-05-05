/*
 * generated by Xtext 2.19.0
 */
package org.sodalite.dsl.parser.antlr;

import org.antlr.runtime.Token;
import org.antlr.runtime.TokenSource;
import org.eclipse.xtext.parser.antlr.AbstractIndentationTokenSource;
import org.sodalite.dsl.parser.antlr.internal.InternalAADMParser;

public class AADMTokenSource extends AbstractIndentationTokenSource {

	public AADMTokenSource(TokenSource delegate) {
		super(delegate);
	}

	@Override
	protected boolean shouldSplitTokenImpl(Token token) {
		// TODO Review assumption
		return token.getType() == InternalAADMParser.RULE_WS;
	}

	@Override
	protected int getBeginTokenType() {
		// TODO Review assumption
		return InternalAADMParser.RULE_BEGIN;
	}

	@Override
	protected int getEndTokenType() {
		// TODO Review assumption
		return InternalAADMParser.RULE_END;
	}

}
