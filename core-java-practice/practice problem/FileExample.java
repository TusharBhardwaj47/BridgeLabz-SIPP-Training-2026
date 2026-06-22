// import java.io.FileNotFoundException;
// import java.io.FileReader;

// public class FileExample{
//     public static void main(String[] args) {
//         try{
//             FileReader r = new FileReader("abc.txt");
//         }
//         catch (FileNotFoundException e){
//             System.out.println(e.getMessage());
//         }
//         int a=10/0;
//     }
// }

// import java.io.FileNotFoundException;
// import java.io.FileReader;

// public class FileExample{
//     public static void main(String[] args) throws FileNotFoundException {
//         // try{
//             FileReader r = new FileReader("abc.txt");
//         // }
//         // catch (FileNotFoundException e){
//         //     System.out.println(e.getMessage());
//         // }
//         int a=10/0;
//     }
// }


// import java.io.FileNotFoundException;
// import java.io.FileReader;
// import java.sql.SQLException;

// public class FileExample
// {
//     public void demo() throws FileNotFoundException, SQLException, ArithmeticException
//     {
//         FileReader r = new FileReader("abc.txt");
//     }
//         // try{
//     //     }
//     //     catch (FileNotFoundException e){
//     //         System.out.println(e.getMessage());
//     //     }
//     //     int a=10/0;
//     // }
//     public void hello() throws FileNotFoundException
//     {
//         FileExample example = new FileExample();
//         example.demo();

//     }
//     public static void main(String[] args) {
        
//     }
// }


// import java.io.FileNotFoundException;
// import java.io.FileReader;

// public class FileExample{
//     public static void main(String[] args) {
//         try{
//             FileReader r = new FileReader("abc.txt");
//             int a=10/0;
//         }
//         catch (FileNotFoundException e){
//             System.out.println(e.getMessage());
//         }
//     }
// }



// import java.io.FileNotFoundException;
// import java.io.FileReader;

// public class FileExample{
//     public static void main(String[] args) {
//         try{
//             FileReader r = new FileReader("abc.txt");
//             int a=10/0;
//         }
//         int a = 10+2;
//         catch (FileNotFoundException e){
//             System.out.println(e.getMessage());
//         }
//     }
// }



// import java.io.FileNotFoundException;
// import java.io.FileReader;

// public class FileExample{
//     public static void main(String[] args) {
//         try{
//             FileReader r = new FileReader("abc.txt");
//             int a=10/0;
//         }
//         catch(Exception e){
//             System.out.println(e.getMessage());
//         }
//         catch (ArithmeticException e){
//             System.out.println(e.getMessage());
//         }
//     }
// }

// import java.io.FileNotFoundException;
// import java.io.FileReader;

// public class FileExample{
//     public static void main(String[] args) {
//         System.out.println("Exception Caught");
//         System.out.println();
//         try{
//             FileReader r = new FileReader("abc.txt");
//         }
//         catch (Exception e){
//             System.out.println(e.getMessage());
//             e.printStackTrace();
//         }
//         int a=10/0;
//     }
// }

// public class FileExample{
//     int id;
//     public FileExample(int id){
//         this.id=id;
//     }
//     @Override
//     public String toString(){
//         return "ID"+ id;
//     }
//     public static void main(String[] args) {
//         FileExample file= new FileExample(10);
//         System.out.println(file); //memory address gets printed.
        
//     }
// }

import java.util.*;

public class FileExample{
    public static void main(String[] args) {
        String Name = "Sahil";
        System.out.println("Enter your name: ");
        Scanner sc = new Scanner(System.in);
        String username = sc.nextLine();
        if(username.equalsIgnoreCase(Name)){
            System.out.println("Login Successfull");
        }
        else{
            try {
                throw new UserNotFoundException("User Not Found Exception");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}