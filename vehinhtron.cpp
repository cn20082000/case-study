#include<iostream>

using namespace std;

int r, x, y;


int check(int a, int b){
	int tmp;
	tmp = (a-x)*(a-x)+ (b-y)*(b-y) -r*r;
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
int main()
{
 
   cout<<"nhap toa do tam va ban kinh hinh tron: "<<endl;
   cout<<"x: ";
   cin>>x;
 //  cout<<endl;
   cout<<"y: ";
   cin>>y;
   //cout<<endl;
   cout<<"r: ";
   cin>>r; 
  // cout<<endl;
   if(x*x<r*r||y*y<r*r){
   	 cout<<"toa do ban kinh khong hop le"<<endl;
   }
   else{
   		in();
   }
    return 0;
}
