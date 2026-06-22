import java.io.FileReader;
import java.io.IOException;
public class FileInputOutput{
    public static void main(String[] args){
        try{
        FileReader file = new FileReader("Hello.txt");
        int character;
        while(character=reader.read()==-1)
        {
            System.out.println((char)character);
    }
    file.close();
}
}
}