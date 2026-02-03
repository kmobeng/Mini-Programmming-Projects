#include <iostream>
using namespace std;

int main() {
    int num, primeCheck = 0, prime;
    cout << "Enter n: ";
    cin >> num;

    int n = 2; 
    while (true) 
    {
        int count = 0;
        for (int i = 1; i <= n; i++) 
        {
            if (n % i == 0) 
            {
                count++;
            }
        }
        if (count == 2) 
        {
            primeCheck++;
            prime = n;
        }
        if (primeCheck == num) 
        {
            break;
        }
        n++;
    }

    cout << "The prime number you are looking for is " << prime << endl;
    return 0;
}