#include <iostream>
#include <map>
#include <vector>

using namespace std;

int main()
{
    string sentence,word="";
    map<string, string> emoticon = {{"smile" , ":D"},{"grin", ":)"},{"sad", ":("},{"mad" , ":P"}};
    cout << "Enter the sentence: ";
    getline(cin, sentence);
    vector<string> wordArray;
    for (int i = 0; i < sentence.length(); i++)
    {   
        if (sentence[i] == ' ')
        {
            if (!word.empty())
            {
                wordArray.push_back(word);
                word="";
            }
        }
        else
        {
            word += sentence[i];
        }
    }
    if (!word.empty())
    {
        wordArray.push_back(word);
    }
    
    for (int i = 0; i < wordArray.size(); i++)
    {
        if (emoticon.count(wordArray[i]))
        {
            cout << emoticon[wordArray[i]] << " ";
        }
        else
        {
            cout << wordArray[i] << " ";
        } 
    }
    return 0;
}
