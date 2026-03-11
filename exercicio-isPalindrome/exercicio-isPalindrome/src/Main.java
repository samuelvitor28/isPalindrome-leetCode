//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
static void main(String [] args)
{
    System.out.println(isPalindrome(121));
    System.out.println(isPalindrome(1221));
    System.out.println(isPalindrome(456));
    System.out.println(isPalindrome(2002));
    System.out.println(isPalindrome(8907));
}

static boolean isPalindrome(int x) {
    if(x < 0)
    {
        return false;
    }
    int arraySize = 0, temp = x;
    int [] array;
    boolean largeFound = false;

    for (int i = 0; !largeFound; i++)
    {
        if(temp / 10 <= 0)
        {
            largeFound = true;
            arraySize = i + 1;
        }
        temp /= 10;
    }

    temp = x;
    array = new int [arraySize];

    for(int i = 0; i < array.length; i++)
    {
        array[i] = temp % 10;
        temp /= 10;
    }

    int right = array.length - 1, left = 0;

    while(right > left)
    {
        if(array[right] != array[left])
        {
            return false;
        }
        right--;
        left++;
    }
    return true;
}

