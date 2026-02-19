public class ExceptionHandlingAllProgramme {

    // 18. Custom Exception for Invalid Age
    static class InvalidAgeException extends Exception {
        public InvalidAgeException(String message) {
            super(message);
        }
    }

    public void registerUser(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above for registration.");
        }
        System.out.println("User registered successfully.");
    }

    // 19. Custom Exception for Insufficient Funds
    static class InsufficientFundsException extends Exception {
        public InsufficientFundsException(String message) {
            super(message);
        }
    }

    public void withdraw(double balance, double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds in the account.");
        }
        System.out.println("Withdrawal successful. Remaining balance: " + (balance - amount));
    }

    // 20. Custom Exception for Invalid Email Address
    static class InvalidEmailException extends Exception {
        public InvalidEmailException(String message) {
            super(message);
        }
    }

    public void validateEmail(String email) throws InvalidEmailException {
        if (!email.contains("@") || !email.contains(".")) {
            throw new InvalidEmailException("Invalid email address.");
        }
        System.out.println("Email is valid.");
    }

    // 21. Custom Exception for Negative Numbers
    static class NegativeNumberException extends Exception {
        public NegativeNumberException(String message) {
            super(message);
        }
    }

    public int squareRoot(int number) throws NegativeNumberException {
        if (number < 0) {
            throw new NegativeNumberException("Cannot calculate square root of a negative number.");
        }
        return (int) Math.sqrt(number);
    }

    public static void main(String[] args) {
        ExceptionHandlingAllProgramme programme = new ExceptionHandlingAllProgramme();

        // Test Invalid Age Exception
        try {
            programme.registerUser(16);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }

        // Test Insufficient Funds Exception
        try {
            programme.withdraw(500, 600);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }

        // Test Invalid Email Exception
        try {
            programme.validateEmail("invalidemail.com");
        } catch (InvalidEmailException e) {
            System.out.println(e.getMessage());
        }

        // Test Negative Number Exception
        try {
            System.out.println("Square root: " + programme.squareRoot(-9));
        } catch (NegativeNumberException e) {
            System.out.println(e.getMessage());
        }
    }
}
