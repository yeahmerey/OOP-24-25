package bonus3 ; 
import java.io.* ; 
import java.util.* ; 

public class FilePart{
	public static void saveToFile(Dog dog , String fileName) throws IOException {
		String data = dog.toDataInfo() ; 
		String encodedData = Base64.getEncoder().encodeToString(data.getBytes()); 
		try(FileWriter writer = new FileWriter(fileName)) {
			writer.write(encodedData);
		}
	}
	public static String readEncodedFromFile(String fileName) throws IOException{
		StringBuilder encodedData = new StringBuilder() ;
		try(BufferedReader reader = new BufferedReader(new FileReader(fileName))){
			String line ; 
			while((line = reader.readLine())!=null) {
				encodedData.append(line); 
			}
		}
		return encodedData.toString() ;
	}
	public static Dog readFromFile(String fileName) throws IOException {
        String encodedData = readEncodedFromFile(fileName);
        String decodedData = new String(Base64.getDecoder().decode(encodedData));
        return Dog.fromDataInfo(decodedData);
    }
}