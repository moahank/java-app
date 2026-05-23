import java.util.*;

class Artwork {
    String name;
    double price;

    Artwork(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

public class ArtGalleryStore {
    public static void main(String[] args) {
        List<Artwork> gallery = new ArrayList<>();

        gallery.add(new Artwork("Sunset Painting", 2500));
        gallery.add(new Artwork("Modern Abstract", 4200));
        gallery.add(new Artwork("Nature Canvas", 1800));

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Art Gallery Store ===");

        for (int i = 0; i < gallery.size(); i++) {
            Artwork art = gallery.get(i);
            System.out.println((i + 1) + ". " + art.name + " - ₹" + art.price);
        }

        System.out.print("\nSelect artwork number to buy: ");
        int choice = scanner.nextInt();

        if (choice > 0 && choice <= gallery.size()) {
            Artwork selected = gallery.get(choice - 1);
            System.out.println("You bought: " + selected.name);
        } else {
            System.out.println("Invalid selection.");
        }

        scanner.close();
    }
}