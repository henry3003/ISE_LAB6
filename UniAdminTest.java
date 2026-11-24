public class UniAdminTest {
    public static void main(String[] args)
    {
        testCalcGrade();
        testCalcGradeBva();
    }

    // Using the basic equivalence partitioning approach
    public static void testCalcGrade()
    {
        assert "".equals(UniAdmin.calcGrade(-5)) : "<0";
        assert "F".equals(UniAdmin.calcGrade(25)) : "0-49";
        assert "5".equals(UniAdmin.calcGrade(55)) : "50-59";
        assert "6".equals(UniAdmin.calcGrade(65)) : "60-69";
        assert "7".equals(UniAdmin.calcGrade(75)) : "70-79";
        assert "8".equals(UniAdmin.calcGrade(85)) : "80-89";
        assert "9".equals(UniAdmin.calcGrade(95)) : "90-99";
        assert "10".equals(UniAdmin.calcGrade(100)) : "=100";
        assert "".equals(UniAdmin.calcGrade(105)) : ">100";
    }

    // Using boundary value analysis
    public static void testCalcGradeBva()
    {
        assert "".equals(UniAdmin.calcGrade(-1)) : "Invalid/F--1";
        assert "F".equals(UniAdmin.calcGrade(0)) : "Invalid/F- 0";
        assert "F".equals(UniAdmin.calcGrade(49)) : "F/5- 49";
        assert "5".equals(UniAdmin.calcGrade(50)) : "F/5- 50";
        assert "5".equals(UniAdmin.calcGrade(59)) : "5/6- 59";
        assert "6".equals(UniAdmin.calcGrade(60)) : "5/6- 60";
        assert "6".equals(UniAdmin.calcGrade(69)) : "6/7- 69";
        assert "7".equals(UniAdmin.calcGrade(70)) : "6/7- 70";
        assert "7".equals(UniAdmin.calcGrade(79)) : "7/8- 79";
        assert "8".equals(UniAdmin.calcGrade(80)) : "7/8- 80";
        assert "8".equals(UniAdmin.calcGrade(89)) : "8/9- 89";
        assert "9".equals(UniAdmin.calcGrade(90)) : "8/9- 90";
        assert "9".equals(UniAdmin.calcGrade(99)) : "9/10- 99";
        assert "10".equals(UniAdmin.calcGrade(100)) : "9/10- 100";
        assert "".equals(UniAdmin.calcGrade(101)) : "10/Invalid- 101";
    }
}
