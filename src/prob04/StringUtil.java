package prob04;

public class StringUtil {
    public static String concatenate(String[] str) {
        //문자열을 결합하여 리턴 하는 메소드 구현
    	String	result="";
    	for (String s : str) {
    		result += s;
    	}
    	
    //	String result =str[0]+str[1]+str[2];
    	return result;
    }
}
