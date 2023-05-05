class bowling {
    public int isWinner(int[] player1, int[] player2) {
        int sum1=0;
        int count1=0;
        for(int i=0;i<player1.length;i++){
            sum1=sum1+player1[i];
            count1++;
            
            if(player1[i]==10){
               
                break;
            }
            
        }
        for(int i=count1;i<player1.length;i++){
            sum1=sum1+(2*player1[i]);
        }
        int sum2=0;
        int count2=0 ;
        for(int i=0;i<player2.length;i++){
            sum2=sum2+player2[i];
            count2++;    
            if(player2[i]==10){
                break;
            }
        }
        for(int i=count2;i<player2.length;i++){
            sum2=sum2+(2*player2[i]);
        }
        if(sum1>sum2){
            return 1;
        }
        else if(sum1<sum2){
            return 2;
        }
        else{
            return 0;
        }
    }
}
