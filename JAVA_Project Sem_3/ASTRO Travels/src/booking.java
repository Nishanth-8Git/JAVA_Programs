import java.util.Scanner;


final class booking {
        Scanner bookin = new Scanner(System.in);


    private int num_pax, pax_date;
    private String pax_ch_1;
    private String pax_dest;
    private String pax_dept;
    
    booking()
    {   //Initialization area.
        num_pax= -1;
        pax_date = -1;
    }

    protected void booking_ph0()
    {

        System.out.println();
        System.out.println();
        System.out.println("Welcome to the Booking section, we are happy to serve you today!");
        System.out.println();
        System.out.println();

    }

    protected void booking_ph1()
    {   
        while(true){
            try 
            {

                while(true)
                {    
                    System.out.println("Enter whether you are planning an 'International' or a 'Domestic' Flight:");
                    pax_ch_1 = bookin.next();
                    System.out.println(pax_ch_1);

            
                    switch (pax_ch_1)
                    {
                        case ( "International" ):
                        {
                            System.out.println("Booking flights to international ariport.");
                       
                            while(true)
                            {
                           
                                System.out.println("Enter your destination Airport:");
                                pax_dest = bookin.nextLine();

                                ///there is a clash in how the above input seem to be working and this line fixes the input being blank
                                pax_dest = bookin.nextLine();

                                System.out.println("The Arrival airport you've entered is "+pax_dest+" confirm ?[Y / N ]" );
                                char ch = bookin.next().charAt(0);
                                if (ch == 'Y')
                                {
                                    break;
                                }
                            }
                        
                            while(true)
                            {
                                System.out.println("Enter your Embarking airport: ");
                                pax_dept = bookin.nextLine();
    
                                ///there is a clash in how the above input seem to be working and this line fixes the input being blank
                                pax_dept = bookin.nextLine();
    
                                System.out.println("The Arrival airport you've entered is "+pax_dept+" confirm ?[Y / N ]" );
                                char ch1 = bookin.next().charAt(0);

                                if (ch1 == 'Y')
                                    {
                                        break;
                                    }
                            }
                            break;
                        }
                        
                        case ("Domestic"):
                        {
                            System.out.println("Booking flights to domestic ariport.");
                   
                            while(true)
                            {
                       
                                System.out.println("Enter your destination Airport:");
                                pax_dest = bookin.nextLine();

                                ///there is a clash in how the above input seem to be working and this line fixes the input being blank
                                pax_dest = bookin.nextLine();

                                System.out.println("The Arrival airport you've entered is "+pax_dest+" confirm ?[Y / N ]" );
                                char ch = bookin.next().charAt(0);
                                if (ch == 'Y')
                                {
                                    break;
                                }
                            }
                    
                            while(true)
                            {
                           
                                System.out.println("Enter your Embarking airport: ");
                                pax_dept = bookin.nextLine();

                                ///there is a clash in how the above input seem to be working and this line fixes the input being blank
                                pax_dept = bookin.nextLine();

                                System.out.println("The Arrival airport you've entered is "+pax_dept+" confirm ?[Y / N ]" );
                                char ch1 = bookin.next().charAt(0);

                                if (ch1 == 'Y')
                                {
                                    break;
                                }
                            }
                            break;
                        }
                            
                        default:
                        System.out.println("Invlid Option");
                    }
                }    
            } catch (Exception e) {
                System.out.println("Please enter the correct destination.");
            }
        }
        
      

        

    }
    
}
