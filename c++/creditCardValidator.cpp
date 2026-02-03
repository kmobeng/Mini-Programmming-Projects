#include <iostream>

using namespace std;

int main()
{
    long long cardNumber,originalCardNumber,originalCardNumber2;
    int digit1,digit2,sumDigit1=0,sumDigit2=0,lastnumdigit2,totalSum,count=0,lastCardNum,firstCardNum;
    do
    {
        cout << "Enter credit card number: ";
        cin >> cardNumber;
    } while (cardNumber < 0);
    originalCardNumber = cardNumber;
    originalCardNumber2 = originalCardNumber;
    
    while (cardNumber > 0)  
    {
        digit1= cardNumber % 10;
        sumDigit1 += digit1; 
        cardNumber = cardNumber / 10;
        digit2 = cardNumber % 10;
        digit2 *= 2;
        while (digit2>0)
        {
            lastnumdigit2 = digit2 % 10;
            sumDigit2 += lastnumdigit2;
            digit2 = digit2 / 10;
        }
        cardNumber = cardNumber / 10;
    }
    totalSum = sumDigit1 + sumDigit2;
    
    if (totalSum % 10 == 0)
    {
        while (originalCardNumber > 0)
        {
            lastCardNum = originalCardNumber % 10;
            count ++;
            originalCardNumber = originalCardNumber / 10;
        }
        
        if (count == 15)
        {
            firstCardNum = originalCardNumber2 / 10000000000000;
            if (firstCardNum == 34 || firstCardNum == 37)
            {
                cout << "AMEX";
            }
            else
            {
                cout << "INVALID";
            } 
        }
        else if (count == 16)
        {
            firstCardNum = originalCardNumber2 / 100000000000000;
            if (firstCardNum == 51 || firstCardNum == 52 || firstCardNum == 53 || firstCardNum == 54 || firstCardNum == 55)
            {
                cout << "MASTERCARD";
            }
            else if ((originalCardNumber2 / 1000000000000000) == 4)
            {
                cout << "VISA";
            }
            else
            {
                cout << "INVALID";
            }    
        }
        else if (count == 13)
        {
            firstCardNum = originalCardNumber2 / 1000000000000;
            if (firstCardNum == 4)
            {
                cout << "VISA";
            }
            else
            {
                cout << "INVALID";
            }
        }
        else
        {
            "INVALID";
        }
        
    }
    else
    {
        cout << "INVALID";
    }  
    return 0;
}