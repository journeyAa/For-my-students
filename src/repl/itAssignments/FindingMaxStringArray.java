package repl.itAssignments;

public class FindingMaxStringArray {
    public static void main(String[] args) {
      String[] words = {"aaa", "bbbbb", "whasstupppp", "longg" , "jaaaaavvaaaaaaaaaa"};

      int max = words[0].length();

      for (String each: words){
          int l = each.length();
          if(l>max){
              max = l;
          }
      }
        System.out.println(max);

      for (String each: words){
          int l = each.length();
          if(l==max){
              System.out.println(each);
          }
      }






    }
}
