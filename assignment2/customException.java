class underAgeException extends Exception
    {
        underAgeException (String s)
          {
            super(s);
          }
    }
class newClass
    {
         static void check(int age) throws underAgeException
            {
              if (age < 18)
                {
                    throw new underAgeException("You are not old enough to vote.");
                }
        else
            {
                System.out.println("Congratulations! You are old enough to vote.");
            }
        }
        public static void main(String[] args)
            {
                try
                    {
                     check(13);
                    }
                catch (Exception e)
                {
                    System.out.println("Exception occured: "+e);
                }
            }
    }
