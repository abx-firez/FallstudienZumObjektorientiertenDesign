package lamdbathis;

/**
 * Beispiel von https://openbook.rheinwerk-verlag.de/javainsel/12_001.html#u12
 * Listing 12.3 src/main/java/com/tutego/insel/lambda/InnerVsLambdaThis.java,
 * Ausschnitt
 *
 */
class InnerVsLambdaSuper {

	public InnerVsLambdaSuper() {

		Runnable lambdaRun = () -> System.out.println(super.getClass().getName());

		Runnable innerRun = new Runnable() {

			@Override
			public void run() {
				System.out.println(super.getClass().getName());
			}

		};

		lambdaRun.run(); // vom Typ InnerVsLambdaSuper

		innerRun.run(); // vom Typ InnerVsLambdaSuper$1, auch vom Typ Runnable, aber ohne Namen da anonyme Klasse

	}

	public static void main(String[] args) {

		new InnerVsLambdaSuper();

	}

}
