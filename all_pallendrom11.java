class all_pallendrom11{
    void main(String s){
        s=" "+s+" ";
        for(int i=1,k=0;i<s.length()-1;i++,k=0)
            while(s.charAt(i-k)==s.charAt(i+k))
                    System.out.println(s.substring((i-k),(i+(++k))));
    }
}