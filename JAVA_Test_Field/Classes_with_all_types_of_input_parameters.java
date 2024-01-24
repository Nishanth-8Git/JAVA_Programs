class Box{
    //values to be intialized.
    int width;
    int height;
    int length;
    String Shape;
    double volume = Volume(); // here, it's not reading the values properly even tho its compiling.

    //////////////////////////////////Constructor region./////////////////////////////////////////////

    //~~ Initializing with Objects.
    Box(Box ob1){
        width  = ob1.width;
        height = ob1.height;
        length = ob1.length;
    }
    //~~Initializing with parameters.
    Box(int l, int w, int h){
        width=w;
        length=l;
        height=h;
    }

    //~~Initializing as a cube(taken as a single parameter.)
    Box(int len){
        width=len;
        length=len;
        height=len; 
        //alt. width = length = height = len;
    }

    //~~Uninitialzed Box to say that the box isn't prepared or something.
    Box(){
        width=-1;
        length=-1;
        height=-1;
        System.out.println("Warning : The box(es) hasn't/haven't been initialized yet.");
    }
    public String toString(){
        /**
         * NOTE:
         * If you use the toString() method in Java we have to declare it as public or else it states the following error:
         * "Cannot reduce the visibility of the inherited method from Object Java(67109273)"
         * 
         * , You can remove the "public" part from this and see it yourself.
         */

        return "This is the volume of the object:"+Volume()+"(m^3)";
    }

    public double Volume(){
        return width*length*height;
    }
    //////////////////////////////////Constructor region ends.////////////////////////////////////////
}




/**This is the main class~~. */
public class Classes_with_all_types_of_input_parameters {
    public static void main(String args[]){
        
        ///////////////////////Object creation area.///////////////////////////
        Box testing   =   new Box();
        Box testing1  =   new Box(1,2,3);
        ///////////////////////Object creation area ends.//////////////////////

        double trial = testing.Volume();
        System.out.println(trial);

        double trial1 = testing1.Volume();
        System.out.println(testing1);
        System.out.println(trial1);
    }   
}
/**The end of the main class. */