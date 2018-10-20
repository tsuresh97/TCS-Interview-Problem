import java.util.Scanner;
class TCS
{
    public static void main(String args[])   
    {
        Scanner input = new Scanner(System.in);
        String a;
        System.out.println("Enter data: ");
        a=input.next();
        char ch[]=(""+a).toCharArray();
        int k,m=0;
        int i,j;
        int len=ch.length;
        char ans[]=new char[len];
        for(i=len-1;i>=0;i--)
        {
            k=0;
            for(j=len-1;j>=0;j--)
            {
                if(ch[i]==ans[j])
                {
                    k++;
                }
            }
            if(k==0)
            {
                ans[m++]=ch[i];
            }
        }
        String outp=String.valueOf(ans);
        System.out.println(outp);
    }  
}