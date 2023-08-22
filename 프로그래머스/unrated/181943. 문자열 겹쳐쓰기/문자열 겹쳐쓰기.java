import java.util.Arrays;
class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        
		String[] msList = my_string.split("");
		String[] arr1 = Arrays.copyOfRange(msList, 0, s);
		String ms1 = String.join("", arr1);
		
		StringBuilder sb = new StringBuilder();
		sb.append(ms1).append(overwrite_string);
		String answer = sb.toString();
		
		if(my_string.length() > answer.length()) {
			String[] arr2 = Arrays.copyOfRange(msList, answer.length(), msList.length);
			String ms2 = String.join("", arr2);
			answer = answer + ms2;
		}
		
        return answer;
    }
}