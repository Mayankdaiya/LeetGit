import java.math.BigInteger;

class MultiplyString {
    public String multiply(String num1, String num2) {
        BigInteger b=new BigInteger(num1);
        BigInteger c=new BigInteger(num2);
        BigInteger d=b.multiply(c);
        return d.toString();
    }
}