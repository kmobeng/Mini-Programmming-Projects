#include <iostream>

using namespace std;

int main()
{
    int key;
    string plaintext,ciphertext="";
    do
    {
        cout << "Enter your key: ";
        cin >> key;
    } while (key < 1);
    
    cin.ignore();
    cout << "Enter the plain text: ";
    getline(cin, plaintext);

    for (int i = 0; i < plaintext.length(); i++)
    {
        if (plaintext[i] >= 'A' && plaintext[i] <= 'Z')
        {
            ciphertext += 'A' + (plaintext[i] - 'A' + key) % 26;
        }
        else if (plaintext[i] >= 'a' && plaintext[i] <= 'z')
        {
            ciphertext += 'a' + (plaintext[i] - 'a' + key) % 26;
        }
        else
        {
            ciphertext += plaintext[i];
        }
    }
    
    cout << "The ciphertext is " << ciphertext;
    return 0;
}