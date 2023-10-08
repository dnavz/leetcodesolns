public class MergeStringsAlt1768 {

    public static void main(String[] args) {

        String oneStr = "Hello";
        String twoStr = "Universe";

        int oneStrLen = oneStr.length();
        int twoStrLen = twoStr.length();

        StringBuilder sb = new StringBuilder();

        int maxLen = oneStrLen>twoStrLen?oneStrLen:twoStrLen;
        for(int i = 0;i<maxLen;i++)
        {
            if(i<oneStrLen)
                sb.append(oneStr.charAt(i));
            if(i<twoStrLen)
                sb.append(twoStr.charAt(i));

        }
        
        System.out.println(sb.toString());
    }

}
