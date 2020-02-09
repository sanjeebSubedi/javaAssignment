interface my_interface
    {
        void  greet();
        static void welcome()
        {
            System.out.println("Welcome to Nepal");
        }
    }

class my_class
    {
    public static void main(String[] args)
        {
                my_interface.welcome();
        }
    }
