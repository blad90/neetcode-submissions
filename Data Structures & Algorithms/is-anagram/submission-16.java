class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> sMap = new HashMap();
        HashMap<Character, Integer> tMap = new HashMap();

        if(s.length() != t.length()) return false;

        for(int i = 0; i < s.length(); i++){
            sMap.put(s.charAt(i), 0);
        }

        for(int i = 0; i < t.length(); i++){
            tMap.put(t.charAt(i), 0);
        }

        for(int i = 0; i < s.length(); i++){
            char key = s.charAt(i);

            if(sMap.containsKey(key)){
                sMap.compute(key, (k,v) -> {
                    v += 1;
                    return v;
                });
            }
        }

        for(int i = 0; i < t.length(); i++){
            char key = t.charAt(i);

            if(tMap.containsKey(key)){
                tMap.compute(key, (k,v) -> {
                    v += 1;
                    return v;
                });
            }
        }

        return sMap.equals(tMap);
    }
}