//question no 7
//Write a Java program to demonstrate the finalize() method by creating an object and making it eligible for garbage collection.

class question7 {


    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalize() method called");
    }

    public static void main(String[] args) {
        question7 obj = new question7();

        obj = null;  // Object becomes eligible for garbage collection

        System.gc(); // Request JVM to run garbage collector

        System.out.println("Object is eligible for garbage collection");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}