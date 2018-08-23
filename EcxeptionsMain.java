package exceptions;

public class EcxeptionsMain {
    public static void main(String[] args) {
        try {
            throwexception();
        } catch (InvalidParamException e) {
            e.printStackTrace();
        }
    }
    private static void throwexception() throws InvalidParamException {
        throw new InvalidParamException("Klaida",null);
    }

}
