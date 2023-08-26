package Accenture;

public class password {
       public static void main(String[] args) {
              String pwd="AmAnnama15";
              char[] arr=pwd.toCharArray();
              System.out.println(isValid(arr));

       }
       static boolean isValid(char arr []){
              int len=arr.length;
              if(len<4){
                     return false;
              }
              else if(arr[0]>'0'&&arr[0]<'9')
              return false;
              boolean uppreCasecheek=false;
              boolean numericCheeck=false;
              for (int i = 0; i < arr.length; i++) {
                     if(arr[i]>='A' && arr[i]<='Z'){
                            uppreCasecheek=true;
                     }
                     if(arr[i]==' '||arr[i]=='/')
                     return false;
                     if(arr[i]>='0'&&arr[i]<='9'&&i>0)
                     {
                            numericCheeck=true;
                     }
              }
              if(uppreCasecheek&&numericCheeck)
              return true;
            else return false;
       }
}
