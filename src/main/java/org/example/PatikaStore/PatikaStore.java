package org.example.PatikaStore;

import java.util.*;

class PatikaStore {
    public static void main(String[] args) {
        List<String> brands = Arrays.asList("Samsung", "Lenovo", "Apple", "Huawei", "Casper", "Asus", "HP", "Xiaomi", "Monster");
        List<Product> products = new ArrayList<>();


        products.add(new Laptop(1, 7000.0, 0.1, 10, "HUAWEI Matebook 14", "Huawei", 16, 512, 14.0));
        products.add(new Laptop(2, 3699.0, 0.05, 8, "LENOVO V14 IGL", "Lenovo", 8, 1024, 14.0));
        products.add(new Laptop(3, 8199.0, 0.15, 5, "ASUS Tuf Gaming", "Asus", 32, 2048, 15.6));
        products.add(new Phone(4, 3199.0, 0.1, 15, "SAMSUNG GALAXY A51", "Samsung", 128, 6.5, 32, 4000.0, 6, "Siyah"));
        products.add(new Phone(5, 7379.0, 0.2, 12, "iPhone 11 64 GB", "Apple", 64, 6.1, 5, 3046.0, 6, "Mavi"));
        products.add(new Phone(6, 4012.0, 0.08, 20, "Redmi Note 10 Pro 8GB", "Xiaomi", 128, 6.5, 35, 4000.0, 12, "Beyaz"));

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("PatikaStore Ürün Yönetim Paneli !");
            System.out.println("1 - Notebook İşlemleri");
            System.out.println("2 - Cep Telefonu İşlemleri");
            System.out.println("3 - Marka Listele");
            System.out.println("0 - Çıkış Yap");
            System.out.print("Tercihiniz: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    listProducts(products, "Notebook Listesi");
                    break;
                case 2:
                    listProducts(products, "Cep Telefonu Listesi");
                    break;
                case 3:
                    listBrands(brands);
                    break;
                case 0:
                    System.out.println("Çıkış yapılıyor...");
                    break;
                default:
                    System.out.println("Geçersiz seçenek!");
            }
        } while (choice != 0);

        scanner.close();
    }

    public static void listProducts(List<Product> products, String title) {
        System.out.println(title);
        System.out.println("--------------------------------------------------------------------------------------------------------------------");
        System.out.println("| ID | Ürün Adı                      | Fiyat     | Marka     | Depolama  | Ekran     | RAM         | Özellikler    |");
        System.out.println("--------------------------------------------------------------------------------------------------------------------");

        for (Product product : products) {
            System.out.println(product.getDetails());
        }

        System.out.println("--------------------------------------------------------------------------------------------------------------------");
    }

    public static void listBrands(List<String> brands) {
        System.out.println("Markalarımız");
        System.out.println("--------------");

        Collections.sort(brands);
        for (String brand : brands) {
            System.out.println("- " + brand);
        }
    }
}