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


//        int[] array = new int[10];

//        add in an array   =>   array[index] = value  =>  array[4] = 45
//        see in an array   =>   array[index]  =>  array[2]
//
//        for(int i=0; i<array.length; i++){
//            array[i] = i*11;
//        }
//
//        for (int i=0; i<array.length; i++){
//            System.out.print(array[i]+" ");
//        }

        int arr[] = new int[3];
        arr[0] = 10;  //[10,0,0]
        arr[0] = 20; // [20,0,0]  update
        System.out.println(arr[0]);

        String sarr[] = new String[4];
        sarr[1] = "yogita"; //["yogita", null, null, null]
        System.out.println(sarr[3]);

        boolean barr[] = new boolean[20];
        barr[0] = true; //[true, false, false, false, ....]
        barr[2] = true;
        barr[10] = true;
        System.out.println(barr[6]); //arrayname[index]
        System.out.println("length - "+barr.length);

        for(int i=0; i<barr.length; i++){
            System.out.print(barr[i]+" ");
        }


    }
}
