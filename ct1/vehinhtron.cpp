#include<iostream>
using namespace std;

int coordinatesX, coordinatesY, radiusR;
//Kiem tra vi tri diem so voi duong tron (trong/tren/ngoai duong tron)
//Neu diem trong/tren duong tron thi tra ve true, ngoai duong tron thi tra ve false
bool checkPointPosition(int xCheck, int yCheck){
	int tmp = (xCheck-coordinatesX)*(xCheck-coordinatesX) 
			  + (yCheck-coordinatesY)*(yCheck-coordinatesY) - radiusR*radiusR;
	if(tmp<=0) return true;
	return false;	
}
//In ra cac diem trong va tren duong tron
void drawCircle(){
	for(int i=0; i<= coordinatesX + radiusR; i++){
		for(int j=0; j<= coordinatesY + radiusR; j++){
			if(checkPointPosition(i,j)==true)	{
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
int convertStringToInteger(string sConvert){
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
   string coordinatesXInput, coordinatesYInput, radiusRInput;
   cout<<"nhap toa do tam va ban kinh hinh tron: "<<endl;
   cout<<"toa do x: ";
   cin>>coordinatesXInput;
   cout<<"toa do y: ";
   cin>>coordinatesYInput;
   cout<<"ban kinh r: ";
   cin>>radiusRInput; 
   //chuyen du lieu nhap vao thanh kieu int
   coordinatesX = convertStringToInteger(coordinatesX_nhap);
   coordinatesY = convertStringToInteger(coordinatesY_nhap);
   radiusR = convertStringToInteger(bankinh_nhap);  
   //kiem tra du lieu nhap vao co phai la so nguyen khong
   if(coordinatesX == -1 || coordinatesY == -1 || radiusR == -1){
   		cout<<"nhap vao khong hop le "<<endl;	
   		return 0;
   } 
   //kiem tra toa do, ban kinh nhap vao co hop le (r^2 < x^2, y^2)
   if(coordinatesX*coordinatesX < radiusR*radiusR || coordinatesY*coordinatesY < radiusR*radiusR){
   	 cout<<"toa do ban kinh khong hop le"<<endl;
   }
   else{
   		drawCircle();
   		
   		//Hoi nguoi dung co muon thoat chuong trinh
   		cout<<"Thoat(Y)?"<<endl;
   		char temp; 
		cin>>temp;
   		if(temp == 'Y'){
   			return 0;
		}
   }	
   return 0;
}
