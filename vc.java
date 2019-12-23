import java.*;
class test
  {
     public static void main(String[] args)
       {
          String s;
          int count_vowel=0,count_consonants=0;
          StringBuffer sb = new StringBuffer("Hello");
          sb.reverse();
          for(int i = 0; i<s.length(); i++)
            {
               char c = charAt(i);
               if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
                 {
                    count_vowel = count_vowel + 1;
                 }
               else
                 {
                    if(c!=' ')
                      {
                        count_consonants = count_consonants + 1;
                      }
                 }
            }  
          System.out.println(sb + ",the given string contains " + count_vowel + "vowels and " + count_consonants + "consonants");    
       }
  }   