#include <iostream>

using namespace std;

int main()
{
    string key,plaintext,ciphertext="";
    int x;
    do
    {
        cout << "Enter the key: ";
        cin >> key;
    } while (key.length() < 26);
    cin.ignore();
    cout << "Enter the plaintext: ";
    getline(cin, plaintext);

    for (int i = 0; i < plaintext.length(); i++)
    {
        if (plaintext[i] >= 'A' && plaintext[i] <= 'Z')
        {
            x = plaintext[i] - 'A';
            ciphertext += key[x];
        }
        else if (plaintext[i] >= 'a' && plaintext[i] <= 'z')
        {
            x = plaintext[i] - 'a';
            ciphertext += (key[x] + 32);
        }
        else
        {
            ciphertext += plaintext[i];
        }
    }
    
    cout << "The ciphertext is " << ciphertext;
    return 0;
}