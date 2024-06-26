public class ConsCount{
static char employeeInitials[]={'A','B','C','E','D','F','S','P','I','N','T','U','A','I','H','E'};
public static void main(String args[]){
int consCount=0;
for(int v=0;v<employeeInitials.length;v++){
if(!(employeeInitials[v]=='A'||employeeInitials[v]=='E'||employeeInitials[v]=='I'||employeeInitials[v]=='O'||employeeInitials[v]=='U')){
consCount++;
}
}
System.out.println("Number of consonants found in Employee Initial list are: "+consCount);
}
}