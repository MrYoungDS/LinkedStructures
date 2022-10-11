public class CallByWhat
{
    public static void main(String[] args)
    {
        int[] arr = {12, 34, 56, 78, 90};
        int x = 99;
        System.out.println(listArr(arr));
        makeChange(arr);
        System.out.println(listArr(arr));
        makeChange(x);
        System.out.println(x);
    }

    public static void makeChange(int[] values)
    {
        for (int i = 0; i < values.length; i++)
        {
            values[i]++;
        }
    }

    public static void makeChange(int val)
    {
        val++;
    }

    public static String listArr(int[] values)
    {
        String result = "";
        if (values.length > 0)
        {
            result += "{" + values[0];
        }
        for (int i = 1; i < values.length; i++)
        {
            result += ", " + values[i];
        }
        result += "}";
        return result;
    }
}
