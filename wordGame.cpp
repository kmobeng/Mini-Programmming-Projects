#include <iostream>
#include <string>

using namespace std;

int main()
{
    string word1,word2;
    int score1=0,score2=0;
    cout << "Player 1:";
    cin >> word1;
    cout << "Player 2: ";
    cin >> word2;

    int numberArray[]={1,3,3,2,1,4,2,4,1,8,5,1,3,1,1,3,10,1,1,1,1,4,4,8,4,10};
    char letterArray[]={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};

    for (int i = 0; i < word1.length(); i++)
    {
        if (word1[i] >= 'a' && word1[i]<= 'z')
        {
            word1[i] = word1[i] - 32;
        }
        
        for (int j = 0; j < 26; j++)
        {
            if (word1[i] == letterArray[j])
            {
                score1 += numberArray[j];
            }
        }
    }

    for (int i = 0; i < word2.length(); i++)
    {
        if (word2[i] >= 'a' && word2[i]<= 'z')
        {
            word2[i] = word2[i] - 32;
        }

        for (int j = 0; j < 26; j++)
        {
            if (word2[i] == letterArray[j])
            {
                score2 += numberArray[j];
            }
        }
    }
    
    if (score1 > score2)
    {
        cout << "Player 1 wins!";
    }
    else if (score2 > score1)   
    {
        cout << "Player 2 wins!";
    }
    else
    {
        cout << "Tie!";
    } 
    return 0;
}