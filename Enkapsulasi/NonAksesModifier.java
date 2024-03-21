// Contoh modifier akses
class AksesModifier {
   private int dataPrivate = 40; // Hanya dapat diakses dalam kelas
   AksesModifier() { }
   protected int dataProtected = 50; // Dapat diakses dalam paket yang sama
   
   public int dataPublic = 60; // Dapat diakses dari mana saja
   
   private void methodPrivate() {
       System.out.println("Private method");
   }
   
   protected void methodProtected() {
       System.out.println("Protected method");
   }
   
   public void methodPublic() {
       System.out.println("Public method");
   }
}