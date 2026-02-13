class C10
{
    public static void main(String args[])
    {
	int[][]matrix ={{1,2,3},{4,5,6}};
        for(int[] row: matrix)
        {
            for(int element:row)
            {
                System.out.print(element + " ");
            }
            System.out.print("\n");
        }
    }
}
a