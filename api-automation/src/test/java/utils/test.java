package utils;

public class test {

	public static void main(String[] args) {
		String x = FileReader.getPropValue("config", "url");
		System.out.println(x);

	}

}
