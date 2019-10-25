package dani.tugas6;
public class DaniTugas6 {
    public static void main(String[] args) {
        int a,b,c,d,e,f;
int n=10;
int dani=n-1;
for (a=0;a<n;a++){
for (b=0;b<dani;b++){
System.out.print(" ");
    }
        for(c=0;c<=a;c++) {
        System.out.print("6 ");
        }
        dani--;
        System.out.println();
        }
        dani = 0;
        for(d=(n);d>0;d--) {
        for(e=0;e<dani;e++) {
        System.out.print(" ");
        }
        for(f=0;f<d;f++) {
        System.out.print("6 ");
        }
        System.out.println();
        dani++;
    }
}
}
    

