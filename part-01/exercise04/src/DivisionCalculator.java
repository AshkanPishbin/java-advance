public class DivisionCalculator {
    public Double divide(Double double1, Double double2) {
        if (double2 == 0 && double1 == 0) {
            return Double.POSITIVE_INFINITY;
        }
        if (double1 == 0 && double2 < double1) {
            double divisionResult = 0;
            return divisionResult;
        }
        Double division = double1 / double2;
        return division;
    }
}
