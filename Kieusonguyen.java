public class Kieusonguyen {
    // byte range [(-2^7), 2^7 -1] 8bit (1byte)
    // short range [(-2^15), 2^15 -1] 16bit (2byte)
    // int range [(-2^31), 2^31 -1] 32bit (4byte)
    // long range [(-2^63), 2^63 -1] 64bit (8byte)

    public static void main(String[] args) {
        
        int a = -2147483648;
        int b = 2147483647;

        int firstResult = b/2;
        System.out.println(firstResult);

        byte firstByte = -128;
        byte secondByte = 127;
        byte byteResult = (byte) (secondByte/2);
        System.out.println(byteResult);

        short firstShort = -1234;
        // short secondShort = 1234;
        short shortResult = (short) (firstShort/2);
        System.out.println(shortResult);

        // long firstLong = 5L;
        long longResult=10L+10L+a+firstByte+shortResult;
        System.out.println(longResult);
    }
}
