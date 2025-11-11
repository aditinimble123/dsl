import java.util.Scanner; 
public class LinearBinary 
{ 
public static void main(String[]args){ 
Scanner scanner = new Scanner(System.in); 
System.out.println("Enter type of search: "); 
String search = scanner.next(); 
switch (search){ 
case "Linear": 
System.out.print("Enter array size :"); 
int size = scanner.nextInt(); 
int[] customer_id = new int[size]; 
System.out.println("Enter Customer id: "); 
for(int i = 0; i< customer_id.length; i++){ 
customer_id[i]=scanner.nextInt(); 
} 
System.out.println("enter search key: "); 
int key=scanner.nextInt(); 
int ans=linearSearch(customer_id,key); 
if(ans!= -1){ 
System.out.println("Customer id found at index: "+ans); 
}else{ 
System.out.println("Customer id not found."); 
} 
break; 
case "Binary": 
System.out.println("Enter size: "); 
int Size = scanner.nextInt(); 
System.out.println("Enter sorted list of customer id:"); 
int[] numbers = new int[Size]; 
for(int i = 0; i< numbers.length; i++){ 
numbers[i]=scanner.nextInt(); 
} 
System.out.println("Enter search key: "); 
int Key = scanner.nextInt(); 
int Ans = binarySearch(numbers,Key); 
if (Ans!=-1){ 
System.out.println("Customer id found at index: " + Ans); 
}else{ 
System.out.println("Customer id not found "); 
} 
} 
} 
public static int linearSearch(int[] arr , int target){ 
for(int i=0;i<arr.length;i++){ 
if (arr[i] == target){ 
return i; 
} 
} 
return -1; 
} 
public static int binarySearch(int[] arr, int key) { 
int left = 0, right = arr.length - 1; 
while (left <= right) { 
int mid = left + (right - left) / 2; 
if (arr[mid] == key) { 
return mid; 
} else if (arr[mid] < key) { 
left = mid + 1; 
} else { 
right = mid - 1; 
} 
} 
return -1; 
} 
} 