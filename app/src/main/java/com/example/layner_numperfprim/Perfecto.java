package com.example.layner_numperfprim;

public class Perfecto {

    private int n;

    public Perfecto(int n){
        this.n=n;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;


    }
    private int sumadei(){
        int s=0, d;

        for(d=1; d<n; d++){
            if(n%d==0){
                s=s+d;
            }
        }
        return s;
    }

     @Override public boolean
}
