class GenrateParenthesis {
    public void print_ways(int n,String ans,int l,int r,ArrayList<String> list){
        if(l==n && r==n){
            list.add(ans);
            return;
        }
        if(l<n){
            print_ways(n,ans+'(',l+1,r,list);
        }
        if(r<l){
            print_ways(n,ans+')',l,r+1,list);
        }

    }

    public List<String> generateParenthesis(int n) {
        ArrayList<String> list=new ArrayList<>();
        print_ways(n,"",0,0,list);
        return list;
    }
}