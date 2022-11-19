package emirates;

public class ExceptionFormatByString {

    private void getCustomExceptionMsg(String str) {

        String ss = str.substring(0, str.indexOf("|"));
        System.err.println(ss);

    }

    public static void main(String[] args) {
        ExceptionFormatByString formatByString = new ExceptionFormatByString();
        formatByString.getCustomExceptionMsg("IOException|the file doesn't exits.");
    }
}
