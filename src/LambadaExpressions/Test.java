package LambadaExpressions;

@FunctionalInterface
interface Cab
{
	public String bookCab(String source, String destination);
}

public class Test {

	public static void main(String[] args) {
		Cab cab = (source,destination)->{
			System.out.println("Ola cab" +source+" is bookes...."+destination);
			return ("Price 500");
		};
		System.out.println(cab.bookCab("test source","Test destination"));
		
	}

}
