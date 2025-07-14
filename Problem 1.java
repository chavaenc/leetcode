class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int count = 0;
        for(int i = 0;i<words.length;i++){
            StringBuilder res = new StringBuilder();
            res.append(words[i]);
            words[i]=null;
            res.reverse();
            if (Arrays.asList(words).contains(res.toString())) {
                count++;
            } 
        }
        return count;
    }
}
