package bonus3;
import java.io.* ; 
public class Test {
	public static void main(String[] args) {
        String fileName = "dog_data.txt";

        Dog bobby = new Dog("Bobby", 3, "White");

        try {
            FilePart.saveToFile(bobby, fileName);
            System.out.println("Date saved to file: " + fileName);

            Dog readDog = FilePart.readFromFile(fileName);
            System.out.println("Encoded data : ");
            String readDogCode = FilePart.readEncodedFromFile(fileName); 
            System.out.println(readDogCode) ; 
            System.out.println("Decoded data:");
            System.out.println(readDog);
        } catch (IOException e) {
            System.err.println("Ошибка при работе с файлом: " + e.getMessage());
        }
    }
}
