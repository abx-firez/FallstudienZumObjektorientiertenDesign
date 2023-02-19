package lambda;

@FunctionalInterface  // kann weggelassen werden in dem Fall
interface IRectangleCalculator {

	double getArea(double length, double width);

}