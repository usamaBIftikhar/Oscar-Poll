import java.util.*;
import java.io.*;
import java.lang.*;
class item{
int round1;
int round2;
int index;
}
class Sortbyround1 implements Comparator<item> {
    public int compare(item a, item b)
    {
        if((a.round1 > b.round1 ) || ((a.round1 == b.round1) && (a.index > b.index)))
            return -1;
        return 1;
    }
}
class Sortbyround2 implements Comparator<item> {
    public int compare(item a, item b)
    {
        if((a.round2 > b.round2 ) || ((a.round2 == b.round2) && (a.index > b.index)))
            return -1;
        return 1;
    }
}


public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        item[] items = new item[n];
        for(int i=0;i<n;i++){
            items[i] = new item();
            items[i].round1 = scan.nextInt();
            items[i].round2 = scan.nextInt();
            items[i].index = i+1;
        }
        Arrays.sort(items,new Sortbyround1());
        Arrays.sort(items,0,k, new Sortbyround2());
        System.out.println(items[0].index+" "+items[k-1].index);
	}
}
