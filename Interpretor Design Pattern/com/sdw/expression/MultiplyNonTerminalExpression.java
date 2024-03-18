package com.sdw.expression;

public class MultiplyNonTerminalExpression implements AbstractExpression {
	
	 AbstractExpression left;
	 AbstractExpression right;
	  

	public MultiplyNonTerminalExpression(AbstractExpression left, AbstractExpression right) {
		this.left = left;
		this.right = right;
	}


	@Override
	public int interpret(Context context) {
		return left.interpret(context) * right.interpret(context);
	}

}
