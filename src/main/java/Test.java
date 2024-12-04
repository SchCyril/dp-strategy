import java.util.Scanner;

import context.Context;
import strategy.Strategy;

public class Test {

	public static void main(String[] args) throws Exception{
		Scanner scanner = new Scanner(System.in);
		Context context = new Context();
		while (true) {
			System.out.println("Quelle strategie ?");
			String strategyClassName = scanner.nextLine();
			Strategy strategy = (Strategy) Class.forName(strategyClassName).getConstructor().newInstance();
			
			context.setStrategy(strategy);
			context.strategyApply();
		}
					
					
	}

}
