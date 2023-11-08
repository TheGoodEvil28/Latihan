/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.pemogramandasar;

/**
 *
 * @author WINDOWS 10
 */
public class Variable {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        int nilai=10;
        double nilai_2=5.3;
        int hasil;
        String s = "Belajar Java";
        System.out.println(nilai+nilai_2);
        System.out.println("Kita sedang "+s);
    }
}
/*
Rules to Declare a Variable :
1. A variable name can consist of Capital letters A-Z, lowercase letters a-z digits 0-9, and two special characters such as _ underscore and $ dollar sign.
2. The first character must not be a digit.
3. Blank spaces cannot be used in variable names.
4. Java keywords cannot be used as variable names.
5. Variable names are case-sensitive.
6. There is no limit on the length of a variable name but by convention, it should be between 4 to 15 chars.
7. Variable names always should exist on the left-hand side of assignment operators.

List of Java keywords that can't be used for variable :

abstract	continue	 for            new             switch
assert          package 	synchronized	default         goto
boolean         do              if              private     	this
break           else            import          public          throw
byte            enum            implements 	protected 	throws
case            double          instanceof 	return          transient
catch           extends 	int             short           try
char            final           interface	static          void
class           finally         long            strictfp 	volatile
const           float           native          super           while
*/
