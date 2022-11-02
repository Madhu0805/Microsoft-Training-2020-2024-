class Solution {
    public String reorganizeString(String s) {
    int n = s.length() , limit = n % 2 == 0 ? n / 2 : (n + 1) / 2;
    
    int[] freqMap = new int[26];
    s.chars().forEach(i -> freqMap[i-97]++);
    
    PriorityQueue<Character> queue = new PriorityQueue<>((a,b) ->  freqMap[b - 97] - freqMap[a - 97]);
    
    for(int i = 0 ; i < 26 ; i++){
        if(freqMap[i] > 0){
            if(freqMap[i] > limit) return "";
            queue.add((char)(i + 97));
        }    
    }
    
    StringBuilder res = new StringBuilder();
    
    while(queue.size() > 1){
        char first = queue.poll();
        char second = queue.poll();
        res.append(first).append(second);
        if(--freqMap[first - 97] > 0) queue.add(first);
        if(--freqMap[second - 97] > 0) queue.add(second);
    }
    
    if(!queue.isEmpty()){
        char last = queue.poll();
        if(freqMap[last - 97] > 1) return "";
        res.append(last);
    }
    
    return res.toString();
}
}
