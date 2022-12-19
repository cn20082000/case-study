#include<iostream>
using namespace std;

int toadox, toadoy, bankinhr;

//Kiem tra vi tri diem so voi duong tron (trong/tren/ngoai duong tron)
//Neu diem trong/tren duong tron thi tra ve true, ngoai duong tron thi tra ve false
bool ktra_vi_tri_diem(int a, int b){
	int tmp = (a-toadox)*(a-toadox) + (b-toadoy)*(b-toadoy) - bankinhr*bankinhr;
	if(tmp<=0) return true;
	return false;	
}

void ve_hinh_tron(){
	for(int i=0; i<= toadox + bankinhr; i++){
		for(int j=0; j<= toadoy + bankinhr; j++){
			if(ktra_vi_tri_diem(i,j)==true)	{
				cout<<"* ";
			}
			else{
				cout<<"  ";
			}
		}
		cout<<endl;
	}	
}

//Neu chuoi nhap vao khong thuoc so nguyen thi tra ve -1, la so nguyen thi tra ve chinh no kieu int
int chuyen_chuoi_thanh_so_nguyen(string s){
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

int main(){
   string bankinh_nhap, toadox_nhap, toadoy_nhap;
   
   cout<<"nhap toa do tam va ban kinh hinh tron: "<<endl;
   
   cout<<"toa do x: ";
   cin>>toadox_nhap;

   cout<<"toa do y: ";
   cin>>toadoy_nhap;

   cout<<"ban kinh r: ";
   cin>>bankinh_nhap; 
   
   //chuyen du lieu nhap vao thanh kieu int
   toadox = chuyen_chuoi_thanh_so_nguyen(toadox_nhap);
   toadoy = chuyen_chuoi_thanh_so_nguyen(toadoy_nhap);
   bankinhr = chuyen_chuoi_thanh_so_nguyen(bankinh_nhap);
   
   //kiem tra du lieu nhap vao co phai la so nguyen khong
   if(toadox == -1 || toadoy == -1 || bankinhr == -1){
   		cout<<"nhap vao khong hop le "<<endl;	
   		return 0;
   }
   
   //kiem tra toa do, ban kinh nhap vao co hop le (r^2 < x^2, y^2)
   if(toadox*toadox < bankinhr*bankinhr || toadoy*toadoy < bankinhr*bankinhr){
   	 cout<<"toa do ban kinh khong hop le"<<endl;
   }
   else{
   		ve_hinh_tron();
   		cout<<"Thoat(Y)?"<<endl;
   		char temp; cin>>temp;
   		if(temp == 'Y'){
   			return 0;
		}
   }
	
   return 0;
}
