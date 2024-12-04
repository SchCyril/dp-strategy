package context;

import strategy.DefaultStrategy;
import strategy.Strategy;

public class Context {

	private Strategy strategy = new DefaultStrategy();
	public void strategyApply() {

		System.out.println("****Begin****");
		strategy.apply();
		System.out.println("****End****");
	}
	
	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}

}
