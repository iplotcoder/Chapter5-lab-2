
/**
 * Write a description of class Probability here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Probability implements ProbabilityCalc
{
    // instance variables - replace the example below with your own
    private int favorable;
    private int sample;
    private double prob;

    /**
     * Constructor for objects of class Probability
     */
    public Probability(int fav, int sam)
    {
        // initialise instance variables
        this.favorable = fav;
        this.sample = sam;
        prob = ((double)favorable)/sample;
    }
    
    public double probabilityAND(Probability p2) {
        return this.prob * p2.getProb();
    }
    
    public double probabilityOR(Probability p2, double overlap) {
        return this.prob + p2.getProb() - overlap;
    }
    
    public double getProb() {
        return this.prob;
    }
    
    public int compareTo(Probability p2) {
        if (this.prob == p2.prob)  {
            return 0;
        }
        else if(this.prob > p2.prob) {
            return 1;
        }
        else {
            return -1;
        }
    }
}
