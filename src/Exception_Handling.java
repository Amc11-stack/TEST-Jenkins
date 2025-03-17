public class Exception_Handling {

    public static void main(String[] args) {
        try {
            // Simulating a ClassNotFoundException
            throw new ClassNotFoundException("Example class not found");
        } catch (Exception e) {
            System.out.println("Caught ClassNotFoundException: " + e.getMessage());
            e.printStackTrace();
        }
    }

}
