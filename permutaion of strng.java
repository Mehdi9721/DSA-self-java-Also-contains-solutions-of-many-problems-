import java.lang.reflect.Array;
import java.util.ArrayList;

class Test{
    public static void main(String[] args) {
String a="abc";

//        sub(a,""); for direct print
//        ArrayList<String> ans=new ArrayList<>();
//sub(a,ans,""); list in argument
     ArrayList<String> k= subseq(a,"");
        System.out.println(k);
    }
    //direct printing
//     static void sub(String a,String ans){
//        if(a.isEmpty()){
//            System.out.println(ans);
//            return;
//        }
//        char m=a.charAt(0);
//        sub(a.substring(1),ans+m);
//        sub(a.substring(1),ans);
//    }

//adding data into arrayList which is passed through argu;
//     static void sub(String ans,ArrayList<String> a,String ok){
//        if(ans.isEmpty()){
//            a.add(ok);
//            return;
//        }
//        char x=ans.charAt(0);
//        sub(ans.substring(1),a,ok+x);
//        sub(ans.substring(1),a,ok);
//    }
//}

// now returning ArrrayList
static ArrayList<String> subseq(String ans,String ok){
        if(ans.isEmpty()){
            ArrayList<String> ls=new ArrayList<>();
            ls.add(ok);
            return ls;
        }
        char q=ans.charAt(0);
    ArrayList<String> left=subseq(ans.substring(1),ok+q);
    ArrayList<String> right=subseq(ans.substring(1),ok);
        left.addAll(right);
        return left;
    }
}


