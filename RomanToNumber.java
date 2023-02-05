class Solution {
    public int romanToInt(String s) {
        int number=0;
        int len=s.length();
        for(int i=0; i<len;i++)
        {
            
            if((i+1)<len  && getValue(s.charAt(i))<getValue(s.charAt(i+1)))
            {
                number=number-getValue(s.charAt(i));
            }else{
                number=number+getValue(s.charAt(i));
            }

        }
        return number;
    }


    private int getValue(char ch){

        switch(ch)
        {
            case 'I' : return 1;
            case 'V' : return 5;
            case 'X' : return 10;
            case 'L' : return 50;
            case 'C' : return 100;
            case 'D' : return 500;
            case 'M' : return 1000;
            
        }
    return 0;
}
}
