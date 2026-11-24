public class HouseCalcTest
{
    public static void main(String[] args)
    {
        testRoomVolume();
        testRoomVolumeCompact();
    }

    public static void testRoomVolume()
    {
        assert Math.abs(60.0- HouseCalc.roomVolume(3, 4, 5)) < 0.00001 : "Valid";
        assert Math.abs(0.0- HouseCalc.roomVolume(3, 4, 1)) < 0.00001 : "h<3";
        assert Math.abs(0.0- HouseCalc.roomVolume(3, 1, 5)) < 0.00001 : "l<2.5";
        assert Math.abs(0.0- HouseCalc.roomVolume(3, 1, 1)) < 0.00001 : "l<2.5, h<3";
        assert Math.abs(0.0- HouseCalc.roomVolume(1, 4, 5)) < 0.00001 : "w<2";
        assert Math.abs(0.0- HouseCalc.roomVolume(1, 4, 1)) < 0.00001 : "w<2, h<3";
        assert Math.abs(0.0- HouseCalc.roomVolume(1, 1, 5)) < 0.00001 : "w<2, l<2.5";
        assert Math.abs(0.0- HouseCalc.roomVolume(1, 1, 1)) < 0.00001 : "w<2, l<2.5, h<3";
        // Notes:
        // (1) It would be better to define a symbolic constant for the tolerance,
        // instead of repeating the literal 0.00001.
        // (2) We could simplify it by removing the "zero minus" bit; e.g.:
        // assert Math.abs(HouseCalc.roomVolume(3, 4, 1)) < 0.00001 : "h < 3";
    }

    // Example of an array-and-for-loop approach:
    public static void testRoomVolumeCompact()
    {
        int[] w = {3, 3, 3, 3, 1, 1, 1, 1};
        int[] l = {4, 4, 1, 1, 4, 4, 1, 1};
        int[] h = {5, 1, 5, 1, 5, 1, 5, 1};
        double[] expected = {60.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};

        assert Math.abs(HouseCalc.roomVolume(3, 4, 1)) < 0.00001 : "h < 3";
        String[] message = {"Valid", "h<3", "l<2.5", "l<2.5, h<3", "w<2", "w<2, h<3", "w<2, l<2.5", "w<2, l<2.5, h<3"};
        for(int i = 0; i < w.length; i++)
        {
            assert Math.abs(expected[i]- HouseCalc.roomVolume(
            w[i], l[i], h[i])) < 0.00001 : message[i];
        }
    }
}