public class NewIdRecommend {
    public static String newIdRecommend(String new_id){
        String result = new_id.toLowerCase();
        result = result.replaceAll("[^-_.a-z0-9]","");
        result = result.replaceAll("[.]{2,}", ".");
        result = result.replaceAll("^[.]|[.]$", "");

        if (result.equals("")){
            result += "a";
        }

        if (result.length() >= 16){
            result = result.substring(0,15);
            result = result.replaceAll("[.]$","");
        }

        if(result.length() <= 2){
            while(result.length()<3){
                result += result.charAt(result.length()-1);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(newIdRecommend("...!@BaT#*..y.abcdefghijklm"));
        System.out.println(newIdRecommend("z-+.^."));
        System.out.println(newIdRecommend("=.="));
        System.out.println(newIdRecommend("123_.def"));
        System.out.println(newIdRecommend("abcdefghijklmn.p"));
    }
}
