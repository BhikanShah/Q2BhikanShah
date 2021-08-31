import java.util.*;
import java.lang.*;
public class restring
{
    public String commonword(String[] a)
    {
        int z = a.length;
        if (z == 0)
            return "";
        if (z == 1)
            return a[0];
        Arrays.sort(a);
        int e = Math.min(a[0].length(), a[z-1].length());
        int i = 0;
        while (i < e && a[0].charAt(i) == a[z-1].charAt(i) )
            i++;
        String pre = a[0].substring(0, i);
        return pre;
    }
    public static void main(String[] args)
    {
        restring r = new restring();
		int i;
        String[] p=new String[50];
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String:-");
		for(i=0;i<p.length();i++)
			p[i]=s.nextLine();
		for(i=0;i<p.length();i++)
			System.out.println( "The  Common Words  is : " +r.commonword(p[i]));
    }
}