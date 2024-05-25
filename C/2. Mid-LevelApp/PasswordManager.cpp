// Project Name: Password Manager

#include<stdio.h>
#include<stdlib.h>
#include<time.h>

void generatePassword(int length){
	const char charset[] = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*"; // Þifre oluþtururken kullanýlacak karakter seti
	char password[length+1];
	
	srand((unsigned int) time(NULL)); //Rastgele sayý üretecinin baþlatýlmasý
	
	for(int i = 0; i<length; i++){
		int randomIndex = rand() % (sizeof(charset) - 1);
		password[i] = charset[randomIndex];
	} // Þifrenin oluþturulmasý
	
	password[length] = '\0'; //Son karakter olarak null byte girilmesi
	
	printf("Oluþturulan þifre: %s\n", password);
	
}

int main(){
	int length;
	printf("Þifre uzunluðunu girin: ");
	scanf("%d",&length);
	generatePassword(length);
	return 0;
}
