public class CharacterUtilsTest {
    public static void main(String[] args)
    {
        testCharCase();
        testSubstr();
    }

    public static void testCharCase()
    {
        assert CharacterUtils.charCase(true, 'A') : "checkUpper, uppercase";
        assert !CharacterUtils.charCase(true, 'a') : "checkUpper, lowercase";
        assert !CharacterUtils.charCase(true, '5') : "checkUpper, non-letter";
        assert !CharacterUtils.charCase(false, 'A') : "!checkUpper, uppercase";
        assert CharacterUtils.charCase(false, 'a') : "!checkUpper, lowercase";
        assert !CharacterUtils.charCase(false, '5') : "!checkUpper, non-letter";
    }

    public static void testSubstr()
    {
        assert "".equals(CharacterUtils.substr("abc", "xyz")) : "disjoint";
        assert "science".equals(CharacterUtils.substr("science", "conscience")) : "str1 in str2";
        assert "science".equals(CharacterUtils.substr("conscience", "science")) : "str2 in str1";
        assert "conscience".equals(CharacterUtils.substr("conscience", "conscience")) : "str1 = str2";
    }
}
