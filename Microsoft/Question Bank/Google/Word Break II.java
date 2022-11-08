class Solution {
    public List<String> wordBreak(String wordToBreak, List<String> wordDict) {        
        return findSolutions(wordToBreak, wordDict, new HashMap<>());
    }
    
    public List<String> findSolutions(String wordToBreak, List<String> wordDict, Map<String, List<String>> wordBrokenDict){
        if(wordBrokenDict.containsKey(wordToBreak)){
            return wordBrokenDict.get(wordToBreak);
        }
        
        List<String> solutions = new ArrayList<>();
        for(String word: wordDict){
            if(!wordToBreak.startsWith(word)){
                continue;
            }
            
            if(wordToBreak.length() == word.length()){
                solutions.add(word);
                continue;
            }
            
            List<String> subSolutions = findSolutions(wordToBreak.substring(word.length()), wordDict, wordBrokenDict);
            for(String subSolution: subSolutions) {
                StringBuilder strBuilder = new StringBuilder();
                strBuilder.append(word).append(' ').append(subSolution);
                solutions.add(strBuilder.toString());
            }
        }
        
        wordBrokenDict.put(wordToBreak, solutions);
        return solutions;
    }
}
