public class ManifoldDataGenerator {
    public static void main(String[] args) {
        int gridSize = 100;
        double[] x = linspace(-5, 5, gridSize);
        double[] y = linspace(-5, 5, gridSize);

        // Iterate over the grid to compute Z values
        for (int i = 0; i < gridSize; i++) {
            for (int j = 0; j < gridSize; j++) {
                double z = Math.sin(Math.sqrt(x[i] * x[i] + y[j] * y[j]));
                System.out.println(x[i] + " " + y[j] + " " + z);
            }
            System.out.println(); // Blank line to separate rows for Gnuplot's 3D plotting
        }
    }

    private static double[] linspace(double start, double end, int num) {
        double[] result = new double[num];
        double step = (end - start) / (num - 1);

        for (int i = 0; i < num; i++) {
            result[i] = start + i * step;
        }

        return result;
    }
}
