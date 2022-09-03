package BinarySearch;

public class BadVersion {
	public static void main(String[] args) {
	}

	public int firstBadVersion(int n) {
		int lo = 1;
		int hi = n;
		int ans = 0;
		while (lo <= hi) {
			int mid = lo + (hi - lo) / 2;
			if (isBadVersion(mid) == true) {
				ans = mid;
				hi = mid - 1;
			} else {
				lo = mid + 1;
			}
		}
		return ans;
	}

	private boolean isBadVersion(int mid) {
		return false;
	}
}