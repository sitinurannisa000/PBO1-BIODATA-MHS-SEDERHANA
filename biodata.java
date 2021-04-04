import java.util.*;
public class biodata{
 	public static void main (String [] args) {
        Scanner input = new Scanner(System.in);	

	String nama;
	String npm;
	String kls;
	String fak;

	System.out.print("masukan nama  :");	
	nama = input.nextLine();
	System.out.print("masukan npm :");
	npm = input.nextLine();
	System.out.print("masukan kls :");
	kls = input.nextLine();
	System.out.print("masukan faklts :");
	fak = input.nextLine();
	
	System.out.println("==========================");
	System.out.println(" BIODATA KAMPUS SEDERHANA ");
	System.out.println("==========================");
	System.out.println("Nama	:"+nama);
	System.out.println("Npm	:"+npm);
	System.out.println("Kelas	:"+nama);
	System.out.println("Fakultas	:"+fak);

      }
}