import java.util.*;
import java.util.Scanner;
class prog
{
	public static void main(String args[])
	{

      Scanner sc=new Scanner(System.in);
		String xyz=sc.nextLine();
System.out.println(xyz);


char arrayxyz[] = xyz.toCharArray();
int length = xyz.length();

//count the number of each letter in the string
int acount = 0;
int bcount = 0;
int ccount = 0;
int dcount = 0;
int ecount = 0;
int fcount = 0;
int gcount = 0;
int hcount = 0;
int icount = 0;
int jcount = 0;
int kcount = 0;
int lcount = 0;
int mcount = 0;
int ncount = 0;
int ocount = 0;
int pcount = 0;
int qcount = 0;
int rcount = 0;
int scount = 0;
int tcount = 0;
int ucount = 0;
int vcount = 0;
int wcount = 0;
int xcount = 0;
int ycount = 0;
int zcount = 0; 

for(int i = 0; i < length; i++)
{
    char c = arrayxyz[i];
    switch (c) 
    {
        case 'a': 
            acount++;
            break;
        case 'b': 
            bcount++;
            break;
        case 'c': 
            ccount++;
            break;
        case 'd': 
            dcount++;
            break;
        case 'e':
            ecount++;
            break;
        case 'f':
            fcount++;
            break;
        case 'g':
            gcount++;
            break;
        case 'h':
            hcount++;
            break;
        case 'i':
            icount++;
            break;
        case 'j':
            jcount++;
            break;
        case 'k':
            kcount++;
            break;
        case 'l':
            lcount++;
            break;
        case 'm':
            mcount++;
            break;
        case 'n':
            ncount++;
            break;
        case 'o':
            ocount++;
            break;
        case 'p':
            pcount++;
            break;
        case 'q':
            qcount++;
            break;
        case 'r':
            rcount++;
            break;
        case 's':
            scount++;
            break;
        case 't':
            tcount++;
            break;
        case 'u':
            ucount++;
            break;
        case 'v':
            vcount++;
            break;
        case 'w':
            wcount++;
            break;
        case 'x':
            xcount++;
            break;
        case 'y':
            ycount++;
            break;
        case 'z':
            zcount++;
            break;
        }
}
System.out.println ("There are " +acount+" a's in here ");
System.out.println ("There are " +bcount+" b's in here ");
System.out.println ("There are " +ccount+" c's in here ");
System.out.println ("There are " +dcount+" d's in here ");
System.out.println ("There are " +ecount+" e's in here ");
System.out.println ("There are " +fcount+" f's in here ");
System.out.println ("There are " +gcount+" g's in here ");
System.out.println ("There are " +hcount+" h's in here ");
System.out.println ("There are " +icount+" i's in here ");
System.out.println ("There are " +jcount+" j's in here ");
System.out.println ("There are " +kcount+" k's in here ");
System.out.println ("There are " +lcount+" l's in here ");
System.out.println ("There are " +mcount+" m's in here ");
System.out.println ("There are " +ncount+" n's in here ");
System.out.println ("There are " +ocount+" o's in here ");
System.out.println ("There are " +pcount+" p's in here ");
System.out.println ("There are " +qcount+" q's in here ");
System.out.println ("There are " +rcount+" r's in here ");
System.out.println ("There are " +scount+" s's in here ");
System.out.println ("There are " +tcount+" t's in here ");
System.out.println ("There are " +ucount+" u's in here ");
System.out.println ("There are " +vcount+" v's in here ");
System.out.println ("There are " +wcount+" w's in here ");
System.out.println ("There are " +xcount+" x's in here ");
System.out.println ("There are " +ycount+" y's in here ");
System.out.println ("There are " +zcount+" z's in here ");


		
		String[] abc1=xyz.split(" ");
		System.out.println("The alternate capital word is ->");
		System.out.println("\n");
		for(String x:abc1)
		{
			int abc=0;
			for(Character ch:x.toCharArray())
			{
				if(abc%2==0)
				System.out.print(Character.toUpperCase(ch));
				else
				System.out.print(Character.toLowerCase(ch));
				abc++;
			}
			System.out.print(" ");
		}
	}   
}

