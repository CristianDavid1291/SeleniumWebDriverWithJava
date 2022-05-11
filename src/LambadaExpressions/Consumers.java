package LambadaExpressions;

import java.util.function.Consumer;

public class Consumers {

	public static void main(String[] args) {
		
		Consumer<String> c1 = s->System.out.println(s);
		c1.accept("Hello World");
		

	}

}
