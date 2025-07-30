public class AllPossibleSubString {
    public static void showAllSubString(String str){
        for(int i = 0;i<str.length();i++){
            for(int j = i;j<str.length();j++){
                System.out.println(str.substring(i, j+1));
            }
        }
    }
    public static void showAllSubStringUsingStringBuffer(String str){
        for(int i = 0;i<str.length();i++){
            StringBuffer stringBuffer = new StringBuffer();
            for(int j = i;j<str.length();j++){
                stringBuffer.append(str.charAt(j));
                System.out.println(stringBuffer);
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Using String");

        showAllSubString("soumya");
        
        System.out.println("Using String Buffer");

        showAllSubStringUsingStringBuffer("soumya");
    }
}
