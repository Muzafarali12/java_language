class binary {
public static void main(String[] args){
int ans = -1; 
int start = 0;
int target = 2;
int[] num = {2,3,4,5,6,7,8};
int lx = num.length - 1;
int nlx = lx+1;
                     // Finding middle term
while(start <= lx){
int mid = start + (lx-start)/2;
if(num[mid] == target){
ans = mid;
break;
}
else if(num[mid]<target){
start = mid+1;
}
else{
lx = mid-1;
}
}
if(ans == -1){
System.out.println("Element not found. ");
}
else {
System.out.println("Found element "+ target +" at index : "+ans);
}
}
}