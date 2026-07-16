package strings;

public class shortestPath {

    public static double getShortestpath(String str) {
        int x = 0;
        int y = 0;
        double shortestPath = 0;

        for (int i = 0; i < str.length(); i++) {

            switch (str.charAt(i)) {
                case 'N' -> y++;
                case 'S' -> y--;
                case 'E' -> x++;
                case 'W' -> x--;
            }
        }
        int sum = x*x + y*y;
        shortestPath = Math.sqrt(sum);
        return shortestPath;
    }

     public static void main(String[] args) {
        String str = "WNEENESENNN";
        System.out.println(getShortestpath(str));
    }


    }

   
// we can use float so that we can use double too 