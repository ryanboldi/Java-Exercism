public class Hamming {
    private String left;
    private String right;

    public Hamming(String leftStrand, String rightStrand) {
        if(leftStrand.isEmpty() && !rightStrand.isEmpty())   throw new IllegalArgumentException("left strand must not be empty.");
        else if(rightStrand.isEmpty() && !leftStrand.isEmpty())  throw new IllegalArgumentException("right strand must not be empty.");
        else if (leftStrand.length() != rightStrand.length())    throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        else {
            left = leftStrand;
            right = rightStrand;
        }

    }

    public int getHammingDistance() {
        int dist = 0;

        for (int i = 0; i < left.length() ; i++){
            if (left.charAt(i) != right.charAt(i)){
                dist += 1;
            }
        }

        return dist;
    }
}
