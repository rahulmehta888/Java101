package Code.Learn.Static;

public class Static {
    private String first;
    private String last;
    private static int members=0;

    public Static(String fs, String ls)
    {
        first =fs;
        last=ls;
        members++;
        System.out.printf("First name %s and Last name %s is %d number on the list",fs,ls,members);
    }
    public String getFirstName(){
        return first;
    }
    public String getLastName(){
        return first;
    }
    public static int getMembers(){
        return members;
    }

}
