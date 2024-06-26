//https://leetcode.com/problems/find-consecutive-integers-from-a-data-stream/description/

class DataStream { 
    private int val;
    private int n;
    private int count=0;

    public DataStream(int value, int k) {
        val=value;
        n=k;
    }
    
    public boolean consec(int num) {
        if(num==val)
        {
            count++;
        }
        else
        {
            count=0;
        }
        return count>=n;
    }
}

/**
 * Your DataStream object will be instantiated and called as such:
 * DataStream obj = new DataStream(value, k);
 * boolean param_1 = obj.consec(num);
 */
