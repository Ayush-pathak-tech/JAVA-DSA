public class first {  // you are defining a class named first.    
    // public.... access modifier(means this class can be used any where , it is vible to all other class)
    // class..... keyword (that is used to create a class) 
    // class is like blueprint or template for creating objectn
    // first..... Name of the class🧐 (ideally it should be First, but first is still allowed.)
    public static void main(String[] args) { // inside that class , defining starting point of the program
        // main Methode of class🧐
        // entry point of any java program
        // the first thing that runs

        // static......we dont need to create an object of the class to run this methode
        // it belongs to the "class not an object"

        //void.....it means method does not return any value( return type of the method.)
        //This method prints something but returns nothing.
        //So we use void.
        // can we use return in void methode ?
        //yes but only like return;▶️ not return 5;

        //main..... name of method🧐
        //string[]....it is an arrayof strings(a list of words)
        //args.....name of that array(you can rename it)
       // command lne input ke liye isko us kerte hai
    System.out.println("I LOVE PIZZA"); // for the "system class", use "static object(out)" which is capable of printing text
    // System..... built in class in java that contains useful tools lke (out)
    // "part of java.lang package." which automatically imported in every java program( here you dont need to write "import java.lang.system")
    // contains usefull things related to input/output

    //out...... (static object of System) inside System class(used to send output to console)
    //it is an object of type "PRINTSTREAM"

   // 🧰 System = a toolbox
//📤 out = a printer inside the toolbox
//🖨️ print() = the button to print something
//"Open the toolbox (System), grab the printer (out), and print the message (print()) onto the screen.

    System.out.print("ITS really good!\n");
    System.out.print("\t I love japan\n");
    System.out.print("\"I LOVE JAPAN\"");
    // \n......(move to next line)
    //newline character → forces text to go to the next line(move to the next line)

    // \t...... ("tab space")

    // \"  \".......used to print double quotes inside the string
       
    /*
         *psvt---- shortcut 
         * sysout---shortcut(sout)
         * 
         * 
         * 
         * 
         */
        
    }
    
}