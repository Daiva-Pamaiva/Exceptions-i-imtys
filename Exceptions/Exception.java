package Exceptions;

public class Exception {
    public static void main(String[] args) {
        public static void main(String[] args)
        {
            try {
                // display the heading for the table
                System.out.println("ACCNO" + "\t" + "CUSTOMER" +
                        "\t" + "BALANCE");

                // display the actual account information
                for (int i = 0; i < 5 ; i++)
                {
                    System.out.println(accno[i] + "\t" + name[i] +
                            "\t" + bal[i]);

                    // display own exception if balance < 1000
                    if (bal[i] < 1000)
                    {
                        InvalidParamException me =
                                new InvalidParamException("Balance is less than 1000");
                        throw me;
                    }
                }
            } //end of try

            catch (InvalidParamException e) {
                e.printStackTrace();
            }
        }
    }

}
}
