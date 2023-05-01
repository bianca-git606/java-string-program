public class App {

    public static boolean twoOccurences (String a, String b) {

        int counter = 0;
        int startIndex = 0;
        int nextIndex = 0;
        
        for (int i = 0; i < 3; i++){
            //start searching for a first occurence
            nextIndex = b.indexOf(a, startIndex + nextIndex);
            // if there is an occurence
            if (nextIndex != -1){
                //update the counter
                counter = counter + 1;
                //update startIndex
                startIndex = nextIndex + a.length();             
            }
        }
        
        if (counter >= 2){
         
            return true;
        }
        
        return false;
    }

    public static void main(String[] args) throws Exception {
        boolean res = twoOccurences("by", "A story by abby");
        System.out.println(res);
        // should be true
        res = twoOccurences("a", "banana");
        System.out.println(res);
        // should be false
        res = twoOccurences("atg", "ctgtatgta");
        System.out.println(res);
    }
}
