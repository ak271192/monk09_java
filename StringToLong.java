
public class StringToLong {

	public static void main(String[] args) {
		//String to long conversion using Long.valueof()
		
		String strLong = "123456789";
		
		long number = Long.valueOf(strLong);
		System.out.println(+number);
		
		//String to long converison using lang.decode()
		
		 strLong = "-123456789";
		 number = Long.decode(strLong);
		 System.out.println(+number);
		 
		 //String to long in hexadecimal format
		 
		 strLong = "0xFFFF";
		 number = Long.decode(strLong);
		 System.out.println(+number);
		 
		 //String to long in octal format
		 
		 strLong = "0777";
		 number = Long.decode(strLong);
		 System.out.println(+number);
		 
		
		

	}

}
