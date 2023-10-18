package Lab_ex5;

class AgeValidationException extends Exception {
    public AgeValidationException(String message) {
        super(message);
    }
}

public class Ex1 {
	 public static void main(String[] args) {
	        try {
	            int age = 14; 
	            validateAge(age);
	            System.out.println("Age is valid.");
	        } catch (AgeValidationException e) {
	            System.out.println("AgeValidationException: " + e.getMessage());
	        }
	    }

	    public static void validateAge(int age) throws AgeValidationException {
	        if (age <= 15) {
	            throw new AgeValidationException("Age must be above 15.");
	        }
	    }
}
