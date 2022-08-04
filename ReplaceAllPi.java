class ReplaceAllPi {
    //approach 1
    public String replacePi(String str) {
        if (str.length() <= 1) {
            return str;
        }
        if (str.charAt(0) == 'p' && str.length() >= 2
                && str.charAt(1) == 'i') {
            return "3.14" + replacePi(str.substring(2, str.length()));
        }
        return str.charAt(0) + replacePi(str.substring(1, str.length()));
    }
    public static void main(String args[]) {
        ReplaceAllPi pi = new ReplaceAllPi();
        String str = "pippppiiiipi";
        System.out.println(pi.replacePi(str));
    }
}

























    //approach 2
    // public static String replacePi(String s)
    // {
    //     if (s.length() == 0 || s.length() == 1)
    //         return s;
    //     if (s.charAt(0) == 'p' && s.charAt(1) == 'i') {
    //         String smallOutput = replacePi(s.substring(2));
    //         return "3.14" + smallOutput;
    //     }
    //     else {
    //         String smallOutput = replacePi(s.substring(1));
    //         return s.charAt(0) + smallOutput;
    //     }
    // }