#include<bits/stdc++.h>
using namespace std;

vector<string> split(string input, string deli){
    vector<string> ret;
    long long pos;
    while((pos = (input.find(deli))) != string::npos){
        ret.push_back(input.substr(0,pos));
        input.erase(0,pos + deli.size());
    }
    ret.push_back(input);
    return ret;
}

int main(){
	string s = "��,��,��,��,��,��,��,��,��,��,��,��,��,��";
	vector<string> vec = split(s,",");
	
	string s1 = "abcabc";
	string s2= "abc";
	cout << s1.find("abc",1);
}
