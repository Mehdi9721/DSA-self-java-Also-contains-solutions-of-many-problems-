public class Dice {
    public static void main(String[] args) {
        int target=3;
        possibleSum("",target);
    }
    //e will use processed and unprocessed approach for this problem
    static void possibleSum(String p,int t){
if(t==0){
    System.out.println(p);
    return;
}
for (int i = 1; i <=6 && i<=t ; i++) {
    possibleSum(p+i,t-i);
        }
    }
}
