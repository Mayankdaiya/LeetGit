class Lexico_Number {
    public static void print_lexico_num(int num,int n,ArrayList<Integer> list){
        if(num>n) return;
        if(num!=0) list.add(num);
        int i=0;
        if(num==0) i=1;
        for(;i<=9;i++) print_lexico_num(num*10+i,n,list);
    }

    public List<Integer> lexicalOrder(int n) {
        ArrayList<Integer> list=new ArrayList<>();
        print_lexico_num(0,n,list);
        return list;
    }
}