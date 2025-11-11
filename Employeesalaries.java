import java.util.Arrays; 
import java.util.Scanner; 
public class Employeesalaries 
{ 
public static void main(String args[]){ 
double employee_salaries[]={25000.0,4300.8,58900.0,21545.0,3000.6,88670.0,67900.0}; 
Scanner scanner = new Scanner(System.in); 
System.out.println("Enter type of sorting: "); 
String sorting = scanner.next(); 
switch (sorting){ 
case "Selectionsort": 
System.out.println(Arrays.toString(Selectionsort(employee_salaries))); 
break; 
case "Bubblesort": 
System.out.println(Arrays.toString(Bubblesort(employee_salaries))); 
} 
System.out.println("Top five salaries of employees are: "); 
for (int i = employee_salaries.length-1; i>=employee_salaries.length-5;i--){ 
System.out.println(employee_salaries[i]); 
} 
} 
public static double[] Selectionsort(double arr[]){ 
int n = arr.length; 
for(int i=0;i<n-1;i++){ 
int min = i; 
for(int j=i+1;j<n;j++){ 
if (arr[j]<arr[min]){ 
min = j; 
} 
} 
double temp = arr[i]; 
arr[i] = arr[min]; 
arr[min] = temp;  
} 
return arr; 
} 
public static double[] Bubblesort(double arr[]){ 
int n = arr.length; 
for(int i=0; i<n-1;i++){ 
int flag=0; 
for(int j=0;j<n-1-i;j++){ 
if(arr[j]>arr[j+1]){ 
double temp = arr[j]; 
arr[j] = arr[j+1]; 
                    arr[j+1] = temp; 
                    flag = 1; 
                } 
            } 
            if(flag == 0){ 
                break; 
            } 
        } 
        return arr; 
    } 
} 
