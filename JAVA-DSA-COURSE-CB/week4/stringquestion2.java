package week4;

public class stringquestion2 {
    static char maxOccurance (String s){
        int countmaxElement=0;
        char maxElement ='*';
        int countCurrElement=0;
        char CurrElement= '*';
        for(int i=0;i<s.length;i++){
            if(s.charAt(i) !=CurrElement){
                if (countCurrElement>countmaxElement){
                    countmaxElement= countCurrElement;
                    maxElement=currElement;
                }
                currElement = s.charAt(i);
                countCurrElement=1;

            } else{
                countCurrElement++;
            }
        }
        if (countCurrElement>countmaxElement){
            countmaxElement=countCurrElement;
            maxElement=currElement;
        }
        return maxElement;
    }
    
}
