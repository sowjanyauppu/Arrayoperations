import java.util.Scanner;
public class Main
{
public static void main(String[] args) {
     int pos,element,i,j;
    
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of an array:");
    int size=sc.nextInt();
    int arr[]=new int[size];
    System.out.println("Enter elements of an array:");
    int newarr[]=new int[arr.length+1];
    for(i=0;i<size;i++)
    {
        arr[i]=sc.nextInt();
    }
    System.out.println("the elements are:");
        for(i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }
        while(true)
        {
            System.out.println("\n operations on array:");
            System.out.println("1-> Insert an element into first position");
            System.out.println("2-> Insert an element into last position");
            System.out.println("3-> Insert an element in to array at specific position");
            System.out.println("4-> Delete an element from specific positon:");
            System.out.println("5-> frequecy of an element in the array:");
            System.out.println("6-> unique elements in the array:");
            System.out.println("0->Exit");
            System.out.println("----------------------------------");
            System.out.println("select your operation:");
            int num=sc.nextInt();
            
            switch(num)
            {
            case 0:
                System.exit(0);
            break;
            case 1:
                pos=0;
                System.out.println("Enter the element you want to insert:");
                element=sc.nextInt();
              //  int newarr[]=new int[arr.length+1];
                for(i=0;i<arr.length;i++)
                {
                    if(i==pos)
                    {
                        newarr[i]=element;
                        newarr[i+1]=arr[i];
                    }
                    else
                    newarr[i+1]=arr[i];
                }
                System.out.println("After inserting element at first positon array are:");
                for(i=0;i<newarr.length;i++)
                System.out.print(newarr[i]+" ");
                
            break; 
            
            case 2:
                //int pos_1=0;
               // int element_1;
                System.out.println("Enter the element you want to insert:");
                element=sc.nextInt();
               // int newarr[]=new int[arr.length+1];
            
                for(j=0;j<arr.length;j++)
                {
                    newarr[j]=arr[j];
                }
                
                newarr[j]=element;
                
                System.out.println("After inserting element at last positon array are:");
                for(j=0;j<newarr.length;j++)
                {
                System.out.print(newarr[j]+" ");
                }
            break;  
            
            case 3:
                        System.out.println("Enter the element index which place you want to insert:");
                        pos=sc.nextInt();
                        System.out.println("Enter the element you want to insert:");
                        element=sc.nextInt();
                        for(i=0;i<arr.length;i++)
                        {          
                            if(i==pos) 
                            {
                            newarr[i]=element;
                            newarr[i+1]=arr[i];
                            }
                            else if (i>pos)
                                newarr[i+1]=arr[i];
                            else 
                                newarr[i]=arr[i];   
                        }
                        System.out.println("List of element after insertion:");
                        for(i=0;i<newarr.length;i++)
                         {
                            System.out.println(newarr[i]+" ");
                         }        
                        break;
                        case 4:
                                    int loc;
                                    System.out.println("Enter the locatin you want to delete:");
                                    loc=sc.nextInt();
                                    for(i=loc;i<size-1;i++)
                                    {
                                        arr[i]=arr[i+1];
                                    }
                                    size--;
                                    System.out.println("elements after deletion:");
                                    for(i=0;i<size;i++)
                                    System.out.println(arr[i]+" ");
                        break;
                        case 5:
                            int [] fr = new int [arr.length];  
                            int visited = -1;  
                            for(i = 0; i < arr.length; i++)
                            {  
                            int count = 1;  
                            for(j = i+1; j < arr.length; j++)
                            {  
                                if(arr[i] == arr[j])
                                {  
                                count++;  
                            //To avoid counting same element again  
                                fr[j] = visited;  
                                }  
                            }  
                            if(fr[i] != visited)  
                            fr[i] = count;  
                             }  
  
                            //Displays the frequency of each element present in array  
                            System.out.println("---------------------------------------");  
                            System.out.println(" Element | Frequency");  
                            System.out.println("---------------------------------------");  
                            for(i = 0; i < fr.length; i++)
                            {  
                            if(fr[i] != visited)  
                            System.out.println("    " + arr[i] + "    |    " + fr[i]);  
                            }  
                            System.out.println("----------------------------------------"); 
                        break;
                        case 6:
                           
                           int [] uq = new int [arr.length];  
                            int visited_1 = -1;  
                            for(i = 0; i < arr.length; i++)
                            {  
                            int count = 1;  
                            int k;
                            for(k = i+1; k < arr.length; k++)
                            {  
                            if(arr[i] == arr[k])
                            {  
                                count++;  
                                uq[k] = visited_1;  
                            }  
                            }  
                            if(count==1 && uq[i]!=visited)  
                            uq[i] = arr[i];  
                            else uq[i]=visited_1;
                            }  
                            System.out.println(" Element"); 
                            for(i = 0; i < uq.length; i++){  
                            if(uq[i] != visited_1)  
                            System.out.println(uq[i]);  
                            }  
                        break;
                        default:
                            System.out.println("Invalid");

            }  
        }
}
}   