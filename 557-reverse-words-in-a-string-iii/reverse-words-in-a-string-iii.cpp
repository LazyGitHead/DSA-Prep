class Solution {
public:
    string reverseWords(string s) {
        int start = 0;
        for(int i = 0; i <= s.length(); i++){
            if(s[i] == ' ' || i == s.length()){
                int l = start, r = i - 1;
                while(l < r){
                    swap(s[l++], s[r--]);
                }
                start = i + 1;
            }
        }
        return s;
    }
};