public class Main {
    public static void main(String[] args) {
        String str = "Hello, World!";
        
        // 1. Substring
        System.out.println("Substring: " + str.substring(7)); // Output: "World!"
        
        // 2. CharAt
        System.out.println("CharAt: " + str.charAt(0)); // Output: "H"
        
        // 3. toLowerCase
        System.out.println("toLowerCase: " + str.toLowerCase()); // Output: "hello, world!"
        
        // 4. toUpperCase
        System.out.println("toUpperCase: " + str.toUpperCase()); // Output: "HELLO, WORLD!"
        
        // 5. Replace
        System.out.println("Replace: " + str.replace("World", "Java")); // Output: "Hello, Java!"
        
        // 6. Contains
        System.out.println("Contains: " + str.contains("World")); // Output: "true"
        
        // 7. Equals
        System.out.println("Equals: " + str.equals("hello, world")); // Output: "false"
        
        // 8. EqualIgnoreCase
        System.out.println("EqualIgnoreCase: " + str.equalsIgnoreCase("hello, world")); // Output: "true"
        
        // 9. EndWith
        System.out.println("EndWith: " + str.endsWith("!")); // Output: "true"
    }
}