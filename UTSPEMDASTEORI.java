/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pemogramandasar;
import java.util.Scanner;
/**
 *
 * @author WINDOWS 10
 */
public class UTSPEMDASTEORI {
    public static void main(String[] args) {
        int x, y;
boolean z;
x = 3; y = 7/2;
z = y == x;
System.out.println(z);
//        int nilai;
//nilai = 3 + 5 / 2 * 5;
//System.out.println(nilai);
//        

//        int discount = 25;  // Set initial discount to 25
//
//        // Print "harga:"
//        System.out.println("harga:");
//
//        // Input price
//        Scanner scanner = new Scanner(System.in);
//        int price = scanner.nextInt();
//
//        // Calculate price with the initial discount
//        price = price * (100 - discount) / 100;
//
//        // Print "membership:"
//        System.out.println("membership:");
//
//        // Input isMember
//        boolean isMember = scanner.nextBoolean();
//
//        // If isMember=true, set discount to 5
//        if (isMember) {
//            discount = 5;
//        }
//
//        // Calculate final price with the updated discount
//        price = price * (100 - discount) / 100;
//
//        // Print "harga:"
//        System.out.println("harga:");
//
//        // Print the final price
//        System.out.println(price);
//
//        // Print the final value of the discount
//        System.out.println("Variabel discount di akhir program: " + discount);
    }
}

//        package javaapplication1;
//        final double PHI = 3.14;
//        PHI = 3.14214;
 
//        int a = 3;
//int b = a % 5 < a ? 1 : 2;
//        System.out.println(b);
//        int a = 25;
//
//if (a % 3 == 0)
//    System.out.println("Zero");
//else if (a % 3 == 1)
//    System.out.println("One");
//else
//    System.out.println("Else");
//        int a = 10;
//
//if (a < 10)
//    System.out.println("A");
//    System.out.println("B");
//        System.out.println(((double)(1.0/2.0 + 3.5) * 2.0));
        
//        int P=10;P=P+5;
//        int Q=P;
//        System.out.println(P);
//        System.out.println(Q);
//        int a = 3;
//int b = ++a * 2;
//int s = a > 3 ? a++ + b : --a + b--;
//        System.out.println(s);
//        int a = 45000;
//if(a%5000>5){
//if(a==35000){ 
//System.out.println("Jawabannya A");
//}else{ 
//System.out.println("Jawabannya B");
//   }
//}else if(a%5000<=5){
//   if(a>=35000){
//System.out.println("Jawabannya C");
//   }else if(a<30000)
//{System.out.println("Jawabannya D");
//   }
//}else{
//System.out.println("Jawabannya E");
//}

    

