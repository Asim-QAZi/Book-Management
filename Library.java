import java.util.ArrayList;
import java.util.Scanner;

class AddBk {

    public ArrayList<String> list = new ArrayList<>();

    protected String name;
    protected String AuthorName;
    protected int price;

    public void addBook(String name, String AuthorName, int price) {

        this.name = name;
        this.AuthorName = AuthorName;
        this.price = price;

        list.add("Name: " + name);
        list.add("price: " + price);
        list.add("Author-Naem: " + AuthorName);

        System.out.println("Added successful.......");

    }

    public void ShowBook() {
        if (list.isEmpty()) {
            System.out.println("no book available right now..");
        } else {
            System.out.println(list);
        }
    }

}

class RmBk {

    public void RemoveBk(String name, AddBk adbk) {

        if (adbk.list.isEmpty()) {
            System.out.println("No book available right now..");

        } else {
            
            boolean found=false;

            for(int i=0;i<adbk.list.size();i++)
            {
                     String nameinfo=adbk.list.get(i);
                     String nm=nameinfo.split(": ")[1];

                     if(name.equalsIgnoreCase(nm))
                     {
                           found=true;
                           int j=0;
                           while(j<3)
                           {
                            adbk.list.remove(i);
                            j++;
                           }
                              System.out.println("successfully removed...");
                           break;
                     }

            }

            if(!found)
            {
                 System.out.println("this book is not available...");
            }

            

        }

    }

}

public class Library {
    public static void main(String[] args) {
        AddBk obj = new AddBk();
        RmBk obj2 = new RmBk();
        Scanner sc = new Scanner(System.in);

        String BookName;

        String Author_name;
        int price;
        int opt;

        do {

            System.out.println("1-Add Book\n2-show Available Book\n3-Remove book\n4-close the library");
            opt = sc.nextInt();
            sc.nextLine();
            if (opt == 1) {

                System.out.println("Enter the book name");
                BookName = sc.nextLine();

                System.out.println("Enter the author name of book");
                Author_name = sc.nextLine();

                System.out.println("Enter the price of book");
                price = sc.nextInt();
                sc.nextLine();
                obj.addBook(BookName, Author_name, price);

            }
            if (opt == 2) {
                obj.ShowBook();
            }
            if (opt == 3) {
                System.out.println("Enter the name");
                String nm = sc.nextLine();

                obj2.RemoveBk(nm, obj);
            }

        } while (opt != 4);

        sc.close();

    }
}
