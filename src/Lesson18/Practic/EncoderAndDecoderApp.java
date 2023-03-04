package Lesson18.Practic;

public class EncoderAndDecoderApp {

    public static void main(String[] args) {
        String res = encoder("Liner searchin time complexity -de worse case-i O(n)-dir.Best case " +
                "scennariosu ise O(1)dir .Buna constant time da deyilir.Mes: Axtaris etdiyimiz eded 1-ci " +
                "indexdedirsen bu ededi constant time-da tapdigi ucun buna constant deyilir.Eksine oldugu" +
                " hallda Liner search-un  worse case scennarioda time complexity-i O(n)-dir. LIner searchin " +
                "icrasi ucun Space complexity 1-dir.Cunki burda her iterasiya zamani ededi massivden goturur" +
                " getirir yoxlamag istediyim edede menimsedir wert odenmesise onu yaddawda saxlamir hemin yeri" +
                " bowaldir novbeti ededi getirir.Buna gore de liner searchin space complexity -si 1dir.");
        System.out.println(res);
        System.out.println(decoder(res));

    }

    public static String encoder(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            result +=   Integer.toString((int) text.charAt(i) + 3, 16) +" ";
        }
        return result;
    }

    public static String decoder(String encodeText) {
        String result = "";
        String[] array = encodeText.split(" ");
        for (String ar : array) {
            int a = Integer.valueOf(ar ,16);
            result += (char) (a - 3);
        }
        return result;
    }
}
