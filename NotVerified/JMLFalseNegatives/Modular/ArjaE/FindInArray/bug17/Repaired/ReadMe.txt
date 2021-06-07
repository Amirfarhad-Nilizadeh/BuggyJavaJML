ARJAE repaired the bug and also inserted the "setKey()" method in the "isMoreThanOneKey()" method, which is a pure method. However, the tester, by calling this method, cannot change the value of "Key" because "isMoreThanOneKey()" does not have any input argument to change the value of "key." Thus, it just passes the current value of "key" to itself. Totally, we did not consider this repaired program as a buggy program, while OpenJML does not verify it. 


Also, it inserts a new loop to the "findFirst()" method, which is basically a structural problem. Thus, this repair can be considered as both modular and structural. 
