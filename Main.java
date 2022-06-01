import java.util.Scanner;

// every file with a .java extension is a class. 
// This file should contain a class and the name of the class should be main [name of the file]

// public: this class can be accesses from anywhere.
// class: named group of properties and functions
// execution starts from 'main'. Entry point of java program
// static: we want to run main class without creating object of class Main
// void: return type of function
// String[] args: command line arguments

// Compile: javac Main.java [creates the byte code in the same folder]
// Best practice: keep source code in src folder, byte code in out folder
//         javac -d .. Main.java

public class Main { // class names start with capital letter
    public static void main(String[] args) {
        System.out.println("Hello world");
        System.out.println(args[1]); // run: java Main 'message' 20 -> o/p: 20
        Scanner input = new Scanner(System.in); // System.in -> take input from keyboard
        System.out.println(input.nextInt());

        // input.nextInt() -> print integer
        // input.next() -> print string (will pick string till it encounters space)
        // input.nextLine() -> print string (till it encounters a new line)
    }
}