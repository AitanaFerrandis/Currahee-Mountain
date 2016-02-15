package curraee;

public class Pokemon {
	static String frase="Paco@es@un c1ch4nd4";
	static String decodificada="";
	static char letra;
	
	public static void main(String[] args) {	
		for(int i=0;i<frase.length();i++){
			letra=frase.charAt(i);
			switch (letra){
				case '@':
					decodificada+=" ";
				break;
				case '1':
					decodificada+="a";
				break;
				case '4':
					decodificada+="o";
				break;
				default: 
					decodificada+=frase.charAt(i);
					
			}
		}
		System.out.println(decodificada);
	}
}
