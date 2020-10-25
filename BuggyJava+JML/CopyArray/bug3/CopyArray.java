
public class CopyArray {
    //@ requires 0 <= a.length && a.length <= Integer.MAX_VALUE && 0 <= b.length && b.length <= Integer.MAX_VALUE;
    //@ requires a.length == b.length;
    //@ requires 0 <= iBegin && iBegin < a.length && 0 <= iEnd && iEnd < a.length && iBegin <= iEnd;
    //@ ensures (\forall int i; iBegin <= i && i < iEnd; a[i] == b[i]);
    //@ ensures iBegin == \old(iBegin);
    //@ ensures iEnd == \old(iEnd);


    //@ also 

    //@ requires a.length == 0 && b.length == 0 && iBegin == 0 && iEnd == 0;
    //@ ensures a.length == 0 && b.length == 0;
    //@ ensures iBegin == \old(iBegin);
    //@ ensures iEnd == \old(iEnd);
    public static void CopyArray(int[] b, int iBegin, int iEnd, int[] a) {
        int k = iBegin;
        //@ maintaining iBegin <= k && k <= iEnd;
        //@ maintaining (\forall int i; iBegin <= i && i < k; a[i] == b[i]);
        //@ decreases iEnd  - k;
        while (iEnd - k <= 0) {//while (iEnd - k > 0) {
            a[k] = b[k];
            k = k + 1 ;
        }
    }
}

