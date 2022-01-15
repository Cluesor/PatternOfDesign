package FaceExamination.Singleton;

public class Client {

   private     static class Singleton{
        private static   final Singleton instance = new Singleton();
         private Singleton() { }

       private static   Singleton getInstance() {
            return instance;
        }
    }

    public static void main(String[] args) {
         Singleton.getInstance();
    }

}
