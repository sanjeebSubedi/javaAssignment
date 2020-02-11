
interface my_interface
    {
         default void welcome()
        {
            System.out.println("Welcome to Nepal");
        }
    }


class my_class implements my_interface
    {
        public void sample()
        {
            System.out.println("Have a nice journey!");
        }
    public static void main(String[] args)
        {
            my_class example = new my_class();
            example.welcome();
            example.sample();

        }
    }
