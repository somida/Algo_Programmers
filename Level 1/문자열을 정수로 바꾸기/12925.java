// function
class Solution {
    public int solution(String s) {
        return Integer.parseInt(s);
    }
}

// algorithm
class Solution {
    public int solution(String s) {
        boolean flag = true;
        int answer = 0;

        for (int i=0; i<s.length(); i++) {
                char ch = s.charAt(i);
                if (ch == '-') flag = false;
                else if(ch != '+') answer = answer * 10 + (ch - '0');
          }
          return flag ? answer : -answer;
  }
}