// Naive String Matching Algorithm
// Assignment 3: DNA Sequence Matching

class DNASequenceMatching {
    public static void main(String args[]) {
        String text = "ATGCGATACGTAGCTAGCTAA";
        String pattern = "GCTA";
        int n = text.length();
        int m = pattern.length();

        System.out.println("DNA Text    : " + text);
        System.out.println("Pattern     : " + pattern);
        System.out.println();

        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (text.charAt(i + j) != pattern.charAt(j)) {
                    break;
                }
            }
            if (j == m) {
                System.out.println("Pattern found at position " + i);
            }
        }

        System.out.println("\nTime Complexity = O(n * m)");
    }
}
