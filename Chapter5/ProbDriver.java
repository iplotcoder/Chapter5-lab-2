
/**
 * Write a description of class ProbDriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ProbDriver
{    
    public static void main(String[] args) {
        Probability p1 = new Probability(5, 15);
        Probability p2 = new Probability(7, 15);
        
        System.out.println(p1.probabilityAND(p2));
        System.out.println(p1.probabilityOR(p2, 0));
    }

}
