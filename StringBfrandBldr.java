public class StringBfrandBldr {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());  // Gives the capacity of the buffer i.e., no. of bytes/characters
        sb.append("Hello");      // Appends given string to the end of the StringBuffer

        System.out.println(sb);
        System.out.println(sb.capacity());

        sb.append(", My name is Deepak.");
        System.out.println(sb);
        System.out.println(sb.capacity());

        sb.insert(7, "Mera naam ");    // Inserts given string at the provided index location in the Stringbuffer
        System.out.println(sb);


        sb.replace(0, 5, "Hi");      // Replaces given string at the provided index location in the String
        System.out.println(sb);

        sb.delete(5, 7);   // Delete given string at the provided index location in the String
        System.out.println(sb);

        sb.ensureCapacity(50);    // Ensures the provided capacity is the minimum capacity of the String
        System.out.println(sb.capacity());
    }
}
