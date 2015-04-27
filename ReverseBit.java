 /*The XOR swap trick:
Reversing bits could be done by swapping the n/2 least significant bits with its most significant bits. 
The trick is to implement a function called swapBits(i, j), which swaps the ith bit with the jth bit. 
If you still remember how XOR operation works: 0 ^ 0 == 0, 1 ^ 1 == 0, 0 ^ 1 == 1, and 1 ^ 0 == 1.

We only need to perform the swap when the ith bit and the jth bit are different.
To test if two bits are different, we could use the XOR operation. 
Then, we need to toggle both ith and jth bits. 
We could apply the XOR operation again. By XOR-ing the ith and jth bit with 1, both bits are toggled.
*/
 public int reverseBits(int n) {
        int total=32;
        for(int i=0;i<total/2;i++){
            int j= total-i-1;//high bit
            n=swap(n,i,j);
        }
        return n;
    }
    
    public int swap(int n, int low,int high){
        int l= (n>>low) &1;
        int h= (n>>high) &1;
        if((l^h)==1){
            int tmp=(1<<low) | (1<<high);
            n^=tmp;
        }
        return n;
  }
