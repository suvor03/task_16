package ru.vsu.cs.suvorov_d_a;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintStream;

public class ConsoleMain {
    public static class CmdParams {
        public String inputFile;
        public String outputFile;
        public boolean error;
        public boolean help;
        public boolean window;
    }

    public static CmdParams parseArgs(String[] args) {
        CmdParams params = new CmdParams();
        if (args.length > 0) {
            if (args[0].equals("--help")) {
                params.help = true;
                return params;
            }
            if (args[0].equals("--window")) {
                params.window = true;
                return params;
            }
            if (args.length < 1) {
                params.help = true;
                params.error = true;
                return params;
            }
            params.inputFile = args[0];
            if (args.length > 1) {
                params.outputFile = args[1];
            }
        } else {
            params.help = true;
            params.error = true;
        }
        return params;
    }

    public static void main(String[] args) throws Exception {
        ConsoleMain.CmdParams params = parseArgs(args);

        if (params.help) {
            PrintStream out = params.error ? System.err : System.out;
            out.println("Usage:");
            out.println("  <cmd> args <input-file> (<output-file>)");
            out.println("  <cmd> --help");
            out.println("  <cmd> --window  // show window");
            System.exit(params.error ? 1 : 0);
        }

        if (params.window) {
            GUIMain.winMain();
        } else {
            String data1 = "";
            String data2 = "";
            try {
                BufferedReader br1 = new BufferedReader(new FileReader("input1.txt"));
                BufferedReader br2 = new BufferedReader(new FileReader("input2.txt"));
                StringBuilder sb1 = new StringBuilder();
                StringBuilder sb2 = new StringBuilder();
                String line1 = br1.readLine();
                String line2 = br2.readLine();

                while (line1 != null && line2 != null) {
                    sb1.append(line1);
                    sb1.append("\n");
                    line1 = br1.readLine();

                    sb2.append(line2);
                    sb2.append("\n");
                    line2 = br2.readLine();
                }
                data1 = sb1.toString();
                data2 = sb2.toString();
            } catch (Exception e) {
                e.printStackTrace();
            }

            String result1 = ReverseStack.reverseStringStandardStack(data1);
            String result2 = ReverseStack.reverseStringMySimpleStack(data2);
            System.out.println(result1);
            System.out.println(result2);
            }
    }
}