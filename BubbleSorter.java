class BubbleSorter{
    
    static boolean flag = true; // This flag is a check if the list is sorted, it is changed to false if a swap occurs
    
    
    
    public static int[] sort(int[] jump)
    {
        while(flag){
            
            flag = false; // No swaps have occured yet...
            
            for (int j = 0; j < jump.length - 1; j++){
                
                
                if (jump[j] > jump[j+1]){ // This only runs if a swap needs to occur
                    int temp = jump[j];
                    jump[j] = jump[j+1];
                    jump[j+1] = temp;   
                    flag = true; // Since a swap has occured, this list was not in order
                                        }
                                        
                                        
                                                    }
                    }
    return(jump);}
    ;

    public static void main(String[] args){
        int[] test = {4,3,5,2,7,6,8,9,20};
        for(int i:sort(test)){System.out.println(i);}
    };
    
    
}