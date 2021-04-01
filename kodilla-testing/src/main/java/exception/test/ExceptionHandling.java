package exception.test;

public class ExceptionHandling{
    SecondChallenge secondChallenge = new SecondChallenge();

    public void exceptionTest(){
        try {
            System.out.println(secondChallenge.probablyIWillThrowException(1.1, 1.2));
        }catch (Exception e){
            System.out.println("Exception: "+e);
        }finally {
            System.out.println("secondChallenge");
        }
    }
}
