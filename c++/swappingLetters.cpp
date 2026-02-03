#include <iostream>

using namespace std;

int main()
{
    string sentence;
    char letter1,letter2;
    cout << "Enter the sentence: ";
    getline(cin , sentence);
    cout << "Enter the letter you want to swap: \n";
    cin >> letter1;
    cout << "Enter the letter you want to swap with: \n";
    cin >> letter2;
    for (int i = 0; i < sentence.length(); i++)
    {
        if (sentence[i] == letter1)
        {
            sentence[i]= letter2;
        }
        else if (sentence[i] == letter2)
        {
            sentence[i] = letter1;
        }
    }
    cout << sentence;
    return 0;
}