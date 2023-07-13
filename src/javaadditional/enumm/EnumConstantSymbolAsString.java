package javaadditional.enumm;

public enum EnumConstantSymbolAsString {
    WINDOWS, MACOS, LINUX
}
class Main2{
    public static void main(String[] args) {
        String osType = EnumConstantSymbolAsString.WINDOWS.toString();
        System.out.println(osType);
    }
}

