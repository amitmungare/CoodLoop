public class ArrayInJava {
    public static void main(String[] args) {
//        int[] array = {10,20,30,40,50,60,70,80,90};
        //             0, 1 ,2 ,3 ,4 ,5 ,6 ,7 ,8

//        System.out.println(array[3]);
//        System.out.println(array[18]);

//        System.out.println(array.length);

//        /*for(int i=0; i<array.length; i++){
//            System.out.print(array[i]+" ");
//        }*/


        int[] array = new int[10];

//        add in an array   =>   array[index] = value  =>  array[4] = 45
//        see in an array   =>   array[index]  =>  array[2]

        for(int i=0; i<array.length; i++){
            array[i] = i*11;
        }

        for (int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }

    }
}
