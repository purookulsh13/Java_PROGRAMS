class array{
    public static void main(String[] args) {
        int[][] arr = new int[3][];
        arr[0] = new int[2];
        arr[1] = new int[1];
        arr[2] = new int[3];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                arr[i][j] = 20;
                System.out.println(arr[i][j]);
            }

        }

       }


}




