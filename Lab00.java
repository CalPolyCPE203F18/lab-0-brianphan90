public class Lab00
{
    public static void main(String[] args) {
        int x = 5;
        String y = "hello";
        double z = 9.8;
        //System.out.println("x: " + x + " y: "+ y + " z: " + z);
        System.out.printf("x: %d " + "y: %s " + "z: %.1f%n", x, y, z);

        int[] nums = {3, 6, -1, 2};
        for (int i = 0; i < nums.length; i++)    //iterate though the array
        {
            System.out.println(nums[i]);

        }
        int numFound = char_count(y, 'l');
        System.out.println("Found:" + numFound);

        for (int i = 1; i < 11; i++) {
            System.out.print(i + " ");
        }
    }
    public static int char_count(String s, char c){
        int count =0;
        for (int char_num=0; char_num < s.length(); char_num++){
            if(c == s.charAt(char_num)){
                count += 1;
            }
        }
        return count;
    }
}

