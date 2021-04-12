import java.util.Dictionary;

public class Kittens {

	public static void main(String[] args) {
		
		String fac_number="1801261039";
		String first_name="Diyana";
		String sec_name="Dimitrova";
		System.out.println(fac_number +" "+first_name+" "+sec_name);
		
		String item1="M17";
		int count_item1=15;
		String item2="A15";
		int count_item2=10;
		String item3="G13";
		int count_item3=1;
		String item4="D10";
		int count_item4=1;
		String item5="P35";
		int count_item5=1;
		String item6="K25";
		double count_item6=169.77;
		
		String[] qualities=new String[]{"Metalni",
			"Aluminievi",
			"Gazov",
			"Durven", 
			"Plastmasov",
			"Kojen"};
		
		String[] items=new String[]{"Mechove",
				"Broni",
				"Pistolet",
				"Bidon", 
				"Sak"};
		
		for(int i=0;i<qualities.length;i++)
		{
			System.out.println(qualities[i]);
		}
		for(int i=0;i<items.length;i++)
		{
			System.out.println(items[i]);
		}
		
		String wish_to_graduate="Wish to get my diploma pls.";
		
		
	}

}
