import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Bill {
    // items to be prepared --> price -->quantity --> amount --> total + gst 18%
    public static void main(String[] args) {
        Items();
    }

    public static void Items() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Kulfi", 100);
        map.put("Sherbet", 250);
        map.put("Frozen-Yogurt", 120);
        map.put("Strawberry", 210);
        map.put("Biscuits", 220);
        map.put("Ketchup", 98);
        map.put("Noodles", 70);
        printing(map);
        HashMap<String, Integer> resultmap = UserInput();
        compute(map, resultmap);
    }

    public static void printing(HashMap<String, Integer> map) {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static HashMap<String, Integer> UserInput() {
        HashMap<String, Integer> map1 = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of products");
        int p = sc.nextInt();
        System.out.println("Select the items and quantity. Enter 'exit' to finish.");

        if (p != 0) {
            sc.nextLine();
            while (p > 0) {
                String input = sc.nextLine().trim(); // Use to remove any leading white spaces (like tabs)

                if (input.equalsIgnoreCase("exit")) {
                    break;
                }

                try {
                    String[] parts = input.split("\\s+");
                    if (parts.length == 2) {
                        String name = parts[0];
                        int quantity = Integer.parseInt(parts[1]);
                        map1.put(name, quantity);
                        p--;
                    } else {
                        System.out.println("Invalid input. Please enter item and quantity separated by space.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid quantity. Please enter a valid number.");
                }
            }
        } else {
            System.out.println("No products to enter.");
        }
        return map1;
    }

    // Computing the price of the product according to the quantity
    public static void compute(HashMap<String, Integer> map, HashMap<String, Integer> map1) {
        ArrayList<Integer> list = new ArrayList<>();

        // Iterate over the keys of map1
        for (String key : map1.keySet()) {
            // Check if the item exists in the map
            if (map.containsKey(key)) {
                // Get the quantity from map1
                // Integer is used instead of int bcz if user want to exit then it able to take
                // the null values
                Integer quantity = map1.get(key);

                // Get the value associated with the key from map
                Integer value = map.get(key);

                if (quantity != null && value != null) {
                    int price = quantity * value;
                    list.add(price);
                } else {
                    System.out.println("Invalid Item: " + key);
                }
            } else {
                System.out.println("Invalid Item: " + key);
            }
        }

        printing1(list, map1);
    }

    public static void printing1(ArrayList<Integer> list, HashMap<String, Integer> map) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            // for (String key : map.keySet())

            // System.out.println("Price of Product " + key + ": " + list.get(i));
            System.out.println("Price of Product " + (i + 1) + ": " + list.get(i));
            sum += list.get(i);

        }
        Float gst = (float) (0.18 * sum);
        System.out.println("GST : " + gst);
        System.out.println("Total Payable amount : " + (gst + sum));
    }
}
