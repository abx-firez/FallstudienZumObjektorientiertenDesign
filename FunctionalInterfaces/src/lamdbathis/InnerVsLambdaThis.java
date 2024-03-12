package lamdbathis;

import java.util.function.Predicate;

/**
 * Beispiel von https://openbook.rheinwerk-verlag.de/javainsel/12_001.html#u12
 * Listing 12.3 src/main/java/com/tutego/insel/lambda/InnerVsLambdaThis.java,
 * Ausschnitt
 *
 */
public class InnerVsLambdaThis {

	String fooString = "foo";
	
	public InnerVsLambdaThis() {
		
		Runnable lambdaRun = () -> System.out.println(this.getClass().getName() + ", " + fooString);

		Runnable innerRun = new Runnable() {

			@Override
			public void run() {
				System.out.println(this.getClass().getName() + ", " + fooString);
			}

		};

		lambdaRun.run(); // vom Typ InnerVsLambdaThis

		innerRun.run(); // vom Typ InnerVsLambdaThis$1, auch vom Typ Runnable, aber ohne Namen da anonyme Klasse

	}

	public static void main(String[] args) {

//		new InnerVsLambdaThis();
	
		Predicate<Integer> predicate = x -> x % 2 == 0;
		System.out.println("Predicate Gerade?: " + predicate.test(14));


	}

}
