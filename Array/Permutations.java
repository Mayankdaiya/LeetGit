class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> permuts = new ArrayList<>();
        Set<Integer> permut = new LinkedHashSet<>();
        permutations(nums, permuts, permut);
        return permuts;
    }

    public void permutations(int[] nums, List<List<Integer>> permuts, Set<Integer> permut) {
        if (nums.length == permut.size()) {
            permuts.add(new ArrayList<>(permut));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (permut.contains(nums[i])) {
                continue;
            }
            permut.add(nums[i]);
            permutations(nums, permuts, permut);
            permut.remove(nums[i]);
        }
    }
}