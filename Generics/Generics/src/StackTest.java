public class StackTest {
   public static void main(String[] args)
   {
      Double[] doubleElements = {1.1, 2.2, 3.3, 4.4, 5.5};
      Integer[] integerElements = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

      // Create a Stack<Double> and a Stack<Integer>
      Stack<Double> doubleStack = new Stack<>(5);
      Stack<Integer> integerStack = new Stack<>();

      // push elements of doubleElements onto doubleStack
      testPush(doubleStack, doubleElements);
      testPop(doubleStack); // pop from doubleStack
      // push elements of integerElements onto integerStack
       System.out.println();
      testPush(integerStack, integerElements);
      testPop(integerStack); // pop from integerStack
   }

    public static <T> void testPush(Stack<T> stack,
                                    T[] elements)
    {
        // push elements onto Stack
        for (T element : elements)
        {
            System.out.printf("%s ", element);
            stack.push(element); // push element onto stack
        }
    }

    // generic method testPop pops elements from a Stack
    public static <T> void testPop(Stack<T> stack)
    {
        // pop elements from stack
        try
        {
            T popValue; // store element removed from stack

            // remove all elements from Stack
            while (true)
            {
                popValue = stack.pop(); // pop from stack
                System.out.printf("%s ", popValue);
            }
        }
        catch(EmptyStackException emptyStackException)
        {
            System.out.println("\n"+emptyStackException);
        }
    }
} // end class StackTest

