class Long_substr_without_repeatingChar {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() <= 1) return s.length();

        int[] map = new int[128];
        Arrays.fill(map, -1);

        int startIndex = 0;
        map[s.charAt(startIndex)] = 0;
        int result = 0;

        for (int i = 1; i < s.length(); i++) {
            if (map[s.charAt(i)] >= startIndex) {
                startIndex = map[s.charAt(i)] + 1;
            }
            map[s.charAt(i)] = i;
            result = Math.max(result, i + 1 - startIndex);
        }
        return result;
    }
}