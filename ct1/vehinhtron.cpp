#include<iostream>

using namespace std;

string bankinh, toadox, toadoy;
 int x, y, r;

int check(int a, int b){
	int tmp;
	tmp = (a-x)*(a-x)+ (b-y)*(b-y) - r*r;
	if(tmp<=0) return 1;
	return 0;	
}
void in(){
	int i =x; int j =y;
	for(int i=0; i<=x+r; i++){
		for(int j=0; j<=y+r; j++){
			if(check(i,j)==1){
				cout<<"* ";
			}
			else{
				cout<<"  ";
			}
		}
		cout<<endl;
	}

	
}
int chuyen(string s){
	int tmp =0;
	int i=0;
	while(i<s.length()){
		int t = s[i]-'0';
		if(0<=t && t<=9){
			tmp = tmp*10 + t;
			i++;
		}
		else{
			return -1;
		}
	}
	return tmp;
}
int main()
{
 
   cout<<"nhap toa do tam va ban kinh hinh tron: "<<endl;
   cout<<"toa do x: ";
   cin>>toadox;

   cout<<"toa do y: ";
   cin>>toadoy;

   cout<<"ban kinh r: ";
   cin>>bankinh; 
  	
  	
  
   
   if(chuyen(toadox)==-1|| chuyen(toadoy)==-1|| chuyen(bankinh)==-1){
   		cout<<"nhap vao khong hop le "<<endl;
   		return 0;
   }
   else{
   		x = chuyen(toadox);
		y = chuyen(toadoy);
		r = chuyen(bankinh);	
   }
   
   if(x*x<r*r||y*y<r*r){
   	 cout<<"toa do ban kinh khong hop le"<<endl;
   }
   else{
   		in();
   }
	
    return 0;
}
