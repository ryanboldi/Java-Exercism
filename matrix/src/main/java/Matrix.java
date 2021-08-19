class Matrix {
    private int[][] matrix;
    private int width;
    private int height;

    Matrix(String matrixAsString) {
        //get the length of the first row
        String lines[] = matrixAsString.split("\\r?\n");
        String firstLine[] = lines[0].split(" ");
        width = firstLine.length;
        height = lines.length;
        matrix = new int[height][width];

        for (int i = 0; i < height; i++){
            String line[] = lines[i].split(" ");
            for (int j = 0; j < width; j++){
                matrix[i][j] = Integer.parseInt(line[j]);
            }
        }
    }

    int[] getRow(int rowNumber) {
        int index = rowNumber -1; // 0 indexing

        return matrix[index];
    }

    int[] getColumn(int columnNumber) {
        int toReturn[] = new int[height];
        int index = columnNumber - 1;

        for (int i = 0 ; i < height; i++){
            toReturn[i] = matrix[i][index];
        }

        return toReturn;
    }
}
