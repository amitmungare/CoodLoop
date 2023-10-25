package codes;

public class Patterns {
    public static void main(String[] args) {
//        //*
//        System.out.println("*");

//        //*****
//        System.out.println("*****");

//        //********************** (*100)
//        for(int i=1; i<=10; i++){
//            System.out.print("*");
//        }

        //****
        //****
        //****
        //****

//        int n=4;
//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=n; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //1111
        //2222
        //3333
        //4444

//        for(int i=1; i<=n; i++){  // i=1,2,3, 4
//            for(int j=1; j<=n; j++){ // j=1,2,3,4,5
//                System.out.print(i);  // 1111, 2222, 3333, 4444
//            }
//            System.out.println();
//        }


        //1234
        //1234
        //1234
        //1234

//        for(int i=1; i<=n; i++){  // i=1,2,3, 4
//            for(int j=1; j<=n; j++){ // j=1,2,3,4,5
//                System.out.print(j);  // 1234, 1234, 1234, 1234
//            }
//            System.out.println();
//        }



        //1 2 3 4
        //5 6 7 8
        //9 10 11 12
        //13 14 15 16

//        int k=1;
//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=n; j++){
//                System.out.print(k+" ");
//                k++;
//            }
//            System.out.println();
//        }


//        ****
//        *  *
//        *  *
//        ****

//        int n=4;
//        for(int i=1; i<=n; i++){ // i=1,2,3,4
//            for(int j=1; j<=n; j++){ // j=1,2,3,4
//                if(i==1 || i==n){
//                    System.out.print("*");
//                }else{
//                    if(j==1 || j==n){
//                        System.out.print("*");
//                    }else{
//                        System.out.print(" ");
//                    }
//                }
//            }
//            System.out.println();
//        }


//        *
//        **
//        ***
//        ****

//        int n=4;
//        for(int i=1; i<=n; i++){  // i=1,2,3,4
//            for(int j=1; j<=n; j++){  // j=1,2,3,4
//                if(j<=i){
//                    System.out.print("*");
//                }
//            }
//            System.out.println();
//        }

//            *
//           **
//          ***
//         ****
        int n=4;
        for(int i=1; i<=n; i++){ // i=1
            for(int j=1; j<=n-i; j++){ // j=1
                System.out.print("-");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
