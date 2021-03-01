package com.way.hackerRank;

public class ReverseBit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseBit obj = new ReverseBit();
		int n =00000000000000000000000000000101;
		System.out.println(obj.reverseBits(n));
	}
	
	public int reverseBits(int n) {
        int k =0;
        int res=0;
        for(int i=0; i<32; i++){
            k = n & 1;
            n = n >> 1;
            k = k << (31-i);
            res = res | k;
        }
        return res;
        
    }

}
