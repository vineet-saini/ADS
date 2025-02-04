class ShortestPalindrome {
    public static String shortesPalind(String s){
        if(s==null| s.length()==0){
            return s;
        }
        String t=s+"#"+new StringBuilder(s).reverse().toString();
        int[]lps=compLPS(t);
        int pallen =lps[t.length()-1];
        String rem=s.substring(pallen);
        String prefix=new StringBuilder(rem).reverse().toString();
        return prefix+s;
    }    
    public static int[] compLPS(String s){
        int n=s.length();
        int[] lps=new int[n];
        int j=0;
        for(int i=1;i<n;i++){
            while(j>0 && s.charAt(i)!=s.charAt(j)){
                j=lps[j-1];
            }
            if(s.charAt(i)==s.charAt(j)){
                j++;
                lps[i]=j;
            }
        }
        return lps;
    }
    public static void main(String[] args) {
        String s="abcd";
        System.out.println(shortesPalind(s));
    }
}