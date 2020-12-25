package org.example;

import java.io.PrintStream;

/**
 * Hello world!
 *
 */
public class App
{
    public App() {
        super();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args )
    {
        final PrintStream out = getOut();
        out.println( "Hello World!" );
        for (int i = 0; i < args.length; i++) {
            String arg = args[i];
            out.println(arg);
        }
        for (String arg : args) {
            out.println(arg);
        }

    }

    private static PrintStream getOut() {
        return System.out;
    }
}
