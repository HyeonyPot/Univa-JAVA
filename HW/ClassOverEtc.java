package ClassOverEtc;

public class ClassOverEtc {
String str ="ex1",str2="ex2",str3="ex3";
int a=1,b=2,c=3;
public ClassOverEtc(){
String str ="ex1",str2="ex2",str3="ex3";
int a=1,b=2,c=3;
System.out.println(a+b+c+str+str2+str3);
}
public ClassOverEtc(int a){
this(a,this.b,this.c,this.str,this.str2,this.str3);
this.a = a;
System.out.println(a+b+c+str+str2+str3);
}
public ClassOverEtc(int a,int b){
this(a,b,this.c,this.str,this.str2,this.str3);
this.a = a;
this.b = b;
System.out.println(a+b+c+str+str2+str3);
}

public ClassOverEtc(int a,int b,int c){
this(a,b,c,this.str,this.str2,this.str3);
this.a = a;
this.b = b; 
this.c = c;
System.out.println(a+b+c+str+str2+str3);

}

public ClassOverEtc(int a,int b,int c,String str){
this(a,b,c,str,this.str2,this.str3);
this.a = a;
this.b = b; 
this.c = c;
this.str = str;
System.out.println(a+b+c+str+str2+str3);
  
}
public ClassOverEtc(int a,int b,int c,String str,String str2){
this(a,b,c,str,str2,this.str3);
this.a = a;
this.b = b; 
this.c = c;
this.str = str;  
this.str2 = str2;
System.out.println(a+b+c+str+str2+str3);
}

public ClassOverEtc(int a,int b,int c,String str,String str2,String str3){
this(a,b,c,str,str2,str3);
this.a = a;
this.b = b; 
this.c = c;
this.str = str;  
this.str2 = str2;
this.str3 = str3; 
System.out.println(a+b+c+str+str2+str3);
}


}
