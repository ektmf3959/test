package level0;

public class One {
	
	
	    public int solution1(int num1, int num2) {
	        boolean val = (-50000<= num1 && num1<= 50000 && -50000<=num2 && num2 <= 50000);
	        int answer = -1;
	        if(val){
	            answer = num1 + num2;
	        }
	        return answer;
	    }
	    
	    public int solution2(int num1, int num2) {
	        boolean val = (0<=num1 && num1 <=100 && 0<=num2 &&num2<=100);
	        int answer = 0;
	        if(val){
	            answer = num1 *num2;
	        }
	        return answer;
	    }
	    
	    public int solution3(int num1, int num2) {
	        boolean val = (0<num1 && num1 <=100 && 0< num2 && num2 <=100);
	        int answer = 0;

	        if(val){
	            answer = num1/num2;
	        }else{
	            answer = -1;
	        }
	        return answer;
	    }
	}


