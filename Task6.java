public class Task6 {
    public static void main(String[] args) {
        String string1="abc";
        String string2="xya";
        System.out.println("Результат: " + strWin(string1,string2));
    }

    public static boolean strWin(String string1, String string2) {
        int []str1=new int[26];//массив на 26 так как в английском алфавите 26 символов
        int []str2=new int[26];

        for(int i=0;i<string1.length();i++){
            str1[string1.charAt(i)-'a']++;
        }

        for(int i=0;i<string2.length();i++){
            str2[string2.charAt(i)-'a']++;
        }

        int k1=0;
        int k2=0;
        int bigger=0;
        int smaller=0;

        for(int i=0;i<26;i++){
            k1+=str1[i];
            k2+=str2[i];

            if(k2>k1){
                smaller++;
            }else if(k1>k2){
                bigger++;
            }
            if(smaller>0 && bigger>0)
                return false;
        }
        return true;
    }
}
