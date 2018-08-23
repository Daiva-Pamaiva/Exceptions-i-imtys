package Exceptions;

public class InvalidParamException extends Exception{

        //store account information
        private static int accno[] = {1001, 1002, 1003, 1004};

        private static String name[] =
                {"Nish", "Shubh", "Sush", "Abhi", "Akash"};

        private static double bal[] =
                {10000.00, 12000.00, 5600.0, 999.00, 1100.55};

        // default constructor
        Exception() { }

        // parametrized constructor
        Exception(String str) { super(str); }

    }
