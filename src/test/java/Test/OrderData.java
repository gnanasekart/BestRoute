package Test;

import Utils.DijkstraShortestPath;
import Utils.DistanceCalculationUtils;
import org.testng.annotations.Test;

public class OrderData {

    //Scenario - When the restaurant 1 is far away compare to restaurant 2
    @Test
    public void ex1() {
        //{latitude, longitude}
        double[] aman = {12.9, 77.1};
        double[] r1 = {13.02, 77.2};
        double[] r2 = {12.8, 77.1};
        double[] c1 = {12.86, 77.10};
        double[] c2 = {13, 77.1};

        int a_a = 0;
        int a_r1 = DistanceCalculationUtils.calculateDistanceInKilometer(aman[0], aman[1], r1[0], r1[1]);
        int a_r2 = DistanceCalculationUtils.calculateDistanceInKilometer(aman[0], aman[1], r2[0], r2[1]);
        int r1_r2 = DistanceCalculationUtils.calculateDistanceInKilometer(r1[0], r1[1], r2[0], r2[1]);
        int c1_c2 = DistanceCalculationUtils.calculateDistanceInKilometer(c1[0], c1[1], c2[0], c2[1]);
        int r1_c2 = DistanceCalculationUtils.calculateDistanceInKilometer(r1[0], r1[1], c2[0], c2[1]);
        int r1_c1 = DistanceCalculationUtils.calculateDistanceInKilometer(r1[0], r1[1], c1[0], c1[1]);
        int r2_c2 = DistanceCalculationUtils.calculateDistanceInKilometer(r2[0], r2[1], c2[0], c2[1]);
        int[] distance = new int[8];
        DijkstraShortestPath dijkstra = new DijkstraShortestPath(distance.length);


    }
}
