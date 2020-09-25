import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class KLists {

    public KLists() {
        super();
    }

    public double[] mergeKLists(double [][] outerArray) {
        int total_elements = 0;

        //Calculate total elements in array
        for(double[] arr : outerArray)
            total_elements += arr.length;

        //returning empty array if there is no element
        if(total_elements == 0)
            return new double[0];

        // We are creating a TreeMap which will keep track of count of different number and also maintain
        // the assending order on keys, in this case, array values
        Map<Double, Integer> countMap = new TreeMap<Double, Integer>();

        //fillthe countMap
        for(double[] arr : outerArray) {
            for(double ele : arr) {
                countMap.put(ele, countMap.getOrDefault(ele, 0) + 1);
            }
        }

        double[] output = new double[total_elements];
        int i = 0;

        for(double key : countMap.keySet()) {
            Arrays.fill(output, i, i + countMap.get(key), key);
            i += countMap.get(key);
        }

        return output;
    }

    public static void main(String[] args) {
        KLists klists = new KLists();
        double[][] outerArray = {{9.7, 17.1}, {15.8}, {12.7, 18.5, 21.27}};
        double[] output = klists.mergeKLists(outerArray);

        //print out the output array
        System.out.println(Arrays.toString(output));
    }


}