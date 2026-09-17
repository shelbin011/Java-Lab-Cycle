// Question no 18
// Write a Java program to demonstrate the use of a static variable that counts the total number of objects created.

class question18 {

    static int count = 0;

    question18() {
        count++;
    }

    public static void main(String[] args) {
        question18 obj1 = new question18();
        question18 obj2 = new question18();
        question18 obj3 = new question18();

        System.out.println("Objects Created : " + count);
    }
}