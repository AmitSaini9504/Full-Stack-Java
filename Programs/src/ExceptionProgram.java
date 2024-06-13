public class ExceptionProgram {
    static void validateAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception("Age is not valid for voting");
        }
    }

    public static void main(String[] args) {
        try {
            validateAge(16);
        } catch (Exception e) {
            System.out.println(e.getMessage()); // Output: Age is not valid for voting
        }
    }
}
