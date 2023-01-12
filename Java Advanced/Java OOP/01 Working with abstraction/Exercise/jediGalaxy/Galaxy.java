package J01WorkingWithAbstraction.Exercise.jediGalaxy;

public class Galaxy {

    private int[][] galaxy;

    public Galaxy(int galaxyRow, int galaxyCol) {
        this.galaxy = new int[galaxyRow][galaxyCol];
        fillGalaxy(galaxyRow, galaxyCol, galaxy);
    }

    public void fillGalaxy(int galaxyRow, int galaxyCol, int[][] galaxy) {
        int starValue = 0;
        for (int row = 0; row < galaxyRow; row++)
        {
            for (int col = 0; col < galaxyCol; col++)
            {
                galaxy[row][col] = starValue++;
            }
        }
    }
}
