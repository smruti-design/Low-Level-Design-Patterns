package com.sdw.expression;

public class NumberTerminalExpression implements AbstractExpression {
	
	String value;
	
	public NumberTerminalExpression(String value) {
		super();
		this.value = value;
	}

	
	@Override
	public int interpret(Context context) {
		return context.get(value);
	}

}
