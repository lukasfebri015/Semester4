// Contoh modifier non-akses
class NonAksesModifier {
   static int nilaiStatic = 100; // Nilai kelas, bukan instansi
   final int nilaiFinal = 200; // Nilai tidak dapat diubah
   
   public static void methodStatic() {
       System.out.println("Static method");
   }
   
   public final void methodFinal() {
       System.out.println("Final method");
   }
}