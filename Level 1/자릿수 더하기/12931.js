function solution(n) {
    var answer = 0;
    var str = String(n);
    for (var i=0; i<str.length; i++) {
        answer += parseInt(str[i]);
    }
    return answer;
}

// reduce 활용
function solution(n) {
    return (n + "").split("").reduce((a, b) => a + parseInt(b), 0);
}