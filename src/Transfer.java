public class Transfer {
    public static void main(String[] args) {
        String s = "0123456789";
        System.out.println(string2Unicode(s)+"\n");
        String s2 = "abcdefghijklmnopqrstuvwxyz";
        System.out.println(string2Unicode(s2)+"\n");
        String s3 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println(string2Unicode(s3));
        int k = 'a' - 87;
        System.out.println(k);
        String s4 = "我爱你";
        System.out.println(string2Unicode(s4));
    }
    public static String string2Unicode(String string) {
          
        StringBuffer unicode = new StringBuffer();
      
        for (int i = 0; i < string.length(); i++) {
      
            // 取出每一个字符
            char c = string.charAt(i);
      
            // 转换为unicode
            unicode.append("\\u" + Integer.toHexString(c));
        }
      
        return unicode.toString(); 
    }
}