/*
Deklarasi variable bukan merupakan bentuk akhir namun variable selanjutnya yang di nilai akhirkan
what is all the printf method in java

ChatGPT
In Java, the printf method is used to format and print text. It's part of the PrintStream and PrintWriter classes and is used to format the output in a specified manner. The printf method uses format specifiers to control the appearance of the output.

Here's the basic syntax for the printf method:

java
Copy code
System.out.printf(String format, Object... args);
Here are some common format specifiers used with printf in Java:

%d: integer
%f: floating-point number
%s: string
%c: character
%b: boolean
%n: newline
Here's a simple example demonstrating the usage of printf:

java
Copy code
public class PrintfExample {
    public static void main(String[] args) {
        int intValue = 42;
        double doubleValue = 3.14159;
        String stringValue = "Hello, world!";
        
        System.out.printf("Integer value: %d%n", intValue);
        System.out.printf("Double value: %f%n", doubleValue);
        System.out.printf("String value: %s%n", stringValue);
    }
}
Output:

vbnet
Copy code
Integer value: 42
Double value: 3.141590
String value: Hello, world!
You can use a combination of format specifiers and arguments to achieve the desired formatting for your output using the printf method in Java.




User
give all the method for print format in java
ChatGPT
In Java, the printf method is used for formatted printing. It is part of the PrintStream and PrintWriter classes. The printf method allows you to print formatted output using format specifiers. Here are the commonly used format specifiers in Java:

%d: Decimal integer
%f: Floating-point number
%s: String
%c: Character
%b: Boolean
%n: Newline
%t: Date/time conversions (followed by one of the conversion characters, e.g., %tB for full month name)
Here's a list of commonly used methods related to formatted printing in Java:

printf:

java
Copy code
System.out.printf(String format, Object... args);
format:

java
Copy code
String.format(String format, Object... args);
This method returns a formatted string using the specified format and arguments, similar to printf.

format(Locale l, String format, Object... args):

java
Copy code
String.format(Locale l, String format, Object... args);
Similar to String.format(String format, Object... args), but allows you to specify a locale for formatting.

These methods allow you to format and print text in a controlled manner using the specified format strings and arguments. The format strings use format specifiers to define how the output should be displayed.




User
how to format print with format in java to make it neat 
ChatGPT
To format output neatly using the String.format method in Java, you can use format specifiers and align the output using width and precision. Here's a basic example to demonstrate formatting for a neat output:

java
Copy code
public class FormatExample {
    public static void main(String[] args) {
        int intValue = 42;
        double doubleValue = 3.14159;
        String stringValue = "Hello, world!";

        // Formatting integers and floats
        System.out.println("Formatted integers and floats:");
        System.out.printf("Integer: %5d%n", intValue);  // Width of 5
        System.out.printf("Float: %.2f%n", doubleValue); // 2 decimal places

        // Formatting strings
        System.out.println("\nFormatted strings:");
        System.out.printf("String: %-15s%n", stringValue);  // Left-aligned, width of 15

        // Formatting using a combination
        System.out.println("\nCombination of formatting:");
        System.out.printf("Combined: %-10s | %7.2f | %03d%n", stringValue, doubleValue, intValue);
    }
}

Output:

yaml
Copy code
Formatted integers and floats:
Integer:    42
Float: 3.14

Formatted strings:
String: Hello, world!  

Combination of formatting:
Combined: Hello, world! |    3.14 | 042
In this example:

%5d specifies that the integer should be formatted in a field of width 5.
%.2f specifies that the float should have 2 decimal places.
%-15s specifies left-aligned string formatting in a field of width 15.
The combination of format specifiers demonstrates how you can format multiple values within a single formatted string.
By adjusting the width, precision, and alignment in the format specifiers, you can achieve neat and organized output according to your requirements.

 Berikut macam-macam Tipe Data dalam Java:
Numerik atau Angka
Bilangan Bulat (byte, short, int, long)
Bilangan Desimal (float, double)
2. Karakter (char)

3. Boolean (boolean)

#1. Tipe Data Numerik
Kita mulai yang pertama, tipe data numerik adalah tipe data yang digunakan pada variabel atau konstanta untuk menyimpan nilai dalam bentuk bilangan atau angka.

Jika menggunakan bilangan bulat, maka anda membutuhkan tipe data byte, short, int, dan long. Sedangkan float dan double digunakan untuk bilangan desimal.

Tipe data byte:

Ukuran memori 8-bit
Nilai miminimal -128 (-2⁷)
Nilai maksimal 127 (2⁷ -1)
Default value adalah 0
Contoh: byte a = 100, byte b = -50
Tipe data short:

Ukuran memori 16-bit
Nilai miminimal -32.768 (-2¹⁵)
Nilai maksimal 32.767 (2¹⁵ -1)
Default value adalah 0
Contoh: short s = 10000, short r = -20000
Tipe data int:

Ukuran memori 32-bit
Nilai miminimal -2.147.483.648 (-2³¹)
Nilai maksimal 2.147.483.647(2³¹ -1)
Default value adalah 0
Contoh: int a = 100000, int b = -200000
Tipe data long:

Ukuran memori 64-bit
Nilai miminimal -9.223.372.036.854.775.808 (-2⁶³)
Nilai maksimal 9.223.372.036.854.775.807 (2⁶³ -1)
Default value adalah 0L
Contoh: long a = 100000L, long b = -200000L
Tipe data bilangan bulat yang paling sering digunakan adalah int. Sedangkan byte dan short jarang digunakan bahkan long hampir tidak pernah digunakan.

Berikut contoh penggunaan tipe data bilangan bulat:

class TambahKurang {
 public static void main(String[] args){
 int x = 10;
 int y = 5;

System.out.println(x + " + " + y + " = " + (x+y));
System.out.println(x + " + " + y + " = " + (x-y));
   }
}
Kemudian ada juga tipe data angka untuk bilangan desimal.

Tipe data float:

Ukuran memori 32-bit
Digunakan untuk bilangan desimal
Default value adalah 0.0f
Contoh: float f1 = 234.5f
Tipe data double:

Ukuran memori 64-bit
Biasanya menjadi pilihan utama untuk bilangan desimal
Default value adalah 0.0d
Contoh: double d1 = 123.4
Berikut contoh penggunaan tipe data desimal:

class KaliBagi {
 public static void main(String[] args){
 double x = 7.0d;
 double y = 2.0d;

 System.out.println(x + " * " + y + " = " + (x*y));
 System.out.println(x + " / " + y + " = " + (x/y));
  
   }
}
#2 Tipe Data Logika
Jenis tipe data kedua adalah boolean:

Hanya memiliki dua nilai yaitu: true dan false)
tipe data boolean merepresentasikan satu bit informasi
Tipe data ini digunakan untuk menandai sebuah kondisi
Default value adalah false
Contoh: boolean one = true
#3. Tipe Data Karakter
Yang terakhir tipe data untuk karakter yaitu char:

Ukuran memori 16-bit
Untuk menyimpan karakter apapun
Contoh: char letterA = ‘A’
Sekarang kita sudah tahu apa saja jenis dan macam-macam tipe data pada bahasa Pemrograman Java, dan kita sudah tahu juga fungsi masing-masing tipe data.

Yang perlu anda ingat adalah: Tipe Data Primitive hanya mampu menyimpan satu nilai tiap satu variabel nya. Berbeda dengan Tipe Data Reference misalnya String.

Jika char hanya mampu menyimpan satu karakter maka berbeda dengan tipe data string yang mampu menyimpan banyak karakter dalam satu variabel.

Berikut contoh Program Char dan String pada Java:

class Karakter {
 public static void main(String[] args) {
  char f = 'F';
  char a = 'A';
  char v = 'V';
 String tulisanJava = "Java";

  System.out.println("char: "+f+a+v);
  System.out.println("String: "+tulisanJava);
  }
}
Pada program diatas jika menggunakan char akan tampil hanya 1 karakter setiap variabel, berbeda dengan string yang dapat menampung lebih dari 1 karakter meskipun hanya mendeklarasikan hanya sekali.
*/