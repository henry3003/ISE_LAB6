public class HealthCalcTest {
    public static void main(String[] args)
    {
        testUvRating();
    }

    public static void testUvRating()
    {
        assert "-".equals(HealthCalc.uvRating(-0.00001)) : "INVALID/low";
        assert "low".equals(HealthCalc.uvRating(0.0)) : "invalid/LOW";
        assert "low".equals(HealthCalc.uvRating(2.99999)) : "LOW/medium";
        assert "medium".equals(HealthCalc.uvRating(3.0)) : "low/MEDIUM";
        assert "medium".equals(HealthCalc.uvRating(5.99999)) : "MEDIUM/high";
        assert "high".equals(HealthCalc.uvRating(6.0)) : "MEDIUM/high";
        assert "high".equals(HealthCalc.uvRating(7.99999)) : "HIGH/very high";
        assert "very high".equals(HealthCalc.uvRating(8.0)) : "high/VERY HIGH";
        assert "very high".equals(HealthCalc.uvRating(10.99999)) : "V. HIGH/extreme";
        assert "extreme".equals(HealthCalc.uvRating(11.0)) : "v. high/EXTREME";
    }
}
