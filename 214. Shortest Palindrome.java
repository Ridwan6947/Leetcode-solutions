class Solution {
  public String shortestPalindrome(String s) {
    String t = new StringBuilder(s).reverse().toString();
    System.out.print(t);
    for (int i = 0; i < t.length(); ++i)
      if (s.startsWith(t.substring(i)))
        return t.substring(0, i) + s;
        System.out.print(t);
    return t + s;
  }
}
