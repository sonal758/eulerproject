package codex;

public class Problem3 {
	private static final long NUMBER = 600851475143L;

    public static void main(String[] args) {
        
        long result = 0;
        for(int i = 2; i < NUMBER; i++) {
            if(NUMBER % i == 0 && isPrime(NUMBER / i)) {
                result = NUMBER / i;
                break;
            }
        }
        System.out.println("Result: " + result);
    }

    private static boolean isPrime(long l) {
        for(long num = 2, max = l / 2 ; num < max; num++) {
            if(l % num == 0) {
                return false;
            }
        }
        return true;
    }
            
    }


