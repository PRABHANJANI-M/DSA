class Solution {
    public String minRemoveToMakeValid(String s) {

        char[] arr = s.toCharArray();
        Stack<Character> stack = new Stack<>();

        int count = 0;
        int count1 = 0;

        int i;

        for (i = 0; i < s.length(); i++) {

            if (arr[i] == '(') {
                count++;
                stack.push('#');
            }

            else if (arr[i] == ')') {

                count1++;

                if (count1 <= count) {
                    stack.push(arr[i]);
                }
                else {
                    count1--;
                }
            }

            else {
                stack.push(arr[i]);
            }
        }

        String res = "";

        while (!stack.isEmpty()) {

            char ch = stack.pop();

            if (ch == '#') {

                if (count <= count1) {
                    res = '(' + res;
                }

                count--;
            }

            else {
                res = ch + res;
            }
        }

        return res;
    }
}