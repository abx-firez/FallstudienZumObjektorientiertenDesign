package functionalinterface;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionalInterfacesMain {

	public static void main(String[] args) {

		int myTestParamter = 5;
		Function<Integer, Integer> f = (x) -> 3 * x - 1;
		System.out.println("Function f (" + myTestParamter + ") = " + f.apply(myTestParamter));
		
		double firstVal = 3.0;
		double secondVal = 10.0;
		BiFunction<Double, Double , Double> bif = (x,y) -> x / y;
		System.out.println("Bifunction: " + bif.apply(firstVal, secondVal));
		
		BinaryOperator<Integer> binaryOp = (x,y) -> x + y;
		System.out.println("Binary Operator: " + binaryOp.apply(3, 5));
		
		Predicate<Integer> predicate = x -> x % 2 == 0;
		System.out.println("Predicate Gerade?: " + predicate.test(myTestParamter));

		Consumer<String> printer = x -> System.out.println(x);
		printer.accept("Consumer: Print me");

	}

}
