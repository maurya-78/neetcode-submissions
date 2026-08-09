class Solution {
        public boolean isPalindrome(String s) {
                s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
                        int n = s.length();
                                int i=0, j=n-1;
                                        char[] a = s.toCharArray();
                                                while(i<j){
                                                            if(a[i] != a[j]){
                                                                            return false;
                                                                                        }
                                                                                                    i++;
                                                                                                                j--;
                                                                                                                        }
                                                                                                                                return true;
                                                                                                                                    }
                                                                                                                                    }

