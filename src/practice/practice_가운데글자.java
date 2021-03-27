package practice;

public class practice_가운데글자 {

}
function solution(s) {
    var answer = '';
    
    if(s.length % 2 == 0){
        answer= s[s.length/2 - 1]+ s[s.length/2];
    } else {
        answer = s[(s.length-1)/2];
    } 
    return answer;
}