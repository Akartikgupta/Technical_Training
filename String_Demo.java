public class String_Demo {
    public static void main(String[] args) {
        // String is immutable
        // bad for changing the value
        String name = "Kartik";// String literals
        // 1 object or 0 object
        String name2 = "Kartik".intern();// intern check for present or not
        System.out.println(name == name2);
        // 2 object is created by using new keyword
        String name3 = new String("Kartik").intern();// new memory is allocated to the string name3
        System.out.println(name == name3);
        // stirng aak kaam krege aak pool me aak value store krege and by using new you
        // allocate the new memory
        StringBuilder sb = new StringBuilder();// not synochrinsed
        // StringBuffer sb = new StringBuffer(10000);// capacity can be expilixity
        // applied
        // stringbuffer is mutable
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.append("Kartik");
        System.out.println(sb.length());
        sb.append("sdfwfewrfwascsdcsdvsdvs");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        // After 16 we have a ne capacity is 16*2 +2
        sb.ensureCapacity(1000);// capacity can not be reduced
    }
}
